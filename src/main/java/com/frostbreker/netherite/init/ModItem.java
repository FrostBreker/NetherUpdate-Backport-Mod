package com.frostbreker.netherite.init;

import com.frostbreker.netherite.objects.items.ItemBase;
import com.frostbreker.netherite.objects.items.armor.NetheriteArmor;
import com.frostbreker.netherite.objects.items.tools.ItemAxeMod;
import com.frostbreker.netherite.objects.items.tools.ItemPickaxeMod;
import com.frostbreker.netherite.objects.items.tools.ItemShovelMod;
import com.frostbreker.netherite.objects.items.tools.ItemSwordMod;
import com.frostbreker.netherite.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItem {
    public static List<Item> ITEMS = new ArrayList<Item>();

    //Tools Materials
    public static final Item.ToolMaterial NETHERITE_TOOLS = EnumHelper.addToolMaterial("netherite_tools", 3, 2031, 9.0F, 4.0F, 15);

    //Armors Materials
    public static final ItemArmor.ArmorMaterial NETHERITE_ARMOR = EnumHelper.addArmorMaterial("netherite_armor", Reference.MODID + ":netherite", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);

    public static final Item NETHERITE_INGOT = new ItemBase("netherite_ingot");
    public static final Item NETHERITE_SCRAP = new ItemBase("netherite_scrap");

    //Tools
    public static final Item NETHERITE_SWORD = new ItemSwordMod("netherite_sword", NETHERITE_TOOLS);
    public static final Item NETHERITE_PICKAXE = new ItemPickaxeMod("netherite_pickaxe", NETHERITE_TOOLS);
    public static final Item NETHERITE_AXE = new ItemAxeMod("netherite_axe", NETHERITE_TOOLS);
    public static final Item NETHERITE_SHOVEL = new ItemShovelMod("netherite_shovel", NETHERITE_TOOLS);
   // public static final Item NETHERITE_HOE = new ItemHoeMod("netherite_hoe");

    public static final Item NETHERITE_HELMET = new NetheriteArmor("netherite_helmet", NETHERITE_ARMOR, 1, EntityEquipmentSlot.HEAD);
    public static final Item NETHERITE_CHESTPLATE = new NetheriteArmor("netherite_chestplate", NETHERITE_ARMOR, 1, EntityEquipmentSlot.CHEST);
    public static final Item NETHERITE_LEGGINGS = new NetheriteArmor("netherite_leggings", NETHERITE_ARMOR, 2, EntityEquipmentSlot.LEGS);
    public static final Item NETHERITE_BOOTS = new NetheriteArmor("netherite_boots", NETHERITE_ARMOR, 1, EntityEquipmentSlot.FEET);


}
