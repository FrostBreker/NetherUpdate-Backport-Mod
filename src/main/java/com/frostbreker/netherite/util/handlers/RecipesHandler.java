package com.frostbreker.netherite.util.handlers;

import com.frostbreker.netherite.init.ModBlock;
import com.frostbreker.netherite.init.ModItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesHandler {
    public static void registerRecipes() {
        //Ancient Debris -> Netherite Ingot
        GameRegistry.addSmelting(ModBlock.ANCIENT_DEBRIS, new ItemStack(ModItem.NETHERITE_SCRAP, 1), 1.0f);


    }
}
