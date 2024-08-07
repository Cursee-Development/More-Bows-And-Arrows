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
import org.jetbrains.annotations.NotNull;

public class EnderPearlArrow extends AbstractArrow implements ICustomArrow {

    public EnderPearlArrow(EntityType type, Level level) {
        super(type, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
    }

    public EnderPearlArrow(Level level, LivingEntity entity) {
        super((EntityType) ModEntitiesFabric.ENDER_PEARL_ARROW, entity, level, new ItemStack(ModItemsFabric.ENDER_PEARL_ARROW), new ItemStack(ModItemsFabric.ENDER_PEARL_ARROW));
        this.setBaseDamage(this.getBaseDamage() + 2.0d);

        debug("created new ender pearl arrow entity from " + entity.getScoreboardName());

        this.setOwner(entity);
        this.ownerUUID = entity.getUUID();
        this.cachedOwner = entity;

        debug(this.getOwner().getDisplayName().getString());
    }

    public EnderPearlArrow(Level level, double x, double y, double z) {
        super((EntityType) ModEntitiesFabric.ENDER_PEARL_ARROW, x, y, z, level, new ItemStack(ModItemsFabric.ENDER_PEARL_ARROW), new ItemStack(ModItemsFabric.ENDER_PEARL_ARROW));
        this.setBaseDamage(this.getBaseDamage() + 2.0d);
    }

    @Override
    protected @NotNull ItemStack getDefaultPickupItem() {
        return new ItemStack(ModItemsFabric.ENDER_PEARL_ARROW);
    }

    @Override
    protected void onHit(HitResult result) {
        this.checkHitResult(this, result);

        if (result.getType() == HitResult.Type.ENTITY) this.discard();


        super.onHit(result);
    }
}
