package com.cursee.more_bows_and_arrows.registry;

import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.core.dispenser.ProjectileDispenseBehavior;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.DispenserBlock;

import java.util.Map;

public class ForgeDispenserBehaviorRegistry {
  public static Object2ObjectMap<Item, DispenseItemBehavior> DISPENSER_OBJECT_MAP = new Object2ObjectOpenHashMap();

  public static void registerArrowsAsProjectiles() {
    Map<Item, DispenseItemBehavior> syncronizedDispenserMap = Object2ObjectMaps.synchronize(DISPENSER_OBJECT_MAP);

    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.FLINT_AND_STEEL_ARROW_ITEM.get());
//    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.FLINT_AND_STEEL_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
//      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
//        FlintAndSteelArrowEntity arrow = new FlintAndSteelArrowEntity(level, pos.x(), pos.y(), pos.z(), stack);
//        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//        return arrow;
//      }
//    });
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.ENDER_PEARL_ARROW_ITEM.get());
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.TNT_ARROW_ITEM.get());
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.PAPER_ARROW_ITEM.get());
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.MOSS_ARROW_ITEM.get());
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.AMETHYST_ARROW_ITEM.get());
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.BAMBOO_ARROW_ITEM.get());
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.BLAZE_ROD_ARROW_ITEM.get());
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.BONE_ARROW_ITEM.get());
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.CACTUS_ARROW_ITEM.get());
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.COAL_ARROW_ITEM.get());
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.EMERALD_ARROW_ITEM.get());
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.LAPIS_ARROW_ITEM.get());
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.OBSIDIAN_ARROW_ITEM.get());
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.FLINT_ARROW_ITEM.get());
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.IRON_ARROW_ITEM.get());
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.COPPER_ARROW_ITEM.get());
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.GOLD_ARROW_ITEM.get());
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.DIAMOND_ARROW_ITEM.get());
    registerProjectileBehavior(syncronizedDispenserMap, ForgeItemRegistry.NETHERITE_ARROW_ITEM.get());

    DispenserBlock.DISPENSER_REGISTRY.putAll(syncronizedDispenserMap);
  }

  public static void registerProjectileBehavior(Map<Item, DispenseItemBehavior> map, ItemLike p_329878_) {
    map.put(p_329878_.asItem(), new ProjectileDispenseBehavior(p_329878_.asItem()));
  }
}
