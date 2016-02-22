package com.rnh.Yummy;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;

public class BiomesYummy {

	public static BiomeGenBase BiomeStrawberryFields;
	
	public static void init(){
		registerBiomes();
		
	}

	private static void registerBiomes() {

	BiomeStrawberryFields = new com.rnh.Yummy.World.Biomes.BiomeStrawberryFields(67).setBiomeName("StrawberryFields");
	BiomeDictionary.registerBiomeType(BiomeStrawberryFields, Type.FOREST);
	BiomeManager.warmBiomes.add(new BiomeEntry(BiomeStrawberryFields, 10));
	
	
	BiomeManager.addSpawnBiome(BiomeStrawberryFields);
	}
}
