package com.rnh.Yummy.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDeadCow extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer horn1;
    ModelRenderer horn2;
    ModelRenderer udders;
  
  public ModelDeadCow()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -4F, -6F, 8, 8, 6);
      head.setRotationPoint(0F, 20F, -4F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 1.570796F);
      body = new ModelRenderer(this, 18, 4);
      body.addBox(-6F, -10F, -7F, 12, 18, 10);
      body.setRotationPoint(3F, 18F, 6F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 1.570796F, 0F, 1.570796F);
      leg1 = new ModelRenderer(this, 0, 16);
      leg1.addBox(-3F, 0F, -2F, 4, 12, 4);
      leg1.setRotationPoint(-3F, 15F, 12F);
      leg1.setTextureSize(64, 32);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 1.570796F);
      leg2 = new ModelRenderer(this, 0, 16);
      leg2.addBox(-1F, 0F, -2F, 4, 12, 4);
      leg2.setRotationPoint(-3F, 21F, 12F);
      leg2.setTextureSize(64, 32);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 1.570796F);
      leg3 = new ModelRenderer(this, 0, 16);
      leg3.addBox(-3F, 0F, -3F, 4, 12, 4);
      leg3.setRotationPoint(-3F, 15F, -1F);
      leg3.setTextureSize(64, 32);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 1.570796F);
      leg4 = new ModelRenderer(this, 0, 16);
      leg4.addBox(-1F, 6F, -3F, 4, 12, 4);
      leg4.setRotationPoint(3F, 21F, 0F);
      leg4.setTextureSize(64, 32);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 1.570796F);
      horn1 = new ModelRenderer(this, 22, 0);
      horn1.addBox(-4F, -5F, -4F, 1, 3, 1);
      horn1.setRotationPoint(0F, 22F, -3F);
      horn1.setTextureSize(64, 32);
      horn1.mirror = true;
      setRotation(horn1, 0F, 0F, 1.570796F);
      horn2 = new ModelRenderer(this, 22, 0);
      horn2.addBox(3F, -5F, -4F, 1, 3, 1);
      horn2.setRotationPoint(0F, 18F, -3F);
      horn2.setTextureSize(64, 32);
      horn2.mirror = true;
      setRotation(horn2, 0F, 0F, 1.570796F);
      udders = new ModelRenderer(this, 52, 0);
      udders.addBox(-2F, -3F, 0F, 4, 6, 2);
      udders.setRotationPoint(-6F, 18F, 11F);
      udders.setTextureSize(64, 32);
      udders.mirror = true;
      setRotation(udders, 1.570796F, 0F, 1.570796F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    horn1.render(f5);
    horn2.render(f5);
    udders.render(f5);
  }
  
  public void rendermodel( float f){
	  head.render(f);
	    body.render(f);
	    leg1.render(f);
	    leg2.render(f);
	    leg3.render(f);
	    leg4.render(f);
	    horn1.render(f);
	    horn2.render(f);
	    udders.render(f);
  }
	    
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
