package com.cursee.more_bows_and_arrows.core.entity.custom;

import com.cursee.more_bows_and_arrows.core.entity.ICustomArrow;
import com.cursee.more_bows_and_arrows.core.entity.ModEntitiesForge;
import com.cursee.more_bows_and_arrows.core.item.ModItemsForge;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;

public class LapisArrow extends AbstractArrow implements ICustomArrow {

    public LapisArrow(EntityType type, Level level) {
        super(type, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
    }

    public LapisArrow(Level level, LivingEntity entity) {
        super((EntityType) ModEntitiesForge.LAPIS_ARROW.get(), entity, level, new ItemStack(ModItemsForge.LAPIS_ARROW.get()), new ItemStack(ModItemsForge.LAPIS_ARROW.get()));
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
        this.setOwner(entity);
    }

    public LapisArrow(Level level, double x, double y, double z) {
        super((EntityType) ModEntitiesForge.LAPIS_ARROW.get(), x, y, z, level, new ItemStack(ModItemsForge.LAPIS_ARROW.get()), new ItemStack(ModItemsForge.LAPIS_ARROW.get()));
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
    }

    @Override
    protected ItemStack getDefaultPickupItem() {
        return new ItemStack(ModItemsForge.LAPIS_ARROW.get());
    }

    @Override
    protected void onHit(HitResult result) {
        this.checkHitResult(this, result);

        if (result.getType() == HitResult.Type.ENTITY) this.discard();

        super.onHit(result);
    }
}
