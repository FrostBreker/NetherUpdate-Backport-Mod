package com.mod.nether.blocks;

import com.mod.nether.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockAncientDebris extends Block
{

    private IIcon top;
    private IIcon bottom;

    public BlockAncientDebris(Material material)
    {
        super(material);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iiconRegister)
    {
        this.blockIcon = iiconRegister.registerIcon(Reference.MOD_ID + ":ancient_debris_side");
        this.top = iiconRegister.registerIcon(Reference.MOD_ID + ":ancient_debris_top");
        this.bottom = iiconRegister.registerIcon(Reference.MOD_ID + ":ancient_debris_top");
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
