//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.cursee.more_bows_and_arrows.item.arrow;

import com.cursee.more_bows_and_arrows.entity.projectile.EnderPearlArrowEntity;
import com.cursee.more_bows_and_arrows.registry.ForgeEntityTypeRegistry;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.AbstractArrow.Pickup;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EnderPearlArrowItem extends ArrowItem {
    public EnderPearlArrowItem(Properties properties) {
        super(properties);
    }

    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> tooltip, TooltipFlag tooltipFlag) {
        super.appendHoverText(itemStack, tooltipContext, tooltip, tooltipFlag);
        tooltip.add(Component.translatable("more_bows_and_arrows.text.ender_pearl_arrow_damage"));
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity, @Nullable ItemStack itemStack2) {
        return new EnderPearlArrowEntity(level, livingEntity, itemStack.copyWithCount(1), itemStack2);
    }

    public Projectile asProjectile(Level level, Position pos, ItemStack stack, Direction direction) {
//    AmethystArrowEntity $$4 = new AmethystArrowEntity(level, pos.x(), pos.y(), pos.z(), stack.copyWithCount(1));
        EnderPearlArrowEntity $$4 = new EnderPearlArrowEntity(pos.x(), pos.y(), pos.z(), level, stack.copyWithCount(1), null);
        $$4.pickup = Pickup.ALLOWED;
        return $$4;
    }
}
