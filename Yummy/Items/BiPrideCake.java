package com.rnh.Yummy.Items;

import com.rnh.Yummy.Yummy;
import com.rnh.Yummy.YummyBlocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BiPrideCake extends Item{
	
	
	public BiPrideCake(){
	setUnlocalizedName("BiPrideCake")
	.setCreativeTab(Yummy.tabYummy)
	.setTextureName(Yummy.MODID + ":" + "BiPrideCake");
	}
	  public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int par1, int par2, int par3, int par4, float x, float y, float z)
	    {
	        if (par4 != 1)
	        {
	            return false;
	        }
	        else if (player.canPlayerEdit(par1, par2, par3, par4, itemstack) && player.canPlayerEdit(par1, par2 + 1, par3, par4, itemstack))
	        {
	            if (world.isAirBlock(par1, par2 +1, par3))
	            {
	                world.setBlock(par1, par2 +1, par3, YummyBlocks.BiPrideCakeBlock);
	                --itemstack.stackSize;
	                return true;
	            }
	            else
	            {
	                return false;
	            }
	        }
	        else
	        {
	            return false;
	        }
	    }

}

