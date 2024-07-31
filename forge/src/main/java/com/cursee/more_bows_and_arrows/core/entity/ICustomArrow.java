package com.cursee.more_bows_and_arrows.core.entity;

import com.cursee.more_bows_and_arrows.core.entity.custom.*;
import com.cursee.more_bows_and_arrows.core.item.ModItemsForge;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
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
import org.apache.logging.log4j.core.jmx.Server;

import static net.minecraft.world.level.levelgen.feature.Feature.isDirt;

public interface ICustomArrow {

    @SuppressWarnings("all")
    default void checkHitResult(AbstractArrow arrow, HitResult result) {

        HitResult.Type type = result.getType();

        if (type == HitResult.Type.MISS || arrow.level().isClientSide() || arrow.getOwner() == null) {
            return;
        }

        switch (type) {
            case BLOCK -> processBlockInteraction(arrow, (BlockHitResult) result);
            case ENTITY -> processEntityInteraction(arrow, (EntityHitResult) result);
        }
    }

    @SuppressWarnings("all")
    default void processBlockInteraction(AbstractArrow arrow, BlockHitResult result) {

        Entity owner = arrow.getOwner();
        Level level = arrow.level();
        BlockPos pos = result.getBlockPos();
        BlockState state = arrow.level().getBlockState(pos);

        if (!(owner instanceof LivingEntity)) {
            return;
        }

        if (arrow instanceof AmethystArrow) {}
        else if (arrow instanceof BambooArrow) {
            ICustomArrow.bambooArrowHitsBlock(result, owner, level, pos, state);
        }
        else if (arrow instanceof BlazeRodArrow) {}
        else if (arrow instanceof BoneArrow) {}
        else if (arrow instanceof CactusArrow) {}
        else if (arrow instanceof CoalArrow) {}
        else if (arrow instanceof CopperArrow) {}
        else if (arrow instanceof DiamondArrow) {}
        else if (arrow instanceof EmeraldArrow) {}
        else if (arrow instanceof EnderPearlArrow) {
            owner.teleportTo((ServerLevel) owner.level(), arrow.xo, arrow.yo, arrow.zo, RelativeMovement.ROTATION, owner.getYRot(), owner.getXRot());
        }
        else if (arrow instanceof FlintAndSteelArrow) {
            ICustomArrow.flintAndSteelArrowHitsBlock(result, owner, level, pos, state);
        }
        else if (arrow instanceof FlintArrow) {}
        else if (arrow instanceof GoldArrow) {}
        else if (arrow instanceof IronArrow) {}
        else if (arrow instanceof LapisArrow) {}
        else if (arrow instanceof MossArrow) {}
        else if (arrow instanceof NetheriteArrow) {}
        else if (arrow instanceof ObsidianArrow) {}
        else if (arrow instanceof PaperArrow) {}
        else if (arrow instanceof TNTArrow) {}
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

        if (arrow instanceof AmethystArrow) {}
        else if (arrow instanceof BambooArrow) {}
        else if (arrow instanceof BlazeRodArrow) {}
        else if (arrow instanceof BoneArrow) {
            ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.WITHER, 20, 1));
        }
        else if (arrow instanceof CactusArrow) {}
        else if (arrow instanceof CoalArrow) {}
        else if (arrow instanceof CopperArrow) {
            if (stack.is(ModItemsForge.COPPER_BOW.get())) {
                LightningBolt lightningBolt = (LightningBolt)EntityType.LIGHTNING_BOLT.create(level);
                lightningBolt.moveTo(Vec3.atBottomCenterOf(entity.blockPosition().above()));
                lightningBolt.setCause((ServerPlayer) owner);
                level.addFreshEntity(lightningBolt);
            }
        }
        else if (arrow instanceof DiamondArrow) {}
        else if (arrow instanceof EmeraldArrow) {}
        else if (arrow instanceof EnderPearlArrow) {
            entity.teleportTo((ServerLevel) owner.level(), owner.xo, owner.yo, owner.zo, RelativeMovement.ROTATION, entity.getYRot(), entity.getXRot());
        }
        else if (arrow instanceof FlintAndSteelArrow) {
            entity.setSecondsOnFire(2);
        }
        else if (arrow instanceof FlintArrow) {
            if (stack.is(ModItemsForge.IRON_BOW.get())) entity.setSecondsOnFire(2);
        }
        else if (arrow instanceof GoldArrow) {}
        else if (arrow instanceof IronArrow) {}
        else if (arrow instanceof LapisArrow) {}
        else if (arrow instanceof MossArrow) {}
        else if (arrow instanceof NetheriteArrow) {}
        else if (arrow instanceof ObsidianArrow) {}
        else if (arrow instanceof PaperArrow) {}
        else if (arrow instanceof TNTArrow) {}
    }

    private static void flintAndSteelArrowHitsBlock(BlockHitResult result, Entity entity, Level level, BlockPos pos, BlockState state) {
        if (!state.hasProperty(BlockStateProperties.LIT)) {
            BlockPos relativePosition = result.getBlockPos().relative(result.getDirection());
            if (level.isEmptyBlock(relativePosition)) {
                level.setBlockAndUpdate(relativePosition, BaseFireBlock.getState(level, relativePosition));
            }
        }
        else {
            level.setBlock(pos, state.setValue(BlockStateProperties.LIT, true), Block.UPDATE_ALL);
        }
    }

    private static void bambooArrowHitsBlock(BlockHitResult result, Entity owner, Level level, BlockPos pos, BlockState state) {
        if (((Player) owner).getMainHandItem().is(ModItemsForge.BAMBOO_BOW.get())) {
            if (Blocks.BAMBOO.defaultBlockState().canSurvive(level, result.getBlockPos())) {
                if (isDirt(level.getBlockState(result.getBlockPos()))) {
                    level.setBlock(result.getBlockPos(), Blocks.PODZOL.defaultBlockState(), 2);
                    level.setBlock(result.getBlockPos().above(), Blocks.BAMBOO.defaultBlockState(), 2);
//                    ((AbstractArrow)(Object)this).discard();
                } else if (level.getBlockState(result.getBlockPos()).is(Blocks.BAMBOO)) {
                    level.setBlock(result.getBlockPos().above(), Blocks.BAMBOO.defaultBlockState(), 2);
//                    ((AbstractArrow)(Object)this).discard();
                }
            }
        }
    }
}
