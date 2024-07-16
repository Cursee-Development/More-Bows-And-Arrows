package com.cursee.more_bows_and_arrows.item.bow;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;

import java.util.List;

public class StrippedBambooBowItem extends BowItem {
    
    public static final String defaultDisplayName = "[Stripped Bamboo Bow]";
    public static final Item repairItem = Items.STRIPPED_BAMBOO_BLOCK;
    
    public StrippedBambooBowItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> tooltip, TooltipFlag tooltipFlag) {
        super.appendHoverText(itemStack, tooltipContext, tooltip, tooltipFlag);
        tooltip.add(Component.translatable("more_bows_and_arrows.text.bamboo_bow_lore"));
        tooltip.add(Component.translatable("more_bows_and_arrows.text.bamboo_bow_damage"));
    }
    
    @Override
    public boolean isValidRepairItem(ItemStack pItemStack1, ItemStack pItemStack2) {
        return (pItemStack1.is(this)) && (pItemStack2.is(repairItem));
    }
}
