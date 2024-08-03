package com.cursee.more_bows_and_arrows.core.entity.custom;

import com.cursee.more_bows_and_arrows.core.entity.ICustomArrow;
import com.cursee.more_bows_and_arrows.core.entity.ModEntitiesFabric;
import com.cursee.more_bows_and_arrows.core.item.ModItemsFabric;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;

public class TNTArrow extends AbstractArrow implements ICustomArrow {

    public TNTArrow(EntityType type, Level level) {
        super(type, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
    }

    public TNTArrow(Level level, LivingEntity entity) {
        super((EntityType) ModEntitiesFabric.TNT_ARROW, entity, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
        this.setOwner(entity);
    }

    public TNTArrow(Level level, double x, double y, double z) {
        super((EntityType) ModEntitiesFabric.TNT_ARROW, x, y, z, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
    }

    @Override
    protected ItemStack getPickupItem() {
        return new ItemStack(ModItemsFabric.TNT_ARROW);
    }

    @Override
    protected void onHit(HitResult result) {
        this.checkHitResult(this, result);
        super.onHit(result);
        if (result.getType() == HitResult.Type.BLOCK || result.getType() == HitResult.Type.ENTITY) {
            this.discard();
        }
    }
}
