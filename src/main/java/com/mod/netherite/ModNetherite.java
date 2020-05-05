package com.mod.netherite;

import com.mod.netherite.init.BlockMod;
import com.mod.netherite.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ModNetherite 
{
	@Instance(Reference.MOD_ID)
    public static ModNetherite instance;
    
    private static final String clientProxy = null;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;
    
    
   // public static CreativeTabs tabFrostArium = new CreativeTabs("Netherite")
    {
       // @SideOnly(Side.CLIENT)
       // public Item getTabIconItem()
        {
           // return Item.getItemFromBlock();
        }

    };
    
  //  public static CreativeTabs tabFrostAriumTool = new CreativeTabs("FrostArium Tool")
    {
       // @SideOnly(Side.CLIENT)
       // public Item getTabIconItem()
        {
           // return ItemMod.item_sword_rubyum;
        }

    };
    
    @EventHandler
  public void preInit(FMLPreInitializationEvent event)
  {
     BlockMod.init();
     BlockMod.register();
  }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.registerRenders();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}
