package com.rnh.Yummy.Proxy;

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

public class ClientProxy extends CommonProxy {

	    @Override
	    public void preInit(FMLPreInitializationEvent e) {
	        super.preInit(e);
	    }

	    @Override
	    public void init(FMLInitializationEvent e) {
	        super.init(e);
	    }

	    @Override
	    public void postInit(FMLPostInitializationEvent e) {
	        super.postInit(e);
	    }
	    
	    public void registerRenderThings() {
			//Churn
	    	TileEntitySpecialRenderer renderchurn = new RenderChurn();
	    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChurn.class, renderchurn);
	    	
			//DeadPig
			TileEntitySpecialRenderer renderdeadpig = new RenderDeadPig();
			ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDeadPig.class, renderdeadpig);
			
			//DeadCow
			TileEntitySpecialRenderer renderdeadcow = new RenderDeadCow();
			ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDeadCow.class, renderdeadcow);
		}

		public void registerTileEntitySpecialRenderer(){
		}
}
