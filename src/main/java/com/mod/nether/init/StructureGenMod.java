package com.mod.nether.init;

import java.util.Random;

import net.minecraft.world.World;

public class StructureGenMod
{
    private static final String StructureWarped = "StructureWarped";
  // private static final String StructureCrimson = "StructureCrimson";
    
    
    public boolean generate(String string, World world, Random random, int x, int y, int z)
    {
        switch(string)
        {
            case StructureWarped:
                com.mod.nether.structures.StructureWarped.init(world, x, y, z);
                break;    
        }
        
        
        return true;
    }
    
  //  public boolean generate1(String string, World world, Random random, int x, int y, int z)
    {
       // switch(string)
        {
        
    
       // case StructureCrimson:
          //  com.mod.nether.structures.StructureCrimson.init(world, x, y, z);
        //    break;    
        
        }   
        
        
        
      //  return true;
    }
    
    
}   
