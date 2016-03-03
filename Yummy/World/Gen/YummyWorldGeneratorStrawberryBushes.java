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
    public int getAirBlockAboveGround(World world, int x, int z) 
    {
        int y = 255;
        while(y > 0 && world.isAirBlock(x,y,z))
        {
            --y;
        }
        return y + 1;
    }

    @Override
    public boolean generate(World world, Random random, int x, int y, int z)
    {
    	System.out.print("trying to generate bushes centered at " + x + ", " + z);
    	
    	final int RADIUS = 8;
    	for (int l = 0; l < 64; ++l)
    	{
    		int tempX = x + random.nextInt(RADIUS) - random.nextInt(RADIUS);
    		int tempZ = z + random.nextInt(RADIUS) - random.nextInt(RADIUS);
    		int tempY = this.getAirBlockAboveGround(world, tempX, tempZ);
    		System.out.print("Trying to place a bush at " + tempX + ", " + tempY + ", " + tempZ);

    		if (world.isAirBlock(tempX, tempY, tempZ) && (!world.provider.hasNoSky || tempY < 255) && YummyBlocks.StrawberryBush.canBlockStay(world, tempX, tempY, tempZ))
    		{
    		   	world.setBlock(tempX, tempY, tempZ, YummyBlocks.StrawberryBush, random.nextInt(5), 2);
    			System.out.print("Success!");
    		}
    	}

    	return true;
    }

}
