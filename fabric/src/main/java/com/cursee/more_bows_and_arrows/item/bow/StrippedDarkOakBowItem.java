package com.cursee.more_bows_and_arrows.item.bow;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;

import java.util.List;

public class StrippedDarkOakBowItem extends BowItem {
    
    public static final String defaultDisplayName = "[Stripped Dark Oak Bow]";
    public static final Item repairItem = Items.STRIPPED_DARK_OAK_LOG;
    
    public StrippedDarkOakBowItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> tooltip, TooltipFlag tooltipFlag) {
        super.appendHoverText(itemStack, tooltipContext, tooltip, tooltipFlag);
        tooltip.add(Component.translatable("morebowsandarrows.text.dark_oak_bow_lore"));
        tooltip.add(Component.translatable("morebowsandarrows.text.dark_oak_bow_damage"));
    }
    
    @Override
    public boolean isValidRepairItem(ItemStack pItemStack1, ItemStack pItemStack2) {
        return (pItemStack1.is(this)) && (pItemStack2.is(repairItem));
    }
}
