//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.cursee.more_bows_and_arrows.item.arrow;

import com.cursee.more_bows_and_arrows.entity.projectile.BambooArrowEntity;
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
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class BambooArrowItem extends ArrowItem {
    public BambooArrowItem(Properties properties) {
        super(properties);
    }

    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> list, TooltipFlag tooltipFlag) {
        super.appendHoverText(itemStack, tooltipContext, list, tooltipFlag);
        list.add(Component.translatable("morebowsandarrows.text.bamboo_arrow_damage"));
    }

    public @NotNull AbstractArrow createArrow(@NotNull Level level, @NotNull ItemStack arrowItem, @NotNull LivingEntity livingEntity) {
        return new BambooArrowEntity(level, livingEntity, arrowItem);
    }

    public Projectile asProjectile(Level p_331476_, Position p_329787_, ItemStack p_328274_, Direction p_330256_) {
        BambooArrowEntity $$4 = new BambooArrowEntity(p_331476_, p_329787_.x(), p_329787_.y(), p_329787_.z(), p_328274_.copyWithCount(1));
        $$4.pickup = Pickup.ALLOWED;
        return $$4;
    }
}
