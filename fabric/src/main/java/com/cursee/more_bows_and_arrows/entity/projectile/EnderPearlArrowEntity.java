//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.cursee.more_bows_and_arrows.entity.projectile;

import com.cursee.more_bows_and_arrows.entity.IAbstractModArrow;
import com.cursee.more_bows_and_arrows.registry.FabricEntityTypeRegistry;
import com.cursee.more_bows_and_arrows.registry.FabricItemRegistry;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.RelativeMovement;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

public class EnderPearlArrowEntity extends AbstractArrow implements IAbstractModArrow {
    
    public EnderPearlArrowEntity(EntityType<? extends EnderPearlArrowEntity> entType, Level level, ItemStack itemStack) {
        super(entType, level, itemStack);
        this.setBaseDamage(this.getBaseDamage() + 4.0);
    }
    
    public EnderPearlArrowEntity(Level level, LivingEntity liveEntity, ItemStack itemStack) {
        super(FabricEntityTypeRegistry.ENDER_PEARL_ARROW_ENTITY, liveEntity, level, itemStack);
        this.setBaseDamage(this.getBaseDamage() + 4.0);
        if (liveEntity instanceof Player && ((Player)liveEntity).getAbilities().instabuild) {
            this.pickup = Pickup.CREATIVE_ONLY;
        }
    }
    
    public EnderPearlArrowEntity(Level level, double x, double y, double z, ItemStack itemStack) {
        super(FabricEntityTypeRegistry.ENDER_PEARL_ARROW_ENTITY, x, y, z, level, itemStack);
        this.setBaseDamage(this.getBaseDamage() + 4.0);
    }
    
    public EnderPearlArrowEntity(Level level, LivingEntity liveEntity) {
        this(level, liveEntity, new ItemStack(FabricItemRegistry.ENDER_PEARL_ARROW_ITEM));
    }
    
    public EnderPearlArrowEntity(EntityType<EnderPearlArrowEntity> EnderPearlArrowEntityEntityType, Level level) {
        this(EnderPearlArrowEntityEntityType, level, new ItemStack(FabricItemRegistry.ENDER_PEARL_ARROW_ITEM));
    }

    public void onHitEntity(@NotNull EntityHitResult hitResult) {
        checkArrowEntityDamage(this, hitResult);

        if (!this.level.isClientSide) {
            Entity owner = this.getOwner();
            Entity hitEntity = hitResult.getEntity();

            hitEntity.teleportTo((ServerLevel) owner.level, owner.xo, owner.yo, owner.zo, RelativeMovement.ROTATION, 1.0f, 1.0f);
        }

        super.onHitEntity(hitResult);
    }

    public void onHitBlock(@NotNull BlockHitResult hitResult) {

        if (!this.level.isClientSide && this.getOwner() != null) {
            Entity owner = this.getOwner();

            assert owner != null;
            owner.teleportTo((ServerLevel) owner.level, this.xo, this.yo, this.zo, RelativeMovement.ROTATION, owner.getYRot(), owner.getXRot());
        }

        this.remove(RemovalReason.DISCARDED);
        super.onHitBlock(hitResult);
    }

    protected @NotNull ItemStack getDefaultPickupItem() {
        return new ItemStack(FabricItemRegistry.ENDER_PEARL_ARROW_ITEM);
    }
}
