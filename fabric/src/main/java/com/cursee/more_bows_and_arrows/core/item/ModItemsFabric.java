package com.cursee.more_bows_and_arrows.core.item;

import com.cursee.more_bows_and_arrows.core.item.custom.MultiArrowItem;
import com.cursee.more_bows_and_arrows.core.item.custom.TieredBowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;

import static com.cursee.more_bows_and_arrows.core.registry.ModRegistryFabric.registerItem;

public class ModItemsFabric {
    
    public static void register() {}

    public static final Item OAK_BOW = registerItem( "oak_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item STRIPPED_OAK_BOW = registerItem( "stripped_oak_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item DARK_OAK_BOW = registerItem( "dark_oak_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item STRIPPED_DARK_OAK_BOW = registerItem( "stripped_dark_oak_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item SPRUCE_BOW = registerItem( "spruce_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item STRIPPED_SPRUCE_BOW = registerItem( "stripped_spruce_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item BIRCH_BOW = registerItem( "birch_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item STRIPPED_BIRCH_BOW = registerItem( "stripped_birch_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item JUNGLE_BOW = registerItem( "jungle_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item STRIPPED_JUNGLE_BOW = registerItem( "stripped_jungle_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item ACACIA_BOW = registerItem( "acacia_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item STRIPPED_ACACIA_BOW = registerItem( "stripped_acacia_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item MANGROVE_BOW = registerItem( "mangrove_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item STRIPPED_MANGROVE_BOW = registerItem( "stripped_mangrove_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item CHERRY_BOW = registerItem( "cherry_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item STRIPPED_CHERRY_BOW = registerItem( "stripped_cherry_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item BAMBOO_BOW = registerItem( "bamboo_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item STRIPPED_BAMBOO_BOW = registerItem( "stripped_bamboo_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item CRIMSON_STEM_BOW = registerItem( "crimson_stem_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item STRIPPED_CRIMSON_STEM_BOW = registerItem( "stripped_crimson_stem_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item WARPED_STEM_BOW = registerItem( "warped_stem_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));
    public static final Item STRIPPED_WARPED_STEM_BOW = registerItem( "stripped_warped_stem_bow", new TieredBowItem(Tiers.WOOD, new Item.Properties().durability(350)));

    public static final Item PAPER_BOW = registerItem( "paper_bow", new TieredBowItem(ModTiersFabric.PAPER, new Item.Properties().durability(300)));
    public static final Item MOSS_BOW = registerItem( "moss_bow", new TieredBowItem(ModTiersFabric.MOSS, new Item.Properties().durability(300)));
    public static final Item LAPIS_BOW = registerItem( "lapis_bow", new TieredBowItem(ModTiersFabric.LAPIS, new Item.Properties().durability(400)));
    public static final Item AMETHYST_BOW = registerItem( "amethyst_bow", new TieredBowItem(ModTiersFabric.AMETHYST, new Item.Properties().durability(400)));
    public static final Item BONE_BOW = registerItem( "bone_bow", new TieredBowItem(ModTiersFabric.BONE, new Item.Properties().durability(400)));
    public static final Item COAL_BOW = registerItem( "coal_bow", new TieredBowItem(ModTiersFabric.COAL, new Item.Properties().durability(400)));
    public static final Item EMERALD_BOW = registerItem( "emerald_bow", new TieredBowItem(ModTiersFabric.EMERALD, new Item.Properties().durability(750)));
    public static final Item BLAZE_BOW = registerItem( "blaze_bow", new TieredBowItem(ModTiersFabric.BLAZE, new Item.Properties().durability(750)));
    public static final Item OBSIDIAN_BOW = registerItem( "obsidian_bow", new TieredBowItem(ModTiersFabric.OBSIDIAN, new Item.Properties().durability(750)));

    public static final Item GOLD_BOW = registerItem( "gold_bow", new TieredBowItem(Tiers.GOLD, new Item.Properties().durability(400)));
    public static final Item IRON_BOW = registerItem( "iron_bow", new TieredBowItem(Tiers.IRON, new Item.Properties().durability(500)));
    public static final Item COPPER_BOW = registerItem( "copper_bow", new TieredBowItem(ModTiersFabric.COPPER, new Item.Properties().durability(500)));
    public static final Item DIAMOND_BOW = registerItem( "diamond_bow", new TieredBowItem(Tiers.DIAMOND, new Item.Properties().durability(1000)));
    public static final Item NETHERITE_BOW = registerItem( "netherite_bow", new TieredBowItem(Tiers.NETHERITE, new Item.Properties().durability(2000)));

    public static final Item ENDER_PEARL_ARROW = registerItem("ender_pearl_arrow", new MultiArrowItem(MultiArrowItem.Type.ENDER_PEARL, new Item.Properties()));
    public static final Item FLINT_AND_STEEL_ARROW = registerItem("flint_and_steel_arrow", new MultiArrowItem(MultiArrowItem.Type.FLINT_AND_STEEL, new Item.Properties()));
    public static final Item TNT_ARROW = registerItem("tnt_arrow", new MultiArrowItem(MultiArrowItem.Type.TNT, new Item.Properties()));
    public static final Item PAPER_ARROW = registerItem("paper_arrow", new MultiArrowItem(MultiArrowItem.Type.PAPER, new Item.Properties()));
    public static final Item MOSS_ARROW = registerItem("moss_arrow", new MultiArrowItem(MultiArrowItem.Type.MOSS, new Item.Properties()));

    public static final Item AMETHYST_ARROW = registerItem("amethyst_arrow", new MultiArrowItem(MultiArrowItem.Type.AMETHYST, new Item.Properties()));
    public static final Item BAMBOO_ARROW = registerItem("bamboo_arrow", new MultiArrowItem(MultiArrowItem.Type.BAMBOO, new Item.Properties()));
    public static final Item BLAZE_ROD_ARROW = registerItem("blaze_rod_arrow", new MultiArrowItem(MultiArrowItem.Type.BLAZE_ROD, new Item.Properties()));
    public static final Item BONE_ARROW = registerItem("bone_arrow", new MultiArrowItem(MultiArrowItem.Type.BONE, new Item.Properties()));
    public static final Item CACTUS_ARROW = registerItem("cactus_arrow", new MultiArrowItem(MultiArrowItem.Type.CACTUS, new Item.Properties()));
    public static final Item COAL_ARROW = registerItem("coal_arrow", new MultiArrowItem(MultiArrowItem.Type.COAL, new Item.Properties()));
    public static final Item EMERALD_ARROW = registerItem("emerald_arrow", new MultiArrowItem(MultiArrowItem.Type.EMERALD, new Item.Properties()));
    public static final Item LAPIS_ARROW = registerItem("lapis_arrow", new MultiArrowItem(MultiArrowItem.Type.LAPIS, new Item.Properties()));
    public static final Item OBSIDIAN_ARROW = registerItem("obsidian_arrow", new MultiArrowItem(MultiArrowItem.Type.OBSIDIAN, new Item.Properties()));
    public static final Item FLINT_ARROW = registerItem("flint_arrow", new MultiArrowItem(MultiArrowItem.Type.FLINT, new Item.Properties()));

    public static final Item IRON_ARROW = registerItem("iron_arrow", new MultiArrowItem(MultiArrowItem.Type.IRON, new Item.Properties()));
    public static final Item COPPER_ARROW = registerItem("copper_arrow", new MultiArrowItem(MultiArrowItem.Type.COPPER, new Item.Properties()));
    public static final Item GOLD_ARROW = registerItem("gold_arrow", new MultiArrowItem(MultiArrowItem.Type.GOLD, new Item.Properties()));
    public static final Item DIAMOND_ARROW = registerItem("diamond_arrow", new MultiArrowItem(MultiArrowItem.Type.DIAMOND, new Item.Properties()));
    public static final Item NETHERITE_ARROW = registerItem("netherite_arrow", new MultiArrowItem(MultiArrowItem.Type.NETHERITE, new Item.Properties()));
}
