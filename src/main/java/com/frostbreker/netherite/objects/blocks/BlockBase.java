package com.frostbreker.netherite.objects.blocks;

import com.frostbreker.netherite.NetherUpdateMod;
import com.frostbreker.netherite.init.ModBlock;
import com.frostbreker.netherite.init.ModItem;
import com.frostbreker.netherite.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
    public BlockBase(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(5.0F);
        setCreativeTab(NetherUpdateMod.NETHERITE_TAB);
        setHarvestLevel("pickaxe", 2);

        ModBlock.BLOCKS.add(this);
        ModItem.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        NetherUpdateMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
    }
}
