package com.cursee.more_bows_and_arrows.core.item.custom;

import com.cursee.more_bows_and_arrows.core.entity.custom.*;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class MultiArrowItem extends ArrowItem {

    private Type type;

    public MultiArrowItem(Type type, Properties p_40512_) {
        super(p_40512_);

        this.type = type;
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack p_40514_, LivingEntity entity, @Nullable ItemStack p_343176_) {
        AbstractArrow toReturn;

        switch (this.type) {
            case AMETHYST -> toReturn = new AmethystArrow(level, entity);
            case BAMBOO -> toReturn = new BambooArrow(level, entity);
            case BLAZE_ROD -> toReturn = new BlazeRodArrow(level, entity);
            case BONE -> toReturn = new BoneArrow(level, entity);
            case CACTUS -> toReturn = new CactusArrow(level, entity);
            case COAL -> toReturn = new CoalArrow(level, entity);
            case COPPER -> toReturn = new CopperArrow(level, entity);
            case DIAMOND -> toReturn = new DiamondArrow(level, entity);
            case EMERALD -> toReturn = new EmeraldArrow(level, entity);
            case ENDER_PEARL -> toReturn = new EnderPearlArrow(level, entity);
            case FLINT_AND_STEEL -> toReturn = new FlintAndSteelArrow(level, entity);
            case FLINT -> toReturn = new FlintArrow(level, entity);
            case GOLD -> toReturn = new GoldArrow(level, entity);
            case IRON -> toReturn = new IronArrow(level, entity);
            case LAPIS -> toReturn = new LapisArrow(level, entity);
            case MOSS -> toReturn = new MossArrow(level, entity);
            case NETHERITE -> toReturn = new NetheriteArrow(level, entity);
            case OBSIDIAN -> toReturn = new ObsidianArrow(level, entity);
            case PAPER -> toReturn = new PaperArrow(level, entity);
            case TNT -> toReturn = new TNTArrow(level, entity);
            default -> toReturn = new Arrow(level, entity, Items.ARROW.getDefaultInstance(), Items.ARROW.getDefaultInstance());
        }

        return toReturn;
    }

    public enum Type {
        AMETHYST, BAMBOO, BLAZE_ROD, BONE, CACTUS, COAL, COPPER, DIAMOND, EMERALD, ENDER_PEARL,
        FLINT_AND_STEEL, FLINT, GOLD, IRON, LAPIS, MOSS, NETHERITE, OBSIDIAN, PAPER, TNT;
    }
}
