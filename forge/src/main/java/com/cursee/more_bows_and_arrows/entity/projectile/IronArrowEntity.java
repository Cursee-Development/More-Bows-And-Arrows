//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.cursee.more_bows_and_arrows.entity.projectile;

import com.cursee.more_bows_and_arrows.entity.IAbstractModArrow;
import com.cursee.more_bows_and_arrows.registry.ForgeEntityTypeRegistry;
import com.cursee.more_bows_and_arrows.registry.ForgeItemRegistry;
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

public class IronArrowEntity extends AbstractArrow implements IAbstractModArrow {

    public IronArrowEntity(EntityType<? extends AbstractArrow> entityEntityType, Level level) {
        super(entityEntityType, level);
        this.setBaseDamage(this.getBaseDamage() + 4.0d);
    }

    public IronArrowEntity(double d, double e, double f, Level level, ItemStack itemStack, @Nullable ItemStack itemStack2) {
        super(ForgeEntityTypeRegistry.IRON_ARROW_ENTITY.get(), d, e, f, level, itemStack, itemStack2);
        this.setBaseDamage(this.getBaseDamage() + 4.0);
        if (this.getOwner() instanceof Player && ((Player) this.getOwner()).getAbilities().instabuild) {
            this.pickup = Pickup.CREATIVE_ONLY;
        }
    }

    public IronArrowEntity(Level level, LivingEntity livingEntity, ItemStack itemStack, ItemStack itemStack2) {
        super(ForgeEntityTypeRegistry.AMETHYST_ARROW_ENTITY.get(), livingEntity, level, itemStack, itemStack);
        this.setBaseDamage(this.getBaseDamage() + 4.0d);
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
        return new ItemStack(ForgeItemRegistry.IRON_ARROW_ITEM.get());
    }
}
