package com.cursee.more_bows_and_arrows.registry;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class FabricItemProperties {
  public static void registerBowModels() {
    registerBow(FabricItemRegistry.OAK_BOW);
    registerBow(FabricItemRegistry.STRIPPED_OAK_BOW);
    registerBow(FabricItemRegistry.DARK_OAK_BOW);
    registerBow(FabricItemRegistry.STRIPPED_DARK_OAK_BOW);
    registerBow(FabricItemRegistry.SPRUCE_BOW);
    registerBow(FabricItemRegistry.STRIPPED_SPRUCE_BOW);
    registerBow(FabricItemRegistry.BIRCH_BOW);
    registerBow(FabricItemRegistry.STRIPPED_BIRCH_BOW);
    registerBow(FabricItemRegistry.JUNGLE_BOW);
    registerBow(FabricItemRegistry.STRIPPED_JUNGLE_BOW);
    registerBow(FabricItemRegistry.ACACIA_BOW);
    registerBow(FabricItemRegistry.STRIPPED_ACACIA_BOW);
    registerBow(FabricItemRegistry.MANGROVE_BOW);
    registerBow(FabricItemRegistry.STRIPPED_MANGROVE_BOW);
    registerBow(FabricItemRegistry.CHERRY_BOW);
    registerBow(FabricItemRegistry.STRIPPED_CHERRY_BOW);
    registerBow(FabricItemRegistry.BAMBOO_BOW);
    registerBow(FabricItemRegistry.STRIPPED_BAMBOO_BOW);
    registerBow(FabricItemRegistry.CRIMSON_STEM_BOW);
    registerBow(FabricItemRegistry.STRIPPED_CRIMSON_STEM_BOW);
    registerBow(FabricItemRegistry.WARPED_STEM_BOW);
    registerBow(FabricItemRegistry.STRIPPED_WARPED_STEM_BOW);
    
    registerBow(FabricItemRegistry.PAPER_BOW);
    registerBow(FabricItemRegistry.MOSS_BOW);
    registerBow(FabricItemRegistry.LAPIS_BOW);
    registerBow(FabricItemRegistry.AMETHYST_BOW);
    registerBow(FabricItemRegistry.BONE_BOW);
    registerBow(FabricItemRegistry.COAL_BOW);
    registerBow(FabricItemRegistry.EMERALD_BOW);
    registerBow(FabricItemRegistry.BLAZE_BOW);
    registerBow(FabricItemRegistry.OBSIDIAN_BOW);
    
    registerBow(FabricItemRegistry.IRON_BOW);
    registerBow(FabricItemRegistry.COPPER_BOW);
    registerBow(FabricItemRegistry.GOLD_BOW);
    registerBow(FabricItemRegistry.DIAMOND_BOW);
    registerBow(FabricItemRegistry.NETHERITE_BOW);
  }
  
  private static void registerBow(Item bow) {
    ItemProperties.register(bow, ResourceLocation.withDefaultNamespace("pull"), (stack, world, entity, seed) -> {
      if (entity == null) {
        return 0.0f;
      }
      if (entity.getUseItem() != stack) {
        return 0.0f;
      }
      return (float)(stack.getUseDuration(entity) - entity.getUseItemRemainingTicks()) / 20.0f;
    });
    ItemProperties.register(bow, ResourceLocation.withDefaultNamespace("pulling"),
      (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0f : 0.0f);
    
  }
}
