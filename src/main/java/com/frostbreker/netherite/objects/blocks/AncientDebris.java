package com.frostbreker.netherite.objects.blocks;

import com.frostbreker.netherite.NetherUpdateMod;
import com.frostbreker.netherite.init.ModBlock;
import com.frostbreker.netherite.init.ModItem;
import com.frostbreker.netherite.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class AncientDebris extends Block implements IHasModel {
    public AncientDebris(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(30.0F);
        setHarvestLevel("pickaxe", 3);
        setCreativeTab(NetherUpdateMod.NETHERITE_TAB);
        setResistance(1200.0F);

        ModBlock.BLOCKS.add(this);
        ModItem.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }


    @Override
    public void registerModels() {
        NetherUpdateMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
    }
}
