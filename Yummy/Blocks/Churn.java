package com.rnh.Yummy.Blocks;

import com.rnh.Yummy.Yummy;
import com.rnh.Yummy.YummyItems;
import com.rnh.Yummy.TileEntity.TileEntityChurn;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Churn extends BlockContainer{

	public Churn(Material material) {
		super(material);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
		this.setCreativeTab(Yummy.tabYummy);
		this.setBlockName("Churn");
		this.setBlockTextureName(Yummy.MODID + ":" + "ChurnIcon");
	}
	
	public int getRenderType(){
		return -1 ;
	}
	
	public boolean isOpaqueCube(){
		return false;
	}
	
	public boolean renderAsNormalBlock(){
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		
		return new TileEntityChurn();
	}

	public boolean blockActivated(World world, int i, int j, int k, EntityPlayer player)
	{
		ItemStack itemstack = player.inventory.getCurrentItem();
			if (itemstack.getItem() == YummyItems.MilkBottle)
				{
					player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(Items.bucket));
			    	player.dropPlayerItemWithRandomChoice(new ItemStack(YummyItems.butter), true);

					return true;
				}	
			return false;
	}
}
