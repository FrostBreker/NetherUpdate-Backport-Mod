package com.mod.nether.blocks;

import com.mod.nether.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class CrimsonStem extends BlockLog
{

    private IIcon bottom;
    private IIcon top;

    public CrimsonStem(Material wood)
    {
        this.setStepSound(soundTypeWood);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iiconRegister)
    {
        this.blockIcon = iiconRegister.registerIcon(Reference.MOD_ID + ":crimson_stem");
        this.top = iiconRegister.registerIcon(Reference.MOD_ID + ":crimson_stem_top");
        this.bottom = iiconRegister.registerIcon(Reference.MOD_ID + ":crimson_stem_top");
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata)
    {
        if(side == 0)
        {
            return this.bottom;
        }
        else if(side == 1)
        {
            return this.top;
        }
        return this.blockIcon;
    }

}
