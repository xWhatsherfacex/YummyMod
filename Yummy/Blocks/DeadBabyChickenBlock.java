package com.rnh.Yummy.Blocks;

import com.rnh.Yummy.Yummy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DeadBabyChickenBlock extends Block{

	public DeadBabyChickenBlock(Material mateiral) {
		super(Material.cloth);
		this.setCreativeTab(Yummy.tabYummy);
		this.setBlockName("DeadBabyChickenBlock");
		this.setBlockTextureName(Yummy.MODID+ ":" + "DeadChickenBlock");
	}

}
