package com.rnh.Yummy.Blocks;

import com.rnh.Yummy.Yummy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DeadChickenBlock extends Block{

	public DeadChickenBlock(Material mateiral) {
		super(Material.cloth);
		this.setCreativeTab(Yummy.tabYummy);
		this.setBlockName("DeadChickenBlock");
		this.setBlockTextureName(Yummy.MODID+ ":" + "DeadChickenBlock");
	}

}
