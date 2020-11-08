package com.mod.nether.structures;

import java.util.Random;

import com.mod.nether.init.BlockMod;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;

public class StructureWarped extends WorldGenerator implements IWorldGenerator
{ 
    

    
    public static void init(World world, int x, int y, int z)
    {
        if(world.getBlock(x, y-1, z) == Blocks.netherrack && world.getBlock(x, y+7,z) == Blocks.air)
        {
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x, y+1, z, BlockMod.warped_stem);
            world.setBlock(x, y+2, z, BlockMod.warped_stem);
            world.setBlock(x, y+3, z, BlockMod.warped_stem);
            world.setBlock(x, y+4, z, BlockMod.warped_stem);
            world.setBlock(x, y+5, z, BlockMod.warped_block);
            world.setBlock(x, y+6, z, BlockMod.warped_block);
           //X Pos 
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+1, y+1, z, Blocks.air);
            world.setBlock(x+1, y+2, z, Blocks.air);
            world.setBlock(x+1, y+3, z, BlockMod.warped_block);
            world.setBlock(x+1, y+4, z, BlockMod.warped_block);
            world.setBlock(x+1, y+5, z, BlockMod.warped_block);
            world.setBlock(x+1, y+6, z, BlockMod.warped_block);
            
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+2, y+1, z, Blocks.air);
            world.setBlock(x+2, y+2, z, Blocks.air);
            world.setBlock(x+2, y+3, z, BlockMod.warped_block);
            world.setBlock(x+2, y+4, z, BlockMod.warped_block);
            world.setBlock(x+2, y+5, z, BlockMod.warped_block);
            world.setBlock(x, y, z, BlockMod.warped_block);
          //X Neg  
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+-1, y+1, z, Blocks.air);
            world.setBlock(x+-1, y+2, z, Blocks.air);
            world.setBlock(x+-1, y+3, z, BlockMod.warped_block);
            world.setBlock(x+-1, y+4, z, BlockMod.warped_block);
            world.setBlock(x+-1, y+5, z, BlockMod.warped_block);
            world.setBlock(x+-1, y+6, z, BlockMod.warped_block);
            
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+-2, y+1, z, Blocks.air);
            world.setBlock(x+-2, y+2, z, Blocks.air);
            world.setBlock(x+-2, y+3, z, BlockMod.warped_block);
            world.setBlock(x+-2, y+4, z, BlockMod.warped_block);
            world.setBlock(x+-2, y+5, z, BlockMod.warped_block);
            world.setBlock(x, y, z, BlockMod.warped_block);
          //X Neg Neg  
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+-1, y+1, z+-1, Blocks.air);
            world.setBlock(x+-1, y+2, z+-1, Blocks.air);
            world.setBlock(x+-1, y+3, z+-1, BlockMod.warped_block);
            world.setBlock(x+-1, y+4, z+-1, BlockMod.warped_block);
            world.setBlock(x+-1, y+5, z+-1, BlockMod.warped_block);
            world.setBlock(x, y, z, BlockMod.warped_block);
            
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+-2, y+1, z+-2, Blocks.air);
            world.setBlock(x+-2, y+2, z+-2, Blocks.air);
            world.setBlock(x+-2, y+3, z+-2, BlockMod.warped_block);
            world.setBlock(x+-2, y+4, z+-2, BlockMod.warped_block);
            world.setBlock(x, y, z, BlockMod.warped_block);
            world.setBlock(x, y, z, BlockMod.warped_block);
          //X Pos Pos  
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+1, y+1, z+1, Blocks.air);
            world.setBlock(x+1, y+2, z+1, Blocks.air);
            world.setBlock(x+1, y+3, z+1, BlockMod.warped_block);
            world.setBlock(x+1, y+4, z+1, BlockMod.warped_block);
            world.setBlock(x+1, y+5, z+1, BlockMod.warped_block);
            world.setBlock(x+1, y+6, z+1, BlockMod.warped_block);
            
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+2, y+1, z+2, Blocks.air);
            world.setBlock(x+2, y+2, z+2, Blocks.air);
            world.setBlock(x+2, y+3, z+2, BlockMod.warped_block);
            world.setBlock(x, y, z, BlockMod.warped_block);
            world.setBlock(x, y, z, BlockMod.warped_block);
            world.setBlock(x, y, z, BlockMod.warped_block);
         //X NEg Pos et Pos Neg
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+-1, y+1, z+1, Blocks.air);
            world.setBlock(x+-1, y+2, z+1, Blocks.air);
            world.setBlock(x+-1, y+3, z+1, BlockMod.warped_block);
            world.setBlock(x+-1, y+4, z+1, BlockMod.warped_block);
            
            
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+-2, y+1, z+2, Blocks.air);
            world.setBlock(x+-2, y+2, z+2, Blocks.air);
            world.setBlock(x+-2, y+3, z+2, BlockMod.warped_block);
            world.setBlock(x+-2, y+4, z+2, BlockMod.warped_block);
            
            
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+1, y+1, z+-1, Blocks.air);
            world.setBlock(x+1, y+2, z+-1, Blocks.air);
            world.setBlock(x+1, y+3, z+-1, BlockMod.warped_block);
            world.setBlock(x+1, y+4, z+-1, BlockMod.warped_block);
           
            
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+2, y+1, z+-2, Blocks.air);
            world.setBlock(x+2, y+2, z+-2, Blocks.air);
            world.setBlock(x+2, y+3, z+-2, BlockMod.warped_block);
            world.setBlock(x+2, y+4, z+-2, BlockMod.warped_block);
           
            
            //Z Pos  
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x, y+1, z+1, Blocks.air);
            world.setBlock(x, y+2, z+1, Blocks.air);
            world.setBlock(x, y+3, z+1, BlockMod.warped_block);
            world.setBlock(x, y+4, z+1, BlockMod.warped_block);
            world.setBlock(x, y+5, z+1, BlockMod.warped_block);
            world.setBlock(x, y+6, z+1, BlockMod.warped_block);
            
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x, y+1, z+2, Blocks.air);
            world.setBlock(x, y+2, z+2, Blocks.air);
            world.setBlock(x, y+3, z+2, BlockMod.warped_block);
            world.setBlock(x, y+4, z+2, BlockMod.warped_block);
            world.setBlock(x, y+5, z+2, BlockMod.warped_block);
           
           //Z Neg 
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x, y+1, z+-1, Blocks.air);
            world.setBlock(x, y+2, z+-1, Blocks.air);
            world.setBlock(x, y+3, z+-1, BlockMod.warped_block);
            world.setBlock(x, y+4, z+-1, BlockMod.warped_block);
            world.setBlock(x, y+5, z+-1, BlockMod.warped_block);
            world.setBlock(x, y+6, z+-1, BlockMod.warped_block);
            
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x, y+1, z+-2, Blocks.air);
            world.setBlock(x, y+2, z+-2, Blocks.air);
            world.setBlock(x, y+3, z+-2, BlockMod.warped_block);
            world.setBlock(x, y+4, z+-2, BlockMod.warped_block);
            world.setBlock(x, y+5, z+-2, BlockMod.warped_block);
            
          //Z Neg Pos  
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+-1, y+1, z+-1, Blocks.air);
            world.setBlock(x+-1, y+2, z+-1, Blocks.air);
          //  world.setBlock(x+-1, y+3, z+-1, BlockMod.warped_block);
          //  world.setBlock(x+-1, y+4, z+-1, BlockMod.warped_block);
            
            
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+-2, y+1, z+-2, Blocks.air);
            world.setBlock(x+-2, y+2, z+-2, Blocks.air);
          //  world.setBlock(x+-2, y+3, z+-2, BlockMod.warped_block);
          //  world.setBlock(x+-2, y+4, z+-2, BlockMod.warped_block);
            
          //Neg Neg Et Pos Pos  
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+1, y+1, z+1, Blocks.air);
            world.setBlock(x+1, y+2, z+1, Blocks.air);
           // world.setBlock(x+1, y+3, z+1, BlockMod.warped_block);
           // world.setBlock(x+1, y+4, z+1, BlockMod.warped_block);
            
            
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+2, y+1, z+2, Blocks.air);
            world.setBlock(x+2, y+2, z+2, Blocks.air);
           // world.setBlock(x+2, y+3, z+2, BlockMod.warped_block);
           // world.setBlock(x+2, y+4, z+2, BlockMod.warped_block);
            
            
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+-1, y+1, z+1, Blocks.air);
            world.setBlock(x+-1, y+2, z+1, Blocks.air);
          //  world.setBlock(x+-1, y+3, z+1, BlockMod.warped_block);
          //  world.setBlock(x+-1, y+4, z+1, BlockMod.warped_block);
            
            
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+-2, y+1, z+2, Blocks.air);
            world.setBlock(x+-2, y+2, z+2, Blocks.air);
          //  world.setBlock(x+-2, y+3, z+2, BlockMod.warped_block);
          //  world.setBlock(x+-2, y+4, z+2, BlockMod.warped_block);
            
            
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+1, y+1, z+-1, Blocks.air);
            world.setBlock(x+1, y+2, z+-1, Blocks.air);
          //  world.setBlock(x+1, y+3, z+-1, BlockMod.warped_block);
          //  world.setBlock(x+1, y+4, z+-1, BlockMod.warped_block);
            
            
            world.setBlock(x, y, z, BlockMod.warped_stem);
            world.setBlock(x+2, y+1, z+-2, Blocks.air);
            world.setBlock(x+2, y+2, z+-2, Blocks.air);
           // world.setBlock(x+2, y+3, z+-2, BlockMod.warped_block);
           // world.setBlock(x+2, y+4, z+-2, BlockMod.warped_block);
            
        }
        
    }



    @Override
    public boolean generate(World p_76484_1_, Random p_76484_2_, int p_76484_3_, int p_76484_4_, int p_76484_5_)
    {
        
        return false;
    }



    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        // TODO Auto-generated method stub
        
    }

}
