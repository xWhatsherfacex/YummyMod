
package com.rnh.Yummy.Model;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDeadPig extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer leg2;
  
  public ModelDeadPig()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -6F, -8F, 8, 8, 8);
      head.setRotationPoint(0F, 18F, 0F);
      head.setTextureSize(64, 64);
      head.mirror = true;
      setRotation(head, -0.0174533F, 0F, 0.0174533F);
      body = new ModelRenderer(this, 28, 8);
      body.addBox(-5F, -10F, -7F, 10, 16, 8);
      body.setRotationPoint(0F, 17F, 10F);
      body.setTextureSize(64, 64);
      body.mirror = true;
      setRotation(body, 1.570796F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 16);
      leg1.addBox(-2F, -8F, -4F, 4, 6, 4);
      leg1.setRotationPoint(3F, 20F, 24F);
      leg1.setTextureSize(64, 64);
      leg1.mirror = true;
      setRotation(leg1, 1.570796F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 16);
      leg3.addBox(-2F, 18F, 14F, 4, 6, 4);
      leg3.setRotationPoint(-3F, 6F, 18F);
      leg3.setTextureSize(64, 64);
      leg3.mirror = true;
      setRotation(leg3, -1.570796F, 0F, 0F);
      leg4 = new ModelRenderer(this, 0, 16);
      leg4.addBox(-2F, 2F, -4F, 4, 6, 4);
      leg4.setRotationPoint(3F, 24F, 2F);
      leg4.setTextureSize(64, 64);
      leg4.mirror = true;
      setRotation(leg4, -1.570796F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 16);
      leg2.addBox(-5F, -15F, 14F, 4, 6, 4);
      leg2.setRotationPoint(0F, 38F, 31F);
      leg2.setTextureSize(64, 64);
      leg2.mirror = true;
      setRotation(leg2, 1.570796F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body.render(f5);
    leg1.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    leg2.render(f5);
  }
  
  public void rendermodel( float f){
	    head.render(f);
	    body.render(f);
	    leg1.render(f);
	    leg3.render(f);
	    leg4.render(f);
	    leg2.render(f);
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
