package com.barion.the_witcher.util;

import com.barion.the_witcher.world.TWBlocks;
import com.barion.the_witcher.world.TWItems;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class TWCreativeModeTab extends CreativeModeTab {
    public static final TWCreativeModeTab Instance = new TWCreativeModeTab();

    private TWCreativeModeTab() {super("the_witcher");}

    @Override
    public void fillItemList(NonNullList<ItemStack> items) {
        items.add(TWBlocks.RawSilverBlock.get().asItem().getDefaultInstance());
        items.add(TWItems.RawSilver.get().getDefaultInstance());
        items.add(TWBlocks.SilverBlock.get().asItem().getDefaultInstance());
        items.add(TWItems.SilverIngot.get().getDefaultInstance());
        items.add(TWItems.SilverNugget.get().getDefaultInstance());
        items.add(TWItems.SilverSword.get().getDefaultInstance());
        items.add(TWItems.MasterfulSilverSword.get().getDefaultInstance());

        items.add(TWItems.SteelIngot.get().getDefaultInstance());
        items.add(TWItems.SteelNugget.get().getDefaultInstance());
        items.add(TWItems.SteelSword.get().getDefaultInstance());
        items.add(TWItems.MasterfulSteelSword.get().getDefaultInstance());
        items.add(TWItems.ReinforcedLeatherHelmet.get().getDefaultInstance());
        items.add(TWItems.ReinforcedLeatherChestplate.get().getDefaultInstance());
        items.add(TWItems.ReinforcedLeatherLeggings.get().getDefaultInstance());
        items.add(TWItems.ReinforcedLeatherBoots.get().getDefaultInstance());
        items.add(TWBlocks.MasterSmithingTable.get().asItem().getDefaultInstance());

        items.add(TWBlocks.PowerBlock.get().asItem().getDefaultInstance());
        items.add(TWBlocks.PowerBlock.get().asItem().getDefaultInstance());

        items.add(TWBlocks.FrostedCobblestone.get().asItem().getDefaultInstance());
        items.add(TWBlocks.FrostedCobblestoneStairs.get().asItem().getDefaultInstance());
        items.add(TWBlocks.FrostedCobblestoneSlab.get().asItem().getDefaultInstance());
        items.add(TWBlocks.FrostedCobblestoneWall.get().asItem().getDefaultInstance());
        items.add(TWBlocks.FrostedCobblestoneButton.get().asItem().getDefaultInstance());
        items.add(TWBlocks.FrostedStone.get().asItem().getDefaultInstance());
        items.add(TWBlocks.FrostedStoneStairs.get().asItem().getDefaultInstance());
        items.add(TWBlocks.FrostedStoneSlab.get().asItem().getDefaultInstance());
        items.add(TWBlocks.FrostedStoneWall.get().asItem().getDefaultInstance());
        items.add(TWBlocks.FrostedStoneButton.get().asItem().getDefaultInstance());
        items.add(TWBlocks.FrostedStoneBricks.get().asItem().getDefaultInstance());
        items.add(TWBlocks.FrostedStoneBrickStairs.get().asItem().getDefaultInstance());
        items.add(TWBlocks.FrostedStoneBrickSlab.get().asItem().getDefaultInstance());
        items.add(TWBlocks.FrostedStoneBrickWall.get().asItem().getDefaultInstance());
        items.add(TWBlocks.FrostedStoneBrickButton.get().asItem().getDefaultInstance());
        items.add(TWBlocks.CrackedFrostedStoneBricks.get().asItem().getDefaultInstance());
        items.add(TWBlocks.CrackedFrostedStoneBrickStairs.get().asItem().getDefaultInstance());
        items.add(TWBlocks.CrackedFrostedStoneBrickSlab.get().asItem().getDefaultInstance());
        items.add(TWBlocks.CrackedFrostedStoneBrickWall.get().asItem().getDefaultInstance());
        items.add(TWBlocks.CrackedFrostedStoneBrickButton.get().asItem().getDefaultInstance());

        items.add(TWBlocks.DeepFrostedCobblestone.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedCobblestoneStairs.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedCobblestoneSlab.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedCobblestoneWall.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedCobblestoneButton.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedStone.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedStoneStairs.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedStoneSlab.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedStoneWall.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedStoneButton.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedStoneBricks.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedStoneBrickStairs.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedStoneBrickSlab.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedStoneBrickWall.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedStoneBrickButton.get().asItem().getDefaultInstance());
        items.add(TWBlocks.CrackedDeepFrostedStoneBricks.get().asItem().getDefaultInstance());
        items.add(TWBlocks.CrackedDeepFrostedStoneBrickStairs.get().asItem().getDefaultInstance());
        items.add(TWBlocks.CrackedDeepFrostedStoneBrickSlab.get().asItem().getDefaultInstance());
        items.add(TWBlocks.CrackedDeepFrostedStoneBrickWall.get().asItem().getDefaultInstance());
        items.add(TWBlocks.CrackedDeepFrostedStoneBrickButton.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedStoneTiles.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedStoneTileStairs.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedStoneTileSlab.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedStoneTileWall.get().asItem().getDefaultInstance());
        items.add(TWBlocks.DeepFrostedStoneTileButton.get().asItem().getDefaultInstance());
        items.add(TWBlocks.CrackedDeepFrostedStoneTiles.get().asItem().getDefaultInstance());
        items.add(TWBlocks.CrackedDeepFrostedStoneTileStairs.get().asItem().getDefaultInstance());
        items.add(TWBlocks.CrackedDeepFrostedStoneTileSlab.get().asItem().getDefaultInstance());
        items.add(TWBlocks.CrackedDeepFrostedStoneTileWall.get().asItem().getDefaultInstance());
        items.add(TWBlocks.CrackedDeepFrostedStoneTileButton.get().asItem().getDefaultInstance());
        items.add(TWBlocks.Icicle.get().asItem().getDefaultInstance());

        items.add(TWItems.Celandine.get().getDefaultInstance());
        items.add(TWItems.WhiteMyrtle.get().getDefaultInstance());
        items.add(TWItems.KikimoraTooth.get().getDefaultInstance());
        items.add(TWItems.HotWaterBottle.get().getDefaultInstance());

        items.add(TWItems.WildHuntKnightSpawnEgg.get().getDefaultInstance());
        items.add(TWItems.WildHuntHoundSpawnEgg.get().getDefaultInstance());
        items.add(TWItems.IceGhostSpawnEgg.get().getDefaultInstance());
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        return TWItems.TabLogo.get().getDefaultInstance();
    }
}