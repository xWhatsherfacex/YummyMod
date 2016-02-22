package com.rnh.Yummy.Items;

import com.rnh.Yummy.Yummy;
import com.rnh.Yummy.YummyItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class AppleSauce extends ItemFood {

	public AppleSauce(int healammount, float saturation, boolean wolvesfavorite) {
		super(4,0.3f,false);
		setUnlocalizedName("AppleSauce") 
		.setCreativeTab(Yummy.tabYummy)
		.setTextureName(Yummy.MODID + ":" + "AppleSauce");
		
	}
	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player)
    {
        super.onEaten(itemstack, world, player);
        if (itemstack.stackSize <= 0)
     {
         return new ItemStack(YummyItems.dirtymasonjar);
     }

     if (!player.inventory.addItemStackToInventory(new ItemStack(YummyItems.dirtymasonjar)))
     {
         player.dropPlayerItemWithRandomChoice(new ItemStack(YummyItems.dirtymasonjar), false);
     }
     
		return itemstack;
    }
}