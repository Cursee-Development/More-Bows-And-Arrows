package com.cursee.more_bows_and_arrows.core.item.custom;

import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public class TieredBowItem extends BowItem {
    private final Tier tier;

    public TieredBowItem(Tier $$0, Item.Properties $$1) {
        super($$1.defaultDurability($$0.getUses()));
        this.tier = $$0;
    }

    public Tier getTier() {
        return this.tier;
    }

    public int getEnchantmentValue() {
        return this.tier.getEnchantmentValue();
    }

    public boolean isValidRepairItem(ItemStack $$0, ItemStack $$1) {
        return this.tier.getRepairIngredient().test($$1) || super.isValidRepairItem($$0, $$1);
    }
}
