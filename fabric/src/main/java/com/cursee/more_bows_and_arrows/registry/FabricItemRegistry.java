package com.cursee.more_bows_and_arrows.registry;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.item.arrow.*;
import com.cursee.more_bows_and_arrows.item.bow.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class FabricItemRegistry {
  
  public static final Item OAK_BOW = registerItem("oak_bow", new OakBowItem(new Item.Properties().durability(350)));
  public static final Item STRIPPED_OAK_BOW = registerItem("stripped_oak_bow", new StrippedOakBowItem(new Item.Properties().durability(350)));
  public static final Item DARK_OAK_BOW = registerItem("dark_oak_bow", new DarkOakBowItem(new Item.Properties().durability(350)));
  public static final Item STRIPPED_DARK_OAK_BOW = registerItem("stripped_dark_oak_bow", new StrippedDarkOakBowItem(new Item.Properties().durability(350)));
  public static final Item SPRUCE_BOW = registerItem("spruce_bow", new SpruceBowItem(new Item.Properties().durability(350)));
  public static final Item STRIPPED_SPRUCE_BOW = registerItem("stripped_spruce_bow", new StrippedSpruceBowItem(new Item.Properties().durability(350)));
  public static final Item BIRCH_BOW = registerItem("birch_bow", new BirchBowItem(new Item.Properties().durability(350)));
  public static final Item STRIPPED_BIRCH_BOW = registerItem("stripped_birch_bow", new StrippedBirchBowItem(new Item.Properties().durability(350)));
  public static final Item JUNGLE_BOW = registerItem("jungle_bow", new JungleBowItem(new Item.Properties().durability(350)));
  public static final Item STRIPPED_JUNGLE_BOW = registerItem("stripped_jungle_bow", new StrippedJungleBowItem(new Item.Properties().durability(350)));
  public static final Item ACACIA_BOW = registerItem("acacia_bow", new AcaciaBowItem(new Item.Properties().durability(350)));
  public static final Item STRIPPED_ACACIA_BOW = registerItem("stripped_acacia_bow", new StrippedAcaciaBowItem(new Item.Properties().durability(350)));
  public static final Item MANGROVE_BOW = registerItem("mangrove_bow", new MangroveBowItem(new Item.Properties().durability(350)));
  public static final Item STRIPPED_MANGROVE_BOW = registerItem("stripped_mangrove_bow", new StrippedMangroveBowItem(new Item.Properties().durability(350)));
  public static final Item CHERRY_BOW = registerItem("cherry_bow", new CherryBowItem(new Item.Properties().durability(350)));
  public static final Item STRIPPED_CHERRY_BOW = registerItem("stripped_cherry_bow", new StrippedCherryBowItem(new Item.Properties().durability(350)));
  public static final Item BAMBOO_BOW = registerItem("bamboo_bow", new BambooBowItem(new Item.Properties().durability(350)));
  public static final Item STRIPPED_BAMBOO_BOW = registerItem("stripped_bamboo_bow", new StrippedBambooBowItem(new Item.Properties().durability(350)));
  public static final Item CRIMSON_STEM_BOW = registerItem("crimson_stem_bow", new CrimsonStemBowItem(new Item.Properties().durability(350)));
  public static final Item STRIPPED_CRIMSON_STEM_BOW = registerItem("stripped_crimson_stem_bow", new StrippedCrimsonStemBowItem(new Item.Properties().durability(350)));
  public static final Item WARPED_STEM_BOW = registerItem("warped_stem_bow", new WarpedStemBowItem(new Item.Properties().durability(350)));
  public static final Item STRIPPED_WARPED_STEM_BOW = registerItem("stripped_warped_stem_bow", new StrippedWarpedStemBowItem(new Item.Properties().durability(350)));
  
  public static final Item PAPER_BOW = registerItem("paper_bow", new PaperBowItem(new Item.Properties().durability(300)));
  public static final Item MOSS_BOW = registerItem("moss_bow", new MossBowItem(new Item.Properties().durability(300)));
  public static final Item LAPIS_BOW = registerItem("lapis_bow", new LapisBowItem(new Item.Properties().durability(400)));
  public static final Item AMETHYST_BOW = registerItem("amethyst_bow", new AmethystBowItem(new Item.Properties().durability(400)));
  public static final Item BONE_BOW = registerItem("bone_bow", new BoneBowItem(new Item.Properties().durability(400)));
  public static final Item COAL_BOW = registerItem("coal_bow", new CoalBowItem(new Item.Properties().durability(400)));
  public static final Item EMERALD_BOW = registerItem("emerald_bow", new EmeraldBowItem(new Item.Properties().durability(750)));
  public static final Item BLAZE_BOW = registerItem("blaze_bow", new BlazeBowItem(new Item.Properties().durability(750)));
  public static final Item OBSIDIAN_BOW = registerItem("obsidian_bow", new ObsidianBowItem(new Item.Properties().durability(750)));
  
  public static final Item GOLD_BOW = registerItem("gold_bow", new GoldBowItem(new Item.Properties().durability(400)));
  public static final Item IRON_BOW = registerItem("iron_bow", new IronBowItem(new Item.Properties().durability(500)));
  public static final Item COPPER_BOW = registerItem("copper_bow", new CopperBowItem(new Item.Properties().durability(500)));
  public static final Item DIAMOND_BOW = registerItem("diamond_bow", new DiamondBowItem(new Item.Properties().durability(1000)));
  public static final Item NETHERITE_BOW = registerItem("netherite_bow", new NetheriteBowItem(new Item.Properties().durability(2000)));
  
  /* ITEM REGISTRATION: ARROWS */
  public static final Item FLINT_AND_STEEL_ARROW_ITEM = registerItem("flint_and_steel_arrow", new FlintAndSteelArrowItem(new Item.Properties()));
  public static final Item ENDER_PEARL_ARROW_ITEM = registerItem("ender_pearl_arrow", new EnderPearlArrowItem(new Item.Properties()));
  public static final Item TNT_ARROW_ITEM = registerItem("tnt_arrow", new TNTArrowItem(new Item.Properties()));
  public static final Item PAPER_ARROW_ITEM = registerItem("paper_arrow", new PaperArrowItem(new Item.Properties()));
  public static final Item MOSS_ARROW_ITEM = registerItem("moss_arrow", new MossArrowItem(new Item.Properties()));
  
  public static final Item AMETHYST_ARROW_ITEM = registerItem("amethyst_arrow", new AmethystArrowItem(new Item.Properties()));
  public static final Item BAMBOO_ARROW_ITEM = registerItem("bamboo_arrow", new BambooArrowItem(new Item.Properties()));
  public static final Item BLAZE_ROD_ARROW_ITEM = registerItem("blaze_rod_arrow", new BlazeRodArrowItem(new Item.Properties()));
  public static final Item BONE_ARROW_ITEM = registerItem("bone_arrow", new BoneArrowItem(new Item.Properties()));
  public static final Item CACTUS_ARROW_ITEM = registerItem("cactus_arrow", new CactusArrowItem(new Item.Properties()));
  public static final Item COAL_ARROW_ITEM = registerItem("coal_arrow", new CoalArrowItem(new Item.Properties()));
  public static final Item EMERALD_ARROW_ITEM = registerItem("emerald_arrow", new EmeraldArrowItem(new Item.Properties()));
  public static final Item LAPIS_ARROW_ITEM = registerItem("lapis_arrow", new LapisArrowItem(new Item.Properties()));
  public static final Item OBSIDIAN_ARROW_ITEM = registerItem("obsidian_arrow", new ObsidianArrowItem(new Item.Properties()));
  public static final Item FLINT_ARROW_ITEM = registerItem("flint_arrow", new FlintArrowItem(new Item.Properties()));
  
  public static final Item IRON_ARROW_ITEM = registerItem("iron_arrow", new IronArrowItem(new Item.Properties()));
  public static final Item COPPER_ARROW_ITEM = registerItem("copper_arrow", new CopperArrowItem(new Item.Properties()));
  public static final Item GOLD_ARROW_ITEM = registerItem("gold_arrow", new GoldArrowItem(new Item.Properties()));
  public static final Item DIAMOND_ARROW_ITEM = registerItem("diamond_arrow", new DiamondArrowItem(new Item.Properties()));
  public static final Item NETHERITE_ARROW_ITEM = registerItem("netherite_arrow", new NetheriteArrowItem(new Item.Properties()));
  
  private static Item registerItem(String name, Item item) {
    return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), item);
  }
  public static void register() {
    Constants.LOG.info("FabricItemRegistry " + Constants.MOD_ID);
  }
}
