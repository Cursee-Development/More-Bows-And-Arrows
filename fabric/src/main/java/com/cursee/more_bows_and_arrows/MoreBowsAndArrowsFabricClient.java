package com.cursee.more_bows_and_arrows;

import com.cursee.more_bows_and_arrows.core.entity.ModEntitiesFabric;
import com.cursee.more_bows_and_arrows.core.entity.renderer.*;
import com.cursee.more_bows_and_arrows.core.item.ModItemsFabric;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class MoreBowsAndArrowsFabricClient implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {

        registerBow(ModItemsFabric.OAK_BOW);
        registerBow(ModItemsFabric.STRIPPED_OAK_BOW);
        registerBow(ModItemsFabric.DARK_OAK_BOW);
        registerBow(ModItemsFabric.STRIPPED_DARK_OAK_BOW);
        registerBow(ModItemsFabric.SPRUCE_BOW);
        registerBow(ModItemsFabric.STRIPPED_SPRUCE_BOW);
        registerBow(ModItemsFabric.BIRCH_BOW);
        registerBow(ModItemsFabric.STRIPPED_BIRCH_BOW);
        registerBow(ModItemsFabric.JUNGLE_BOW);
        registerBow(ModItemsFabric.STRIPPED_JUNGLE_BOW);
        registerBow(ModItemsFabric.ACACIA_BOW);
        registerBow(ModItemsFabric.STRIPPED_ACACIA_BOW);
        registerBow(ModItemsFabric.MANGROVE_BOW);
        registerBow(ModItemsFabric.STRIPPED_MANGROVE_BOW);
        registerBow(ModItemsFabric.CHERRY_BOW);
        registerBow(ModItemsFabric.STRIPPED_CHERRY_BOW);
        registerBow(ModItemsFabric.BAMBOO_BOW);
        registerBow(ModItemsFabric.STRIPPED_BAMBOO_BOW);
        registerBow(ModItemsFabric.CRIMSON_STEM_BOW);
        registerBow(ModItemsFabric.STRIPPED_CRIMSON_STEM_BOW);
        registerBow(ModItemsFabric.WARPED_STEM_BOW);
        registerBow(ModItemsFabric.STRIPPED_WARPED_STEM_BOW);

        registerBow(ModItemsFabric.PAPER_BOW);
        registerBow(ModItemsFabric.MOSS_BOW);
        registerBow(ModItemsFabric.LAPIS_BOW);
        registerBow(ModItemsFabric.AMETHYST_BOW);
        registerBow(ModItemsFabric.BONE_BOW);
        registerBow(ModItemsFabric.COAL_BOW);
        registerBow(ModItemsFabric.EMERALD_BOW);
        registerBow(ModItemsFabric.BLAZE_BOW);
        registerBow(ModItemsFabric.OBSIDIAN_BOW);

        registerBow(ModItemsFabric.IRON_BOW);
        registerBow(ModItemsFabric.COPPER_BOW);
        registerBow(ModItemsFabric.GOLD_BOW);
        registerBow(ModItemsFabric.DIAMOND_BOW);
        registerBow(ModItemsFabric.NETHERITE_BOW);

        EntityRendererRegistry.register(ModEntitiesFabric.FLINT_AND_STEEL_ARROW, FlintAndSteelArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.ENDER_PEARL_ARROW, EnderPearlArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.TNT_ARROW, TNTArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.PAPER_ARROW, PaperArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.MOSS_ARROW, MossArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.AMETHYST_ARROW, AmethystArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.BAMBOO_ARROW, BambooArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.BLAZE_ROD_ARROW, BlazeRodArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.BONE_ARROW, BoneArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.CACTUS_ARROW, CactusArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.COAL_ARROW, CoalArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.EMERALD_ARROW, EmeraldArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.LAPIS_ARROW, LapisArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.OBSIDIAN_ARROW, ObsidianArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.FLINT_ARROW, FlintArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.COPPER_ARROW, CopperArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.GOLD_ARROW, GoldArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.IRON_ARROW, IronArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.DIAMOND_ARROW, DiamondArrowRenderer::new);
        EntityRendererRegistry.register(ModEntitiesFabric.NETHERITE_ARROW, NetheriteArrowRenderer::new);
    }

    private static void registerBow(Item bow) {
        ItemProperties.register(bow, new ResourceLocation("pull"), (stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0f;
            }
            if (entity.getUseItem() != stack) {
                return 0.0f;
            }
            return (float)(stack.getUseDuration() - entity.getUseItemRemainingTicks()) / 20.0f;
        });
        ItemProperties.register(bow, new ResourceLocation("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0f : 0.0f);

    }
}
