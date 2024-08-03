package com.cursee.more_bows_and_arrows.core.item;

import com.cursee.more_bows_and_arrows.core.item.custom.MultiArrowItem;
import com.cursee.more_bows_and_arrows.core.item.custom.TieredBowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredHolder;

import static com.cursee.more_bows_and_arrows.core.registry.ModRegistryForge.registerItem;

public class ModItemsForge {

    public static void register() {}

    public static final DeferredHolder<Item, Item> OAK_BOW = registerItem( "oak_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> STRIPPED_OAK_BOW = registerItem( "stripped_oak_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> DARK_OAK_BOW = registerItem( "dark_oak_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> STRIPPED_DARK_OAK_BOW = registerItem( "stripped_dark_oak_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> SPRUCE_BOW = registerItem( "spruce_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> STRIPPED_SPRUCE_BOW = registerItem( "stripped_spruce_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> BIRCH_BOW = registerItem( "birch_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> STRIPPED_BIRCH_BOW = registerItem( "stripped_birch_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> JUNGLE_BOW = registerItem( "jungle_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> STRIPPED_JUNGLE_BOW = registerItem( "stripped_jungle_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> ACACIA_BOW = registerItem( "acacia_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> STRIPPED_ACACIA_BOW = registerItem( "stripped_acacia_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> MANGROVE_BOW = registerItem( "mangrove_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> STRIPPED_MANGROVE_BOW = registerItem( "stripped_mangrove_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> CHERRY_BOW = registerItem( "cherry_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> STRIPPED_CHERRY_BOW = registerItem( "stripped_cherry_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> BAMBOO_BOW = registerItem( "bamboo_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> STRIPPED_BAMBOO_BOW = registerItem( "stripped_bamboo_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> CRIMSON_STEM_BOW = registerItem( "crimson_stem_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> STRIPPED_CRIMSON_STEM_BOW = registerItem( "stripped_crimson_stem_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> WARPED_STEM_BOW = registerItem( "warped_stem_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final DeferredHolder<Item, Item> STRIPPED_WARPED_STEM_BOW = registerItem( "stripped_warped_stem_bow", () -> new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));

    public static final DeferredHolder<Item, Item> PAPER_BOW = registerItem( "paper_bow", () -> new TieredBowItem(ModTiersForge.PAPER, new Item.Properties().durability(300)));
    public static final DeferredHolder<Item, Item> MOSS_BOW = registerItem( "moss_bow", () -> new TieredBowItem(ModTiersForge.MOSS, new Item.Properties().durability(300)));
    public static final DeferredHolder<Item, Item> LAPIS_BOW = registerItem( "lapis_bow", () -> new TieredBowItem(ModTiersForge.LAPIS, new Item.Properties().durability(400)));
    public static final DeferredHolder<Item, Item> AMETHYST_BOW = registerItem( "amethyst_bow", () -> new TieredBowItem(ModTiersForge.AMETHYST, new Item.Properties().durability(400)));
    public static final DeferredHolder<Item, Item> BONE_BOW = registerItem( "bone_bow", () -> new TieredBowItem(ModTiersForge.BONE, new Item.Properties().durability(400)));
    public static final DeferredHolder<Item, Item> COAL_BOW = registerItem( "coal_bow", () -> new TieredBowItem(ModTiersForge.COAL, new Item.Properties().durability(400)));
    public static final DeferredHolder<Item, Item> EMERALD_BOW = registerItem( "emerald_bow", () -> new TieredBowItem(ModTiersForge.EMERALD, new Item.Properties().durability(750)));
    public static final DeferredHolder<Item, Item> BLAZE_BOW = registerItem( "blaze_bow", () -> new TieredBowItem(ModTiersForge.BLAZE, new Item.Properties().durability(750)));
    public static final DeferredHolder<Item, Item> OBSIDIAN_BOW = registerItem( "obsidian_bow", () -> new TieredBowItem(ModTiersForge.OBSIDIAN, new Item.Properties().durability(750)));

    public static final DeferredHolder<Item, Item> GOLD_BOW = registerItem( "gold_bow", () -> new TieredBowItem(Tiers.GOLD, new Item.Properties().durability(400)));
    public static final DeferredHolder<Item, Item> IRON_BOW = registerItem( "iron_bow", () -> new TieredBowItem(Tiers.IRON, new Item.Properties().durability(500)));
    public static final DeferredHolder<Item, Item> COPPER_BOW = registerItem( "copper_bow", () -> new TieredBowItem(ModTiersForge.COPPER, new Item.Properties().durability(500)));
    public static final DeferredHolder<Item, Item> DIAMOND_BOW = registerItem( "diamond_bow", () -> new TieredBowItem(Tiers.DIAMOND, new Item.Properties().durability(1000)));
    public static final DeferredHolder<Item, Item> NETHERITE_BOW = registerItem( "netherite_bow", () -> new TieredBowItem(Tiers.NETHERITE, new Item.Properties().durability(2000)));

    public static final DeferredHolder<Item, Item> ENDER_PEARL_ARROW = registerItem("ender_pearl_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.ENDER_PEARL, new Item.Properties()); });
    public static final DeferredHolder<Item, Item> FLINT_AND_STEEL_ARROW = registerItem("flint_and_steel_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.FLINT_AND_STEEL, new Item.Properties()); });
    public static final DeferredHolder<Item, Item> TNT_ARROW = registerItem("tnt_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.TNT, new Item.Properties()); });
    public static final DeferredHolder<Item, Item> PAPER_ARROW = registerItem("paper_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.PAPER, new Item.Properties()); });
    public static final DeferredHolder<Item, Item> MOSS_ARROW = registerItem("moss_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.MOSS, new Item.Properties()); });

    public static final DeferredHolder<Item, Item> AMETHYST_ARROW = registerItem("amethyst_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.AMETHYST, new Item.Properties()); });
    public static final DeferredHolder<Item, Item> BAMBOO_ARROW = registerItem("bamboo_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.BAMBOO, new Item.Properties()); });
    public static final DeferredHolder<Item, Item> BLAZE_ROD_ARROW = registerItem("blaze_rod_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.BLAZE_ROD, new Item.Properties()); });
    public static final DeferredHolder<Item, Item> BONE_ARROW = registerItem("bone_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.BONE, new Item.Properties()); });
    public static final DeferredHolder<Item, Item> CACTUS_ARROW = registerItem("cactus_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.CACTUS, new Item.Properties()); });
    public static final DeferredHolder<Item, Item> COAL_ARROW = registerItem("coal_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.COAL, new Item.Properties()); });
    public static final DeferredHolder<Item, Item> EMERALD_ARROW = registerItem("emerald_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.EMERALD, new Item.Properties()); });
    public static final DeferredHolder<Item, Item> LAPIS_ARROW = registerItem("lapis_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.LAPIS, new Item.Properties()); });
    public static final DeferredHolder<Item, Item> OBSIDIAN_ARROW = registerItem("obsidian_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.OBSIDIAN, new Item.Properties()); });
    public static final DeferredHolder<Item, Item> FLINT_ARROW = registerItem("flint_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.FLINT, new Item.Properties()); });

    public static final DeferredHolder<Item, Item> IRON_ARROW = registerItem("iron_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.IRON, new Item.Properties()); });
    public static final DeferredHolder<Item, Item> COPPER_ARROW = registerItem("copper_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.COPPER, new Item.Properties()); });
    public static final DeferredHolder<Item, Item> GOLD_ARROW = registerItem("gold_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.GOLD, new Item.Properties()); });
    public static final DeferredHolder<Item, Item> DIAMOND_ARROW = registerItem("diamond_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.DIAMOND, new Item.Properties()); });
    public static final DeferredHolder<Item, Item> NETHERITE_ARROW = registerItem("netherite_arrow", () -> { return new MultiArrowItem(MultiArrowItem.Type.NETHERITE, new Item.Properties()); });
}
