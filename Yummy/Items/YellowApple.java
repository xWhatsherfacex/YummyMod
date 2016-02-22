package com.rnh.Yummy.Items;

import com.rnh.Yummy.Yummy;
import com.rnh.Yummy.YummyItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class YellowApple extends ItemFood {

	public YellowApple(int healammount, float saturation, boolean wolvesfavorite) {
		super(4,0.3f,false);
		setUnlocalizedName("YellowApple") 
		.setCreativeTab(Yummy.tabYummy)
		.setTextureName(Yummy.MODID + ":" + "YellowApple");
		
	}
	 public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player)
	    {
	        super.onEaten(itemstack, world, player);
	        if (itemstack.stackSize <= 0)
         {
             return new ItemStack(YummyItems.YellowAppleCore);
         }

         if (!player.inventory.addItemStackToInventory(new ItemStack(YummyItems.YellowAppleCore)))
         {
             player.dropPlayerItemWithRandomChoice(new ItemStack(YummyItems.YellowAppleCore), false);
         }
         
			return itemstack;
	    }
}