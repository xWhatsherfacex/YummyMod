package com.rnh.Yummy.Blocks;

import java.util.ArrayList;

import com.rnh.Yummy.Yummy;
import com.rnh.Yummy.YummyItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DeadBabyCowBlock extends Block{

	public DeadBabyCowBlock(Material mateiral) {
		super(Material.cloth);
		this.setCreativeTab(Yummy.tabYummy);
		this.setBlockName("DeadBabyCowBlock");
		this.setBlockTextureName(Yummy.MODID+ ":" + "DeadCowBlock");
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
	    ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
	    drops.add(new ItemStack(Items.bone, world.rand.nextInt(3) + 1));
	    drops.add(new ItemStack(Items.leather, world.rand.nextInt(2) + 1));
	    drops.add(new ItemStack(YummyItems.Veal, world.rand.nextInt(2) + 1));
	   
	    return drops;
	}
}
