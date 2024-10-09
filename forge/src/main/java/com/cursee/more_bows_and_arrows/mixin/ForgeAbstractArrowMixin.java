package com.cursee.more_bows_and_arrows.mixin;

import com.cursee.more_bows_and_arrows.core.item.custom.TieredBowItem;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.TraceableEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(AbstractArrow.class)
public class ForgeAbstractArrowMixin {

    @Redirect(method = "onHitEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private boolean redirected$onHitEntityHurt(Entity toHurt, DamageSource source, float damage) {

        AbstractArrow self = (AbstractArrow) (Object) this;

        if (self.getOwner() instanceof Player player) {

            if (player.getMainHandItem().getItem() instanceof TieredBowItem tieredBowItem) {
                return toHurt.hurt(source, damage + tieredBowItem.damageFromBowTier());
            }
        }

        return toHurt.hurt(source, damage);
    }
}
