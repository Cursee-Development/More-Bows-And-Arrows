package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.item.ModItemsForge;
import net.minecraft.world.level.block.DispenserBlock;

public class ModDispenserRegistryForge {

//    public static Object2ObjectMap<Item, AbstractProjectileDispenseBehavior> DISPENSER_OBJECT_MAP = new Object2ObjectOpenHashMap();

    public static void registerArrowsAsProjectiles() {

        DispenserBlock.registerProjectileBehavior(ModItemsForge.AMETHYST_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.BAMBOO_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.BLAZE_ROD_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.BONE_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.CACTUS_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.COAL_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.COPPER_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.DIAMOND_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.EMERALD_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.ENDER_PEARL_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.FLINT_AND_STEEL_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.FLINT_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.GOLD_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.IRON_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.LAPIS_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.MOSS_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.NETHERITE_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.OBSIDIAN_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.PAPER_ARROW.get());
        DispenserBlock.registerProjectileBehavior(ModItemsForge.TNT_ARROW.get());

//        Map<Item, AbstractProjectileDispenseBehavior> syncronizedDispenserMap = Object2ObjectMaps.synchronize(DISPENSER_OBJECT_MAP);
//
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.FLINT_AND_STEEL_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                FlintAndSteelArrow arrow = new FlintAndSteelArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.ENDER_PEARL_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                EnderPearlArrow arrow = new EnderPearlArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.TNT_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                TNTArrow arrow = new TNTArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.PAPER_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                PaperArrow arrow = new PaperArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.MOSS_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                MossArrow arrow = new MossArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.AMETHYST_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                AmethystArrow arrow = new AmethystArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.BAMBOO_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                BambooArrow arrow = new BambooArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.BLAZE_ROD_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                BlazeRodArrow arrow = new BlazeRodArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.BONE_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                BoneArrow arrow = new BoneArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.CACTUS_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                CactusArrow arrow = new CactusArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.COAL_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                CoalArrow arrow = new CoalArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.EMERALD_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                EmeraldArrow arrow = new EmeraldArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.LAPIS_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                LapisArrow arrow = new LapisArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.OBSIDIAN_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                ObsidianArrow arrow = new ObsidianArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.FLINT_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                FlintArrow arrow = new FlintArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.IRON_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                IronArrow arrow = new IronArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.COPPER_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                CopperArrow arrow = new CopperArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.GOLD_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                GoldArrow arrow = new GoldArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.DIAMOND_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                DiamondArrow arrow = new DiamondArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DISPENSER_OBJECT_MAP.put(ModItemsForge.NETHERITE_ARROW.get(), new AbstractProjectileDispenseBehavior() {
//            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//                NetheriteArrow arrow = new NetheriteArrow(level, pos.x(), pos.y(), pos.z());
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//
//        DispenserBlock.DISPENSER_REGISTRY.putAll(syncronizedDispenserMap);
    }
}
