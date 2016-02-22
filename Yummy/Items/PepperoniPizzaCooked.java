package com.rnh.Yummy.Items;

import com.rnh.Yummy.Yummy;
import com.rnh.Yummy.YummyItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapData;

public class PepperoniPizzaCooked extends Item {

	 public PepperoniPizzaCooked()
	    {
	    	this.setUnlocalizedName("CheesePizzaPanCooked");
	        this.setCreativeTab(Yummy.tabYummy);
	        this.setTextureName(Yummy.MODID + ":" + "CheesePizzaPanCooked");
	        this.setMaxStackSize(1);
	    }
	
	 public ItemStack onItemRightClick(ItemStack itemstack, World p_77659_2_, EntityPlayer player)
	    {
		 return new ItemStack(YummyItems.CheesePizza , 1);
	     

	    }
	 
	 
}

