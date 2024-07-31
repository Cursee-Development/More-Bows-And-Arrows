package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.entity.custom.*;
import com.cursee.more_bows_and_arrows.core.item.ModItemsFabric;
import net.minecraft.core.Position;
import net.minecraft.core.dispenser.AbstractProjectileDispenseBehavior;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;

public class ModDispenserRegistryFabric {

    public static void register() {

        DispenserBlock.registerBehavior(ModItemsFabric.AMETHYST_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                AmethystArrow arrow = new AmethystArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.BAMBOO_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                BambooArrow arrow = new BambooArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.BLAZE_ROD_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                BlazeRodArrow arrow = new BlazeRodArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.BONE_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                BoneArrow arrow = new BoneArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.CACTUS_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                CactusArrow arrow = new CactusArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.COAL_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                CoalArrow arrow = new CoalArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.COPPER_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                CopperArrow arrow = new CopperArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.DIAMOND_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                DiamondArrow arrow = new DiamondArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.EMERALD_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                EmeraldArrow arrow = new EmeraldArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.ENDER_PEARL_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                EnderPearlArrow arrow = new EnderPearlArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.FLINT_AND_STEEL_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                FlintAndSteelArrow arrow = new FlintAndSteelArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.FLINT_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                FlintArrow arrow = new FlintArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.GOLD_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                GoldArrow arrow = new GoldArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.IRON_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                IronArrow arrow = new IronArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.LAPIS_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                LapisArrow arrow = new LapisArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.MOSS_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                MossArrow arrow = new MossArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.NETHERITE_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                NetheriteArrow arrow = new NetheriteArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.OBSIDIAN_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                ObsidianArrow arrow = new ObsidianArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.PAPER_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                PaperArrow arrow = new PaperArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItemsFabric.TNT_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                TNTArrow arrow = new TNTArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
    }
}
