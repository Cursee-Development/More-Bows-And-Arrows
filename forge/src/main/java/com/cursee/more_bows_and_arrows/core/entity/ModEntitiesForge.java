package com.cursee.more_bows_and_arrows.core.entity;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.core.entity.custom.*;
import com.cursee.more_bows_and_arrows.core.item.custom.MultiArrowItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.cursee.more_bows_and_arrows.core.registry.ModRegistryForge.registerEntityType;

public class ModEntitiesForge {

    public static void register() {}

    public static final String TEXTURE_LOCATION = new ResourceLocation(Constants.MOD_ID, "textures/entity/arrow").toString();

    public static final RegistryObject<EntityType<?>> ENDER_PEARL_ARROW = registerEntityType("ender_pearl_arrow",
            () -> EntityType.Builder.of((type, level) -> new _TypedArrow(MultiArrowItem.Type.ENDER_PEARL, type, level), MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );

    public static final RegistryObject<EntityType<?>> FLINT_AND_STEEL_ARROW = registerEntityType("flint_and_steel_arrow",
            () -> EntityType.Builder.of(FlintAndSteelArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );
    
    public static final RegistryObject<EntityType<?>> TNT_ARROW = registerEntityType("tnt_arrow",
            () -> EntityType.Builder.of(TNTArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );
    
    public static final RegistryObject<EntityType<?>> PAPER_ARROW = registerEntityType("paper_arrow",
            () -> EntityType.Builder.of(PaperArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );
    
    public static final RegistryObject<EntityType<?>> MOSS_ARROW = registerEntityType("moss_arrow",
            () -> EntityType.Builder.of(MossArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );

    public static final RegistryObject<EntityType<?>> AMETHYST_ARROW = registerEntityType("amethyst_arrow",
            () -> EntityType.Builder.of((AmethystArrow::new), MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );
    
    public static final RegistryObject<EntityType<?>> BAMBOO_ARROW = registerEntityType("bamboo_arrow",
            () -> EntityType.Builder.of(BambooArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );
    
    public static final RegistryObject<EntityType<?>> BLAZE_ROD_ARROW = registerEntityType("blaze_rod_arrow",
            () -> EntityType.Builder.of(BlazeRodArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );
    
    public static final RegistryObject<EntityType<?>> BONE_ARROW = registerEntityType("bone_arrow",
            () -> EntityType.Builder.of(BoneArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );
    
    public static final RegistryObject<EntityType<?>> CACTUS_ARROW = registerEntityType("cactus_arrow",
            () -> EntityType.Builder.of(CactusArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );
    
    public static final RegistryObject<EntityType<?>> COAL_ARROW = registerEntityType("coal_arrow",
            () -> EntityType.Builder.of(CoalArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );
    
    public static final RegistryObject<EntityType<?>> EMERALD_ARROW = registerEntityType("emerald_arrow",
            () -> EntityType.Builder.of(EmeraldArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );
    
    public static final RegistryObject<EntityType<?>> LAPIS_ARROW = registerEntityType("lapis_arrow",
            () -> EntityType.Builder.of(LapisArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );
    
    public static final RegistryObject<EntityType<?>> OBSIDIAN_ARROW = registerEntityType("obsidian_arrow",
            () -> EntityType.Builder.of(ObsidianArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );
    
    public static final RegistryObject<EntityType<?>> FLINT_ARROW = registerEntityType("flint_arrow",
            () -> EntityType.Builder.of(FlintArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );

    public static final RegistryObject<EntityType<?>> IRON_ARROW = registerEntityType("iron_arrow",
            () -> EntityType.Builder.of(IronArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );
    
    public static final RegistryObject<EntityType<?>> COPPER_ARROW = registerEntityType("copper_arrow",
            () -> EntityType.Builder.of(CopperArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );
    
    public static final RegistryObject<EntityType<?>> GOLD_ARROW = registerEntityType("gold_arrow",
            () -> EntityType.Builder.of(GoldArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );
    
    public static final RegistryObject<EntityType<?>> DIAMOND_ARROW = registerEntityType("diamond_arrow",
            () -> EntityType.Builder.of(DiamondArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );
    
    public static final RegistryObject<EntityType<?>> NETHERITE_ARROW = registerEntityType("netherite_arrow",
            () -> EntityType.Builder.of(NetheriteArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(TEXTURE_LOCATION)
    );
}
