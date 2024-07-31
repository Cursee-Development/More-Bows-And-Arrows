package com.cursee.more_bows_and_arrows;

import com.cursee.more_bows_and_arrows.core.entity.ModEntitiesForge;
import com.cursee.more_bows_and_arrows.core.entity.renderer.EnderPearlArrowRenderer;
import com.cursee.more_bows_and_arrows.core.item.ModItemsForge;
import com.cursee.more_bows_and_arrows.core.registry.ModRegistryForge;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MoreBowsAndArrowsForgeClient {

    @SubscribeEvent
    public void onClientSetup(FMLClientSetupEvent event) {
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.OAK_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.STRIPPED_OAK_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.DARK_OAK_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.STRIPPED_DARK_OAK_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.SPRUCE_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.STRIPPED_SPRUCE_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.BIRCH_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.STRIPPED_BIRCH_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.JUNGLE_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.STRIPPED_JUNGLE_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.ACACIA_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.STRIPPED_ACACIA_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.MANGROVE_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.STRIPPED_MANGROVE_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.CHERRY_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.STRIPPED_CHERRY_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.BAMBOO_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.STRIPPED_BAMBOO_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.CRIMSON_STEM_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.STRIPPED_CRIMSON_STEM_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.WARPED_STEM_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.STRIPPED_WARPED_STEM_BOW.get());

        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.PAPER_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.MOSS_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.LAPIS_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.AMETHYST_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.BONE_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.COAL_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.EMERALD_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.BLAZE_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.OBSIDIAN_BOW.get());

        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.IRON_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.COPPER_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.GOLD_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.DIAMOND_BOW.get());
        MoreBowsAndArrowsForgeClient.registerBowProperties(ModItemsForge.NETHERITE_BOW.get());
    }

    @SubscribeEvent
    public static void onRegisterEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer((EntityType) ModEntitiesForge.ENDER_PEARL_ARROW.get(), EnderPearlArrowRenderer::new);
    }

    private static <T extends Item> void registerBowProperties(T item) {

        ItemProperties.register(item, new ResourceLocation("pull"), ((itemStack, clientLevel, livingEntity, i) -> {
            if (livingEntity == null || livingEntity.getUseItem() != itemStack) return 0.0f;
            return (float) (itemStack.getUseDuration() - livingEntity.getUseItemRemainingTicks()) / 20.0F;
        }));

        ItemProperties.register(item, new ResourceLocation("pulling"), ((itemStack, clientLevel, livingEntity, i) -> {
            if (livingEntity != null && livingEntity.isUsingItem() && livingEntity.getUseItem() == itemStack) return 1.0f;
            return 0.0f;
        }));
    }
}
