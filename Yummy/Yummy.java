package com.rnh.Yummy;

import com.rnh.Yummy.CreativeTabs.CreativeTabsYummy;
import com.rnh.Yummy.Recipes.YummyRecipies;
import com.rnh.Yummy.DropHandler.YummyChickenDropHandler;
import com.rnh.Yummy.DropHandler.YummyCowDropHandler;
import com.rnh.Yummy.DropHandler.YummyPigDropHandler;
import com.rnh.Yummy.DropHandler.YummySheepDropHandler;
import com.rnh.Yummy.DropHandler.YummySquidDropHandler;
import com.rnh.Yummy.Proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Yummy.MODID, name = Yummy.MODNAME, version = Yummy.VERSION)
public class Yummy {
	public static final String MODID ="yummy";
	public static final String MODNAME ="Yummy!";
	public static final String VERSION = "1.0";
	
	@SidedProxy(clientSide="com.rnh.Yummy.Proxy.ClientProxy", serverSide="com.rnh.Yummy.Proxy.CommonProxy")
	public static CommonProxy proxy;	

	public static CreativeTabs tabYummy	= new CreativeTabsYummy("Yummy");

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
    	proxy.registerRenderThings();
    	BiomesYummy.init();
    	YummyBlocks.init();
    	YummyItems.init();
	}
	@EventHandler
	public void init(FMLInitializationEvent e) {
    	proxy.init(e);
    	MinecraftForge.EVENT_BUS.register(new YummyPigDropHandler());
    	MinecraftForge.EVENT_BUS.register(new YummyCowDropHandler());
    	MinecraftForge.EVENT_BUS.register(new YummyChickenDropHandler());
    	MinecraftForge.EVENT_BUS.register(new YummySheepDropHandler());
    	MinecraftForge.EVENT_BUS.register(new YummySquidDropHandler());
    	YummyRecipies.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);
	}
}
