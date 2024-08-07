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

public class GoldArrow extends AbstractArrow implements ICustomArrow {

    public GoldArrow(EntityType type, Level level) {
        super(type, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
    }

    public GoldArrow(Level level, LivingEntity entity) {
        super((EntityType) ModEntitiesFabric.GOLD_ARROW, entity, level, new ItemStack(ModItemsFabric.GOLD_ARROW), new ItemStack(ModItemsFabric.GOLD_ARROW));
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
        this.setOwner(entity);
    }

    public GoldArrow(Level level, double x, double y, double z) {
        super((EntityType) ModEntitiesFabric.GOLD_ARROW, x, y, z, level, new ItemStack(ModItemsFabric.GOLD_ARROW), new ItemStack(ModItemsFabric.GOLD_ARROW));
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
    }

    @Override
    protected ItemStack getDefaultPickupItem() {
        return new ItemStack(ModItemsFabric.GOLD_ARROW);
    }

    @Override
    protected void onHit(HitResult result) {
        this.checkHitResult(this, result);

        if (result.getType() == HitResult.Type.ENTITY) this.discard();


        super.onHit(result);
    }
}
