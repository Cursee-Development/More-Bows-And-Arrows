package com.cursee.more_bows_and_arrows.item.arrow;

import com.cursee.more_bows_and_arrows.entity.projectile.AmethystArrowEntity;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class AmethystArrowItem extends ArrowItem {
  public AmethystArrowItem(Properties properties) {
    super(properties);
  }
  
//  @Override
//  public void appendHoverText(@NotNull ItemStack itemStack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag tooltipFlag) {
//    tooltip.add(Component.translatable("morebowsandarrows.text.amethyst_arrow_damage"));
//    super.appendHoverText(itemStack, level, tooltip, tooltipFlag);
//  }

  @Override
  public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> list, TooltipFlag tooltipFlag) {
    super.appendHoverText(itemStack, tooltipContext, list, tooltipFlag);
    list.add(Component.translatable("morebowsandarrows.text.amethyst_arrow_damage"));
  }

  @Override
  public AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity) {
    return new AmethystArrowEntity(level, livingEntity, itemStack);
  }

  public Projectile asProjectile(Level p_331476_, Position p_329787_, ItemStack p_328274_, Direction p_330256_) {
    AmethystArrowEntity $$4 = new AmethystArrowEntity(p_331476_, p_329787_.x(), p_329787_.y(), p_329787_.z(), p_328274_.copyWithCount(1));
    $$4.pickup = AbstractArrow.Pickup.ALLOWED;
    return $$4;
  }
}