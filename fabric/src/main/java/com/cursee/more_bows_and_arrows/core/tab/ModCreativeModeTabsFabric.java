package com.cursee.more_bows_and_arrows.core.tab;

import com.cursee.more_bows_and_arrows.core.item.ModItemsFabric;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.cursee.more_bows_and_arrows.core.registry.ModRegistryFabric.registerCreativeModeTab;

public class ModCreativeModeTabsFabric {

    public static void register() {}

//    public static RegistryObject<CreativeModeTab> MORE_BOWS_AND_ARROWS = registerCreativeModeTab("more_bows_and_arrows", () -> {
//        return CreativeModeTab.builder()
//                .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
//                .title(Component.translatable("itemGroup.moreBowsAndArrows"))
//                .icon(() -> new ItemStack(Items.BOW))
//                .displayItems(((itemDisplayParameters, output) -> {
//                    addBows(output);
//                    addArrows(output);
//                }))
//                .build();
//    });

    public static final CreativeModeTab MORE_BOWS_AND_ARROWS = registerCreativeModeTab("more_bows_and_arrows", FabricItemGroup.builder()
            .title(Component.translatable("itemGroup.moreBowsAndArrows"))
            .icon(() -> new ItemStack(ModItemsFabric.AMETHYST_ARROW))
            .displayItems(((itemDisplayParameters, output) -> {
                addBows(output);
                addArrows(output);
            }))
            .build());

    public static void addBows(CreativeModeTab.Output output) {
        output.accept(ModItemsFabric.OAK_BOW);
        output.accept(ModItemsFabric.STRIPPED_OAK_BOW);
        output.accept(ModItemsFabric.DARK_OAK_BOW);
        output.accept(ModItemsFabric.STRIPPED_DARK_OAK_BOW);
        output.accept(ModItemsFabric.SPRUCE_BOW);
        output.accept(ModItemsFabric.STRIPPED_SPRUCE_BOW);
        output.accept(ModItemsFabric.BIRCH_BOW);
        output.accept(ModItemsFabric.STRIPPED_BIRCH_BOW);
        output.accept(ModItemsFabric.JUNGLE_BOW);
        output.accept(ModItemsFabric.STRIPPED_JUNGLE_BOW);
        output.accept(ModItemsFabric.ACACIA_BOW);
        output.accept(ModItemsFabric.STRIPPED_ACACIA_BOW);
        output.accept(ModItemsFabric.MANGROVE_BOW);
        output.accept(ModItemsFabric.STRIPPED_MANGROVE_BOW);
        output.accept(ModItemsFabric.CHERRY_BOW);
        output.accept(ModItemsFabric.STRIPPED_CHERRY_BOW);
        output.accept(ModItemsFabric.BAMBOO_BOW);
        output.accept(ModItemsFabric.STRIPPED_BAMBOO_BOW);
        output.accept(ModItemsFabric.CRIMSON_STEM_BOW);
        output.accept(ModItemsFabric.STRIPPED_CRIMSON_STEM_BOW);
        output.accept(ModItemsFabric.WARPED_STEM_BOW);
        output.accept(ModItemsFabric.STRIPPED_WARPED_STEM_BOW);

        output.accept(ModItemsFabric.PAPER_BOW);
        output.accept(ModItemsFabric.MOSS_BOW);
        output.accept(ModItemsFabric.LAPIS_BOW);
        output.accept(ModItemsFabric.AMETHYST_BOW);
        output.accept(ModItemsFabric.BONE_BOW);
        output.accept(ModItemsFabric.COAL_BOW);
        output.accept(ModItemsFabric.EMERALD_BOW);
        output.accept(ModItemsFabric.BLAZE_BOW);
        output.accept(ModItemsFabric.OBSIDIAN_BOW);

        output.accept(ModItemsFabric.IRON_BOW);
        output.accept(ModItemsFabric.COPPER_BOW);
        output.accept(ModItemsFabric.GOLD_BOW);
        output.accept(ModItemsFabric.DIAMOND_BOW);
        output.accept(ModItemsFabric.NETHERITE_BOW);
    }
    public static void addArrows(CreativeModeTab.Output output) {
        output.accept(ModItemsFabric.FLINT_AND_STEEL_ARROW);
        output.accept(ModItemsFabric.ENDER_PEARL_ARROW);
        output.accept(ModItemsFabric.TNT_ARROW);
        output.accept(ModItemsFabric.PAPER_ARROW);
        output.accept(ModItemsFabric.MOSS_ARROW);

        output.accept(ModItemsFabric.AMETHYST_ARROW);
        output.accept(ModItemsFabric.BAMBOO_ARROW);
        output.accept(ModItemsFabric.BLAZE_ROD_ARROW);
        output.accept(ModItemsFabric.BONE_ARROW);
        output.accept(ModItemsFabric.CACTUS_ARROW);
        output.accept(ModItemsFabric.COAL_ARROW);
        output.accept(ModItemsFabric.EMERALD_ARROW);
        output.accept(ModItemsFabric.LAPIS_ARROW);
        output.accept(ModItemsFabric.OBSIDIAN_ARROW);
        output.accept(ModItemsFabric.FLINT_ARROW);

        output.accept(ModItemsFabric.IRON_ARROW);
        output.accept(ModItemsFabric.COPPER_ARROW);
        output.accept(ModItemsFabric.GOLD_ARROW);
        output.accept(ModItemsFabric.DIAMOND_ARROW);
        output.accept(ModItemsFabric.NETHERITE_ARROW);
    }
}
