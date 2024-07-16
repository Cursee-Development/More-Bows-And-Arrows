//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.cursee.more_bows_and_arrows.registry;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.renderer.projectile.*;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = Constants.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ForgeRendererRegistry {

    @SubscribeEvent
    public static void registerArrowRenders(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.AMETHYST_ARROW_ENTITY.get(), AmethystArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.BAMBOO_ARROW_ENTITY.get(), BambooArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.BLAZE_ROD_ARROW_ENTITY.get(), BlazeRodArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.BONE_ARROW_ENTITY.get(), BoneArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.CACTUS_ARROW_ENTITY.get(), CactusArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.COAL_ARROW_ENTITY.get(), CoalArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.COPPER_ARROW_ENTITY.get(), CopperArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.DIAMOND_ARROW_ENTITY.get(), DiamondArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.EMERALD_ARROW_ENTITY.get(), EmeraldArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.ENDER_PEARL_ARROW_ENTITY.get(), EnderPearlArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.FLINT_AND_STEEL_ARROW_ENTITY.get(), FlintAndSteelArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.FLINT_ARROW_ENTITY.get(), FlintArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.GOLD_ARROW_ENTITY.get(), GoldArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.IRON_ARROW_ENTITY.get(), IronArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.LAPIS_ARROW_ENTITY.get(), LapisArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.MOSS_ARROW_ENTITY.get(), MossArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.NETHERITE_ARROW_ENTITY.get(), NetheriteArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.OBSIDIAN_ARROW_ENTITY.get(), ObsidianArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.PAPER_ARROW_ENTITY.get(), PaperArrowRenderer::new);
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.TNT_ARROW_ENTITY.get(), TNTArrowRenderer::new);
    }
}
