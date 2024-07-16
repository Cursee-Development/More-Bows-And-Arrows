package com.cursee.more_bows_and_arrows;

import com.cursee.monolib.core.sailing.Sailing;
import com.cursee.more_bows_and_arrows.registry.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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

        bus.addListener(this::clientSetup);
        bus.addListener(this::commonSetup);

        ForgeItemRegistry.register(bus);
        ForgeEntityTypeRegistry.register(bus);
        ForgeCreativeModeTabRegistry.register(bus);

        bus.addListener(ForgeCreativeModeTabRegistry::addToCombatTab);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(ForgeItemProperties::addCustomItemProperties);
    }

    public void commonSetup(FMLCommonSetupEvent event) {
        ForgeDispenserBehaviorRegistry.registerArrowsAsProjectiles();
    }

    @SubscribeEvent
    public void onAnvilUpdate(AnvilUpdateEvent event) {
        ForgeBowRepairRegistry.register(event);
    }
}
