//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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

public class LapisArrowEntity extends AbstractArrow implements IAbstractModArrow {
    
    public LapisArrowEntity(EntityType<? extends LapisArrowEntity> entType, Level level, ItemStack itemStack) {
        super(entType, level, itemStack);
        this.setBaseDamage(this.getBaseDamage() + 4.0);
    }
    
    public LapisArrowEntity(Level level, LivingEntity liveEntity, ItemStack itemStack) {
        super(FabricEntityTypeRegistry.LAPIS_ARROW_ENTITY, liveEntity, level, itemStack);
        this.setBaseDamage(this.getBaseDamage() + 4.0);
        if (liveEntity instanceof Player && ((Player)liveEntity).getAbilities().instabuild) {
            this.pickup = Pickup.CREATIVE_ONLY;
        }
    }
    
    public LapisArrowEntity(Level level, double x, double y, double z, ItemStack itemStack) {
        super(FabricEntityTypeRegistry.LAPIS_ARROW_ENTITY, x, y, z, level, itemStack);
        this.setBaseDamage(this.getBaseDamage() + 4.0);
    }
    
    public LapisArrowEntity(Level level, LivingEntity liveEntity) {
        this(level, liveEntity, new ItemStack(FabricItemRegistry.LAPIS_ARROW_ITEM));
    }
    
    public LapisArrowEntity(EntityType<LapisArrowEntity> LapisArrowEntityEntityType, Level level) {
        this(LapisArrowEntityEntityType, level, new ItemStack(FabricItemRegistry.LAPIS_ARROW_ITEM));
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
        return new ItemStack(FabricItemRegistry.LAPIS_ARROW_ITEM);
    }
}
