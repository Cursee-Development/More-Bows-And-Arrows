package com.cursee.more_bows_and_arrows.core.tab;

import com.cursee.more_bows_and_arrows.core.item.ModItemsForge;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredHolder;

import static com.cursee.more_bows_and_arrows.core.registry.ModRegistryForge.registerCreativeModeTab;

public class ModCreativeModeTabsForge {

    public static void register() {}

    public static DeferredHolder<CreativeModeTab, CreativeModeTab> MORE_BOWS_AND_ARROWS = registerCreativeModeTab("more_bows_and_arrows", () -> {
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

    public static void addBows(CreativeModeTab.Output output) {
        output.accept(ModItemsForge.OAK_BOW.get());
        output.accept(ModItemsForge.STRIPPED_OAK_BOW.get());
        output.accept(ModItemsForge.DARK_OAK_BOW.get());
        output.accept(ModItemsForge.STRIPPED_DARK_OAK_BOW.get());
        output.accept(ModItemsForge.SPRUCE_BOW.get());
        output.accept(ModItemsForge.STRIPPED_SPRUCE_BOW.get());
        output.accept(ModItemsForge.BIRCH_BOW.get());
        output.accept(ModItemsForge.STRIPPED_BIRCH_BOW.get());
        output.accept(ModItemsForge.JUNGLE_BOW.get());
        output.accept(ModItemsForge.STRIPPED_JUNGLE_BOW.get());
        output.accept(ModItemsForge.ACACIA_BOW.get());
        output.accept(ModItemsForge.STRIPPED_ACACIA_BOW.get());
        output.accept(ModItemsForge.MANGROVE_BOW.get());
        output.accept(ModItemsForge.STRIPPED_MANGROVE_BOW.get());
        output.accept(ModItemsForge.CHERRY_BOW.get());
        output.accept(ModItemsForge.STRIPPED_CHERRY_BOW.get());
        output.accept(ModItemsForge.BAMBOO_BOW.get());
        output.accept(ModItemsForge.STRIPPED_BAMBOO_BOW.get());
        output.accept(ModItemsForge.CRIMSON_STEM_BOW.get());
        output.accept(ModItemsForge.STRIPPED_CRIMSON_STEM_BOW.get());
        output.accept(ModItemsForge.WARPED_STEM_BOW.get());
        output.accept(ModItemsForge.STRIPPED_WARPED_STEM_BOW.get());

        output.accept(ModItemsForge.PAPER_BOW.get());
        output.accept(ModItemsForge.MOSS_BOW.get());
        output.accept(ModItemsForge.LAPIS_BOW.get());
        output.accept(ModItemsForge.AMETHYST_BOW.get());
        output.accept(ModItemsForge.BONE_BOW.get());
        output.accept(ModItemsForge.COAL_BOW.get());
        output.accept(ModItemsForge.EMERALD_BOW.get());
        output.accept(ModItemsForge.BLAZE_BOW.get());
        output.accept(ModItemsForge.OBSIDIAN_BOW.get());

        output.accept(ModItemsForge.IRON_BOW.get());
        output.accept(ModItemsForge.COPPER_BOW.get());
        output.accept(ModItemsForge.GOLD_BOW.get());
        output.accept(ModItemsForge.DIAMOND_BOW.get());
        output.accept(ModItemsForge.NETHERITE_BOW.get());
    }
    public static void addArrows(CreativeModeTab.Output output) {
        output.accept(ModItemsForge.FLINT_AND_STEEL_ARROW.get());
        output.accept(ModItemsForge.ENDER_PEARL_ARROW.get());
        output.accept(ModItemsForge.TNT_ARROW.get());
        output.accept(ModItemsForge.PAPER_ARROW.get());
        output.accept(ModItemsForge.MOSS_ARROW.get());

        output.accept(ModItemsForge.AMETHYST_ARROW.get());
        output.accept(ModItemsForge.BAMBOO_ARROW.get());
        output.accept(ModItemsForge.BLAZE_ROD_ARROW.get());
        output.accept(ModItemsForge.BONE_ARROW.get());
        output.accept(ModItemsForge.CACTUS_ARROW.get());
        output.accept(ModItemsForge.COAL_ARROW.get());
        output.accept(ModItemsForge.EMERALD_ARROW.get());
        output.accept(ModItemsForge.LAPIS_ARROW.get());
        output.accept(ModItemsForge.OBSIDIAN_ARROW.get());
        output.accept(ModItemsForge.FLINT_ARROW.get());

        output.accept(ModItemsForge.IRON_ARROW.get());
        output.accept(ModItemsForge.COPPER_ARROW.get());
        output.accept(ModItemsForge.GOLD_ARROW.get());
        output.accept(ModItemsForge.DIAMOND_ARROW.get());
        output.accept(ModItemsForge.NETHERITE_ARROW.get());
    }
}
