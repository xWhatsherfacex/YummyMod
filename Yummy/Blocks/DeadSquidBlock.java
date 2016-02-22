package com.rnh.Yummy.Blocks;

import com.rnh.Yummy.Yummy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DeadSquidBlock extends Block{

	public DeadSquidBlock(Material mateiral) {
		super(Material.cloth);
		this.setCreativeTab(Yummy.tabYummy);
		this.setBlockName("DeadSquidBlock");
		this.setBlockTextureName(Yummy.MODID+ ":" + "DeadSquidBlock");
		
	}

}
