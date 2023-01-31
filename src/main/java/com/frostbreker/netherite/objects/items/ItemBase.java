package com.frostbreker.netherite.objects.items;

import com.frostbreker.netherite.NetherUpdateMod;
import com.frostbreker.netherite.init.ModItem;
import com.frostbreker.netherite.util.interfaces.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(NetherUpdateMod.NETHERITE_TAB);
        ModItem.ITEMS.add(this);
    }

    public void registerModels() {
        NetherUpdateMod.proxy.registerItemRenderer(this, 0);
    }
}
