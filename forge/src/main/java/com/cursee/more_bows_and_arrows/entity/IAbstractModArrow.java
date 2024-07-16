package com.cursee.more_bows_and_arrows.entity;

import com.cursee.more_bows_and_arrows.entity.projectile.MossArrowEntity;
import com.cursee.more_bows_and_arrows.entity.projectile.PaperArrowEntity;
import com.cursee.more_bows_and_arrows.registry.ForgeItemRegistry;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

import java.util.concurrent.ThreadLocalRandom;

public interface IAbstractModArrow {
  int NETHERITE_BOW_DAMAGE = 6;
  int DIAMOND_BOW_DAMAGE = 5;
  int OBSIDIAN_BOW_DAMAGE = 4;
  int BLAZE_BOW_DAMAGE = 3;
  int EMERALD_BOW_DAMAGE = 3;
  
  int AMETHYST_BOW_DAMAGE = 2;
  int BONE_BOW_DAMAGE = 2;
  int COAL_BOW_DAMAGE = 2;
  int COPPER_BOW_DAMAGE = 2;
  int IRON_BOW_DAMAGE = 2;
  int LAPIS_BOW_DAMAGE = 2;
  int GOLD_BOW_DAMAGE = 1;
  
  int MOSS_BOW_DAMAGE = 0;
  int PAPER_BOW_DAMAGE = 0;
  
  int WOODEN_BOW_DAMAGE = 2;
  
  Item[] woodenBowItems = {
    ForgeItemRegistry.ACACIA_BOW.get(), ForgeItemRegistry.STRIPPED_ACACIA_BOW.get(),
    ForgeItemRegistry.BAMBOO_BOW.get(), ForgeItemRegistry.STRIPPED_BAMBOO_BOW.get(),
    ForgeItemRegistry.BIRCH_BOW.get(), ForgeItemRegistry.STRIPPED_BIRCH_BOW.get(),
    ForgeItemRegistry.CHERRY_BOW.get(), ForgeItemRegistry.STRIPPED_CHERRY_BOW.get(),
    ForgeItemRegistry.CRIMSON_STEM_BOW.get(), ForgeItemRegistry.CRIMSON_STEM_BOW.get(),
    ForgeItemRegistry.DARK_OAK_BOW.get(), ForgeItemRegistry.STRIPPED_DARK_OAK_BOW.get(),
    ForgeItemRegistry.JUNGLE_BOW.get(), ForgeItemRegistry.STRIPPED_JUNGLE_BOW.get(),
    ForgeItemRegistry.MANGROVE_BOW.get(), ForgeItemRegistry.STRIPPED_MANGROVE_BOW.get(),
    ForgeItemRegistry.OAK_BOW.get(), ForgeItemRegistry.STRIPPED_OAK_BOW.get(),
    ForgeItemRegistry.SPRUCE_BOW.get(), ForgeItemRegistry.STRIPPED_SPRUCE_BOW.get(),
    ForgeItemRegistry.WARPED_STEM_BOW.get(), ForgeItemRegistry.STRIPPED_WARPED_STEM_BOW.get()
  };
  
