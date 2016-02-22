package com.rnh.Yummy.Proxy;



import com.rnh.Yummy.YummyBlocks;
import com.rnh.Yummy.YummyItems;
import com.rnh.Yummy.Recipies.YummyRecipieRemoverCake;
import com.rnh.Yummy.Recipies.YummyRecipieRemoverDye;
import com.rnh.Yummy.Recipies.YummyRecipies;
import com.rnh.Yummy.Renderer.RenderChurn;
import com.rnh.Yummy.Renderer.RenderDeadCow;
import com.rnh.Yummy.Renderer.RenderDeadPig;
import com.rnh.Yummy.TileEntity.TileEntityChurn;
import com.rnh.Yummy.TileEntity.TileEntityDeadCow;
import com.rnh.Yummy.TileEntity.TileEntityDeadPig;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e) {
		
		YummyBlocks.init();
		YummyItems.init();
		
		YummyRecipieRemoverCake.init();
		YummyRecipieRemoverDye.init();
		
		YummyRecipies.init();
		
	}

	public void init(FMLInitializationEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void postInit(FMLPostInitializationEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void registerRenderThings() {
	
		TileEntitySpecialRenderer renderchurn = new RenderChurn();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChurn.class, renderchurn);
		TileEntitySpecialRenderer renderdeadpig = new RenderDeadPig();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDeadPig.class, renderdeadpig);
		TileEntitySpecialRenderer renderdeadcow = new RenderDeadCow();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDeadCow.class, renderdeadcow);
		
	}

	public void registerTileEntitySpecialRenderer(){
	}
	
}
