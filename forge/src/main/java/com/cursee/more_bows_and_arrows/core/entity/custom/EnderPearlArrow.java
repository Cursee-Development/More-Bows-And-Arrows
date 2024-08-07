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
import org.jetbrains.annotations.NotNull;

public class EnderPearlArrow extends AbstractArrow implements ICustomArrow {

    public EnderPearlArrow(EntityType type, Level level) {
        super(type, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
    }

    public EnderPearlArrow(Level level, LivingEntity entity) {
        super((EntityType) ModEntitiesForge.ENDER_PEARL_ARROW.get(), entity, level, new ItemStack(ModItemsForge.ENDER_PEARL_ARROW.get()), new ItemStack(ModItemsForge.ENDER_PEARL_ARROW.get()));
        this.setBaseDamage(this.getBaseDamage() + 2.0d);

        this.setOwner(entity);
        this.ownerUUID = entity.getUUID();
        this.cachedOwner = entity;
    }

    public EnderPearlArrow(Level level, double x, double y, double z) {
        super((EntityType) ModEntitiesForge.ENDER_PEARL_ARROW.get(), x, y, z, level, new ItemStack(ModItemsForge.ENDER_PEARL_ARROW.get()), new ItemStack(ModItemsForge.ENDER_PEARL_ARROW.get()));
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
    }

    @Override
    protected @NotNull ItemStack getDefaultPickupItem() {
        return new ItemStack(ModItemsForge.ENDER_PEARL_ARROW.get());
    }

    @Override
    protected void onHit(HitResult result) {
        this.checkHitResult(this, result);

        if (result.getType() == HitResult.Type.ENTITY) this.discard();

        super.onHit(result);
    }
}
