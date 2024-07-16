package com.cursee.more_bows_and_arrows.entity.projectile;

import com.cursee.more_bows_and_arrows.entity.IAbstractModArrow;
import com.cursee.more_bows_and_arrows.registry.FabricEntityTypeRegistry;
import com.cursee.more_bows_and_arrows.registry.FabricItemRegistry;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AmethystArrowEntity extends AbstractArrow implements IAbstractModArrow {

  public AmethystArrowEntity(EntityType<? extends AbstractArrow> entityEntityType, Level level) {
    super(entityEntityType, level);
    this.setBaseDamage(this.getBaseDamage() + 4.0d);
  }

  public AmethystArrowEntity(double d, double e, double f, Level level, ItemStack itemStack, @Nullable ItemStack itemStack2) {
    super(FabricEntityTypeRegistry.AMETHYST_ARROW_ENTITY, d, e, f, level, itemStack, itemStack2);
    this.setBaseDamage(this.getBaseDamage() + 4.0);
    if (this.getOwner() instanceof Player && ((Player) this.getOwner()).getAbilities().instabuild) {
      this.pickup = Pickup.CREATIVE_ONLY;
    }
  }

  public AmethystArrowEntity(Level level, LivingEntity livingEntity, ItemStack itemStack, ItemStack itemStack2) {
    super(FabricEntityTypeRegistry.AMETHYST_ARROW_ENTITY, livingEntity, level, itemStack, itemStack);
    this.setBaseDamage(this.getBaseDamage() + 4.0d);
  }

//  public AmethystArrowEntity(Level level) {
//    super(FabricEntityTypeRegistry.AMETHYST_ARROW_ENTITY, level);
//  }

//  public AmethystArrowEntity(LivingEntity livingEntity, Level level, ItemStack itemStack, @Nullable ItemStack itemStack2) {
//    super(FabricEntityTypeRegistry.AMETHYST_ARROW_ENTITY, livingEntity, level, itemStack, itemStack2);
//  }


//  public AmethystArrowEntity(EntityType<? extends AmethystArrowEntity> entType, Level level, ItemStack itemStack) {
//    super(entType, level, itemStack);
//    this.setBaseDamage(this.getBaseDamage() + 4.0);
//  }
//
//  public AmethystArrowEntity(Level level, LivingEntity liveEntity, ItemStack itemStack) {
//    super(FabricEntityTypeRegistry.AMETHYST_ARROW_ENTITY, liveEntity, level, itemStack);
//    this.setBaseDamage(this.getBaseDamage() + 4.0);
//    if (liveEntity instanceof Player && ((Player)liveEntity).getAbilities().instabuild) {
//      this.pickup = Pickup.CREATIVE_ONLY;
//    }
//
//  }
//
//  public AmethystArrowEntity(Level level, double x, double y, double z, ItemStack itemStack) {
//    super(FabricEntityTypeRegistry.AMETHYST_ARROW_ENTITY, x, y, z, level, itemStack);
//    this.setBaseDamage(this.getBaseDamage() + 4.0);
//  }
//
//  public AmethystArrowEntity(Level level, LivingEntity liveEntity) {
//    this(level, liveEntity, new ItemStack(FabricItemRegistry.AMETHYST_ARROW_ITEM));
//  }
//
//  public AmethystArrowEntity(EntityType<AmethystArrowEntity> AmethystArrowEntityEntityType, Level level) {
//    this(AmethystArrowEntityEntityType, level, new ItemStack(FabricItemRegistry.AMETHYST_ARROW_ITEM));
//  }
  
  
  public void onHitEntity(@NotNull EntityHitResult hitResult) {
    checkArrowEntityDamage(this, hitResult);
    super.onHitEntity(hitResult);
  }
  
  public void onHitBlock(@NotNull BlockHitResult hitResult) {
    checkArrowBlockDamage(this, hitResult);
    super.onHitBlock(hitResult);
  }
  
  protected @NotNull ItemStack getDefaultPickupItem() {
    return new ItemStack(FabricItemRegistry.AMETHYST_ARROW_ITEM);
  }

//  @Override
//  protected ItemStack getDefaultPickupItem() {
//    return Items.ARROW.getDefaultInstance();
//  }
}
