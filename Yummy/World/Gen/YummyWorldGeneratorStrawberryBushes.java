package com.rnh.Yummy.World.Gen;

import java.util.Random;

import com.rnh.Yummy.YummyBlocks;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;

public class YummyWorldGeneratorStrawberryBushes extends WorldGenerator{
	 
	
	private Block StrawberryBush;
    private int field_150551_b;

    public YummyWorldGeneratorStrawberryBushes(Block block)
    {
        this.StrawberryBush = YummyBlocks.StrawberryBush;
    }

    public void func_150550_a(Block block, int meta)
    {
        this.StrawberryBush = block;
        this.field_150551_b = meta;
    }

    public boolean generate(World world, Random random, int x, int y, int z)
    {
        for (int l = 0; l < 64; ++l)
        {
            int i1 = x + random.nextInt(8) - random.nextInt(8);
            int j1 = y + random.nextInt(4) - random.nextInt(4);
            int k1 = z + random.nextInt(8) - random.nextInt(8);

            if (world.isAirBlock(i1, j1, k1) && (!world.provider.hasNoSky || j1 < 255) && this.StrawberryBush.canBlockStay(world, i1, j1, k1))
            {
            	world.setBlock(i1, j1, k1, this.StrawberryBush, this.field_150551_b, 2);
            }
        }

        return true;
    }
}
