package com.rnh.Yummy.Blocks;

import com.rnh.Yummy.Yummy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DeadPigBlock extends Block{

	public DeadPigBlock(Material mateiral) {
		super(Material.cloth);
		this.setCreativeTab(Yummy.tabYummy);
		this.setBlockName("DeadPigBlock");
		this.setBlockTextureName(Yummy.MODID+ ":" + "DeadPigBlock");
	}

}
