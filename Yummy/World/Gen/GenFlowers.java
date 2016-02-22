package com.rnh.Yummy.World.Gen;

import java.util.Random;

import com.rnh.Yummy.YummyBlocks;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;

public class GenFlowers extends WorldGenerator{

	
	
	@Override
	public boolean generate(World world, Random random, int x, int y, int z)
    {
        for (int l = 0; l < 64; ++l)
        {
            int i1 = x + random.nextInt(8) - random.nextInt(8);
            int j1 = y + random.nextInt(4) - random.nextInt(4);
            int k1 = z + random.nextInt(8) - random.nextInt(8);

            if (world.isAirBlock(i1, j1, k1) && (!world.provider.hasNoSky || j1 < 255) && YummyBlocks.StrawberryBush.canBlockStay(world, i1, j1, k1))
            {
            	world.setBlock(i1, j1, k1, YummyBlocks.StrawberryBush, 4, 2);
            }
        }

        return true;
    }
}