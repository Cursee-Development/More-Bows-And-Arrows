package com.cursee.more_bows_and_arrows.registry;

import com.cursee.more_bows_and_arrows.item.bow.*;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AnvilMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import oshi.util.tuples.Triplet;

public class FabricBowRepairRegistry {
  public static Triplet<Integer, Integer, ItemStack> onRepairEvent(AnvilMenu pAnvilMenu, ItemStack slotLeft, ItemStack slotRight, ItemStack slotOutput, String itemName, int baseCost, Player player) {
    
    if ((player.experienceLevel >= 1 || player.isCreative())) {
      
      if (slotLeft.getDamageValue() == slotLeft.getItem().getDefaultInstance().getDamageValue()) {
        return null;
      }
      
      // pre 1.20.6
//      if (slotLeft.hasCustomHoverName()) {
//        slotOutput.setHoverName(slotLeft.getHoverName());
//      }
      
      // 1.20.6
      if (slotLeft.has(DataComponents.CUSTOM_NAME)) {
        slotOutput.set(DataComponents.CUSTOM_NAME, slotLeft.getHoverName());
      }
      
      final String defaultName = slotLeft.getItem().getDefaultInstance().getDisplayName().getString();
      
      System.out.println(defaultName);
      
      
      // switch (defaultName) {
      //   case (AmethystBowItem.defaultDisplayName) -> {
      //     if (slotRight.getItem() == AmethystBowItem.repairItem) {
      //       Map<Enchantment, Integer> map = EnchantmentHelper.getEnchantments(slotLeft);
      //       EnchantmentHelper.setEnchantments(map, slotOutput);
      //       return new Triplet<>(baseCost, baseCost, slotOutput);
      //     }
      //   }
      // }
      
      // 1.20.6
//      switch (defaultName) {
//        case AcaciaBowItem.defaultDisplayName -> {
//          if (slotRight.getItem() == AcaciaBowItem.repairItem) {
//            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
//            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
//            return new Triplet<>(baseCost, baseCost, slotOutput);
//          }
//        }
//      }
      
      switch (defaultName) {
        case AcaciaBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == AcaciaBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case AmethystBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == AmethystBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case BambooBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == BambooBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case BirchBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == BirchBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case BlazeBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == BlazeBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case BoneBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == BoneBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case CherryBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == CherryBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case CoalBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == CoalBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case CopperBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == CopperBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case CrimsonStemBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == CrimsonStemBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case DarkOakBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == DarkOakBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case DiamondBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == DiamondBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case EmeraldBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == EmeraldBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case GoldBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == GoldBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case IronBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == IronBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case JungleBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == JungleBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case LapisBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == LapisBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case MangroveBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == MangroveBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case MossBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == MossBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case NetheriteBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == NetheriteBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case OakBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == OakBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case ObsidianBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == ObsidianBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case PaperBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == PaperBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case SpruceBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == SpruceBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedAcaciaBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedAcaciaBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedBambooBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedBambooBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedBirchBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedBirchBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedCherryBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedCherryBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedCrimsonStemBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedCrimsonStemBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedDarkOakBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedDarkOakBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedJungleBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedJungleBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedMangroveBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedMangroveBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedOakBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedOakBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedSpruceBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedSpruceBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedWarpedStemBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedWarpedStemBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case WarpedStemBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == WarpedStemBowItem.repairItem) {
            ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
            EnchantmentHelper.setEnchantments(slotOutput, enchantments);
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
      }
      
      return null;
    }
    return null;
  }
}
    
    //                  ItemStack slotOutput = new ItemStack(slotLeft.getItem());
    //
    //                  if (slotLeft.hasCustomHoverName()) {
    //                    slotOutput.setHoverName(slotLeft.getHoverName());
    //                  }
    //
    //                  String defaultName = slotLeft.getItem().getDefaultInstance().getDisplayName().getString();
    //
    //                  boolean flagged = false;
    //
    //                  // BEGINNING OF THE ALMIGHTY SWITCH STATEMENT (for repairing bows in an anvil)
    //
    //                  switch (defaultName) {
    //                    case (AmethystBowItem.defaultDisplayName) -> {
    //                      if (slotRight.getItem() == AmethystBowItem.repairItem) {
    //                        Map<Enchantment, Integer> map = EnchantmentHelper.getEnchantments(slotLeft);
    //                        EnchantmentHelper.setEnchantments(map, slotOutput);
    //                        return new Triplet<>(baseCost, baseCost, slotOutput);
    //                      }
    //                    }
    //                  }
    //
    //                  // END OF THE ALMIGHTY SWITCH STATEMENT (for repairing bows in an anvil)
    //
    //                  if (flagged && (player.experienceLevel >= 1 || player.isCreative())) {
    //                    // event.setOutput(slotOutput);
    //                    return new Triplet<Integer, Integer, ItemStack>(1, 1, slotOutput);
    //                  }
    //
    //                  if (slotLeft.getDamageValue() == slotLeft.getItem().getDefaultInstance().getDamageValue() || player.experienceLevel == 0) {
    //                    return null;
    //                  }
    //
    //                  return null;