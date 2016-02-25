package com.rnh.Yummy.Blocks;

import java.util.ArrayList;

import com.rnh.Yummy.Yummy;
import com.rnh.Yummy.YummyItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DeadBabyChickenBlock extends Block{

	public DeadBabyChickenBlock(Material mateiral) {
		super(Material.cloth);
		this.setCreativeTab(Yummy.tabYummy);
		this.setBlockName("DeadBabyChickenBlock");
		this.setBlockTextureName(Yummy.MODID+ ":" + "DeadChickenBlock");
		this.setHarvestLevel("sword", 0);
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
	    ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
	    drops.add(new ItemStack(Items.bone, world.rand.nextInt(3) + 1));
	    drops.add(new ItemStack(Items.feather, world.rand.nextInt(5) + 1));
	   
	    return drops;
	}
}
