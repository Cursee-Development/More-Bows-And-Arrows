//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.cursee.more_bows_and_arrows.entity.projectile;

import com.cursee.more_bows_and_arrows.entity.IAbstractModArrow;
import com.cursee.more_bows_and_arrows.registry.FabricEntityTypeRegistry;
import com.cursee.more_bows_and_arrows.registry.FabricItemRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

public class TNTArrowEntity extends AbstractArrow implements IAbstractModArrow {
    
    public TNTArrowEntity(EntityType<? extends TNTArrowEntity> entType, Level level, ItemStack itemStack) {
        super(entType, level, itemStack);
        this.setBaseDamage(this.getBaseDamage() + 4.0);
    }
    
    public TNTArrowEntity(Level level, LivingEntity liveEntity, ItemStack itemStack) {
        super(FabricEntityTypeRegistry.TNT_ARROW_ENTITY, liveEntity, level, itemStack);
        this.setBaseDamage(this.getBaseDamage() + 4.0);
        if (liveEntity instanceof Player && ((Player)liveEntity).getAbilities().instabuild) {
            this.pickup = Pickup.CREATIVE_ONLY;
        }
    }
    
    public TNTArrowEntity(Level level, double x, double y, double z, ItemStack itemStack) {
        super(FabricEntityTypeRegistry.TNT_ARROW_ENTITY, x, y, z, level, itemStack);
        this.setBaseDamage(this.getBaseDamage() + 4.0);
    }
    
    public TNTArrowEntity(Level level, LivingEntity liveEntity) {
        this(level, liveEntity, new ItemStack(FabricItemRegistry.TNT_ARROW_ITEM));
    }
    
    public TNTArrowEntity(EntityType<TNTArrowEntity> TNTArrowEntityEntityType, Level level) {
        this(TNTArrowEntityEntityType, level, new ItemStack(FabricItemRegistry.TNT_ARROW_ITEM));
    }

    public void onHitEntity(@NotNull EntityHitResult hitResult) {
        checkArrowEntityDamage(this, hitResult);

        if (!this.level.isClientSide) {
            Entity hit = hitResult.getEntity();
            level.explode(hit, hit.xo, hit.yo+1, hit.zo, 1.0f, true, Level.ExplosionInteraction.MOB);
        }
        super.onHitEntity(hitResult);
    }

    public void onHitBlock(@NotNull BlockHitResult hitResult) {

        if (!this.level.isClientSide) {
            BlockPos hit = hitResult.getBlockPos();
            level.explode(this, hit.getX(), hit.getY()+1, hit.getZ(), 2.0f, true, Level.ExplosionInteraction.BLOCK);
        }
        this.remove(RemovalReason.DISCARDED);
        super.onHitBlock(hitResult);
    }

    protected @NotNull ItemStack getDefaultPickupItem() {
        return new ItemStack(FabricItemRegistry.TNT_ARROW_ITEM);
    }
}
