package com.cursee.more_bows_and_arrows.entity.projectile;

import com.cursee.more_bows_and_arrows.entity.IAbstractModArrow;
import com.cursee.more_bows_and_arrows.registry.FabricEntityTypeRegistry;
import com.cursee.more_bows_and_arrows.registry.FabricItemRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

public class DiamondArrowEntity extends AbstractArrow implements IAbstractModArrow {
    
    public DiamondArrowEntity(EntityType<? extends DiamondArrowEntity> entType, Level level, ItemStack itemStack) {
        super(entType, level, itemStack);
        this.setBaseDamage(this.getBaseDamage() + 4.0);
    }
    
    public DiamondArrowEntity(Level level, LivingEntity liveEntity, ItemStack itemStack) {
        super(FabricEntityTypeRegistry.DIAMOND_ARROW_ENTITY, liveEntity, level, itemStack);
        this.setBaseDamage(this.getBaseDamage() + 4.0);
        if (liveEntity instanceof Player && ((Player)liveEntity).getAbilities().instabuild) {
            this.pickup = Pickup.CREATIVE_ONLY;
        }
    }
    
    public DiamondArrowEntity(Level level, double x, double y, double z, ItemStack itemStack) {
        super(FabricEntityTypeRegistry.DIAMOND_ARROW_ENTITY, x, y, z, level, itemStack);
        this.setBaseDamage(this.getBaseDamage() + 4.0);
    }
    
    public DiamondArrowEntity(Level level, LivingEntity liveEntity) {
        this(level, liveEntity, new ItemStack(FabricItemRegistry.DIAMOND_ARROW_ITEM));
    }
    
    public DiamondArrowEntity(EntityType<DiamondArrowEntity> DiamondArrowEntityEntityType, Level level) {
        this(DiamondArrowEntityEntityType, level, new ItemStack(FabricItemRegistry.DIAMOND_ARROW_ITEM));
    }
    
    public void onHitEntity(@NotNull EntityHitResult hitResult) {
        checkArrowEntityDamage(this, hitResult);
        super.onHitEntity(hitResult);
    }
    
    public void onHitBlock(@NotNull BlockHitResult hitResult) {
        checkArrowBlockDamage(this, hitResult);
        super.onHitBlock(hitResult);
    }
    
    protected @NotNull ItemStack getDefaultPickupItem() {
        return new ItemStack(FabricItemRegistry.DIAMOND_ARROW_ITEM);
    }
}
