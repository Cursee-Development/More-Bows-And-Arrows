package com.cursee.more_bows_and_arrows.registry;

import com.cursee.more_bows_and_arrows.Constants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
//import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
//import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.RegistryObject;

public class ForgeCreativeModeTabRegistry {
  public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Constants.MOD_ID);
  public static void register(IEventBus bus) {
    CREATIVE_MODE_TAB.register(bus);
  }
  
  public static void addBows(CreativeModeTab.Output output) {
    output.accept(ForgeItemRegistry.OAK_BOW.get());
    output.accept(ForgeItemRegistry.STRIPPED_OAK_BOW.get());
    output.accept(ForgeItemRegistry.DARK_OAK_BOW.get());
    output.accept(ForgeItemRegistry.STRIPPED_DARK_OAK_BOW.get());
    output.accept(ForgeItemRegistry.SPRUCE_BOW.get());
    output.accept(ForgeItemRegistry.STRIPPED_SPRUCE_BOW.get());
    output.accept(ForgeItemRegistry.BIRCH_BOW.get());
    output.accept(ForgeItemRegistry.STRIPPED_BIRCH_BOW.get());
    output.accept(ForgeItemRegistry.JUNGLE_BOW.get());
    output.accept(ForgeItemRegistry.STRIPPED_JUNGLE_BOW.get());
    output.accept(ForgeItemRegistry.ACACIA_BOW.get());
    output.accept(ForgeItemRegistry.STRIPPED_ACACIA_BOW.get());
    output.accept(ForgeItemRegistry.MANGROVE_BOW.get());
    output.accept(ForgeItemRegistry.STRIPPED_MANGROVE_BOW.get());
    output.accept(ForgeItemRegistry.CHERRY_BOW.get());
    output.accept(ForgeItemRegistry.STRIPPED_CHERRY_BOW.get());
    output.accept(ForgeItemRegistry.BAMBOO_BOW.get());
    output.accept(ForgeItemRegistry.STRIPPED_BAMBOO_BOW.get());
    output.accept(ForgeItemRegistry.CRIMSON_STEM_BOW.get());
    output.accept(ForgeItemRegistry.STRIPPED_CRIMSON_STEM_BOW.get());
    output.accept(ForgeItemRegistry.WARPED_STEM_BOW.get());
    output.accept(ForgeItemRegistry.STRIPPED_WARPED_STEM_BOW.get());
    
    output.accept(ForgeItemRegistry.PAPER_BOW.get());
    output.accept(ForgeItemRegistry.MOSS_BOW.get());
    output.accept(ForgeItemRegistry.LAPIS_BOW.get());
    output.accept(ForgeItemRegistry.AMETHYST_BOW.get());
    output.accept(ForgeItemRegistry.BONE_BOW.get());
    output.accept(ForgeItemRegistry.COAL_BOW.get());
    output.accept(ForgeItemRegistry.EMERALD_BOW.get());
    output.accept(ForgeItemRegistry.BLAZE_BOW.get());
    output.accept(ForgeItemRegistry.OBSIDIAN_BOW.get());
    
    output.accept(ForgeItemRegistry.IRON_BOW.get());
    output.accept(ForgeItemRegistry.COPPER_BOW.get());
    output.accept(ForgeItemRegistry.GOLD_BOW.get());
    output.accept(ForgeItemRegistry.DIAMOND_BOW.get());
    output.accept(ForgeItemRegistry.NETHERITE_BOW.get());
  }
  public static void addArrows(CreativeModeTab.Output output) {
    output.accept(ForgeItemRegistry.FLINT_AND_STEEL_ARROW_ITEM.get());
    output.accept(ForgeItemRegistry.ENDER_PEARL_ARROW_ITEM.get());
    output.accept(ForgeItemRegistry.TNT_ARROW_ITEM.get());
    output.accept(ForgeItemRegistry.PAPER_ARROW_ITEM.get());
    output.accept(ForgeItemRegistry.MOSS_ARROW_ITEM.get());
    
    output.accept(ForgeItemRegistry.AMETHYST_ARROW_ITEM.get());
    output.accept(ForgeItemRegistry.BAMBOO_ARROW_ITEM.get());
    output.accept(ForgeItemRegistry.BLAZE_ROD_ARROW_ITEM.get());
    output.accept(ForgeItemRegistry.BONE_ARROW_ITEM.get());
    output.accept(ForgeItemRegistry.CACTUS_ARROW_ITEM.get());
    output.accept(ForgeItemRegistry.COAL_ARROW_ITEM.get());
    output.accept(ForgeItemRegistry.EMERALD_ARROW_ITEM.get());
    output.accept(ForgeItemRegistry.LAPIS_ARROW_ITEM.get());
    output.accept(ForgeItemRegistry.OBSIDIAN_ARROW_ITEM.get());
    output.accept(ForgeItemRegistry.FLINT_ARROW_ITEM.get());
    
    output.accept(ForgeItemRegistry.IRON_ARROW_ITEM.get());
    output.accept(ForgeItemRegistry.COPPER_ARROW_ITEM.get());
    output.accept(ForgeItemRegistry.GOLD_ARROW_ITEM.get());
    output.accept(ForgeItemRegistry.DIAMOND_ARROW_ITEM.get());
    output.accept(ForgeItemRegistry.NETHERITE_ARROW_ITEM.get());
  }
  
  public static DeferredHolder<CreativeModeTab, CreativeModeTab> MOREBOWSANDARROWS_TAB = CREATIVE_MODE_TAB.register("morebowsandarrows_tab", () -> {
    return CreativeModeTab.builder()
      .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
      .title(Component.translatable("itemGroup.moreBowsAndArrows"))
      .icon(() -> new ItemStack(Items.BOW))
      .displayItems(((itemDisplayParameters, output) -> {
        addBows(output);
        addArrows(output);
      }))
      .build();
  });
  
  @SubscribeEvent
  public static void addToCombatTab(BuildCreativeModeTabContentsEvent output) {
    if (output.getTabKey().equals(CreativeModeTabs.COMBAT)) {
      addBows(output);
      addArrows(output);
    }
  }
}
