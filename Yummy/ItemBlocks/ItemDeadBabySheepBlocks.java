package com.rnh.Yummy.ItemBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemDeadBabySheepBlocks extends ItemBlock{

	public static final String[] names = new String[] {"white", "orange", "magenta", "lightblue", "yellow", "lime", "pink", "gray", "silver", "cyan", "purple", "blue", "brown", "green", "red", "black"};
	
	public ItemDeadBabySheepBlocks(Block block){
		super(block);
		this.setHasSubtypes(true);
		
	}
	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if(i < 0 || i >= names.length){
			i = 0;
		}
	return super.getUnlocalizedName() + "." + names[i];
	
	}
	public int getMetadata(int meta){
		return meta;
	}
	
	
	
}
