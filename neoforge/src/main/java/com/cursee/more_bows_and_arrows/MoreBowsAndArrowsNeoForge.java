package com.cursee.more_bows_and_arrows;

import com.cursee.monolib.core.sailing.Sailing;
import com.cursee.more_bows_and_arrows.core.item.ModItemsForge;
import com.cursee.more_bows_and_arrows.core.registry.ModDispenserRegistryForge;
import com.cursee.more_bows_and_arrows.core.registry.ModRegistryForge;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.AnvilUpdateEvent;

@Mod(Constants.MOD_ID)
public class MoreBowsAndArrowsNeoForge {

    public MoreBowsAndArrowsNeoForge(IEventBus bus) {

        MoreBowsAndArrows.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);

        ModRegistryForge.registerAll(bus);

        bus.addListener(this::client);

        bus.addListener(this::common);
    }

    public void client(FMLClientSetupEvent event) {

        event.enqueueWork(() -> {
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.OAK_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.STRIPPED_OAK_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.DARK_OAK_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.STRIPPED_DARK_OAK_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.SPRUCE_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.STRIPPED_SPRUCE_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.BIRCH_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.STRIPPED_BIRCH_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.JUNGLE_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.STRIPPED_JUNGLE_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.ACACIA_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.STRIPPED_ACACIA_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.MANGROVE_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.STRIPPED_MANGROVE_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.CHERRY_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.STRIPPED_CHERRY_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.BAMBOO_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.STRIPPED_BAMBOO_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.CRIMSON_STEM_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.STRIPPED_CRIMSON_STEM_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.WARPED_STEM_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.STRIPPED_WARPED_STEM_BOW.get());

            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.PAPER_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.MOSS_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.LAPIS_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.AMETHYST_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.BONE_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.COAL_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.EMERALD_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.BLAZE_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.OBSIDIAN_BOW.get());

            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.IRON_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.COPPER_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.GOLD_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.DIAMOND_BOW.get());
            MoreBowsAndArrowsNeoForge.registerBowProperties(ModItemsForge.NETHERITE_BOW.get());
        });
    }

    public void common(FMLCommonSetupEvent event) {
        ModDispenserRegistryForge.registerArrowsAsProjectiles();
    }

    private static <T extends Item> void registerBowProperties(T bow) {

        ItemProperties.register(bow, ResourceLocation.withDefaultNamespace("pull"), (itemStack, clientLevel, livingEntity, i) -> {
            if (livingEntity == null) {
                return 0.0F;
            } else {
                return livingEntity.getUseItem() != itemStack ? 0.0F : (float)(itemStack.getUseDuration(livingEntity) - livingEntity.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemProperties.register(bow, ResourceLocation.withDefaultNamespace("pulling"), (itemStack, clientLevel, livingEntity, i) -> {
            return livingEntity != null && livingEntity.isUsingItem() && livingEntity.getUseItem() == itemStack ? 1.0F : 0.0F;
        });
    }
}
