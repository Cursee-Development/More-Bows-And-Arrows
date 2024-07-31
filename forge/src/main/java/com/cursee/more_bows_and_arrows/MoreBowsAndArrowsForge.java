package com.cursee.more_bows_and_arrows;

import com.cursee.monolib.core.sailing.Sailing;
import com.cursee.more_bows_and_arrows.core.registry.ModDispenserRegistryForge;
import com.cursee.more_bows_and_arrows.core.registry.ModRegistryForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class MoreBowsAndArrowsForge {
    
    public MoreBowsAndArrowsForge() {
    
        MoreBowsAndArrows.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModRegistryForge.registerAll(bus);

        bus.addListener(this::common);
    }

    public void common(FMLCommonSetupEvent event) {
        ModDispenserRegistryForge.registerArrowsAsProjectiles();
    }
}