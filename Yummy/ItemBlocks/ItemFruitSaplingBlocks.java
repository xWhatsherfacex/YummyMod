package com.rnh.Yummy.ItemBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemFruitSaplingBlocks extends ItemBlock{

	public static final String[] saplings = new String[] {"CherrySapling"};
	
	public ItemFruitSaplingBlocks(Block block){
		super(block);
		this.setHasSubtypes(true);
		
	}
	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if(i < 0 || i >= saplings.length){
			i = 0;
		}
	return super.getUnlocalizedName() + "." + saplings[i];
	
	}
	public int getMetadata(int meta){
		return meta;
	}
	
	
	
}
