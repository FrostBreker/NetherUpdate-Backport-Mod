package com.mod.nether.blocks;

import java.util.Random;

import com.mod.nether.init.BlockMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class BlockNetherGoldOre extends Block
{

    public BlockNetherGoldOre(Material p_i45394_1_)
    {
        super(p_i45394_1_);

    }
    
    
    
    private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            int j1 = 0;

            if (this == BlockMod.nether_gold_ore)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 4, 8);
            }

            return j1;
        }
        return 0;
    }
    

}
