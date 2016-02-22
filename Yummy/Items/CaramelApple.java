package com.rnh.Yummy.Items;

import com.rnh.Yummy.Yummy;
import com.rnh.Yummy.YummyItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CaramelApple extends ItemFood {


	public CaramelApple(int healammount, float saturation, boolean wolvesfavorite) {
		super(4,0.3f,false);
		setUnlocalizedName("CaramelApple") 
		.setCreativeTab(Yummy.tabYummy)
		.setTextureName(Yummy.MODID + ":" + "CaramelApple");
		
	}
	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player)
    {
        super.onEaten(itemstack, world, player);
        if (itemstack.stackSize <= 0)
     {
         return new ItemStack(Items.stick);
     }

     if (!player.inventory.addItemStackToInventory(new ItemStack(Items.stick)))
     {
         player.dropPlayerItemWithRandomChoice(new ItemStack(Items.stick), false);
     }
     
		return itemstack;
    }
}
