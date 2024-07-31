package com.cursee.more_bows_and_arrows;

import com.cursee.monolib.core.sailing.Sailing;
import com.cursee.more_bows_and_arrows.core.item.ModItemsForge;
import com.cursee.more_bows_and_arrows.core.registry.ModDispenserRegistryForge;
import com.cursee.more_bows_and_arrows.core.registry.ModRegistryForge;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class MoreBowsAndArrowsForge {
    
    public MoreBowsAndArrowsForge() {
    
        MoreBowsAndArrows.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModRegistryForge.registerAll(bus);

        bus.addListener(this::client);

        bus.addListener(this::common);
    }

    public void client(FMLClientSetupEvent event) {

        event.enqueueWork(() -> {
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.OAK_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.STRIPPED_OAK_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.DARK_OAK_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.STRIPPED_DARK_OAK_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.SPRUCE_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.STRIPPED_SPRUCE_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.BIRCH_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.STRIPPED_BIRCH_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.JUNGLE_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.STRIPPED_JUNGLE_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.ACACIA_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.STRIPPED_ACACIA_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.MANGROVE_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.STRIPPED_MANGROVE_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.CHERRY_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.STRIPPED_CHERRY_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.BAMBOO_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.STRIPPED_BAMBOO_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.CRIMSON_STEM_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.STRIPPED_CRIMSON_STEM_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.WARPED_STEM_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.STRIPPED_WARPED_STEM_BOW.get());

            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.PAPER_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.MOSS_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.LAPIS_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.AMETHYST_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.BONE_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.COAL_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.EMERALD_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.BLAZE_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.OBSIDIAN_BOW.get());

            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.IRON_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.COPPER_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.GOLD_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.DIAMOND_BOW.get());
            MoreBowsAndArrowsForge.registerBowProperties(ModItemsForge.NETHERITE_BOW.get());
        });
    }

    public void common(FMLCommonSetupEvent event) {
        ModDispenserRegistryForge.registerArrowsAsProjectiles();
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