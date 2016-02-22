package com.rnh.Yummy.World.Trees;

import java.util.Random;

import com.rnh.Yummy.YummyBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.init.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.util.ForgeDirection;

public class WorldGenBananaTree extends WorldGenAbstractTree {
    private int strengthRand;
    private int bMax;
    private double offset;

    public WorldGenBananaTree() {
        this(35, 10, 1.3);
    }

    public WorldGenBananaTree(int strengthRand, int bMax, double offset) {
        super(false);
        this.strengthRand = strengthRand;
        this.bMax = bMax;
        this.offset = offset;
    }

    public boolean generate(World world, Random random, int x, int y, int z) {
        while (world.isAirBlock(x, y, z) && y > 2) {
            --y;
        }
        Block block = world.getBlock(x, y, z);
        if (block != Blocks.grass && block != Blocks.dirt) {
            return false;
        }
        for (int var7 = -2; var7 <= 2; ++var7) {
            for (int var8 = -2; var8 <= 2; ++var8) {
                if (!world.isAirBlock(x + var7, y - 1, z + var8) || !world.isAirBlock(x + var7, y - 2, z + var8) || world.isAirBlock(x + var7, y, z + var8)) continue;
                return false;
            }
        }
        double strength = (double)random.nextInt(this.strengthRand) / 100.0;
        double xoff = 0.0;
        double yoff = 0.0;
        int r = random.nextInt(4);
        if (r == 0) {
            xoff = strength;
        } else if (r == 1) {
            xoff = - strength;
        } else {
            yoff = r == 2 ? strength : - strength;
        }
        int h = 1;
        this.buildBlock(world, x, y, z, Blocks.dirt, 0);
        for (int b = 0; b < this.bMax; ++b) {
            this.buildBlock(world, x + (int)Math.floor(xoff), y + h, z + (int)Math.floor(yoff),Blocks.log,1);
            if (b == this.bMax - 1) {
                this.generateTop(world, x + (int)Math.floor(xoff), y + h, z + (int)Math.floor(yoff));
                continue;
            }
            ++h;
            xoff *= this.offset;
            yoff *= this.offset;
        }
        return true;
    }

    public void generateTop(World world, int x, int y, int z) {
    	this.buildBlock(world, x - 1 , y  , z , YummyBlocks.BananaBunch, 1);
        this.buildBlock(world, x + 1 , y  , z , YummyBlocks.BananaBunch, 1);
        this.buildBlock(world, x , y  , z - 1 , YummyBlocks.BananaBunch, 1);
        this.buildBlock(world, x , y  , z + 1 , YummyBlocks.BananaBunch, 1);
        this.buildBlock(world, x - 1 , y + 1 , z , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x + 1 , y + 1 , z , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x , y + 1 , z - 1 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x , y + 1 , z + 1 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x - 4 , y + 1 , z , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x + 4 , y + 1 , z , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x , y + 1 , z - 4 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x , y + 1 , z + 4 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x , y + 1 , z , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x - 2 , y + 2 , z , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x + 2 , y + 2 , z , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x , y + 2 , z - 2 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x , y + 2 , z + 2 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x - 3 , y + 2 , z , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x + 3 , y + 2 , z , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x , y + 2 , z - 3 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x , y + 2 , z + 3 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x - 1 , y + 2 , z - 1 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x + 1 , y + 2 , z - 1 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x - 1, y + 2 , z + 1 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x + 1, y + 2 , z + 1 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x - 2 , y + 2 , z - 2 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x + 2 , y + 2 , z - 2 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x - 2, y + 2 , z + 2 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x + 2, y + 2 , z + 2 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x - 3 , y + 1 , z - 3 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x + 3 , y + 1 , z - 3 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x - 3, y + 1 , z + 3 , YummyBlocks.PalmLeaves, 1);
        this.buildBlock(world, x + 3, y + 1 , z + 3 , YummyBlocks.PalmLeaves, 1);
    }

    public void buildBlock(World world, int x, int y, int z, Block block, int meta) {
        if (world.isAirBlock(x, y, z) || world.getBlock(x, y, z).isLeaves((IBlockAccess)world, x, y, z)) {
            world.setBlock(x, y, z, block, meta, 2);
        }
    }

	
}
