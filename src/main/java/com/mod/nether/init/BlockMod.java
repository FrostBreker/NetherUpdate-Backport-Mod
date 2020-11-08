package com.mod.nether.init;

import com.mod.nether.ModNetherite;
import com.mod.nether.Reference;
import com.mod.nether.blocks.BlockAncientDebris;
import com.mod.nether.blocks.BlockBasic;
import com.mod.nether.blocks.BlockCropsNetherite;
import com.mod.nether.blocks.BlockNetherCoal;
import com.mod.nether.blocks.BlockNetherDiamond;
import com.mod.nether.blocks.BlockNetherEmerald;
import com.mod.nether.blocks.BlockNetherGoldOre;
import com.mod.nether.blocks.CrimsonStem;
import com.mod.nether.blocks.NetherWartBlock;
import com.mod.nether.blocks.WarpedStem;
import com.mod.nether.blocks.WarpedBlock;

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
    public static Block block_ancient_debris, block_shroomlight, nether_gold_ore, warped_stem, crimson_planks, warped_planks, crimson_stem, warped_block, nether_wart_block;
    public static Block culture_netherite, nether_diamond_ore, nether_emerald_ore, nether_coal_ore, nether_iron_ore;
    
    
    
    public static void init()
    {
        block_ancient_debris = new BlockAncientDebris(Material.rock).setBlockName("block_ancient_debris").setCreativeTab(ModNetherite.tabNetherite).setHardness(15.0F).setResistance(10F);
        block_shroomlight = new BlockBasic(Material.glass).setBlockName("block_shroomlight").setCreativeTab(ModNetherite.tabNetherite).setHardness(15.0F).setBlockTextureName(Reference.MOD_ID + ":shroomlight").setLightLevel(50F);
        nether_gold_ore = new BlockNetherGoldOre(Material.rock).setBlockName("block_nether_gold_ore").setCreativeTab(ModNetherite.tabNetherite).setBlockTextureName(Reference.MOD_ID + ":nether_gold_ore").setHardness(2.0F);
        warped_stem = new WarpedStem(Material.wood).setBlockName("block_warped_stem").setCreativeTab(ModNetherite.tabNetherite).setHardness(2.0F);
        crimson_planks = new BlockBasic(Material.wood).setBlockName("block_crimson_planks").setCreativeTab(ModNetherite.tabNetherite).setHardness(2.0F).setBlockTextureName(Reference.MOD_ID + ":crimson_planks");
        warped_planks = new BlockBasic(Material.wood).setBlockName("block_warped_planks").setCreativeTab(ModNetherite.tabNetherite).setHardness(2.0F).setBlockTextureName(Reference.MOD_ID + ":warped_planks");
        crimson_stem = new CrimsonStem(Material.wood).setBlockName("block_crimson_stem").setCreativeTab(ModNetherite.tabNetherite).setHardness(2.0F);
        warped_block = new WarpedBlock(Material.rock).setBlockName("warped_block").setCreativeTab(ModNetherite.tabNetherite).setHardness(2.0F).setBlockTextureName(Reference.MOD_ID + ":warped_wart_block");
        nether_wart_block = new NetherWartBlock(Material.rock).setBlockName("nether_wart_block").setCreativeTab(ModNetherite.tabNetherite).setHardness(2.0F).setBlockTextureName(Reference.MOD_ID + ":nether_wart_block");
        nether_diamond_ore = new BlockNetherDiamond(Material.rock).setBlockName("nether_diamond_ore").setCreativeTab(ModNetherite.tabNetherite).setHardness(2.0F).setBlockTextureName(Reference.MOD_ID + ":netherrack_diamond");
        nether_emerald_ore = new BlockNetherEmerald(Material.rock).setBlockName("nether_emerald_ore").setCreativeTab(ModNetherite.tabNetherite).setHardness(2.0F).setBlockTextureName(Reference.MOD_ID + ":netherrack_emerald");
        nether_coal_ore = new BlockNetherCoal(Material.rock).setBlockName("nether_coal_ore").setCreativeTab(ModNetherite.tabNetherite).setHardness(2.0F).setBlockTextureName(Reference.MOD_ID + ":netherrack_coal");
        nether_iron_ore = new BlockBasic(Material.rock).setBlockName("nether_iron_ore").setCreativeTab(ModNetherite.tabNetherite).setHardness(2.0F).setBlockTextureName(Reference.MOD_ID + ":netherrack_iron");
        
        culture_netherite = new BlockCropsNetherite().setBlockName("block_netherite_crops").setBlockTextureName(Reference.MOD_ID + ":culture_netherite");
        
    }
    
    
    public static void register()
    {
        GameRegistry.registerBlock(block_ancient_debris, block_ancient_debris.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_shroomlight, block_shroomlight.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(nether_gold_ore, nether_gold_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(warped_stem, warped_stem.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(warped_planks, warped_planks.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(crimson_planks, crimson_planks.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(crimson_stem, crimson_stem.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(warped_block, warped_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(nether_wart_block, nether_wart_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(culture_netherite, culture_netherite.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(nether_coal_ore, nether_coal_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(nether_diamond_ore, nether_diamond_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(nether_emerald_ore, nether_emerald_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(nether_iron_ore, nether_iron_ore.getUnlocalizedName().substring(5));
    }
}
