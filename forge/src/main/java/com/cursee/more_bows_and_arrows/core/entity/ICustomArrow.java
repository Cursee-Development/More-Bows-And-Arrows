package com.cursee.more_bows_and_arrows.core.entity;

import com.cursee.monolib.core.MonoLibConfiguration;
import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.core.entity.ModEntitiesForge;
import com.cursee.more_bows_and_arrows.core.entity.custom.*;
import com.cursee.more_bows_and_arrows.core.item.ModItemsForge;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

import java.util.Random;

import static net.minecraft.world.level.levelgen.feature.Feature.isDirt;

public interface ICustomArrow {

//    void discard();

    default void debug(String string) {
        if (MonoLibConfiguration.debugging) Constants.LOG.info(string);
    }

    float NETHERITE_DAMAGE = 6.0f;
    float DIAMOND_DAMAGE = 5.0f;
    float OBSIDIAN_DAMAGE = 4.0f;
    float BLAZE_DAMAGE = 3.0f;
    float EMERALD_DAMAGE = 3.0f;
    float ENDER_PEARL_DAMAGE = 3.0f;

    float AMETHYST_DAMAGE = 2.0f;
    float BONE_DAMAGE = 2.0f;
    float CACTUS_DAMAGE = 2.0f;
    float COAL_DAMAGE = 2.0f;
    float COPPER_DAMAGE = 2.0f;
    float IRON_DAMAGE = 2.0f;
    float LAPIS_DAMAGE = 2.0f;
    float GOLD_DAMAGE = 1.0f;

    float MOSS_DAMAGE = 0.0f;
    float PAPER_DAMAGE = 0.0f;

    float WOODEN_DAMAGE = 2.0f;

    default void checkHitResult(AbstractArrow arrow, HitResult result) {

        HitResult.Type type = result.getType();

        if (type == HitResult.Type.MISS || arrow.level().isClientSide() || arrow.getOwner() == null) {
            debug("failed, arrow owner null");
            return;
        }

        debug("checking HitResult type");

        switch (type) {
            case BLOCK -> processBlockInteraction(arrow, (BlockHitResult) result);
            case ENTITY -> processEntityInteraction(arrow, (EntityHitResult) result);
        }

//        discard();
    }

