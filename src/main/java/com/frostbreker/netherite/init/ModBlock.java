package com.frostbreker.netherite.init;

import com.frostbreker.netherite.objects.blocks.AncientDebris;
import com.frostbreker.netherite.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlock {
    public static List<Block> BLOCKS = new ArrayList<>();

    public static final Block ANCIENT_DEBRIS = new AncientDebris("ancient_debris", Material.IRON);
    public static final Block NETHERITE_BLOCK = new BlockBase("netherite_block", Material.IRON);

}
