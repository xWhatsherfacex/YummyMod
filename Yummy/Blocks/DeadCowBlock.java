package com.rnh.Yummy.Blocks;

import com.rnh.Yummy.Yummy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DeadCowBlock extends Block{

	public DeadCowBlock(Material mateiral) {
		super(Material.cloth);
		this.setCreativeTab(Yummy.tabYummy);
		this.setBlockName("DeadCowBlock");
		this.setBlockTextureName(Yummy.MODID+ ":" + "DeadCowBlock");
	}

}
