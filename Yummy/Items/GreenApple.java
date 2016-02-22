package com.rnh.Yummy.Items;

import com.rnh.Yummy.Yummy;
import com.rnh.Yummy.YummyItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GreenApple extends ItemFood {

	public GreenApple(int healammount, float saturation, boolean wolvesfavorite) {
		super(4,0.3f,false);
		setUnlocalizedName("GreenApple") 
		.setCreativeTab(Yummy.tabYummy)
		.setTextureName(Yummy.MODID + ":" + "GreenApple");
		
	}
	 public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player)
	    {
	        super.onEaten(itemstack, world, player);
	        if (itemstack.stackSize <= 0)
            {
                return new ItemStack(YummyItems.GreenAppleCore);
            }

            if (!player.inventory.addItemStackToInventory(new ItemStack(YummyItems.GreenAppleCore)))
            {
                player.dropPlayerItemWithRandomChoice(new ItemStack(YummyItems.GreenAppleCore), false);
            }
            
			return itemstack;
	    }
}
