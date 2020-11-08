package com.mod.nether.blocks;

import java.util.ArrayList;

import com.mod.nether.init.ItemMod;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockCropsNetherite extends BlockCrops
{
    protected Item func_149866_i()
    {
        return ItemMod.item_netherite_seed;
    }
    
    protected Item func_149865_P()
    {
        return ItemMod.item_netherite_nuggets;
        
    }
    
   // @Override
   // public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
     //   ArrayList<ItemStack> ret = super.getDrops(world, x, y, z, metadata, fortune);
     //   if (metadata >= 7 && world.rand.nextInt(50) == 0)
     //       ret.add(new ItemStack(ItemMod.item_feather_netherite));
     //   return ret;
    }
}
