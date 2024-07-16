package com.cursee.more_bows_and_arrows;

import com.cursee.monolib.core.sailing.Sailing;
import com.cursee.more_bows_and_arrows.registry.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.AnvilUpdateEvent;

@Mod(Constants.MOD_ID)
public class MoreBowsAndArrowsNeoForge {

    public MoreBowsAndArrowsNeoForge(IEventBus eventBus) {

        MoreBowsAndArrows.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);

        IEventBus bus = eventBus;

        bus.addListener(this::clientSetup);
        bus.addListener(this::commonSetup);

        ForgeItemRegistry.register(bus);
        ForgeEntityTypeRegistry.register(bus);
        ForgeCreativeModeTabRegistry.register(bus);

        bus.addListener(ForgeCreativeModeTabRegistry::addToCombatTab);

        NeoForge.EVENT_BUS.register(this);
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
