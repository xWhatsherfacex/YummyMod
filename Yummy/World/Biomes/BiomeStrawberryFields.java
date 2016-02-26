package com.rnh.Yummy.World.Biomes;

import com.rnh.Yummy.YummyBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeStrawberryFields extends BiomeGenBase{
	public BiomeStrawberryFields(int id){
		super(id);
		this.setHeight(new Height(0.1f,0.1f));
		this.setColor(4699501);
		this.setTemperatureRainfall(0.9F , 1.0F);
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		//this.topBlock = ((byte)Main.MyGrass.blockID);
		//this.fillerBlock = ((byte)Main.MyDirt.blockID);
		this.setBiomeName("Stawberry Fields");

		this.waterColorMultiplier = 3660528;
	}

	@Override
	public int getBiomeGrassColor( int x, int y, int z){
		return 4699501;
	}
	@Override
	public int getBiomeFoliageColor(int x, int y, int z){
		return 7397529;
	}

	
	
}
