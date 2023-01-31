package com.frostbreker.netherite.objects.items.armor;

import com.frostbreker.netherite.NetherUpdateMod;
import com.frostbreker.netherite.init.ModItem;
import com.frostbreker.netherite.util.interfaces.IHasModel;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class NetheriteArmor extends ItemArmor implements IHasModel {
    public NetheriteArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(NetherUpdateMod.NETHERITE_TAB);

        ModItem.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        NetherUpdateMod.proxy.registerItemRenderer(this, 0);
    }
}
