package com.rnh.Yummy.Renderer;

import org.lwjgl.opengl.GL11;

import com.rnh.Yummy.Yummy;
import com.rnh.Yummy.Model.ModelDeadPig;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderDeadPig extends TileEntitySpecialRenderer{
	
	private static final ResourceLocation texture = new ResourceLocation("Yummy:textures/blocks/deadpig.png");
	private ModelDeadPig model;
	
	public RenderDeadPig(){
		this.model = new ModelDeadPig();
		
	}

	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		
			GL11.glTranslatef((float)x + 0.5F,(float)y + 1.5F,(float)z + 0.5F);
			GL11.glRotatef(180, 0f, 0f, 1f);
			
			this.bindTexture(texture);
			
			GL11.glPushMatrix();
			this.model.rendermodel(0.0625F);
			GL11.glPopMatrix();
			
		GL11.glPopMatrix();
	}

}