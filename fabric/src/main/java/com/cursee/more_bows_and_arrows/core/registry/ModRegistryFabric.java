package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.core.entity.ModEntitiesFabric;
import com.cursee.more_bows_and_arrows.core.item.ModItemsFabric;
import com.cursee.more_bows_and_arrows.core.tab.ModCreativeModeTabsFabric;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class ModRegistryFabric {

    public static void registerAll() {

        ModItemsFabric.register();
        ModCreativeModeTabsFabric.register();
        ModEntitiesFabric.register();
    }

    public static <T extends Item> T registerItem(String name, T item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, name), item);
    }

//    public static EntityType<? extends AbstractArrow> registerEntityType(String name, EntityType<? extends AbstractArrow> type) {
//        return Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, name), type);
//    }

//    public static <T extends AbstractArrow> EntityType<T> registerEntityType(String name, EntityType<T> entity) {
//        return Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, name), entity);
//    }

//    public static <E extends AbstractArrow> EntityType<? extends E> registerEntityType(String name, EntityType<? extends E> entityType) {
//        return Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, name), entityType);
//    }

    public static <T extends Entity> EntityType<? extends T> registerEntityType(String name, EntityType<? extends T> entityType) {
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, name), entityType);
    }

    public static <T extends CreativeModeTab> CreativeModeTab registerCreativeModeTab(String name, CreativeModeTab tab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(Constants.MOD_ID, name), tab);
    }
}
