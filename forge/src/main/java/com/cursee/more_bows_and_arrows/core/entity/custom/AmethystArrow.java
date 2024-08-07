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

public class AmethystArrow extends AbstractArrow implements ICustomArrow {

    public AmethystArrow(EntityType entityType, Level level) {
        super(entityType, level);
    }

    public AmethystArrow(double d, double e, double f, Level level) {
        super((EntityType) ModEntitiesForge.AMETHYST_ARROW.get(), d, e, f, level, ModItemsForge.AMETHYST_ARROW.get().getDefaultInstance(), ModItemsForge.AMETHYST_ARROW.get().getDefaultInstance());
    }

    public AmethystArrow(Level level, LivingEntity livingEntity) {
        super((EntityType) ModEntitiesForge.AMETHYST_ARROW.get(), livingEntity, level, ModItemsForge.AMETHYST_ARROW.get().getDefaultInstance(), ModItemsForge.AMETHYST_ARROW.get().getDefaultInstance());
    }

    @Override
    protected ItemStack getDefaultPickupItem() {
        return ModItemsForge.AMETHYST_ARROW.get().getDefaultInstance();
    }

    @Override
    protected void onHit(HitResult result) {
        this.checkHitResult(this, result);

        if (result.getType() == HitResult.Type.ENTITY) this.discard();

        super.onHit(result);
    }

    //    public AmethystArrow(EntityType type, Level level) {
//        super(type, level);
//        this.setBaseDamage(this.getBaseDamage() + 2.0d);
//    }
//
//    public AmethystArrow(Level level, LivingEntity entity) {
//        super((EntityType) ModEntitiesForge.AMETHYST_ARROW.get(), entity, level);
//        this.setBaseDamage(this.getBaseDamage() + 2.0d);
////        this.ownerUUID = entity.getUUID();
////        this.cachedOwner = entity;
//    }
//
//    public AmethystArrow(Level level, double x, double y, double z) {
//        super((EntityType) ModEntitiesForge.AMETHYST_ARROW.get(), x, y, z, level);
//        this.setBaseDamage(this.getBaseDamage() + 2.0d);
//    }

//    @Override
//    protected ItemStack getPickupItem() {
//        return new ItemStack(ModItemsForge.AMETHYST_ARROW.get());
//    }
//
//    @Override
//    protected void onHit(HitResult result) {
//
//        debug("checking AmethystArrow onHit method HitResult parameter");
//
//        this.checkHitResult(this, result);
//        super.onHit(result);
//    }
}
