package com.frostbreker.netherite;

import com.frostbreker.netherite.proxy.CommonProxy;
import com.frostbreker.netherite.tabs.NetherUpdateTabs;
import com.frostbreker.netherite.util.Reference;
import com.frostbreker.netherite.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class NetherUpdateMod {
    @Mod.Instance
    public static NetherUpdateMod instance;
    public static CreativeTabs NETHERITE_TAB = new NetherUpdateTabs("netherupdate");

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog(); // initialise le logger.  event.getModLog() retourne un logger avec votre modid
        proxy.preInit();

        RegistryHandler.preInitRegistries();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        RegistryHandler.initRegistries();
    }

    @Mod.EventHandler
    public void postInit(FMLInitializationEvent event) {

    }
}
