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
import org.jetbrains.annotations.Nullable;

public class BambooArrowEntity extends AbstractArrow implements IAbstractModArrow {

    public BambooArrowEntity(EntityType<? extends AbstractArrow> entityEntityType, Level level) {
        super(entityEntityType, level);
        this.setBaseDamage(this.getBaseDamage() + 4.0d);
    }

    public BambooArrowEntity(double d, double e, double f, Level level, ItemStack itemStack, @Nullable ItemStack itemStack2) {
        super(FabricEntityTypeRegistry.BAMBOO_ARROW_ENTITY, d, e, f, level, itemStack, itemStack2);
        this.setBaseDamage(this.getBaseDamage() + 4.0);
        if (this.getOwner() instanceof Player && ((Player) this.getOwner()).getAbilities().instabuild) {
            this.pickup = Pickup.CREATIVE_ONLY;
        }
    }

    public BambooArrowEntity(Level level, LivingEntity livingEntity, ItemStack itemStack, ItemStack itemStack2) {
        super(FabricEntityTypeRegistry.BAMBOO_ARROW_ENTITY, livingEntity, level, itemStack, itemStack);
        this.setBaseDamage(this.getBaseDamage() + 4.0d);
    }
    
//    public BambooArrowEntity(EntityType<? extends BambooArrowEntity> entType, Level level, ItemStack itemStack) {
//        super(entType, level, itemStack);
//        this.setBaseDamage(this.getBaseDamage() + 4.0);
//    }
//
//    public BambooArrowEntity(Level level, LivingEntity liveEntity, ItemStack itemStack) {
//        super(FabricEntityTypeRegistry.BAMBOO_ARROW_ENTITY, liveEntity, level, itemStack);
//        this.setBaseDamage(this.getBaseDamage() + 4.0);
//        if (liveEntity instanceof Player && ((Player)liveEntity).getAbilities().instabuild) {
//            this.pickup = Pickup.CREATIVE_ONLY;
//        }
//    }
//
//    public BambooArrowEntity(Level level, double x, double y, double z, ItemStack itemStack) {
//        super(FabricEntityTypeRegistry.BAMBOO_ARROW_ENTITY, x, y, z, level, itemStack);
//        this.setBaseDamage(this.getBaseDamage() + 4.0);
//    }
//
//    public BambooArrowEntity(Level level, LivingEntity liveEntity) {
//        this(level, liveEntity, new ItemStack(FabricItemRegistry.BAMBOO_ARROW_ITEM));
//    }
//
//    public BambooArrowEntity(EntityType<BambooArrowEntity> BambooArrowEntityEntityType, Level level) {
//        this(BambooArrowEntityEntityType, level, new ItemStack(FabricItemRegistry.BAMBOO_ARROW_ITEM));
//    }

    public void onHitEntity(@NotNull EntityHitResult hitResult) {
        checkArrowEntityDamage(this, hitResult);
        super.onHitEntity(hitResult);
    }

    public void onHitBlock(@NotNull BlockHitResult hitResult) {
        checkArrowBlockDamage(this, hitResult);
        super.onHitBlock(hitResult);
    }

    protected @NotNull ItemStack getDefaultPickupItem() {
        return new ItemStack(FabricItemRegistry.BAMBOO_ARROW_ITEM);
    }

//    @Override
//    protected ItemStack getDefaultPickupItem() {
//        return Items.ARROW.getDefaultInstance();
//    }
}