    @SuppressWarnings("all")
    default void processBlockInteraction(AbstractArrow arrow, BlockHitResult result) {

        Entity owner = arrow.getOwner();
        Level level = arrow.level();
        BlockPos pos = result.getBlockPos();
        BlockState state = arrow.level().getBlockState(pos);

        ItemStack stack = ItemStack.EMPTY;

        if (!(owner instanceof LivingEntity)) {
            return;
        }

        if (owner instanceof Player player) {
            stack = player.getMainHandItem();
        }

        debug("an instance of ICustomArrow has hit a block");

        if (arrow instanceof AmethystArrow) {
            debug("AmethystArrow has hit a block.");
            debug("AmethystArrow Has Owner" + arrow.getOwner().getDisplayName().toString());
        }
        else if (arrow instanceof BambooArrow) {
            ICustomArrow.bambooArrowHitsBlock(owner, level, pos, state);
        }
        else if (arrow instanceof BlazeRodArrow) {
            ICustomArrow.igniteBlockOnHit(result, level, pos, state);

            if (stack.is(ModItemsForge.BLAZE_BOW.get())) {
                level.explode(owner, result.getBlockPos().getX(), result.getBlockPos().getY()+1, result.getBlockPos().getZ(), 2.0f, true, Level.ExplosionInteraction.TNT);
            }
        }
        else if (arrow instanceof BoneArrow) {}
        else if (arrow instanceof CactusArrow) {}
        else if (arrow instanceof CoalArrow) {}
        else if (arrow instanceof CopperArrow) {
            if (stack.is(ModItemsForge.COPPER_BOW.get())) {
                LightningBolt lightningBolt = (LightningBolt)EntityType.LIGHTNING_BOLT.create(level);
                lightningBolt.moveTo(Vec3.atBottomCenterOf(pos.above()));
                lightningBolt.setCause((ServerPlayer) owner);
                level.addFreshEntity(lightningBolt);
            }
        }
        else if (arrow instanceof DiamondArrow) {}
        else if (arrow instanceof EmeraldArrow) {}
        else if (arrow instanceof EnderPearlArrow || arrow.getName().getString().contains("ender")) {
            debug("EnderPearlArrow has hit a block.");
            debug("EnderPearlArrow Has Owner " + arrow.getOwner().getDisplayName().getString());
            // arrow.getOwner().teleportTo((ServerLevel) arrow.getOwner().level(), arrow.xo, arrow.yo, arrow.zo, RelativeMovement.ROTATION, arrow.getOwner().getYRot(), arrow.getOwner().getXRot());
            BlockPos relativePosition = pos.relative(result.getDirection());
            owner.teleportTo((ServerLevel) owner.level(), relativePosition.getX(), relativePosition.getY(), relativePosition.getZ(), RelativeMovement.ROTATION, owner.getYRot(), owner.getXRot());
        }
        else if (arrow instanceof FlintAndSteelArrow) {
            ICustomArrow.igniteBlockOnHit(result, level, pos, state);
        }
        else if (arrow instanceof FlintArrow) {
            ICustomArrow.igniteBlockOnHit(result, level, pos, state);
        }
        else if (arrow instanceof GoldArrow) {}
        else if (arrow instanceof IronArrow) {}
        else if (arrow instanceof LapisArrow) {}
        else if (arrow instanceof MossArrow) {
            if (stack.is(ModItemsForge.PAPER_BOW.get()) || stack.is(ModItemsForge.MOSS_BOW.get())) {
                ICustomArrow.paperArrowHitsBlock(owner, level, pos);
            }
        }
        else if (arrow instanceof NetheriteArrow) {}
        else if (arrow instanceof ObsidianArrow) {}
        else if (arrow instanceof PaperArrow) {
            if (stack.is(ModItemsForge.PAPER_BOW.get()) || stack.is(ModItemsForge.MOSS_BOW.get())) {
                ICustomArrow.paperArrowHitsBlock(owner, level, pos);
            }
        }
        else if (arrow instanceof TNTArrow) {
            level.explode(owner, result.getBlockPos().getX(), result.getBlockPos().getY()+1, result.getBlockPos().getZ(), 2.0f, true, Level.ExplosionInteraction.TNT);
        }

//        discard();
    }

