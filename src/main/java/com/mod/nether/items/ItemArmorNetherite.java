package com.mod.nether.items;

import com.mod.nether.Reference;
import com.mod.nether.init.ItemMod;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemArmorNetherite extends ItemArmor
{

    public ItemArmorNetherite(ArmorMaterial p_i45325_1_, int p_i45325_2_)
    {
        super(p_i45325_1_, p_i45325_2_, p_i45325_2_);
    }

    
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ItemMod.item_leggings_netherite)
        {
            return Reference.MOD_ID + ":textures/models/armor/netherite_layer_2.png";
        }
        
        else if(stack.getItem() == ItemMod.item_helmet_netherite || stack.getItem() == ItemMod.item_chestplate_netherite || stack.getItem() == ItemMod.item_boots_netherite)
        {
            return Reference.MOD_ID + ":textures/models/armor/netherite_layer_1.png";
        }
        return null;
    }
}    

    
