package com.rnh.Yummy.Items;

import com.rnh.Yummy.Yummy;
import com.rnh.Yummy.YummyItems;

import ibxm.Player;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GoldenCarrotCakePanBaked extends Item {
	public GoldenCarrotCakePanBaked(){
		setUnlocalizedName("CarrotCakePanBaked")
		.setCreativeTab(Yummy.tabYummy)
		.setMaxStackSize(1)
		.setTextureName(Yummy.MODID + ":" + "CakePanBaked_GoldenCarrot");
		}
	
    public ItemStack onItemRightClick(ItemStack itemstack, World p_77659_2_, EntityPlayer player) {
    	
    	player.dropPlayerItemWithRandomChoice(new ItemStack(YummyItems.dirtycakepan, 1, 0), true);

		return new ItemStack(YummyItems.CakeSheet,1, 1);
    }
    	
    


}
