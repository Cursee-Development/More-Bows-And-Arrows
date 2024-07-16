package com.cursee.more_bows_and_arrows.registry;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.item.arrow.*;
import com.cursee.more_bows_and_arrows.item.bow.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ForgeItemRegistry {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);
  public static void register(IEventBus bus) { ITEMS.register(bus); }
  
  // ITEM REGISTRATION: BOWS
  public static final RegistryObject<Item> OAK_BOW = ITEMS.register( "oak_bow", () -> new OakBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> STRIPPED_OAK_BOW = ITEMS.register( "stripped_oak_bow", () -> new StrippedOakBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> DARK_OAK_BOW = ITEMS.register( "dark_oak_bow", () -> new DarkOakBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> STRIPPED_DARK_OAK_BOW = ITEMS.register( "stripped_dark_oak_bow", () -> new StrippedDarkOakBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> SPRUCE_BOW = ITEMS.register( "spruce_bow", () -> new SpruceBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> STRIPPED_SPRUCE_BOW = ITEMS.register( "stripped_spruce_bow", () -> new StrippedSpruceBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> BIRCH_BOW = ITEMS.register( "birch_bow", () -> new BirchBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> STRIPPED_BIRCH_BOW = ITEMS.register( "stripped_birch_bow", () -> new StrippedBirchBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> JUNGLE_BOW = ITEMS.register( "jungle_bow", () -> new JungleBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> STRIPPED_JUNGLE_BOW = ITEMS.register( "stripped_jungle_bow", () -> new StrippedJungleBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> ACACIA_BOW = ITEMS.register( "acacia_bow", () -> new AcaciaBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> STRIPPED_ACACIA_BOW = ITEMS.register( "stripped_acacia_bow", () -> new StrippedAcaciaBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> MANGROVE_BOW = ITEMS.register( "mangrove_bow", () -> new MangroveBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> STRIPPED_MANGROVE_BOW = ITEMS.register( "stripped_mangrove_bow", () -> new StrippedMangroveBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> CHERRY_BOW = ITEMS.register( "cherry_bow", () -> new CherryBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> STRIPPED_CHERRY_BOW = ITEMS.register( "stripped_cherry_bow", () -> new StrippedCherryBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> BAMBOO_BOW = ITEMS.register( "bamboo_bow", () -> new BambooBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> STRIPPED_BAMBOO_BOW = ITEMS.register( "stripped_bamboo_bow", () -> new StrippedBambooBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> CRIMSON_STEM_BOW = ITEMS.register( "crimson_stem_bow", () -> new CrimsonStemBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> STRIPPED_CRIMSON_STEM_BOW = ITEMS.register( "stripped_crimson_stem_bow", () -> new StrippedCrimsonStemBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> WARPED_STEM_BOW = ITEMS.register( "warped_stem_bow", () -> new WarpedStemBowItem(new Item.Properties().durability(350)));
  public static final RegistryObject<Item> STRIPPED_WARPED_STEM_BOW = ITEMS.register( "stripped_warped_stem_bow", () -> new StrippedWarpedStemBowItem(new Item.Properties().durability(350)));
  
  public static final RegistryObject<Item> PAPER_BOW = ITEMS.register( "paper_bow", () -> new PaperBowItem(new Item.Properties().durability(300)));
  public static final RegistryObject<Item> MOSS_BOW = ITEMS.register( "moss_bow", () -> new MossBowItem(new Item.Properties().durability(300)));
  public static final RegistryObject<Item> LAPIS_BOW = ITEMS.register( "lapis_bow", () -> new LapisBowItem(new Item.Properties().durability(400)));
  public static final RegistryObject<Item> AMETHYST_BOW = ITEMS.register( "amethyst_bow", () -> new AmethystBowItem(new Item.Properties().durability(400)));
  public static final RegistryObject<Item> BONE_BOW = ITEMS.register( "bone_bow", () -> new BoneBowItem(new Item.Properties().durability(400)));
  public static final RegistryObject<Item> COAL_BOW = ITEMS.register( "coal_bow", () -> new CoalBowItem(new Item.Properties().durability(400)));
  public static final RegistryObject<Item> EMERALD_BOW = ITEMS.register( "emerald_bow", () -> new EmeraldBowItem(new Item.Properties().durability(750)));
  public static final RegistryObject<Item> BLAZE_BOW = ITEMS.register( "blaze_bow", () -> new BlazeBowItem(new Item.Properties().durability(750)));
  public static final RegistryObject<Item> OBSIDIAN_BOW = ITEMS.register( "obsidian_bow", () -> new ObsidianBowItem(new Item.Properties().durability(750)));
  
  public static final RegistryObject<Item> GOLD_BOW = ITEMS.register( "gold_bow", () -> new GoldBowItem(new Item.Properties().durability(400)));
  public static final RegistryObject<Item> IRON_BOW = ITEMS.register( "iron_bow", () -> new IronBowItem(new Item.Properties().durability(500)));
  public static final RegistryObject<Item> COPPER_BOW = ITEMS.register( "copper_bow", () -> new CopperBowItem(new Item.Properties().durability(500)));
  public static final RegistryObject<Item> DIAMOND_BOW = ITEMS.register( "diamond_bow", () -> new DiamondBowItem(new Item.Properties().durability(1000)));
  public static final RegistryObject<Item> NETHERITE_BOW = ITEMS.register( "netherite_bow", () -> new NetheriteBowItem(new Item.Properties().durability(2000)));
  
  // ITEM REGISTRATION: ARROWS
  public static final RegistryObject<Item> FLINT_AND_STEEL_ARROW_ITEM = ITEMS.register("flint_and_steel_arrow", () -> { return new FlintAndSteelArrowItem(new Item.Properties()); });
  public static final RegistryObject<Item> ENDER_PEARL_ARROW_ITEM = ITEMS.register("ender_pearl_arrow", () -> { return new EnderPearlArrowItem(new Item.Properties()); });
  public static final RegistryObject<Item> TNT_ARROW_ITEM = ITEMS.register("tnt_arrow", () -> { return new TNTArrowItem(new Item.Properties()); });
  public static final RegistryObject<Item> PAPER_ARROW_ITEM = ITEMS.register("paper_arrow", () -> { return new PaperArrowItem(new Item.Properties()); });
  public static final RegistryObject<Item> MOSS_ARROW_ITEM = ITEMS.register("moss_arrow", () -> { return new MossArrowItem(new Item.Properties()); });
  
  public static final RegistryObject<Item> AMETHYST_ARROW_ITEM = ITEMS.register("amethyst_arrow", () -> { return new AmethystArrowItem(new Item.Properties()); });
  public static final RegistryObject<Item> BAMBOO_ARROW_ITEM = ITEMS.register("bamboo_arrow", () -> { return new BambooArrowItem(new Item.Properties()); });
  public static final RegistryObject<Item> BLAZE_ROD_ARROW_ITEM = ITEMS.register("blaze_rod_arrow", () -> { return new BlazeRodArrowItem(new Item.Properties()); });
  public static final RegistryObject<Item> BONE_ARROW_ITEM = ITEMS.register("bone_arrow", () -> { return new BoneArrowItem(new Item.Properties()); });
  public static final RegistryObject<Item> CACTUS_ARROW_ITEM = ITEMS.register("cactus_arrow", () -> { return new CactusArrowItem(new Item.Properties()); });
  public static final RegistryObject<Item> COAL_ARROW_ITEM = ITEMS.register("coal_arrow", () -> { return new CoalArrowItem(new Item.Properties()); });
  public static final RegistryObject<Item> EMERALD_ARROW_ITEM = ITEMS.register("emerald_arrow", () -> { return new EmeraldArrowItem(new Item.Properties()); });
  public static final RegistryObject<Item> LAPIS_ARROW_ITEM = ITEMS.register("lapis_arrow", () -> { return new LapisArrowItem(new Item.Properties()); });
  public static final RegistryObject<Item> OBSIDIAN_ARROW_ITEM = ITEMS.register("obsidian_arrow", () -> { return new ObsidianArrowItem(new Item.Properties()); });
  public static final RegistryObject<Item> FLINT_ARROW_ITEM = ITEMS.register("flint_arrow", () -> { return new FlintArrowItem(new Item.Properties()); });
  
  public static final RegistryObject<Item> IRON_ARROW_ITEM = ITEMS.register("iron_arrow", () -> { return new IronArrowItem(new Item.Properties()); });
  public static final RegistryObject<Item> COPPER_ARROW_ITEM = ITEMS.register("copper_arrow", () -> { return new CopperArrowItem(new Item.Properties()); });
  public static final RegistryObject<Item> GOLD_ARROW_ITEM = ITEMS.register("gold_arrow", () -> { return new GoldArrowItem(new Item.Properties()); });
  public static final RegistryObject<Item> DIAMOND_ARROW_ITEM = ITEMS.register("diamond_arrow", () -> { return new DiamondArrowItem(new Item.Properties()); });
  public static final RegistryObject<Item> NETHERITE_ARROW_ITEM = ITEMS.register("netherite_arrow", () -> { return new NetheriteArrowItem(new Item.Properties()); });
}
