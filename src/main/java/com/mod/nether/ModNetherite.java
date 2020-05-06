package com.mod.nether;


import com.mod.nether.init.BlockMod;
import com.mod.nether.init.ItemMod;
import com.mod.nether.init.Recipes;
import com.mod.nether.proxy.CommonProxy;
import com.mod.nether.world.WorldRegister;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class ModNetherite
{
    
    @Instance(Reference.MOD_ID)
    public static ModNetherite instance;
    
    private static final String clientProxy = null;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;
    
    public static CreativeTabs tabNetherite = new CreativeTabs("tabNetherite")
    {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(BlockMod.block_ancient_debris);
        }
    };
    
    
    @EventHandler
  public void preInit(FMLPreInitializationEvent event)
  {
      
      
      BlockMod.init();
      BlockMod.register();
      ItemMod.init();
      ItemMod.register();
      Recipes.init();
      Recipes.register();
      WorldRegister.mainRegistry();
    
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