  default void checkArrowBlockDamage(AbstractArrow arrow, BlockHitResult hitResult) {
    // operate server-side
    if (!arrow.level.isClientSide) {

      // arrow has an owner
      if (arrow.getOwner() != null) {
//        for (ItemStack stack : arrow.getOwner().getHandSlots()) {
//          if (this.getClass() == BambooArrowEntity.class && stack.is(ForgeItemRegistry.BAMBOO_BOW)) {
//            if (Blocks.BAMBOO.defaultBlockState().canSurvive(arrow.level, hitResult.getBlockPos())) {
//              if (isDirt(arrow.level.getBlockState(hitResult.getBlockPos()))) {
//                arrow.level.setBlock(hitResult.getBlockPos(), Blocks.PODZOL.defaultBlockState(), 2);
//                arrow.level.setBlock(hitResult.getBlockPos().above(), Blocks.BAMBOO.defaultBlockState(), 2);
//                arrow.discard();
//              } else if (arrow.level.getBlockState(hitResult.getBlockPos()).is(Blocks.BAMBOO)) {
//                arrow.level.setBlock(hitResult.getBlockPos().above(), Blocks.BAMBOO.defaultBlockState(), 2);
//                arrow.discard();
//              }
//            }
//          }
//        }
      }
      // arrow does not have an owner
      else if (arrow.getOwner() == null) {
      }
    }
  }
  
  
  default void checkArrowEntityDamage(AbstractArrow arrow, EntityHitResult hitResult) {
    // operating on the server and likely fired from an Entity
    if (!arrow.level.isClientSide && arrow.getOwner() != null) {
//      for (ItemStack stack : arrow.getOwner().getHandSlots()) {
//
//        for (int i = 0; i < woodenBowItems.length; i++) {
//          hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), WOODEN_BOW_DAMAGE);
//        }
//
//        if (stack.is(ForgeItemRegistry.AMETHYST_BOW)) {
//          if (this.getClass() != AmethystArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), AMETHYST_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), AMETHYST_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(ForgeItemRegistry.BAMBOO_BOW)) {
//          if (this.getClass() != BambooArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), WOODEN_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), WOODEN_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(ForgeItemRegistry.BLAZE_BOW)) {
//          if (this.getClass() != BlazeRodArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), BLAZE_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().setSecondsOnFire(2);
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), BLAZE_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(ForgeItemRegistry.BONE_BOW)) {
//          if (this.getClass() != BoneArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), BONE_BOW_DAMAGE);
//          } else {
//            LivingEntity pLiving = (LivingEntity) hitResult.getEntity();
//            MobEffectInstance mobeffectinstance = new MobEffectInstance(MobEffects.WITHER, 100, 0);
//            pLiving.addEffect(mobeffectinstance, (Entity)((BoneArrowEntity) this).getEffectSource());
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), BONE_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(ForgeItemRegistry.COAL_BOW)) {
//          if (this.getClass() != CoalArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), COAL_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().setSecondsOnFire(2);
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), COAL_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(ForgeItemRegistry.COPPER_BOW)) {
//          if (this.getClass() != CopperArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), COPPER_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), COPPER_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(ForgeItemRegistry.DIAMOND_BOW)) {
//          if (this.getClass() != DiamondArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), DIAMOND_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), DIAMOND_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(ForgeItemRegistry.EMERALD_BOW)) {
//          if (this.getClass() != EmeraldArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), EMERALD_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), EMERALD_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(ForgeItemRegistry.GOLD_BOW)) {
//          if (this.getClass() != GoldArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), GOLD_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), GOLD_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(ForgeItemRegistry.IRON_BOW)) {
//          if (this.getClass() != IronArrowEntity.class && this.getClass() == FlintArrowEntity.class) {
//            hitResult.getEntity().setSecondsOnFire(2);
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), IRON_BOW_DAMAGE);
//          } else if (this.getClass() != IronArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), IRON_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), IRON_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(ForgeItemRegistry.LAPIS_BOW)) {
//          if (this.getClass() != LapisArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), LAPIS_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), LAPIS_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(ForgeItemRegistry.PAPER_BOW)) {
//          if (this.getClass() != PaperArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), PAPER_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), PAPER_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(ForgeItemRegistry.MOSS_BOW)) {
//          if (this.getClass() != MossArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), MOSS_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), MOSS_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(ForgeItemRegistry.NETHERITE_BOW)) {
//          if (this.getClass() != NetheriteArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), NETHERITE_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), NETHERITE_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(ForgeItemRegistry.OBSIDIAN_BOW)) {
//          if (this.getClass() != ObsidianArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), OBSIDIAN_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), OBSIDIAN_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(ForgeItemRegistry.PAPER_BOW) || stack.is(ForgeItemRegistry.MOSS_BOW)) {
//          if (this.getClass() == PaperArrowEntity.class || this.getClass() == MossArrowEntity.class) {
//
//            Entity hitEntity = hitResult.getEntity();
//            int a = ThreadLocalRandom.current().nextInt(1, 8 + 1);
//            switch (a) {
//              case 1 -> {
//                // set entity on fire
//                hitEntity.setSecondsOnFire(2);
//                arrow.discard();
//              }
//              case 2 -> {
//                // teleport entity to player
//                hitEntity.teleportTo(arrow.getOwner().xo, arrow.getOwner().yo, arrow.getOwner().zo);
//                arrow.discard();
//              }
//              case 3 -> {
//                // teleport player to entity
//                arrow.getOwner().teleportTo(hitEntity.xo, hitEntity.yo, hitEntity.zo);
//                arrow.discard();
//              }
//              case 4 -> {
//                // teleport entity up 10 blocks
//                hitEntity.teleportTo(hitEntity.xo, hitEntity.yo + 10, hitEntity.zo);
//                arrow.discard();
//              }
//              case 5 -> {
//                // strike entity with lightning
//                LightningBolt lightningBoltEntity = new LightningBolt(EntityType.LIGHTNING_BOLT, arrow.level);
//                lightningBoltEntity.setPos(hitResult.getLocation());
//                lightningBoltEntity.setVisualOnly(false);
//                // lightningBoltEntity.setDamage(10.0F); // not valid in fabric
//                lightningBoltEntity.setCause((ServerPlayer) arrow.getOwner());
//                arrow.level.addFreshEntity(lightningBoltEntity);
//                arrow.discard();
//              }
//              case 6 -> {
//                // create explosion at entity
//                arrow.level.explode(hitEntity, hitEntity.xo, hitEntity.yo + 1, hitEntity.zo, 1.0f, true, Level.ExplosionInteraction.MOB);
//                arrow.discard();
//              }
//              case 7 -> {
//                // spawn chickens at entity
//                for (int i = 0; i < 4; i++) {
//                  Chicken spawnableChicken = new Chicken(EntityType.CHICKEN, arrow.level);
//                  spawnableChicken.setPos(hitEntity.getEyePosition());
//                  arrow.level.addFreshEntity(spawnableChicken);
//                }
//                arrow.discard();
//              }
//              case 8 -> {
//                // spawn zombies at entity
//                for (int i = 0; i < 3; i++) {
//                  Zombie spawnableZombie = new Zombie(EntityType.ZOMBIE, arrow.level);
//                  spawnableZombie.setPos(hitEntity.getEyePosition());
//                  arrow.level.addFreshEntity(spawnableZombie);
//                }
//                arrow.discard();
//              }
//            }
//          }
//          hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), PAPER_BOW_DAMAGE);
//
//        }
//      }
    }
    // operating on the server and likely fired from a dispenser
    else if (!arrow.level.isClientSide && arrow.getOwner() == null) {

      Entity hitEntity = hitResult.getEntity();
      // PAPER ARROW OR MOSS ARROW FIRED FROM DISPENSER
      if (this.getClass() == PaperArrowEntity.class || this.getClass() == MossArrowEntity.class) {
        int a = ThreadLocalRandom.current().nextInt(1, 8 + 1);
        switch (a) {
          case 1 -> {
//            hitEntity.setSecondsOnFire(2);
            hitEntity.setRemainingFireTicks(2 * 20);
            arrow.discard();
          }
          case 2 -> {
            hitEntity.teleportTo(hitEntity.xo, hitEntity.yo, hitEntity.zo);
            arrow.discard();
          }
          case 3 -> {
            hitEntity.setDeltaMovement(0, 2, 0);
            arrow.discard();
          }
          case 4 -> {
            hitEntity.teleportTo(hitEntity.xo, hitEntity.yo + 10, hitEntity.zo);
            arrow.discard();
          }
          case 5 -> {
            LightningBolt lightningBoltEntity = new LightningBolt(EntityType.LIGHTNING_BOLT, arrow.level);
            lightningBoltEntity.setPos(hitResult.getLocation());
            lightningBoltEntity.setVisualOnly(false);
            // lightningBoltEntity.setDamage(10.0F); // not valid in fabric
            lightningBoltEntity.setCause(null);
            arrow.level.addFreshEntity(lightningBoltEntity);
            arrow.discard();
          }
          case 6 -> {
            arrow.level.explode(hitEntity, hitEntity.xo, hitEntity.yo + 1, hitEntity.zo, 1.0f, true, Level.ExplosionInteraction.MOB);
            arrow.discard();
          }
          case 7 -> {
            for (int i = 0; i < 7; i++) {
              arrow.level.addFreshEntity(new Chicken(EntityType.CHICKEN, arrow.level));
            }
            arrow.discard();
          }
          case 8 -> {
            for (int i = 0; i < 3; i++) {
              arrow.level.addFreshEntity(new Zombie(EntityType.ZOMBIE, arrow.level));
            }
            arrow.discard();
          }
        }
      }
    }
  }
}
