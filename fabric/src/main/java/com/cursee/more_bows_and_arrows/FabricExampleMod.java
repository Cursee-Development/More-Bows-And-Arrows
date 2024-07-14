package com.cursee.more_bows_and_arrows;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.jason13.monolib.methods.BlockMethods;
import com.cursee.more_bows_and_arrows.callback.FabricAnvilUpdateEvent;
import com.cursee.more_bows_and_arrows.registry.FabricBowRepairRegistry;
import com.cursee.more_bows_and_arrows.registry.FabricEntityTypeRegistry;
import com.cursee.more_bows_and_arrows.registry.FabricItemCreativeModeTabRegistry;
import com.cursee.more_bows_and_arrows.registry.FabricItemRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AnvilMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DispenserBlock;

public class FabricExampleMod implements ModInitializer {

    public static boolean debuggingEnabled = false;

    @Override
    public void onInitialize() {

        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        Constants.LOG.info("Hello Fabric world!");
        MoreBowsAndArrows.init();

        FabricItemRegistry.register();
        FabricItemCreativeModeTabRegistry.register();
        FabricEntityTypeRegistry.init();

        registerDispenserProjectileBehaviors();

        registerAnvilRepairBehaviors();

        ServerTickEvents.START_SERVER_TICK.register(new PlayerTickHandler());

    }

    private static void registerDispenserProjectileBehaviors() {

        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.AMETHYST_ARROW_ITEM); // simplified in 1.20.6, other refactors have been removed
        // DispenserBlock.registerBehavior(FabricItemRegistry.AMETHYST_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
        //     @Override
        //     protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
        //         AmethystArrowEntity arrow = new AmethystArrowEntity(level, position.x(), position.y(), position.z(), itemStack);
        //         arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        //         return arrow;
        //     }
        // });

        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.BAMBOO_ARROW_ITEM);
        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.BLAZE_ROD_ARROW_ITEM);
        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.BONE_ARROW_ITEM);
        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.CACTUS_ARROW_ITEM);
        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.COAL_ARROW_ITEM);
        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.COPPER_ARROW_ITEM);
        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.DIAMOND_ARROW_ITEM);
        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.EMERALD_ARROW_ITEM);
        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.ENDER_PEARL_ARROW_ITEM);
        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.FLINT_AND_STEEL_ARROW_ITEM);
        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.FLINT_ARROW_ITEM);
        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.GOLD_ARROW_ITEM);
        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.IRON_ARROW_ITEM);
        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.LAPIS_ARROW_ITEM);
        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.MOSS_ARROW_ITEM);
        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.NETHERITE_ARROW_ITEM);
        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.OBSIDIAN_ARROW_ITEM);
        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.PAPER_ARROW_ITEM);
        DispenserBlock.registerProjectileBehavior(FabricItemRegistry.TNT_ARROW_ITEM);
    }
    
    private static void registerAnvilRepairBehaviors() {
        FabricAnvilUpdateEvent.EVENT.register((AnvilMenu anvilmenu, ItemStack left, ItemStack right, ItemStack output, String itemName, int baseCost, Player player) -> FabricBowRepairRegistry.onRepairEvent(anvilmenu, left, right, output, itemName, 1, player));
    }
    
    public static class PlayerTickHandler implements ServerTickEvents.StartTick {
        @Override
        public void onStartTick(MinecraftServer server) {
            for (ServerPlayer player : server.getPlayerList().getPlayers()) {
                
                boolean leftHandCommand = BlockMethods.compareBlockToItemStack(Blocks.COMMAND_BLOCK, player.getOffhandItem());
                boolean rightHandCommand = BlockMethods.compareBlockToItemStack(Blocks.COMMAND_BLOCK, player.getMainHandItem());
                
                if (!debuggingEnabled && leftHandCommand && rightHandCommand) {
                    player.sendSystemMessage(Component.literal("Ticking!"));
                    debuggingEnabled = true;
                }
            }
        }
    }
}
