package com.rhn.YummyMod.Blocks;

import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

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
     */ so that you can override getBlockTextureFromSideAndMetadata() to return the metadata 0 position plus metadata
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
        Block soil = blocksList[world.getBlockId(x, y - 1, z)];
        return (world.getFullBlockLightValue(x, y, z) >= 8 || world .canBlockSeeTheSky(x, y, z)) && 
               (soil != null && soil.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, com.rhn.YummyMod.Items.CornSeed));
    }

    @Override
    public int idDropped (int metadata, Random random, int par2) {
        switch (metadata) {
        case 0:
            return com.rhn.YummyMod.Items.CornSeed.itemID;
        case 1:
            return com.rhn.YummyMod.Items.Corn.itemID;
        default:
            // Error case!
            return -1; // air
        }
    }

    //when crop is 
    @Override
    public int idPicked (World world, int x, int y, int z) {
        return com.rhn.YummyMod.Items.CornSeed.itemID;
    }
}
