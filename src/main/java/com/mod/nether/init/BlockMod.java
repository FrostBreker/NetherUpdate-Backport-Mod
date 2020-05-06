package com.mod.nether.init;

import com.mod.nether.ModNetherite;
import com.mod.nether.Reference;
import com.mod.nether.blocks.BlockAncientDebris;
import com.mod.nether.blocks.BlockBasic;

import cpw.mods.fml.common.registry.GameRegistry;import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGravel;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BlockMod
{
    public static Block block_ancient_debris, block_shroomlight;
    
    
    
    public static void init()
    {
        block_ancient_debris = new BlockAncientDebris(Material.rock).setBlockName("block_ancient_debris").setCreativeTab(ModNetherite.tabNetherite).setHardness(15.0F).setResistance(10F);
        block_shroomlight = new BlockBasic(Material.glass).setBlockName("block_shroomlight").setCreativeTab(ModNetherite.tabNetherite).setHardness(15.0F).setBlockTextureName(Reference.MOD_ID + ":shroomlight").setLightLevel(50F);
    }
    
    public static void register()
    {
        GameRegistry.registerBlock(block_ancient_debris, block_ancient_debris.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_shroomlight, block_shroomlight.getUnlocalizedName().substring(5));
    }
}
