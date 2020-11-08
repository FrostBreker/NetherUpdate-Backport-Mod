package com.mod.nether.world;

import java.util.Random;

import com.mod.nether.init.BlockMod;
import com.mod.nether.init.StructureGenMod;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenNetherite implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.dimensionId)
        {
            case -1:
                GenerateNether(world, chunkX * 16, chunkZ * 16, random);
                break;
         
            case 0:
                GenerateOverWorld(world, chunkX * 16, chunkZ * 16, random);
                break;

            case 1:
                GenerateEnd(world, chunkX * 16, chunkZ * 16, random);
                break;
        }
    }
    
    private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minV, int maxV, int spawnChance)
    {
        for(int i = 0; i < spawnChance; i++)
        {
            int chunkSize = 16;
            int Xpos = posX + random.nextInt(chunkSize);
            int Ypos = minY + random.nextInt(maxY - minY);
            int Zpos = posZ + random.nextInt(chunkSize);
            
            new WorldGenMinable(block, maxV, blockSpawn).generate(world, random, Xpos, Ypos, Zpos);
        }
    }
    
    private void addStructure(String string, Random random, World world, int posX, int posZ, int minY, int maxY, int spawnChance)
    {
        for(int i = 0; i < spawnChance ; i++)
        {
            int chunkSize = 16;
            int Xpos = posX + random.nextInt(chunkSize);
            int Ypos = minY + random.nextInt(maxY - minY);
            int Zpos = posZ + random.nextInt(chunkSize);
            
            new StructureGenMod().generate(string, world, random, Xpos, Ypos, Zpos);
        //    new StructureGenMod().generate1(string, world, random, Xpos, Ypos, Zpos);
        }
    }


    private void GenerateNether(World world, int i, int j, Random random)
    {
        addOre(BlockMod.block_ancient_debris, Blocks.netherrack, random, world, i, j, 10, 18, 3, 5, 10);
        addOre(BlockMod.nether_gold_ore, Blocks.netherrack, random, world, i, j, 10, 117, 5, 7, 60);
        addOre(BlockMod.nether_diamond_ore, Blocks.netherrack, random, world, i, j, 10, 18, 3, 7, 14);
        addOre(BlockMod.nether_iron_ore, Blocks.netherrack, random, world, i, j, 10, 117, 5, 7, 70);
        addOre(BlockMod.nether_coal_ore, Blocks.netherrack, random, world, i, j, 10, 117, 5, 7, 80);
        addOre(BlockMod.nether_emerald_ore, Blocks.netherrack, random, world, i, j, 10, 18, 2, 4, 12);
        addStructure("StructureWarped", random, world, i, j, 150, 200, 125);
      //  addStructure("StructureCrimson", random, world, i, j, 150, 250, 170);
    }

    private void GenerateOverWorld(World world, int i, int j, Random random)
    {
       
    }

    private void GenerateEnd(World world, int i, int j, Random random)
    {
        addOre(BlockMod.block_ancient_debris, Blocks.end_stone, random, world, i, j, 10, 60, 5, 9, 15);
    }
    
}
