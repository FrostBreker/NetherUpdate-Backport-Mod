package com.frostbreker.netherite.objects.items.tools;

import com.frostbreker.netherite.NetherUpdateMod;
import com.frostbreker.netherite.init.ModItem;
import com.frostbreker.netherite.util.interfaces.IHasModel;
import net.minecraft.item.ItemSpade;

public class ItemShovelMod extends ItemSpade implements IHasModel {

    public ItemShovelMod(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(NetherUpdateMod.NETHERITE_TAB);

        ModItem.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        NetherUpdateMod.proxy.registerItemRenderer(this, 0);
    }
}
