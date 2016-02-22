package com.rnh.Yummy.Blocks;

import java.util.Random;

import com.rnh.Yummy.Yummy;
import com.rnh.Yummy.YummyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCake;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TransPrideCakeBlock extends BlockContainer {
	
	 @SideOnly(Side.CLIENT)
	    private IIcon top;
	    @SideOnly(Side.CLIENT)
	    private IIcon bottom;
	    @SideOnly(Side.CLIENT)
	    private IIcon inside;
	    private static final String __OBFID = "CL_00000211";

	public TransPrideCakeBlock(String string, Material material) {
		super(Material.cake);
		this.setBlockName("TransPrideCakeBlock");
        this.setTickRandomly(true);
        this.setStepSound(soundTypeCloth);
        this.setHardness(1);
        this.setBlockTextureName(Yummy.MODID + ":" + "TransPrideCake");
        }

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		// TODO Auto-generated method stub
		return null;
	}

    public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z)
    {
        int l = world.getBlockMetadata(x, y, z);
        float f = 0.0625F;
        float f1 = (float)(1 + l * 2) / 16.0F;
        float f2 = 0.5F;
        this.setBlockBounds(f1, 0.0F, f, 1.0F - f, f2, 1.0F - f);
    }

    public void setBlockBoundsForItemRender()
    {
        float f = 0.0625F;
        float f1 = 0.5F;
        this.setBlockBounds(f, 0.0F, f, 1.0F - f, f1, 1.0F - f);
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        int l = world.getBlockMetadata(x, y, z);
        float f = 0.0625F;
        float f1 = (float)(1 + l * 2) / 16.0F;
        float f2 = 0.5F;
        return AxisAlignedBB.getBoundingBox((double)((float)x + f1), (double)y, (double)((float)z + f), (double)((float)(x + 1) - f), (double)((float)y + f2 - f), (double)((float)(z + 1) - f));
    }


    @SideOnly(Side.CLIENT)
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z)
    {
        int l = world.getBlockMetadata(x, y, z);
        float f = 0.0625F;
        float f1 = (float)(1 + l * 2) / 16.0F;
        float f2 = 0.5F;
        return AxisAlignedBB.getBoundingBox((double)((float)x + f1), (double)y, (double)((float)z + f), (double)((float)(x + 1) - f), (double)((float)y + f2), (double)((float)(z + 1) - f));
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return side == 1 ? this.inside : (side == 0 ? this.bottom : (meta > 0 && side == 4 ? this.top : this.blockIcon));
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon)
    {
        this.blockIcon = icon.registerIcon(this.getTextureName() + "_side");
        this.inside = icon.registerIcon(this.getTextureName() + "_top");
        this.top = icon.registerIcon(this.getTextureName() + "_inner");
        this.bottom = icon.registerIcon(this.getTextureName() + "_bottom");
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        this.func_150036_b(world, x, y, z, player);
        return true;
    }

    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player)
    {
        this.func_150036_b(world, x, y, z, player);
    }

    private void func_150036_b(World world, int x, int y, int z, EntityPlayer player)
    {
        if (player.canEat(false))
        {
            player.getFoodStats().addStats(2, 0.1F);
            int l = world.getBlockMetadata(x, y, z) + 1;

            if (l >= 6)
            {
                world.setBlockToAir(x, y, z);
            }
            else
            {
                world.setBlockMetadataWithNotify(x, y, z, l, 2);
            }
        }
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z)
    {
        return !super.canPlaceBlockAt(world, x, y, z) ? false : this.canBlockStay(world, x, y, z);
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighbor)
    {
        if (!this.canBlockStay(world, x, y, z))
        {
            world.setBlockToAir(x, y, z);
        }
    }

    public boolean canBlockStay(World world, int x, int y, int z)
    {
        return world.getBlock(x, y - 1, z).getMaterial().isSolid();
    }

    public int quantityDropped(Random random)
    {
        return 0;
    }

    public Item getItemDropped(int x, Random random, int y)
    {
        return null;
    }
    
    @SideOnly(Side.CLIENT)
    public Item getitem(World world, int x, int y, int p_149z694_4_)
    {
        return YummyItems.TransPrideCake;
    }
}

