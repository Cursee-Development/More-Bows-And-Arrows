//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.cursee.more_bows_and_arrows.item.arrow;

import com.cursee.more_bows_and_arrows.entity.projectile.BambooArrowEntity;
import com.cursee.more_bows_and_arrows.entity.projectile.CoalArrowEntity;
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

public class CoalArrowItem extends ArrowItem {
    public CoalArrowItem(Properties properties) {
        super(properties);
    }

    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> tooltip, TooltipFlag tooltipFlag) {
        super.appendHoverText(itemStack, tooltipContext, tooltip, tooltipFlag);
        tooltip.add(Component.translatable("morebowsandarrows.text.coal_arrow_damage"));
    }
    
    public @NotNull AbstractArrow createArrow(@NotNull Level level, @NotNull ItemStack arrowItem, @NotNull LivingEntity livingEntity) {
        return new CoalArrowEntity(level, livingEntity, arrowItem);
    }

    public Projectile asProjectile(Level p_331476_, Position p_329787_, ItemStack p_328274_, Direction p_330256_) {
        CoalArrowEntity $$4 = new CoalArrowEntity(p_331476_, p_329787_.x(), p_329787_.y(), p_329787_.z(), p_328274_.copyWithCount(1));
        $$4.pickup = Pickup.ALLOWED;
        return $$4;
    }
}
