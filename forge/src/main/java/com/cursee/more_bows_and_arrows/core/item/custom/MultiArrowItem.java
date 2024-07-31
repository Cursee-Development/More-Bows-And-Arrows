package com.cursee.more_bows_and_arrows.core.item.custom;

import com.cursee.more_bows_and_arrows.core.entity.custom.*;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class MultiArrowItem extends ArrowItem {

    private MultiArrowItem.Type type;

    public MultiArrowItem(MultiArrowItem.Type type, Properties p_40512_) {
        super(p_40512_);

        this.type = type;
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack stack, LivingEntity entity) {

        switch (this.type) {
            case AMETHYST -> {
                return new AmethystArrow(level, entity);
            }
            case BAMBOO -> {
                return new BambooArrow(level, entity);
            }
            case BLAZE_ROD -> {
                return new BlazeRodArrow(level, entity);
            }
            case BONE -> {
                return new BoneArrow(level, entity);
            }
            case CACTUS -> {
                return new CactusArrow(level, entity);
            }
            case COAL -> {
                return new CoalArrow(level, entity);
            }
            case COPPER -> {
                return new CopperArrow(level, entity);
            }
            case DIAMOND -> {
                return new DiamondArrow(level, entity);
            }
            case EMERALD -> {
                return new EmeraldArrow(level, entity);
            }
            case ENDER_PEARL -> {
                return new EnderPearlArrow(level, entity);
            }
            case FLINT_AND_STEEL -> {
                return new FlintAndSteelArrow(level, entity);
            }
            case FLINT -> {
                return new FlintArrow(level, entity);
            }
            case GOLD -> {
                return new GoldArrow(level, entity);
            }
            case IRON -> {
                return new IronArrow(level, entity);
            }
            case LAPIS -> {
                return new LapisArrow(level, entity);
            }
            case MOSS -> {
                return new MossArrow(level, entity);
            }
            case NETHERITE -> {
                return new NetheriteArrow(level, entity);
            }
            case OBSIDIAN -> {
                return new ObsidianArrow(level, entity);
            }
            case PAPER -> {
                return new PaperArrow(level, entity);
            }
            case TNT -> {
                return new TNTArrow(level, entity);
            }
            default -> {
                return new Arrow(level, entity);
            }
        }
    }

    public enum Type {
        AMETHYST, BAMBOO, BLAZE_ROD, BONE, CACTUS, COAL, COPPER, DIAMOND, EMERALD, ENDER_PEARL,
        FLINT_AND_STEEL, FLINT, GOLD, IRON, LAPIS, MOSS, NETHERITE, OBSIDIAN, PAPER, TNT;
    }
}
