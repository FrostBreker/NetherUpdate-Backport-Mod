package com.mod.netherite.init;

import com.mod.netherite.Reference;
import com.mod.netherite.blocks.BlockAncientDebris;
import com.mod.netherite.blocks.BlockBasic;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMod 
{
	public static Block block_ancient_debris;
	
	public static void init()
	{
		block_ancient_debris = new BlockBasic(Material.rock).setBlockName("block_ancient_debris");
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(block_ancient_debris, block_ancient_debris.getUnlocalizedName().substring(5));
	}
}
