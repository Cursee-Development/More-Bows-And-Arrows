package com.cursee.more_bows_and_arrows.core.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public enum ModTiersForge implements Tier {

//    WOOD(0, 59, 2.0F, 0.0F, 15, () -> {
//        return Ingredient.of(ItemTags.PLANKS);
//    }),
//    STONE(1, 131, 4.0F, 1.0F, 5, () -> {
//        return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);
//    }),
//    IRON(2, 250, 6.0F, 2.0F, 14, () -> {
//        return Ingredient.of(new ItemLike[]{Items.IRON_INGOT});
//    }),
//    DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {
//        return Ingredient.of(new ItemLike[]{Items.DIAMOND});
//    }),
//    GOLD(0, 32, 12.0F, 0.0F, 22, () -> {
//        return Ingredient.of(new ItemLike[]{Items.GOLD_INGOT});
//    }),
//    NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {
//        return Ingredient.of(new ItemLike[]{Items.NETHERITE_INGOT});
//    });

    COPPER(1, 131, 4.0F, 1.0F, 5, () -> {
        return Ingredient.of(Items.COPPER_INGOT);
    }),
    PAPER(1, 131, 4.0f, 1.0f, 5, () -> {
        return Ingredient.of(Items.PAPER);
    }),
    MOSS(1, 131, 4.0f, 1.0f, 5, () -> {
        return Ingredient.of(Items.MOSS_BLOCK);
    }),
    LAPIS(1, 131, 4.0f, 1.0f, 5, () -> {
        return Ingredient.of(Items.LAPIS_LAZULI);
    }),
    AMETHYST(1, 131, 4.0f, 1.0f, 5, () -> {
        return Ingredient.of(Items.AMETHYST_SHARD);
    }),
    BONE(1, 131, 4.0f, 1.0f, 5, () -> {
        return Ingredient.of(Items.BONE);
    }),
    COAL(1, 131, 4.0f, 1.0f, 5, () -> {
        return Ingredient.of(ItemTags.COALS);
    }),
    EMERALD(1, 131, 4.0f, 1.0f, 5, () -> {
        return Ingredient.of(Items.EMERALD);
    }),
    BLAZE(1, 131, 4.0f, 1.0f, 5, () -> {
        return Ingredient.of(Items.BLAZE_ROD);
    }),
    OBSIDIAN(1, 131, 4.0f, 1.0f, 5, () -> {
        return Ingredient.of(Items.OBSIDIAN);
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModTiersForge(int level, int uses, float speed, float damage, int enchantmentValue, Supplier repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyLoadedValue(repairIngredient);
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return BlockTags.INCORRECT_FOR_NETHERITE_TOOL;
    }

//    @Override
//    public int getLevel() {
//        return this.level;
//    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
