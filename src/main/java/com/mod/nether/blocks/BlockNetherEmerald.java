package com.mod.nether.blocks;

import java.util.Random;

import com.mod.nether.init.BlockMod;

import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class BlockNetherEmerald extends BlockOre
{


    public BlockNetherEmerald(Material rock)
    {
        // TODO Auto-generated constructor stub
    }
    
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return this == BlockMod.nether_emerald_ore ? Items.emerald : Item.getItemFromBlock(this);
    }
    
    public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
    {
        if (p_149679_1_ > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, p_149679_2_, p_149679_1_))
        {
            int j = p_149679_2_.nextInt(p_149679_1_ + 2) - 1;

            if (j < 0)
            {
                j = 0;
            }

            return this.quantityDropped(p_149679_2_) * (j + 1);
        }
        else
        {
            return this.quantityDropped(p_149679_2_);
        }
    }
    
    private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            int j1 = 0;

            if (this == BlockMod.nether_emerald_ore)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 4, 8);
            }

            return j1;
        }
        return 0;
    }

}
