package com.cursee.more_bows_and_arrows.core.entity;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.core.entity.custom.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.projectile.AbstractArrow;

import static com.cursee.more_bows_and_arrows.core.registry.ModRegistryFabric.registerEntityType;

public class ModEntitiesFabric {

    public static void register() {}

    public static final String TEXTURE_LOCATION = new ResourceLocation(Constants.MOD_ID, "textures/entity/arrow").toString();

    public static final EntityType<AmethystArrow> AMETHYST_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "amethyst_arrow"),
            FabricEntityTypeBuilder.<AmethystArrow>create(MobCategory.MISC, AmethystArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<BambooArrow> BAMBOO_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "bamboo_arrow"),
            FabricEntityTypeBuilder.<BambooArrow>create(MobCategory.MISC, BambooArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<BlazeRodArrow> BLAZE_ROD_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "blaze_arrow"),
            FabricEntityTypeBuilder.<BlazeRodArrow>create(MobCategory.MISC, BlazeRodArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<BoneArrow> BONE_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "bone_arrow"),
            FabricEntityTypeBuilder.<BoneArrow>create(MobCategory.MISC, BoneArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<CactusArrow> CACTUS_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "cactus_arrow"),
            FabricEntityTypeBuilder.<CactusArrow>create(MobCategory.MISC, CactusArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<CoalArrow> COAL_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "coal_arrow"),
            FabricEntityTypeBuilder.<CoalArrow>create(MobCategory.MISC, CoalArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<CopperArrow> COPPER_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "copper_arrow"),
            FabricEntityTypeBuilder.<CopperArrow>create(MobCategory.MISC, CopperArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<DiamondArrow> DIAMOND_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "diamond_arrow"),
            FabricEntityTypeBuilder.<DiamondArrow>create(MobCategory.MISC, DiamondArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<EmeraldArrow> EMERALD_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "emerald_arrow"),
            FabricEntityTypeBuilder.<EmeraldArrow>create(MobCategory.MISC, EmeraldArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<EnderPearlArrow> ENDER_PEARL_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "ender_pearl_arrow"),
            FabricEntityTypeBuilder.<EnderPearlArrow>create(MobCategory.MISC, EnderPearlArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<FlintAndSteelArrow> FLINT_AND_STEEL_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "flint_and_steel_arrow"),
            FabricEntityTypeBuilder.<FlintAndSteelArrow>create(MobCategory.MISC, FlintAndSteelArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<FlintArrow> FLINT_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "flint_arrow"),
            FabricEntityTypeBuilder.<FlintArrow>create(MobCategory.MISC, FlintArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<GoldArrow> GOLD_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "gold_arrow"),
            FabricEntityTypeBuilder.<GoldArrow>create(MobCategory.MISC, GoldArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<IronArrow> IRON_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "iron_arrow"),
            FabricEntityTypeBuilder.<IronArrow>create(MobCategory.MISC, IronArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<LapisArrow> LAPIS_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "lapis_arrow"),
            FabricEntityTypeBuilder.<LapisArrow>create(MobCategory.MISC, LapisArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<MossArrow> MOSS_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "moss_arrow"),
            FabricEntityTypeBuilder.<MossArrow>create(MobCategory.MISC, MossArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<NetheriteArrow> NETHERITE_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "netherite_arrow"),
            FabricEntityTypeBuilder.<NetheriteArrow>create(MobCategory.MISC, NetheriteArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<ObsidianArrow> OBSIDIAN_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "obsidian_arrow"),
            FabricEntityTypeBuilder.<ObsidianArrow>create(MobCategory.MISC, ObsidianArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<PaperArrow> PAPER_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "paper_arrow"),
            FabricEntityTypeBuilder.<PaperArrow>create(MobCategory.MISC, PaperArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    public static final EntityType<TNTArrow> TNT_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "tnt_arrow"),
            FabricEntityTypeBuilder.<TNTArrow>create(MobCategory.MISC, TNTArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
    
    

//    public static <T extends Entity> EntityType<? extends T> registerEntityType(String name, EntityType<? extends T> entityType) {
//        return Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, name), entityType);
//    }

    // valid but has weird wild card and not abstracted to a method
//    public static final EntityType<AmethystArrow> AMETHYST_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, "amethyst_arrow"),
//            FabricEntityTypeBuilder.<AmethystArrow>create(MobCategory.MISC, AmethystArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
    // valid but has unchecked cast which could result in unexpected behavior [arrows have no behavior ??]
//    public static final EntityType<AmethystArrow> AMETHYST_ARROW = (EntityType<AmethystArrow>) registerEntityType("amethyst_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, AmethystArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<BambooArrow> BAMBOO_ARROW = (EntityType<BambooArrow>) registerEntityType("bamboo_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, BambooArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<BlazeRodArrow> BLAZE_ROD_ARROW = (EntityType<BlazeRodArrow>) registerEntityType("blaze_rod_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, BlazeRodArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<BoneArrow> BONE_ARROW = (EntityType<BoneArrow>) registerEntityType("bone_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, BoneArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<CactusArrow> CACTUS_ARROW = (EntityType<CactusArrow>) registerEntityType("cactus_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, CactusArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<CoalArrow> COAL_ARROW = (EntityType<CoalArrow>) registerEntityType("coal_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, CoalArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<CopperArrow> COPPER_ARROW = (EntityType<CopperArrow>) registerEntityType("copper_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, CopperArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<DiamondArrow> DIAMOND_ARROW = (EntityType<DiamondArrow>) registerEntityType("diamond_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, DiamondArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<EmeraldArrow> EMERALD_ARROW = (EntityType<EmeraldArrow>) registerEntityType("emerald_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, EmeraldArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<EnderPearlArrow> ENDER_PEARL_ARROW = (EntityType<EnderPearlArrow>) registerEntityType("ender_pearl_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, EnderPearlArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<FlintAndSteelArrow> FLINT_AND_STEEL_ARROW = (EntityType<FlintAndSteelArrow>) registerEntityType("flint_and_steel_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, FlintAndSteelArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<FlintArrow> FLINT_ARROW = (EntityType<FlintArrow>) registerEntityType("flint_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, FlintArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<GoldArrow> GOLD_ARROW = (EntityType<GoldArrow>) registerEntityType("gold_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, GoldArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<IronArrow> IRON_ARROW = (EntityType<IronArrow>) registerEntityType("iron_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, IronArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<LapisArrow> LAPIS_ARROW = (EntityType<LapisArrow>) registerEntityType("lapis_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, LapisArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<MossArrow> MOSS_ARROW = (EntityType<MossArrow>) registerEntityType("moss_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, MossArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<NetheriteArrow> NETHERITE_ARROW = (EntityType<NetheriteArrow>) registerEntityType("netherite_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, NetheriteArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<ObsidianArrow> OBSIDIAN_ARROW = (EntityType<ObsidianArrow>) registerEntityType("obsidian_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, ObsidianArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<PaperArrow> PAPER_ARROW = (EntityType<PaperArrow>) registerEntityType("paper_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, PaperArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
//    public static final EntityType<TNTArrow> TNT_ARROW = (EntityType<TNTArrow>) registerEntityType("tnt_arrow", FabricEntityTypeBuilder.create(MobCategory.MISC, TNTArrow::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

//    public static final EntityType<?> ENDER_PEARL_ARROW = registerEntityType("ender_pearl_arrow",
//            EntityType.Builder.of(EnderPearlArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> FLINT_AND_STEEL_ARROW = registerEntityType("flint_and_steel_arrow",
//            EntityType.Builder.of(FlintAndSteelArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> TNT_ARROW = registerEntityType("tnt_arrow",
//            EntityType.Builder.of(TNTArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> PAPER_ARROW = registerEntityType("paper_arrow",
//            EntityType.Builder.of(PaperArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> MOSS_ARROW = registerEntityType("moss_arrow",
//            EntityType.Builder.of(MossArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> AMETHYST_ARROW = registerEntityType("amethyst_arrow",
//            EntityType.Builder.of((AmethystArrow::new), MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> BAMBOO_ARROW = registerEntityType("bamboo_arrow",
//            EntityType.Builder.of(BambooArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> BLAZE_ROD_ARROW = registerEntityType("blaze_rod_arrow",
//            EntityType.Builder.of(BlazeRodArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> BONE_ARROW = registerEntityType("bone_arrow",
//            EntityType.Builder.of(BoneArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> CACTUS_ARROW = registerEntityType("cactus_arrow",
//            EntityType.Builder.of(CactusArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> COAL_ARROW = registerEntityType("coal_arrow",
//            EntityType.Builder.of(CoalArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> EMERALD_ARROW = registerEntityType("emerald_arrow",
//            EntityType.Builder.of(EmeraldArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> LAPIS_ARROW = registerEntityType("lapis_arrow",
//            EntityType.Builder.of(LapisArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> OBSIDIAN_ARROW = registerEntityType("obsidian_arrow",
//            EntityType.Builder.of(ObsidianArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> FLINT_ARROW = registerEntityType("flint_arrow",
//            EntityType.Builder.of(FlintArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> IRON_ARROW = registerEntityType("iron_arrow",
//            EntityType.Builder.of(IronArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> COPPER_ARROW = registerEntityType("copper_arrow",
//            EntityType.Builder.of(CopperArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> GOLD_ARROW = registerEntityType("gold_arrow",
//            EntityType.Builder.of(GoldArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> DIAMOND_ARROW = registerEntityType("diamond_arrow",
//            EntityType.Builder.of(DiamondArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
//
//    public static final EntityType<?> NETHERITE_ARROW = registerEntityType("netherite_arrow",
//            EntityType.Builder.of(NetheriteArrow::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .clientTrackingRange(4)
//                    .updateInterval(20)
//                    .build(TEXTURE_LOCATION)
//    );
}
