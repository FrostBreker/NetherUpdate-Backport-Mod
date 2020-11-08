package com.mod.nether.structures;

import java.util.Random;

import com.mod.nether.init.BlockMod;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;

public class StructureCrimson extends WorldGenerator implements IWorldGenerator
{

    public StructureCrimson()
    {
        // TODO Auto-generated constructor stub
    }

    public StructureCrimson(boolean b)
    {
        // TODO Auto-generated constructor stub
    }

    public static void init(World world, int x, int y, int z)
    {
        if(world.getBlock(x, y-1, z) == Blocks.netherrack && world.getBlock(x, y+7,z) == Blocks.air)
        {
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x, y+1, z, BlockMod.crimson_stem);
            world.setBlock(x, y+2, z, BlockMod.crimson_stem);
            world.setBlock(x, y+3, z, BlockMod.crimson_stem);
            world.setBlock(x, y+4, z, BlockMod.crimson_stem);
            world.setBlock(x, y+5, z, BlockMod.nether_wart_block);
            world.setBlock(x, y+6, z, BlockMod.nether_wart_block);
           //X Pos 
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+1, y+1, z, Blocks.air);
            world.setBlock(x+1, y+2, z, Blocks.air);
            world.setBlock(x+1, y+3, z, BlockMod.nether_wart_block);
            world.setBlock(x+1, y+4, z, BlockMod.nether_wart_block);
            world.setBlock(x+1, y+5, z, BlockMod.nether_wart_block);
            world.setBlock(x+1, y+6, z, BlockMod.nether_wart_block);
            
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+2, y+1, z, Blocks.air);
            world.setBlock(x+2, y+2, z, Blocks.air);
            world.setBlock(x+2, y+3, z, BlockMod.nether_wart_block);
            world.setBlock(x+2, y+4, z, BlockMod.nether_wart_block);
            world.setBlock(x+2, y+5, z, BlockMod.nether_wart_block);
            world.setBlock(x, y, z, BlockMod.nether_wart_block);
          //X Neg  
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+-1, y+1, z, Blocks.air);
            world.setBlock(x+-1, y+2, z, Blocks.air);
            world.setBlock(x+-1, y+3, z, BlockMod.nether_wart_block);
            world.setBlock(x+-1, y+4, z, BlockMod.nether_wart_block);
            world.setBlock(x+-1, y+5, z, BlockMod.nether_wart_block);
            world.setBlock(x+-1, y+6, z, BlockMod.nether_wart_block);
            
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+-2, y+1, z, Blocks.air);
            world.setBlock(x+-2, y+2, z, Blocks.air);
            world.setBlock(x+-2, y+3, z, BlockMod.nether_wart_block);
            world.setBlock(x+-2, y+4, z, BlockMod.nether_wart_block);
            world.setBlock(x+-2, y+5, z, BlockMod.nether_wart_block);
            world.setBlock(x, y, z, BlockMod.nether_wart_block);
          //X Neg Neg  
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+-1, y+1, z+-1, Blocks.air);
            world.setBlock(x+-1, y+2, z+-1, Blocks.air);
            world.setBlock(x+-1, y+3, z+-1, BlockMod.nether_wart_block);
            world.setBlock(x+-1, y+4, z+-1, BlockMod.nether_wart_block);
            world.setBlock(x+-1, y+5, z+-1, BlockMod.nether_wart_block);
            world.setBlock(x, y, z, BlockMod.nether_wart_block);
            
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+-2, y+1, z+-2, Blocks.air);
            world.setBlock(x+-2, y+2, z+-2, Blocks.air);
            world.setBlock(x+-2, y+3, z+-2, BlockMod.nether_wart_block);
            world.setBlock(x+-2, y+4, z+-2, BlockMod.nether_wart_block);
            world.setBlock(x, y, z, BlockMod.nether_wart_block);
            world.setBlock(x, y, z, BlockMod.nether_wart_block);
          //X Pos Pos  
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+1, y+1, z+1, Blocks.air);
            world.setBlock(x+1, y+2, z+1, Blocks.air);
            world.setBlock(x+1, y+3, z+1, BlockMod.nether_wart_block);
            world.setBlock(x+1, y+4, z+1, BlockMod.nether_wart_block);
            world.setBlock(x+1, y+5, z+1, BlockMod.nether_wart_block);
            world.setBlock(x+1, y+6, z+1, BlockMod.nether_wart_block);
            
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+2, y+1, z+2, Blocks.air);
            world.setBlock(x+2, y+2, z+2, Blocks.air);
            world.setBlock(x+2, y+3, z+2, BlockMod.nether_wart_block);
            world.setBlock(x, y, z, BlockMod.nether_wart_block);
            world.setBlock(x, y, z, BlockMod.nether_wart_block);
            world.setBlock(x, y, z, BlockMod.nether_wart_block);
         //X NEg Pos et Pos Neg
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+-1, y+1, z+1, Blocks.air);
            world.setBlock(x+-1, y+2, z+1, Blocks.air);
            world.setBlock(x+-1, y+3, z+1, BlockMod.nether_wart_block);
            world.setBlock(x+-1, y+4, z+1, BlockMod.nether_wart_block);
            
            
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+-2, y+1, z+2, Blocks.air);
            world.setBlock(x+-2, y+2, z+2, Blocks.air);
            world.setBlock(x+-2, y+3, z+2, BlockMod.nether_wart_block);
            world.setBlock(x+-2, y+4, z+2, BlockMod.nether_wart_block);
            
            
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+1, y+1, z+-1, Blocks.air);
            world.setBlock(x+1, y+2, z+-1, Blocks.air);
            world.setBlock(x+1, y+3, z+-1, BlockMod.nether_wart_block);
            world.setBlock(x+1, y+4, z+-1, BlockMod.nether_wart_block);
           
            
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+2, y+1, z+-2, Blocks.air);
            world.setBlock(x+2, y+2, z+-2, Blocks.air);
            world.setBlock(x+2, y+3, z+-2, BlockMod.nether_wart_block);
            world.setBlock(x+2, y+4, z+-2, BlockMod.nether_wart_block);
           
            
            //Z Pos  
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x, y+1, z+1, Blocks.air);
            world.setBlock(x, y+2, z+1, Blocks.air);
            world.setBlock(x, y+3, z+1, BlockMod.nether_wart_block);
            world.setBlock(x, y+4, z+1, BlockMod.nether_wart_block);
            world.setBlock(x, y+5, z+1, BlockMod.nether_wart_block);
            world.setBlock(x, y+6, z+1, BlockMod.nether_wart_block);
            
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x, y+1, z+2, Blocks.air);
            world.setBlock(x, y+2, z+2, Blocks.air);
            world.setBlock(x, y+3, z+2, BlockMod.nether_wart_block);
            world.setBlock(x, y+4, z+2, BlockMod.nether_wart_block);
            world.setBlock(x, y+5, z+2, BlockMod.nether_wart_block);
           
           //Z Neg 
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x, y+1, z+-1, Blocks.air);
            world.setBlock(x, y+2, z+-1, Blocks.air);
            world.setBlock(x, y+3, z+-1, BlockMod.nether_wart_block);
            world.setBlock(x, y+4, z+-1, BlockMod.nether_wart_block);
            world.setBlock(x, y+5, z+-1, BlockMod.nether_wart_block);
            world.setBlock(x, y+6, z+-1, BlockMod.nether_wart_block);
            
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x, y+1, z+-2, Blocks.air);
            world.setBlock(x, y+2, z+-2, Blocks.air);
            world.setBlock(x, y+3, z+-2, BlockMod.nether_wart_block);
            world.setBlock(x, y+4, z+-2, BlockMod.nether_wart_block);
            world.setBlock(x, y+5, z+-2, BlockMod.nether_wart_block);
            
          //Z Neg Pos  
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+-1, y+1, z+-1, Blocks.air);
            world.setBlock(x+-1, y+2, z+-1, Blocks.air);
          //  world.setBlock(x+-1, y+3, z+-1, BlockMod.nether_wart_block);
          //  world.setBlock(x+-1, y+4, z+-1, BlockMod.nether_wart_block);
            
            
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+-2, y+1, z+-2, Blocks.air);
            world.setBlock(x+-2, y+2, z+-2, Blocks.air);
          //  world.setBlock(x+-2, y+3, z+-2, BlockMod.nether_wart_block);
          //  world.setBlock(x+-2, y+4, z+-2, BlockMod.nether_wart_block);
            
          //Neg Neg Et Pos Pos  
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+1, y+1, z+1, Blocks.air);
            world.setBlock(x+1, y+2, z+1, Blocks.air);
           // world.setBlock(x+1, y+3, z+1, BlockMod.nether_wart_block);
           // world.setBlock(x+1, y+4, z+1, BlockMod.nether_wart_block);
            
            
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+2, y+1, z+2, Blocks.air);
            world.setBlock(x+2, y+2, z+2, Blocks.air);
           // world.setBlock(x+2, y+3, z+2, BlockMod.nether_wart_block);
           // world.setBlock(x+2, y+4, z+2, BlockMod.nether_wart_block);
            
            
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+-1, y+1, z+1, Blocks.air);
            world.setBlock(x+-1, y+2, z+1, Blocks.air);
          //  world.setBlock(x+-1, y+3, z+1, BlockMod.nether_wart_block);
          //  world.setBlock(x+-1, y+4, z+1, BlockMod.nether_wart_block);
            
            
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+-2, y+1, z+2, Blocks.air);
            world.setBlock(x+-2, y+2, z+2, Blocks.air);
          //  world.setBlock(x+-2, y+3, z+2, BlockMod.nether_wart_block);
          //  world.setBlock(x+-2, y+4, z+2, BlockMod.nether_wart_block);
            
            
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+1, y+1, z+-1, Blocks.air);
            world.setBlock(x+1, y+2, z+-1, Blocks.air);
          //  world.setBlock(x+1, y+3, z+-1, BlockMod.nether_wart_block);
          //  world.setBlock(x+1, y+4, z+-1, BlockMod.nether_wart_block);
            
            
            world.setBlock(x, y, z, BlockMod.crimson_stem);
            world.setBlock(x+2, y+1, z+-2, Blocks.air);
            world.setBlock(x+2, y+2, z+-2, Blocks.air);
           // world.setBlock(x+2, y+3, z+-2, BlockMod.nether_wart_block);
           // world.setBlock(x+2, y+4, z+-2, BlockMod.nether_wart_block);
            
        }
        
    }

    @Override
    public boolean generate(World p_76484_1_, Random p_76484_2_, int p_76484_3_, int p_76484_4_, int p_76484_5_)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        // TODO Auto-generated method stub
        
    }

}
