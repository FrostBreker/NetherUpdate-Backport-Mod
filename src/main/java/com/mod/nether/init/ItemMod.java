package com.mod.nether.init;

import com.mod.nether.ModNetherite;
import com.mod.nether.Reference;
import com.mod.nether.items.ItemArmorNetherite;
import com.mod.nether.items.ItemAxeNetherite;
import com.mod.nether.items.ItemHammerNetherite;
import com.mod.nether.items.ItemHoeNetherite;
import com.mod.nether.items.ItemNetheriteSeed;
import com.mod.nether.items.ItemPickaxeNetherite;
import com.mod.nether.items.ItemShovelNetherite;
import com.mod.nether.items.ItemSwordNetherite;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMod
{
    public static ToolMaterial toolNetherite = EnumHelper.addToolMaterial("toolNetherite", 4, 3000, 16, 4, 30);
    public static ToolMaterial toolHammerNetherite = EnumHelper.addToolMaterial("toolHammerNetherite", 4, 3000, 14, 3, 30);
    
    public static ArmorMaterial armorNetherite = EnumHelper.addArmorMaterial("armorNetherite", 150, new int[] {4, 9, 6, 3}, 30);
    
    
    public static Item item_netherite_scrap, item_netherite_ingot, item_netherite_sword, item_netherite_pickaxe, item_netherite_shovel, item_netherite_axe, item_netherite_hoe, item_helmet_netherite, item_chestplate_netherite;
    public static Item item_leggings_netherite, item_boots_netherite, item_hammer_netherite, item_stick_netherite, item_netherite_nuggets, item_netherite_seed;
    

    public static void init()
    {
        item_netherite_scrap = new Item().setUnlocalizedName("item_netherite_scrap").setTextureName(Reference.MOD_ID + ":netherite_scrap").setCreativeTab(ModNetherite.tabNetherite);
        item_netherite_ingot = new Item().setUnlocalizedName("item_netherite_ingot").setTextureName(Reference.MOD_ID + ":netherite_ingot").setCreativeTab(ModNetherite.tabNetherite);
        item_netherite_sword = new ItemSwordNetherite(toolNetherite).setUnlocalizedName("item_netherite_sword").setTextureName(Reference.MOD_ID + ":netherite_sword").setCreativeTab(ModNetherite.tabNetherite);
        item_netherite_pickaxe = new ItemPickaxeNetherite(toolNetherite).setUnlocalizedName("item_netherite_pickaxe").setTextureName(Reference.MOD_ID + ":netherite_pickaxe").setCreativeTab(ModNetherite.tabNetherite);
        item_netherite_shovel = new ItemShovelNetherite(toolNetherite).setUnlocalizedName("item_netherite_shovel").setTextureName(Reference.MOD_ID + ":netherite_shovel").setCreativeTab(ModNetherite.tabNetherite);
        item_netherite_axe = new ItemAxeNetherite(toolNetherite).setUnlocalizedName("item_netherite_axe").setTextureName(Reference.MOD_ID + ":netherite_axe").setCreativeTab(ModNetherite.tabNetherite);
        item_netherite_hoe = new ItemHoeNetherite(toolNetherite).setUnlocalizedName("item_netherite_hoe").setTextureName(Reference.MOD_ID + ":netherite_hoe").setCreativeTab(ModNetherite.tabNetherite);
        
        item_helmet_netherite = new ItemArmorNetherite(armorNetherite, 0).setUnlocalizedName("item_netherite_helmet").setTextureName(Reference.MOD_ID + ":netherite_helmet").setCreativeTab(ModNetherite.tabNetherite);
        item_chestplate_netherite = new ItemArmorNetherite(armorNetherite, 1).setUnlocalizedName("item_netherite_chestplate").setTextureName(Reference.MOD_ID + ":netherite_chestplate").setCreativeTab(ModNetherite.tabNetherite);
        item_leggings_netherite = new ItemArmorNetherite(armorNetherite, 2).setUnlocalizedName("item_netherite_leggings").setTextureName(Reference.MOD_ID + ":netherite_leggings").setCreativeTab(ModNetherite.tabNetherite);
        item_boots_netherite = new ItemArmorNetherite(armorNetherite, 3).setUnlocalizedName("item_netherite_boots").setTextureName(Reference.MOD_ID + ":netherite_boots").setCreativeTab(ModNetherite.tabNetherite);
        
        item_hammer_netherite = new ItemHammerNetherite(toolHammerNetherite).setUnlocalizedName("item_netherite_hammer").setTextureName(Reference.MOD_ID + ":hammer_netherite").setCreativeTab(ModNetherite.tabNetherite);
        item_stick_netherite = new Item().setUnlocalizedName("item_netherite_stick").setTextureName(Reference.MOD_ID + ":netherite_stick").setCreativeTab(ModNetherite.tabNetherite);
        
        
        item_netherite_nuggets = new Item().setUnlocalizedName("item_netherite_nuggets").setTextureName(Reference.MOD_ID + ":netherite_nugget").setCreativeTab(ModNetherite.tabNetherite);
        item_netherite_seed = new ItemNetheriteSeed(BlockMod.culture_netherite, Blocks.farmland).setUnlocalizedName("item_netherite_seed").setCreativeTab(ModNetherite.tabNetherite).setTextureName(Reference.MOD_ID + ":netherite_seeds");
        
    }
    
    public static void register()
    {
        GameRegistry.registerItem(item_netherite_scrap, "item_netherite_scrap");
        GameRegistry.registerItem(item_netherite_ingot, "item_netherite_ingot");
        GameRegistry.registerItem(item_netherite_sword, "item_netherite_sword");
        GameRegistry.registerItem(item_netherite_pickaxe, "item_netherite_pickaxe");
        GameRegistry.registerItem(item_netherite_axe, "item_netherite_axe");
        GameRegistry.registerItem(item_netherite_shovel, "item_netherite_shovel");
        GameRegistry.registerItem(item_netherite_hoe, "item_netherite_hoe");
        GameRegistry.registerItem(item_helmet_netherite, "item_helmet_netherite");
        GameRegistry.registerItem(item_leggings_netherite, "item_leggings_netherite");
        GameRegistry.registerItem(item_chestplate_netherite, "item_chestplate_netherite");
        GameRegistry.registerItem(item_boots_netherite, "item_boots_netherite");
        GameRegistry.registerItem(item_hammer_netherite, "item_hammer_netherite");
        GameRegistry.registerItem(item_stick_netherite, "item_stick_netherite");
        GameRegistry.registerItem(item_netherite_seed, "item_netherite_seed");
        GameRegistry.registerItem(item_netherite_nuggets, "item_netherite_nuggets");
        
        
        
    }
}
