package com.cursee.more_bows_and_arrows.registry;

import com.cursee.more_bows_and_arrows.item.bow.*;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.neoforged.neoforge.event.AnvilUpdateEvent;
//import net.minecraftforge.event.AnvilUpdateEvent;

public class ForgeBowRepairRegistry {
  public static void register(AnvilUpdateEvent event) {
    
    event.setCost(1);
    event.setMaterialCost(1);
    
    Player player = event.getPlayer();
    
    ItemStack slotLeft = event.getLeft();
    ItemStack slotRight = event.getRight();
    ItemStack slotOutput = new ItemStack(slotLeft.getItem());

    // pre 1.20.6
//      if (slotLeft.hasCustomHoverName()) {
//        slotOutput.setHoverName(slotLeft.getHoverName());
//      }

    // 1.20.6
    if (slotLeft.has(DataComponents.CUSTOM_NAME)) {
      slotOutput.set(DataComponents.CUSTOM_NAME, slotLeft.getHoverName());
    }
    
    String defaultName = slotLeft.getItem().getDefaultInstance().getDisplayName().getString();
    
    boolean flagged = false;
    
    // BEGINNING OF THE ALMIGHTY SWITCH STATEMENT (for repairing bows in an anvil)
    
    switch (defaultName) {
      case AcaciaBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == AcaciaBowItem.repairItem) {
          flagged = true;
        }
      }
      case AmethystBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == AmethystBowItem.repairItem) {
          flagged = true;
        }
      }
      case BambooBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == BambooBowItem.repairItem) {
          flagged = true;
        }
      }
      case BirchBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == BirchBowItem.repairItem) {
          flagged = true;
        }
      }
      case BlazeBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == BlazeBowItem.repairItem) {
          flagged = true;
        }
      }
      case BoneBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == BoneBowItem.repairItem) {
          flagged = true;
        }
      }
      case CherryBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == CherryBowItem.repairItem) {
          flagged = true;
        }
      }
      case CoalBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == CoalBowItem.repairItem) {
          flagged = true;
        }
      }
      case CopperBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == CopperBowItem.repairItem) {
          flagged = true;
        }
      }
      case CrimsonStemBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == CrimsonStemBowItem.repairItem) {
          flagged = true;
        }
      }
      case DarkOakBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == DarkOakBowItem.repairItem) {
          flagged = true;
        }
      }
      case DiamondBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == DiamondBowItem.repairItem) {
          flagged = true;
        }
      }
      case EmeraldBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == EmeraldBowItem.repairItem) {
          flagged = true;
        }
      }
      case GoldBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == GoldBowItem.repairItem) {
          flagged = true;
        }
      }
      case IronBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == IronBowItem.repairItem) {
          flagged = true;
        }
      }
      case JungleBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == JungleBowItem.repairItem) {
          flagged = true;
        }
      }
      case LapisBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == LapisBowItem.repairItem) {
          flagged = true;
        }
      }
      case MangroveBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == MangroveBowItem.repairItem) {
          flagged = true;
        }
      }
      case MossBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == MossBowItem.repairItem) {
          flagged = true;
        }
      }
      case NetheriteBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == NetheriteBowItem.repairItem) {
          flagged = true;
        }
      }
      case OakBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == OakBowItem.repairItem) {
          flagged = true;
        }
      }
      case ObsidianBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == ObsidianBowItem.repairItem) {
          flagged = true;
        }
      }
      case PaperBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == PaperBowItem.repairItem) {
          flagged = true;
        }
      }
      case SpruceBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == SpruceBowItem.repairItem) {
          flagged = true;
        }
      }
      case StrippedAcaciaBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == StrippedAcaciaBowItem.repairItem) {
          flagged = true;
        }
      }
      case StrippedBambooBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == StrippedBambooBowItem.repairItem) {
          flagged = true;
        }
      }
      case StrippedBirchBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == StrippedBirchBowItem.repairItem) {
          flagged = true;
        }
      }
      case StrippedCherryBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == StrippedCherryBowItem.repairItem) {
          flagged = true;
        }
      }
      case StrippedCrimsonStemBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == StrippedCrimsonStemBowItem.repairItem) {
          flagged = true;
        }
      }
      case StrippedDarkOakBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == StrippedDarkOakBowItem.repairItem) {
          flagged = true;
        }
      }
      case StrippedJungleBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == StrippedJungleBowItem.repairItem) {
          flagged = true;
        }
      }
      case StrippedMangroveBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == StrippedMangroveBowItem.repairItem) {
          flagged = true;
        }
      }
      case StrippedOakBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == StrippedOakBowItem.repairItem) {
          flagged = true;
        }
      }
      case StrippedSpruceBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == StrippedSpruceBowItem.repairItem) {
          flagged = true;
        }
      }
      case StrippedWarpedStemBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == StrippedWarpedStemBowItem.repairItem) {
          flagged = true;
        }
      }
      case WarpedStemBowItem.defaultDisplayName -> {
        if (slotRight.getItem() == WarpedStemBowItem.repairItem) {
          flagged = true;
        }
      }
    }
    
    // END OF THE ALMIGHTY SWITCH STATEMENT (for repairing bows in an anvil)
    
    if (flagged && (player.experienceLevel >= 1 || player.isCreative())) {
      ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(slotLeft);
      EnchantmentHelper.setEnchantments(slotOutput, enchantments);
      event.setOutput(slotOutput);
    }
    
    if (slotLeft.getDamageValue() == slotLeft.getItem().getDefaultInstance().getDamageValue() || player.experienceLevel == 0) {
      event.setOutput(new ItemStack(Items.AIR));
    }
    
  }
}
