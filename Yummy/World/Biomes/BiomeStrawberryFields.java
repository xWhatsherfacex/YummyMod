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

	@Override
	public void decorate(World world, Random rand, int chunkX, int chunkZ)
	{
		super.decorate(world, rand, chunkX, chunkZ);
		WorldGenerator strawberryBushGen = new YummyWorldGeneratorStrawberryBushes(topBlock);
		final int MIN_PATCHES = 2; // change if needed
		final int MAX_PATCHES = 10; // change if needed
		for (int i = MIN_PATCHES + rand.nextInt(MAX_PATCHES - MIN_PATCHES); i > 0; i--) 
		{
	            int xRand = (chunkX * 16) + rand.nextInt(16) - rand.nextInt(16);
	            int zRand = (chunkZ * 16) + rand.nextInt(16) - rand.nextInt(16);
	            strawberryBushGen.generate(world, rand, xRand, 0, zRand);
		}
	}
	
	
}
