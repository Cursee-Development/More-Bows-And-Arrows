package com.cursee.more_bows_and_arrows.registry;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ForgeItemProperties {
  
  public static void addCustomItemProperties() {
    makeBow(ForgeItemRegistry.OAK_BOW.get());
    makeBow(ForgeItemRegistry.STRIPPED_OAK_BOW.get());
    makeBow(ForgeItemRegistry.DARK_OAK_BOW.get());
    makeBow(ForgeItemRegistry.STRIPPED_DARK_OAK_BOW.get());
    makeBow(ForgeItemRegistry.SPRUCE_BOW.get());
    makeBow(ForgeItemRegistry.STRIPPED_SPRUCE_BOW.get());
    makeBow(ForgeItemRegistry.BIRCH_BOW.get());
    makeBow(ForgeItemRegistry.STRIPPED_BIRCH_BOW.get());
    makeBow(ForgeItemRegistry.JUNGLE_BOW.get());
    makeBow(ForgeItemRegistry.STRIPPED_JUNGLE_BOW.get());
    makeBow(ForgeItemRegistry.ACACIA_BOW.get());
    makeBow(ForgeItemRegistry.STRIPPED_ACACIA_BOW.get());
    makeBow(ForgeItemRegistry.MANGROVE_BOW.get());
    makeBow(ForgeItemRegistry.STRIPPED_MANGROVE_BOW.get());
    makeBow(ForgeItemRegistry.CHERRY_BOW.get());
    makeBow(ForgeItemRegistry.STRIPPED_CHERRY_BOW.get());
    makeBow(ForgeItemRegistry.BAMBOO_BOW.get());
    makeBow(ForgeItemRegistry.STRIPPED_BAMBOO_BOW.get());
    makeBow(ForgeItemRegistry.CRIMSON_STEM_BOW.get());
    makeBow(ForgeItemRegistry.STRIPPED_CRIMSON_STEM_BOW.get());
    makeBow(ForgeItemRegistry.WARPED_STEM_BOW.get());
    makeBow(ForgeItemRegistry.STRIPPED_WARPED_STEM_BOW.get());
    
    makeBow(ForgeItemRegistry.PAPER_BOW.get());
    makeBow(ForgeItemRegistry.MOSS_BOW.get());
    makeBow(ForgeItemRegistry.LAPIS_BOW.get());
    makeBow(ForgeItemRegistry.AMETHYST_BOW.get());
    makeBow(ForgeItemRegistry.BONE_BOW.get());
    makeBow(ForgeItemRegistry.COAL_BOW.get());
    makeBow(ForgeItemRegistry.EMERALD_BOW.get());
    makeBow(ForgeItemRegistry.BLAZE_BOW.get());
    makeBow(ForgeItemRegistry.OBSIDIAN_BOW.get());
    
    makeBow(ForgeItemRegistry.IRON_BOW.get());
    makeBow(ForgeItemRegistry.COPPER_BOW.get());
    makeBow(ForgeItemRegistry.GOLD_BOW.get());
    makeBow(ForgeItemRegistry.DIAMOND_BOW.get());
    makeBow(ForgeItemRegistry.NETHERITE_BOW.get());
  }
  
  private static void makeBow(Item item) {
    ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pull"), (itemStack, level, entity, amount) -> {
      if (entity == null) {
        return 0.0F;
      } else {
        return entity.getUseItem() != itemStack ? 0.0F : (float)(itemStack.getUseDuration(entity) - entity.getUseItemRemainingTicks()) / 20.0F;
      }
    });
    ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pulling"), (p_174630_, p_174631_, p_174632_, p_174633_) -> {
      return p_174632_ != null && p_174632_.isUsingItem() && p_174632_.getUseItem() == p_174630_ ? 1.0F : 0.0F;
    });
  }
}
