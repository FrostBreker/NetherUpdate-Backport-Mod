package com.mod.nether.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        
    }

    public static void register()
    {
        //Recipes
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_netherite_ingot, 1), new Object[] {"###", "# F", "FFF", '#', ItemMod.item_netherite_scrap, 'F', Items.gold_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_netherite_sword, 1), new Object[] {"#F", '#', Items.diamond_sword, 'F', ItemMod.item_netherite_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_netherite_pickaxe, 1), new Object[] {"#F", '#', Items.diamond_pickaxe, 'F', ItemMod.item_netherite_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_netherite_axe, 1), new Object[] {"#F", '#', Items.diamond_axe, 'F', ItemMod.item_netherite_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_netherite_shovel, 1), new Object[] {"#F", '#', Items.diamond_shovel, 'F', ItemMod.item_netherite_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_netherite_hoe, 1), new Object[] {"#F", '#', Items.diamond_hoe, 'F', ItemMod.item_netherite_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_helmet_netherite, 1), new Object[] {"#F", '#', Items.diamond_helmet, 'F', ItemMod.item_netherite_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_chestplate_netherite, 1), new Object[] {"#F", '#', Items.diamond_chestplate, 'F', ItemMod.item_netherite_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_leggings_netherite, 1), new Object[] {"#F", '#', Items.diamond_leggings, 'F', ItemMod.item_netherite_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_boots_netherite, 1), new Object[] {"#F", '#', Items.diamond_boots, 'F', ItemMod.item_netherite_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_stick_netherite, 1), new Object[] {"#", "#", '#', ItemMod.item_netherite_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_hammer_netherite, 1), new Object[] {"###", "###", " F ", '#', ItemMod.item_netherite_ingot, 'F', ItemMod.item_stick_netherite});
        GameRegistry.addRecipe(new ItemStack(BlockMod.block_shroomlight, 4), new Object[] {"F#F", "#F#", "F#F", '#', Blocks.glowstone, 'F', Items.blaze_rod});
        
        
        //Smelt
        GameRegistry.addSmelting(BlockMod.block_ancient_debris, new ItemStack(ItemMod.item_netherite_scrap, 1), 2024F);
    }
}
