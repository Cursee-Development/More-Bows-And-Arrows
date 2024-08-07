package com.cursee.more_bows_and_arrows.core.entity.custom;

import com.cursee.monolib.core.MonoLibConfiguration;
import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.core.entity.ICustomArrow;
import com.cursee.more_bows_and_arrows.core.entity.ModEntitiesFabric;
import com.cursee.more_bows_and_arrows.core.item.ModItemsFabric;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.Nullable;

public class AmethystArrow extends AbstractArrow implements ICustomArrow {

    public AmethystArrow(EntityType entityType, Level level) {
        super(entityType, level);
    }

    public AmethystArrow(double d, double e, double f, Level level) {
        super((EntityType) ModEntitiesFabric.AMETHYST_ARROW, d, e, f, level, ModItemsFabric.AMETHYST_ARROW.getDefaultInstance(), ModItemsFabric.AMETHYST_ARROW.getDefaultInstance());
    }

    public AmethystArrow(LivingEntity livingEntity, Level level) {
        super((EntityType) ModEntitiesFabric.AMETHYST_ARROW, livingEntity, level, ModItemsFabric.AMETHYST_ARROW.getDefaultInstance(), ModItemsFabric.AMETHYST_ARROW.getDefaultInstance());
    }

    @Override
    protected ItemStack getDefaultPickupItem() {
        return ModItemsFabric.AMETHYST_ARROW.getDefaultInstance();
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
//        super((EntityType) ModEntitiesFabric.AMETHYST_ARROW, entity, level);
//        this.setBaseDamage(this.getBaseDamage() + 2.0d);
////        this.ownerUUID = entity.getUUID();
////        this.cachedOwner = entity;
//    }
//
//    public AmethystArrow(Level level, double x, double y, double z) {
//        super((EntityType) ModEntitiesFabric.AMETHYST_ARROW, x, y, z, level);
//        this.setBaseDamage(this.getBaseDamage() + 2.0d);
//    }

//    @Override
//    protected ItemStack getPickupItem() {
//        return new ItemStack(ModItemsFabric.AMETHYST_ARROW);
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
