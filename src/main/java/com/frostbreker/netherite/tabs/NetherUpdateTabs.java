package com.frostbreker.netherite.tabs;

import com.frostbreker.netherite.init.ModItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class NetherUpdateTabs extends CreativeTabs {

    public NetherUpdateTabs(String label) {
        super(label);
        this.setBackgroundImageName(label + ".png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItem.NETHERITE_INGOT);
    }
}
