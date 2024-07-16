package com.cursee.more_bows_and_arrows;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import com.cursee.more_bows_and_arrows.registry.FabricEntityTypeRegistry;
import com.cursee.more_bows_and_arrows.registry.FabricItemProperties;
import com.cursee.more_bows_and_arrows.renderer.projectile.*;

public class MoreBowsAndArrowsFabricClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    FabricItemProperties.registerBowModels();
    registerArrowRenderers();
  }
  
  private void registerArrowRenderers() {
    
    EntityRendererRegistry.register(FabricEntityTypeRegistry.FLINT_AND_STEEL_ARROW_ENTITY, FlintAndSteelArrowRenderer::new);
    EntityRendererRegistry.register(FabricEntityTypeRegistry.ENDER_PEARL_ARROW_ENTITY, EnderPearlArrowRenderer::new);
    EntityRendererRegistry.register(FabricEntityTypeRegistry.TNT_ARROW_ENTITY, TNTArrowRenderer::new);
    EntityRendererRegistry.register(FabricEntityTypeRegistry.PAPER_ARROW_ENTITY, PaperArrowRenderer::new);
    EntityRendererRegistry.register(FabricEntityTypeRegistry.MOSS_ARROW_ENTITY, MossArrowRenderer::new);

    EntityRendererRegistry.register(FabricEntityTypeRegistry.AMETHYST_ARROW_ENTITY, AmethystArrowRenderer::new);
    EntityRendererRegistry.register(FabricEntityTypeRegistry.BAMBOO_ARROW_ENTITY, BambooArrowRenderer::new);
    EntityRendererRegistry.register(FabricEntityTypeRegistry.BLAZE_ROD_ARROW_ENTITY, BlazeRodArrowRenderer::new);
    EntityRendererRegistry.register(FabricEntityTypeRegistry.BONE_ARROW_ENTITY, BoneArrowRenderer::new);
    EntityRendererRegistry.register(FabricEntityTypeRegistry.CACTUS_ARROW_ENTITY, CactusArrowRenderer::new);
    EntityRendererRegistry.register(FabricEntityTypeRegistry.COAL_ARROW_ENTITY, CoalArrowRenderer::new);
    EntityRendererRegistry.register(FabricEntityTypeRegistry.EMERALD_ARROW_ENTITY, EmeraldArrowRenderer::new);
    EntityRendererRegistry.register(FabricEntityTypeRegistry.LAPIS_ARROW_ENTITY, LapisArrowRenderer::new);
    EntityRendererRegistry.register(FabricEntityTypeRegistry.OBSIDIAN_ARROW_ENTITY, ObsidianArrowRenderer::new);
    EntityRendererRegistry.register(FabricEntityTypeRegistry.FLINT_ARROW_ENTITY, FlintArrowRenderer::new);

    EntityRendererRegistry.register(FabricEntityTypeRegistry.COPPER_ARROW_ENTITY, CopperArrowRenderer::new);
    EntityRendererRegistry.register(FabricEntityTypeRegistry.GOLD_ARROW_ENTITY, GoldArrowRenderer::new);

    EntityRendererRegistry.register(FabricEntityTypeRegistry.IRON_ARROW_ENTITY, IronArrowRenderer::new);
    EntityRendererRegistry.register(FabricEntityTypeRegistry.DIAMOND_ARROW_ENTITY, DiamondArrowRenderer::new);
    EntityRendererRegistry.register(FabricEntityTypeRegistry.NETHERITE_ARROW_ENTITY, NetheriteArrowRenderer::new);
  }
}
