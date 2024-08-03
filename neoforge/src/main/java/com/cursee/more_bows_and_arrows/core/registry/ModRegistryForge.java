package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.core.entity.ModEntitiesForge;
import com.cursee.more_bows_and_arrows.core.item.ModItemsForge;
import com.cursee.more_bows_and_arrows.core.tab.ModCreativeModeTabsForge;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModRegistryForge {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, Constants.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, Constants.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

    public static void registerAll(IEventBus bus) {

        ModItemsForge.register();
        ModCreativeModeTabsForge.register();
        ModEntitiesForge.register();

        ITEMS.register(bus);
        ENTITY_TYPES.register(bus);
        CREATIVE_MODE_TABS.register(bus);
    }

    public static <T extends Item> DeferredHolder<Item, T> registerItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    public static DeferredHolder<EntityType<?>, EntityType<?>> registerEntityType(String name, Supplier<EntityType<?>> type) {
        return ENTITY_TYPES.register(name, type);
    }

    public static <T extends CreativeModeTab> DeferredHolder<CreativeModeTab, CreativeModeTab> registerCreativeModeTab(String name, Supplier<CreativeModeTab> tab) {
        return CREATIVE_MODE_TABS.register(name, tab);
    }
}
