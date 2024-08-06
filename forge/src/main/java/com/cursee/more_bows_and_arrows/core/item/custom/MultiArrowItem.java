package com.cursee.more_bows_and_arrows.core.item.custom;

import com.cursee.more_bows_and_arrows.core.entity.custom.*;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MultiArrowItem extends ArrowItem {

    private Type type;

    public MultiArrowItem(Type type, Properties p_40512_) {
        super(p_40512_);

        this.type = type;
    }

    @Override
    public @NotNull AbstractArrow createArrow(Level level, ItemStack stack, LivingEntity entity) {

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
            default -> toReturn = new Arrow(level, entity);
        }

        return toReturn;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {

//        if (!Services.PLATFORM.isModLoaded("tooltipfix")) {
//            return;
//        }

        switch (this.type) {

            case AMETHYST -> {
                list.add(Component.translatable("more_bows_and_arrows.text.amethyst_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.amethyst_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.amethyst_arrow_damage"));
            }
            case BAMBOO -> {
                list.add(Component.translatable("more_bows_and_arrows.text.bamboo_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.bamboo_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.bamboo_arrow_damage"));
            }
            case BLAZE_ROD -> {
                list.add(Component.translatable("more_bows_and_arrows.text.blaze_rod_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.blaze_rod_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.blaze_rod_arrow_damage"));
            }
            case BONE -> {
                list.add(Component.translatable("more_bows_and_arrows.text.bone_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.bone_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.bone_arrow_damage"));
            }
            case CACTUS -> {
                list.add(Component.translatable("more_bows_and_arrows.text.cactus_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.cactus_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.cactus_arrow_damage"));
            }
            case COAL -> {
                list.add(Component.translatable("more_bows_and_arrows.text.coal_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.coal_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.coal_arrow_damage"));
            }
            case COPPER -> {
                list.add(Component.translatable("more_bows_and_arrows.text.copper_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.copper_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.copper_arrow_damage"));
            }
            case DIAMOND -> {
                list.add(Component.translatable("more_bows_and_arrows.text.diamond_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.diamond_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.diamond_arrow_damage"));
            }
            case EMERALD -> {
                list.add(Component.translatable("more_bows_and_arrows.text.emerald_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.emerald_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.emerald_arrow_damage"));
            }
            case ENDER_PEARL -> {
                list.add(Component.translatable("more_bows_and_arrows.text.ender_pearl_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.ender_pearl_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.ender_pearl_arrow_damage"));
            }
            case FLINT_AND_STEEL -> {
                list.add(Component.translatable("more_bows_and_arrows.text.flint_and_steel_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.flint_and_steel_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.flint_and_steel_arrow_damage"));
            }
            case FLINT -> {
                list.add(Component.translatable("more_bows_and_arrows.text.flint_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.flint_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.flint_arrow_damage"));
            }
            case GOLD -> {
                list.add(Component.translatable("more_bows_and_arrows.text.gold_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.gold_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.gold_arrow_damage"));
            }
            case IRON -> {
                list.add(Component.translatable("more_bows_and_arrows.text.iron_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.iron_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.iron_arrow_damage"));
            }
            case LAPIS -> {
                list.add(Component.translatable("more_bows_and_arrows.text.lapis_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.lapis_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.lapis_arrow_damage"));
            }
            case MOSS -> {
                list.add(Component.translatable("more_bows_and_arrows.text.moss_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.moss_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.moss_arrow_damage"));
            }
            case NETHERITE -> {
                list.add(Component.translatable("more_bows_and_arrows.text.netherite_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.netherite_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.netherite_arrow_damage"));
            }
            case OBSIDIAN -> {
                list.add(Component.translatable("more_bows_and_arrows.text.obsidian_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.obsidian_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.obsidian_arrow_damage"));
            }
            case PAPER -> {
                list.add(Component.translatable("more_bows_and_arrows.text.paper_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.paper_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.paper_arrow_damage"));
            }
            case TNT -> {
                list.add(Component.translatable("more_bows_and_arrows.text.tnt_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.tnt_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.tnt_arrow_damage"));
            }
            default -> {}
        }

        super.appendHoverText(itemStack, level, list, tooltipFlag);
    }

    public enum Type {
        AMETHYST, BAMBOO, BLAZE_ROD, BONE, CACTUS, COAL, COPPER, DIAMOND, EMERALD, ENDER_PEARL,
        FLINT_AND_STEEL, FLINT, GOLD, IRON, LAPIS, MOSS, NETHERITE, OBSIDIAN, PAPER, TNT;
    }
}
