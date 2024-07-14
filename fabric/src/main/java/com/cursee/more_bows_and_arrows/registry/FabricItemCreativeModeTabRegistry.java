package com.cursee.more_bows_and_arrows.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import com.cursee.more_bows_and_arrows.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;

public class FabricItemCreativeModeTabRegistry {
  
  public static void register() {
    Constants.LOG.info("FabricItemGroupRegistry " + Constants.MOD_ID);
    Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "morebowsandarrows_tab"), MOREBOWSANDARROWS_TAB);
    registerCreativeTabEntries();
  }
  
  public static void addBows(CreativeModeTab.Output output) {
    output.accept(FabricItemRegistry.OAK_BOW);
    output.accept(FabricItemRegistry.STRIPPED_OAK_BOW);
    output.accept(FabricItemRegistry.DARK_OAK_BOW);
    output.accept(FabricItemRegistry.STRIPPED_DARK_OAK_BOW);
    output.accept(FabricItemRegistry.SPRUCE_BOW);
    output.accept(FabricItemRegistry.STRIPPED_SPRUCE_BOW);
    output.accept(FabricItemRegistry.BIRCH_BOW);
    output.accept(FabricItemRegistry.STRIPPED_BIRCH_BOW);
    output.accept(FabricItemRegistry.JUNGLE_BOW);
    output.accept(FabricItemRegistry.STRIPPED_JUNGLE_BOW);
    output.accept(FabricItemRegistry.ACACIA_BOW);
    output.accept(FabricItemRegistry.STRIPPED_ACACIA_BOW);
    output.accept(FabricItemRegistry.MANGROVE_BOW);
    output.accept(FabricItemRegistry.STRIPPED_MANGROVE_BOW);
    output.accept(FabricItemRegistry.CHERRY_BOW);
    output.accept(FabricItemRegistry.STRIPPED_CHERRY_BOW);
    output.accept(FabricItemRegistry.BAMBOO_BOW);
    output.accept(FabricItemRegistry.STRIPPED_BAMBOO_BOW);
    output.accept(FabricItemRegistry.CRIMSON_STEM_BOW);
    output.accept(FabricItemRegistry.STRIPPED_CRIMSON_STEM_BOW);
    output.accept(FabricItemRegistry.WARPED_STEM_BOW);
    output.accept(FabricItemRegistry.STRIPPED_WARPED_STEM_BOW);
    
    output.accept(FabricItemRegistry.PAPER_BOW);
    output.accept(FabricItemRegistry.MOSS_BOW);
    output.accept(FabricItemRegistry.LAPIS_BOW);
    output.accept(FabricItemRegistry.AMETHYST_BOW);
    output.accept(FabricItemRegistry.BONE_BOW);
    output.accept(FabricItemRegistry.COAL_BOW);
    output.accept(FabricItemRegistry.EMERALD_BOW);
    output.accept(FabricItemRegistry.BLAZE_BOW);
    output.accept(FabricItemRegistry.OBSIDIAN_BOW);
    
    output.accept(FabricItemRegistry.IRON_BOW);
    output.accept(FabricItemRegistry.COPPER_BOW);
    output.accept(FabricItemRegistry.GOLD_BOW);
    output.accept(FabricItemRegistry.DIAMOND_BOW);
    output.accept(FabricItemRegistry.NETHERITE_BOW);
  }
  public static void addArrows(CreativeModeTab.Output output) {
    output.accept(FabricItemRegistry.FLINT_AND_STEEL_ARROW_ITEM);
    output.accept(FabricItemRegistry.ENDER_PEARL_ARROW_ITEM);
    output.accept(FabricItemRegistry.TNT_ARROW_ITEM);
    output.accept(FabricItemRegistry.PAPER_ARROW_ITEM);
    output.accept(FabricItemRegistry.MOSS_ARROW_ITEM);
    
    output.accept(FabricItemRegistry.AMETHYST_ARROW_ITEM);
    output.accept(FabricItemRegistry.BAMBOO_ARROW_ITEM);
    output.accept(FabricItemRegistry.BLAZE_ROD_ARROW_ITEM);
    output.accept(FabricItemRegistry.BONE_ARROW_ITEM);
    output.accept(FabricItemRegistry.CACTUS_ARROW_ITEM);
    output.accept(FabricItemRegistry.COAL_ARROW_ITEM);
    output.accept(FabricItemRegistry.EMERALD_ARROW_ITEM);
    output.accept(FabricItemRegistry.LAPIS_ARROW_ITEM);
    output.accept(FabricItemRegistry.OBSIDIAN_ARROW_ITEM);
    output.accept(FabricItemRegistry.FLINT_ARROW_ITEM);
    
    output.accept(FabricItemRegistry.IRON_ARROW_ITEM);
    output.accept(FabricItemRegistry.COPPER_ARROW_ITEM);
    output.accept(FabricItemRegistry.GOLD_ARROW_ITEM);
    output.accept(FabricItemRegistry.DIAMOND_ARROW_ITEM);
    output.accept(FabricItemRegistry.NETHERITE_ARROW_ITEM);
  }
  
  public static final CreativeModeTab MOREBOWSANDARROWS_TAB = FabricItemGroup.builder()
    .title(Component.translatable("itemGroup.moreBowsAndArrows"))
    .icon(() -> new ItemStack(FabricItemRegistry.AMETHYST_ARROW_ITEM))
    .displayItems((params, output) -> {
      addBows(output);
      addArrows(output);
    })
    .build();
  
  public static void registerCreativeTabEntries() {
    ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(output -> {
      addBows(output);
      addArrows(output);
    });
  }
}
