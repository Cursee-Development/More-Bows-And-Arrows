package com.cursee.more_bows_and_arrows.core.entity.custom;

import com.cursee.more_bows_and_arrows.core.entity.ICustomArrow;
import com.cursee.more_bows_and_arrows.core.entity.ModEntitiesForge;
import com.cursee.more_bows_and_arrows.core.item.ModItemsForge;
import com.cursee.more_bows_and_arrows.core.item.custom.MultiArrowItem;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;

public class _TypedArrow extends AbstractArrow implements ICustomArrow {

    MultiArrowItem.Type type;

    public _TypedArrow(MultiArrowItem.Type arrowType, EntityType entityType, Level level) {
        super(entityType, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
        this. type = arrowType;
    }

    public _TypedArrow(Level level, LivingEntity entity) {
        super((EntityType) ModEntitiesForge.AMETHYST_ARROW.get(), entity, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
    }

    public _TypedArrow(Level level, double x, double y, double z) {
        super((EntityType) ModEntitiesForge.AMETHYST_ARROW.get(), x, y, z, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
    }

    @Override
    protected ItemStack getPickupItem() {
        return new ItemStack(ModItemsForge.AMETHYST_ARROW.get());
    }

    @Override
    protected void onHit(HitResult result) {
        this.checkHitResult(this, result);
        super.onHit(result);
    }
}
