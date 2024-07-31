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

public class BlazeRodArrow extends AbstractArrow implements ICustomArrow {

    public BlazeRodArrow(EntityType type, Level level) {
        super(type, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
    }

    public BlazeRodArrow(Level level, LivingEntity entity) {
        super((EntityType) ModEntitiesFabric.BLAZE_ROD_ARROW, entity, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
        this.setOwner(entity);
    }

    public BlazeRodArrow(Level level, double x, double y, double z) {
        super((EntityType) ModEntitiesFabric.BLAZE_ROD_ARROW, x, y, z, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
    }

    @Override
    protected ItemStack getPickupItem() {
        return new ItemStack(ModItemsFabric.BLAZE_ROD_ARROW);
    }

    @Override
    protected void onHit(HitResult result) {
        this.checkHitResult(this, result);
        super.onHit(result);
    }
}
