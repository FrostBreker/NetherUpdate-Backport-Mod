package com.mod.nether.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldRegister
{
    public static void mainRegistry()
    {
        registerWorldGen(new WorldGenNetherite(), -1);
        registerWorldGen(new WorldGenNetherite(), 0);
        registerWorldGen(new WorldGenNetherite(), 1);
    }
    
    public static void registerWorldGen(IWorldGenerator iGenerator, int probability)
    {
        GameRegistry.registerWorldGenerator(iGenerator, probability);
    }
}
