package com.cursee.more_bows_and_arrows.item.bow;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;

import java.util.List;

public class CrimsonStemBowItem extends BowItem {
    
    public static final String defaultDisplayName = "[Crimson Stem Bow]";
    public static final Item repairItem = Items.CRIMSON_STEM;
    
    public CrimsonStemBowItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> tooltip, TooltipFlag tooltipFlag) {
        super.appendHoverText(itemStack, tooltipContext, tooltip, tooltipFlag);
        tooltip.add(Component.translatable("morebowsandarrows.text.crimson_stem_bow_lore"));
        tooltip.add(Component.translatable("morebowsandarrows.text.crimson_stem_bow_damage"));
    }
    
    @Override
    public boolean isValidRepairItem(ItemStack pItemStack1, ItemStack pItemStack2) {
        return (pItemStack1.is(this)) && (pItemStack2.is(repairItem));
    }
}