    @SuppressWarnings("all")
    default void processEntityInteraction(AbstractArrow arrow, EntityHitResult result) {

        Entity owner = arrow.getOwner();
        Level level = arrow.level();

        Entity entity = result.getEntity();

        ItemStack stack = ItemStack.EMPTY;

        if (!(owner instanceof LivingEntity) || !(entity instanceof LivingEntity)) {
            return;
        }

        if (owner instanceof Player player) {
            stack = player.getMainHandItem();
        }

        if (arrow instanceof AmethystArrow) {
            debug("AmethystArrow hit an Entity");
            entity.hurt(entity.damageSources().arrow((AmethystArrow) ModEntitiesForge.AMETHYST_ARROW.get().create(level), owner), AMETHYST_DAMAGE);
        }
        else if (arrow instanceof BambooArrow) {
            entity.hurt(entity.damageSources().arrow((BambooArrow) ModEntitiesForge.BAMBOO_ARROW.get().create(level), owner), WOODEN_DAMAGE);
        }
        else if (arrow instanceof BlazeRodArrow) {
            entity.hurt(entity.damageSources().arrow((BlazeRodArrow) ModEntitiesForge.BLAZE_ROD_ARROW.get().create(level), owner), BLAZE_DAMAGE);

            entity.setSecondsOnFire(2);

            if (stack.is(ModItemsForge.BLAZE_BOW.get())) {
                level.explode(owner, entity.xo, entity.yo+1, entity.zo, 2.0f, true, Level.ExplosionInteraction.TNT);
            }
        }
        else if (arrow instanceof BoneArrow) {
            entity.hurt(entity.damageSources().arrow((BoneArrow) ModEntitiesForge.BONE_ARROW.get().create(level), owner), BONE_DAMAGE);
            ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.WITHER, 20, 1));
        }
        else if (arrow instanceof CactusArrow) {
            entity.hurt(entity.damageSources().arrow((CactusArrow) ModEntitiesForge.CACTUS_ARROW.get().create(level), owner), CACTUS_DAMAGE);
        }
        else if (arrow instanceof CoalArrow) {
            entity.hurt(entity.damageSources().arrow((CoalArrow) ModEntitiesForge.COAL_ARROW.get().create(level), owner), COAL_DAMAGE);
        }
        else if (arrow instanceof CopperArrow) {
            entity.hurt(entity.damageSources().arrow((CopperArrow) ModEntitiesForge.COPPER_ARROW.get().create(level), owner), COPPER_DAMAGE);
            if (stack.is(ModItemsForge.COPPER_BOW.get())) {
                LightningBolt lightningBolt = (LightningBolt)EntityType.LIGHTNING_BOLT.create(level);
                lightningBolt.moveTo(Vec3.atBottomCenterOf(entity.blockPosition().above()));
                lightningBolt.setCause((ServerPlayer) owner);
                level.addFreshEntity(lightningBolt);
            }
        }
        else if (arrow instanceof DiamondArrow) {
            entity.hurt(entity.damageSources().arrow((DiamondArrow) ModEntitiesForge.DIAMOND_ARROW.get().create(level), owner), DIAMOND_DAMAGE);
        }
        else if (arrow instanceof EmeraldArrow) {
            entity.hurt(entity.damageSources().arrow((EmeraldArrow) ModEntitiesForge.EMERALD_ARROW.get().create(level), owner), EMERALD_DAMAGE);
        }
        else if (arrow instanceof EnderPearlArrow) {
            entity.hurt(entity.damageSources().arrow((EnderPearlArrow) ModEntitiesForge.ENDER_PEARL_ARROW.get().create(level), owner), ENDER_PEARL_DAMAGE);
            entity.teleportTo((ServerLevel) owner.level(), owner.xo, owner.yo, owner.zo, RelativeMovement.ROTATION, entity.getYRot(), entity.getXRot());
        }
        else if (arrow instanceof FlintAndSteelArrow) {
            entity.hurt(entity.damageSources().arrow((FlintAndSteelArrow) ModEntitiesForge.FLINT_AND_STEEL_ARROW.get().create(level), owner), IRON_DAMAGE);
            entity.setSecondsOnFire(2);
        }
        else if (arrow instanceof FlintArrow) {
            entity.hurt(entity.damageSources().arrow((FlintArrow) ModEntitiesForge.FLINT_ARROW.get().create(level), owner), IRON_DAMAGE);
            if (stack.is(ModItemsForge.IRON_BOW.get())) entity.setSecondsOnFire(2);
        }
        else if (arrow instanceof GoldArrow) {
            entity.hurt(entity.damageSources().arrow((GoldArrow) ModEntitiesForge.GOLD_ARROW.get().create(level), owner), GOLD_DAMAGE);
        }
        else if (arrow instanceof IronArrow) {
            entity.hurt(entity.damageSources().arrow((IronArrow) ModEntitiesForge.IRON_ARROW.get().create(level), owner), IRON_DAMAGE);
        }
        else if (arrow instanceof LapisArrow) {
            entity.hurt(entity.damageSources().arrow((LapisArrow) ModEntitiesForge.LAPIS_ARROW.get().create(level), owner), LAPIS_DAMAGE);
        }
        else if (arrow instanceof MossArrow) {
            entity.hurt(entity.damageSources().arrow((MossArrow) ModEntitiesForge.MOSS_ARROW.get().create(level), owner), MOSS_DAMAGE);
            if (stack.is(ModItemsForge.PAPER_BOW.get())) {
                ICustomArrow.paperArrowHitsEntity(owner, level, entity);
            }
        }
        else if (arrow instanceof NetheriteArrow) {
            entity.hurt(entity.damageSources().arrow((NetheriteArrow) ModEntitiesForge.NETHERITE_ARROW.get().create(level), owner), NETHERITE_DAMAGE);
        }
        else if (arrow instanceof ObsidianArrow) {
            entity.hurt(entity.damageSources().arrow((ObsidianArrow) ModEntitiesForge.OBSIDIAN_ARROW.get().create(level), owner), OBSIDIAN_DAMAGE);
        }
        else if (arrow instanceof PaperArrow) {
            entity.hurt(entity.damageSources().arrow((PaperArrow) ModEntitiesForge.PAPER_ARROW.get().create(level), owner), PAPER_DAMAGE);
            if (stack.is(ModItemsForge.PAPER_BOW.get())) {
                ICustomArrow.paperArrowHitsEntity(owner, level, entity);
            }
        }
        else if (arrow instanceof TNTArrow) {
            entity.hurt(entity.damageSources().arrow((TNTArrow) ModEntitiesForge.TNT_ARROW.get().create(level), owner), IRON_DAMAGE);
            level.explode(owner, entity.xo, entity.yo+1, entity.zo, 1.0f, true, Level.ExplosionInteraction.TNT);
        }

        checkMainhandToHurtEntity((LivingEntity) owner, (LivingEntity) entity);
    }

    default void checkMainhandToHurtEntity(LivingEntity owner, LivingEntity toHurt) {

        ItemStack itemStack = owner.getMainHandItem();
        DamageSource damageSource = owner.getLastDamageSource();

        if (damageSource == null) {
            return;
        }

        switch (itemStack.getDisplayName().getString()) {
            case "[Netherite Bow]" -> toHurt.hurt(damageSource, 6);
            case "[Diamond Bow]" -> toHurt.hurt(damageSource, 5);
            case "[Obsidian Bow]" -> toHurt.hurt(damageSource, 4);
            case "[Emerald Bow]", "[Blaze Bow]" -> toHurt.hurt(damageSource, 3);
            case "[Oak Bow]", "[Stripped Oak Bow]",
                 "[Dark Oak Bow]", "[Stripped Dark Oak Bow]",
                 "[Spruce Bow]", "[Stripped Spruce Bow]",
                 "[Birch Bow]", "[Stripped Birch Bow]",
                 "[Jungle Bow]", "[Stripped Jungle Bow]",
                 "[Acacia Bow]", "[Stripped Acacia Bow]",
                 "[Mangrove Bow]", "[Stripped Mangrove Bow]",
                 "[Cherry Bow]", "[Stripped Cherry Bow]",
                 "[Bamboo Bow]", "[Stripped Bamboo Bow]",
                 "[Crimson Stem Bow]", "[Stripped Crimson Stem Bow]",
                 "[Warped Stem Bow]", "[Stripped Warped Stem Bow]",
                 "[Lapis Bow]", "[Amethyst Bow]",
                 "[Bone Bow]", "[Coal Bow]",
                 "[Iron Bow]", "[Copper Bow]" -> toHurt.hurt(damageSource, 2);
            case "[Paper Bow]", "[Moss Bow]" -> {
                debug("checked paper or moss bow with proprietary arrow");
            }
        }
    }











    private static void igniteBlockOnHit(BlockHitResult result, Level level, BlockPos pos, BlockState state) {
        if (!state.hasProperty(BlockStateProperties.LIT)) {
            BlockPos relativePosition = pos.relative(result.getDirection());
            if (level.isEmptyBlock(relativePosition)) {
                level.setBlockAndUpdate(relativePosition, BaseFireBlock.getState(level, relativePosition));
            }
        }
        else {
            level.setBlock(pos, state.setValue(BlockStateProperties.LIT, true), Block.UPDATE_ALL);
        }
    }

    private static void bambooArrowHitsBlock(Entity owner, Level level, BlockPos pos, BlockState state) {
        if (((Player) owner).getMainHandItem().is(ModItemsForge.BAMBOO_BOW.get())) {
            if (Blocks.BAMBOO.defaultBlockState().canSurvive(level, pos)) {
                if (isDirt(state)) {
                    level.setBlock(pos, Blocks.PODZOL.defaultBlockState(), Block.UPDATE_ALL);
                    level.setBlock(pos.above(), Blocks.BAMBOO.defaultBlockState(), Block.UPDATE_ALL);
                } else if (state.is(Blocks.BAMBOO)) {
                    level.setBlock(pos.above(), Blocks.BAMBOO.defaultBlockState(), Block.UPDATE_ALL);
                }
            }
        }
    }

    private static void paperArrowHitsBlock(Entity owner, Level level, BlockPos pos) {

        Random random = new Random();

        switch (random.nextInt(1, 8)) {
            case 1 -> {
                level.explode(owner, pos.getX(), pos.getY(), pos.getZ(), 2.0f, true, Level.ExplosionInteraction.TNT);
            }
            case 2 -> {
                owner.teleportTo(owner.xo, owner.yo+10, owner.zo);
            }
            case 3 -> {
                owner.teleportTo(pos.getX(), pos.getY(), pos.getZ());
            }
            case 4 -> {
                owner.teleportTo(pos.getX(), pos.getY()+10, pos.getZ());
            }
            case 5 -> {
                LightningBolt lightningBolt = (LightningBolt)EntityType.LIGHTNING_BOLT.create(level);
                lightningBolt.moveTo(Vec3.atBottomCenterOf(pos.above()));
                lightningBolt.setCause((ServerPlayer) owner);
                level.addFreshEntity(lightningBolt);
            }
            case 6 -> {
                level.explode(owner, pos.getX(), pos.getY(), pos.getZ(), 1.0f, true, Level.ExplosionInteraction.TNT);
            }
            case 7 -> {
                for (int i=0; i<4; ++i) {
                    Chicken chicken = (Chicken)EntityType.CHICKEN.create(level);
                    chicken.moveTo(pos.getX(), pos.getY()+i, pos.getZ());
                    level.addFreshEntity(chicken);
                }
            }
            case 8 -> {
                for (int i=0; i<4; ++i) {
                    Zombie zombie = (Zombie)EntityType.ZOMBIE.create(level);
                    zombie.moveTo(pos.getX(), pos.getY(), pos.getZ());
                    level.addFreshEntity(zombie);
                }
            }
        }
    }

    private static void paperArrowHitsEntity(Entity owner, Level level, Entity entity) {

        Random random = new Random();

        switch (random.nextInt(1, 8)) {
            case 1 -> {
                entity.setSecondsOnFire(2);
            }
            case 2 -> {
                entity.teleportTo(owner.xo, owner.yo, owner.zo);
            }
            case 3 -> {
                owner.teleportTo(entity.xo, entity.yo, entity.zo);
            }
            case 4 -> {
                entity.teleportTo(entity.xo, entity.yo+10, entity.zo);
            }
            case 5 -> {
                LightningBolt lightningBolt = (LightningBolt)EntityType.LIGHTNING_BOLT.create(level);
                lightningBolt.moveTo(Vec3.atBottomCenterOf(entity.blockPosition().above()));
                lightningBolt.setCause((ServerPlayer) owner);
                level.addFreshEntity(lightningBolt);
            }
            case 6 -> {
                level.explode(owner, entity.xo, entity.yo, entity.zo, 2.0f, true, Level.ExplosionInteraction.TNT);
            }
            case 7 -> {
                for (int i=0; i<4; ++i) {
                    Chicken chicken = (Chicken)EntityType.CHICKEN.create(level);
                    chicken.moveTo(entity.xo, entity.yo+i, entity.zo);
                    level.addFreshEntity(chicken);
                }
            }
            case 8 -> {
                for (int i=0; i<4; ++i) {
                    Zombie zombie = (Zombie)EntityType.ZOMBIE.create(level);
                    zombie.moveTo(entity.xo, entity.yo, entity.zo);
                    level.addFreshEntity(zombie);
                }
            }
        }
    }
}
