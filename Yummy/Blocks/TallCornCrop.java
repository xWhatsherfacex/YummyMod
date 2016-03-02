package com.rnh.Yummy.Blocks;


import com.rnh.Yummy.YummyItems;

import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class TallCornCrop extends Block {

    public TallCornCrop (int id) {
        super(id, 32, Material.plants);
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.5F, 1.0F);
        setTickRandomly(true);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool (World world, int x,  int y, int z) {
        return null;
    }

    @Override
    public int getRenderType () {
        return 6;
    }

    @Override
    public boolean isOpaqueCube () {
        return false;
    }

    /*  The texture differs, based on whether the plant is grown or not. 
     *  In the texture file, position 32 contains the ungrown corn while position 33 contains the grown position. 
     *  When your texture and metadata values correspond on a one-for-one value, it makes sense to order the textures by metadata value, 
     *  so that you can override getBlockTextureFromSideAndMetadata() to return the metadata 0 position plus metadata
     */
    @Override
    public int getBlockTextureFromSideAndMetadata (int side, int metadata) {
        return 32 + metadata;
    }

    @Override
    public void updateTick (World world, int x, int y, int z, Random random) {
        if (world.getBlockMetadata(x, y, z) == 1) {
            //fully grown
            //set above block to another corn block
        }

        if (random.nextInt(isFertile(world, x, y - 1, z) ? 12 : 25) != 0) {
            return;
        }
        world.setBlockMetadataWithNotify(x, y, z, 1);
    }

    @Override
    public void onNeighborBlockChange (World world, int x, int y, int z, int neighborId) {
        if (!canBlockStay(world, x, y, z)) {
            dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
            world.setBlockWithNotify(x, y, z, 0);
        }
    }

    @Override
    public boolean canBlockStay (World world, int x, int y, int z) {
        Block BelowBlock = blocksList[world.getBlockId(x, y - 1, z)]; //block beneath the plant
        return (world.getFullBlockLightValue(x, y, z) >= 8 || world.canBlockSeeTheSky(x, y, z)) && 
               (BelowBlock != null && BelowBlock.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, YummyItems.CornSeeds));
    }

    public ItemStack idDropped (int metadata, Random random, int par2) {
        switch (metadata) {
        case 0:
            return new ItemStack(YummyItems.CornSeeds,1);
        case 1:
            return new ItemStack(YummyItems.Corn,3);
        default:
            // Error case!
            return new ItemStack(Blocks.air);
        }
    }

    //when crop is picked before it's grown
    public ItemStack idPicked (World world, int x, int y, int z) {
        return new ItemStack(YummyItems.CornSeeds);
    }
