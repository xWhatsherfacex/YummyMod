package com.rnh.Yummy.Blocks;

import com.rnh.Yummy.Yummy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DeadBabyPigBlock extends Block{

	public DeadBabyPigBlock(Material mateiral) {
		super(Material.cloth);
		this.setCreativeTab(Yummy.tabYummy);
		this.setBlockName("DeadBabyPigBlock");
		this.setBlockTextureName(Yummy.MODID+ ":" + "DeadPigBlock");
	}

}
