package com.rnh.Yummy.Blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.rnh.Yummy.Yummy;
import com.rnh.Yummy.YummyBlocks;
import com.rnh.Yummy.YummyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCocoa;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Direction;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;

public class Coconut extends BlockCocoa{

		@SideOnly(Side.CLIENT)
		
		public static final String[] Names = new String[] {"Coconut"};
		private IIcon[] Icons = new IIcon[Names.length];;


		public Coconut(){

		this.setTickRandomly(true);
		this.setCreativeTab(Yummy.tabYummy);
		}

		@SideOnly(Side.CLIENT)

		public IIcon getIcon(int side, int meta){
			if(meta < 7){
				if (meta == 6) {
					meta = 5;
				}
				return this.Icons[meta >> 1];
			}
			return this.Icons[3];
		}

		
		@Override
		public void updateTick(World world, int x, int y, int z, Random random)

		{

		if (!this.canBlockStay(world, x, y, z))

		{

		this.dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);

		world.setBlock(x, y, z, getBlockById(0), 0, 2);

		}

		else if (world.rand.nextInt(5) == 0)

		{

		int l = world.getBlockMetadata(x, y, z);

		int i1 = func_149987_c(l);

		if (i1 < 2)

		{

		++i1;

		world.setBlockMetadataWithNotify(x, y, z, i1 << 2 | getDirection(l), 2);

		}

		}

		}

		@SideOnly(Side.CLIENT)

		public IIcon getCocoaIcon(int meta)

		{

		if (meta < 0 || meta >= this.Icons.length)

		{

		meta = this.Icons.length - 1;

		}

		return this.Icons[meta];

		}

		/**

		* Can this block stay at this position. Similar to canPlaceBlockAt except gets checked often with plants.

		*/
		@Override
		public boolean canBlockStay(World world, int x, int y, int z)

		{

		if (world.getBlock(x , y + 1, z) == YummyBlocks.PalmLeaves){

		return true;}

		else if (world.getBlock(x , y - 1, z) == YummyBlocks.PalmLeaves){

		return true;}



		return false;

		}

		/**

		* The type of render function that is called for this block

		*/
		@Override
		public int getRenderType()

		{

		return 1;

		}

		/**

		* If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)

		*/
		@Override
		public boolean renderAsNormalBlock()

		{

		return false;

		}

		/**

		* Is this block (a) opaque and (b) a full 1m cube? This determines whether or not to render the shared face of two

		* adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.

		*/
		@Override
		public boolean isOpaqueCube()

		{

		return false;

		}

		/**

		* Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been

		* cleared to be reused)

		*/
		@Override
		public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)

		{

		this.setBlockBoundsBasedOnState(p_149668_1_, p_149668_2_, p_149668_3_, p_149668_4_);

		return super.getCollisionBoundingBoxFromPool(p_149668_1_, p_149668_2_, p_149668_3_, p_149668_4_);

		}

		/**

		* Updates the blocks bounds based on its current state. Args: world, x, y, z

		*/
		@Override
		public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_)

		{

		int l = p_149719_1_.getBlockMetadata(p_149719_2_, p_149719_3_, p_149719_4_);

		int i1 = getDirection(l);

		int j1 = func_149987_c(l);

		int k1 = 4 + j1 * 2;

		int l1 = 5 + j1 * 2;

		float f = (float)k1 / 2.0F;

		switch (i1)

		{

		case 0:

		this.setBlockBounds((8.0F - f) / 16.0F, (12.0F - (float)l1) / 16.0F, (15.0F - (float)k1) / 16.0F, (8.0F + f) / 16.0F, 0.75F, 0.9375F);

		break;

		case 1:

		this.setBlockBounds(0.0625F, (12.0F - (float)l1) / 16.0F, (8.0F - f) / 16.0F, (1.0F + (float)k1) / 16.0F, 0.75F, (8.0F + f) / 16.0F);

		break;

		case 2:

		this.setBlockBounds((8.0F - f) / 16.0F, (12.0F - (float)l1) / 16.0F, 0.0625F, (8.0F + f) / 16.0F, 0.75F, (1.0F + (float)k1) / 16.0F);

		break;

		case 3:

		this.setBlockBounds((15.0F - (float)k1) / 16.0F, (12.0F - (float)l1) / 16.0F, (8.0F - f) / 16.0F, 0.9375F, 0.75F, (8.0F + f) / 16.0F);

		}

		}

		/**

		* Called when the block is placed in the world.

		*/
		@Override
		public void onBlockPlacedBy(World p_149689_1_, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_)

		{

		int l = ((MathHelper.floor_double((double)(p_149689_5_.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) + 0) % 4;

		p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, l, 2);

		}

		/**

		* Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata

		*/
       @Override
		public int onBlockPlaced(World p_149660_1_, int p_149660_2_, int p_149660_3_, int p_149660_4_, int p_149660_5_, float p_149660_6_, float p_149660_7_, float p_149660_8_, int p_149660_9_)

		{

		if (p_149660_5_ == 1 || p_149660_5_ == 0)

		{

		p_149660_5_ = 2;

		}

		return Direction.rotateOpposite[Direction.facingToDirection[p_149660_5_]];

		}

		/**

		* Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are

		* their own) Args: x, y, z, neighbor Block

		*/

		public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)

		{

		if (!this.canBlockStay(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_))

		{

		this.dropBlockAsItem(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_, p_149695_1_.getBlockMetadata(p_149695_2_, p_149695_3_, p_149695_4_), 0);

		p_149695_1_.setBlock(p_149695_2_, p_149695_3_, p_149695_4_, getBlockById(0), 0, 2);

		}

		}

		/**

		* Returns the bounding box of the wired rectangular prism to render.

		*/

		@SideOnly(Side.CLIENT)

		public AxisAlignedBB getSelectedBoundingBoxFromPool(World p_149633_1_, int p_149633_2_, int p_149633_3_, int p_149633_4_)

		{

		this.setBlockBoundsBasedOnState(p_149633_1_, p_149633_2_, p_149633_3_, p_149633_4_);

		return super.getSelectedBoundingBoxFromPool(p_149633_1_, p_149633_2_, p_149633_3_, p_149633_4_);

		}

		public static int func_149987_c(int p_149987_0_)

		{

		return (p_149987_0_ & 12) >> 2;

		}

		/**

		* Drops the block items with a specified chance of dropping the specified items

		*/

		public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_)

		{

		super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, p_149690_7_);

		}

		@Override

		public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int p_149690_5_, int fortune)

		{

		ArrayList<ItemStack> dropped = super.getDrops(world, x, y, z, p_149690_5_, fortune);

		int j1 = func_149987_c(p_149690_5_);

		byte b0 = 1;

		if (j1 >= 2)

		{

		b0 = 3;

		}

		for (int k1 = 0; k1 < b0; ++k1)

		{

		dropped.add(new ItemStack(YummyItems.Banana));

		}

		return dropped;

		}

		/**

		* Gets an item for the block being called on. Args: world, x, y, z

		*/

		@SideOnly(Side.CLIENT)

		public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)

		{

		return YummyItems.Banana;

		}

		/**

		* Get the block's damage value (for use with pick block).

		*/

		public int getDamageValue(World p_149643_1_, int p_149643_2_, int p_149643_3_, int p_149643_4_)

		{

		return 3;

		}

		@SideOnly(Side.CLIENT)

		public void registerBlockIcons(IIconRegister icon)

		{
			this.Icons = new IIcon[4];
		
		for(int i = 0; i< this.Icons.length; i++){
			this.Icons[i] = icon.registerIcon(Yummy.MODID + ":" + this.getUnlocalizedName().substring(5) + (i + 1));
		}
	}

		
		
		
		
		
		
		public boolean func_149851_a(World world, int x, int y, int z, boolean p_149851_5_)

		{

		int l = world.getBlockMetadata(x, y, z);

		int i1 = func_149987_c(l);

		return i1 < 2;

		}


		public boolean func_149852_a(World p_149852_1_, Random p_149852_2_, int p_149852_3_, int p_149852_4_, int p_149852_5_)

		{

		return true;

		}


		public void func_149853_b(World p_149853_1_, Random p_149853_2_, int p_149853_3_, int p_149853_4_, int p_149853_5_)

		{

		int l = p_149853_1_.getBlockMetadata(p_149853_3_, p_149853_4_, p_149853_5_);

		int i1 = BlockDirectional.getDirection(l);

		int j1 = func_149987_c(l);

		++j1;

		p_149853_1_.setBlockMetadataWithNotify(p_149853_3_, p_149853_4_, p_149853_5_, j1 << 2 | i1, 2);

		}


		@Override

		public Item getItemDropped(int par1, Random par2Random, int par3)

		{

		return null;

		}

		
		/* Left-click harvests berries */
	    @Override
	    public void onBlockClicked (World world, int x, int y, int z, EntityPlayer player)
	    {
	        if (!world.isRemote)
	        {
	            int meta = world.getBlockMetadata(x, y, z);
	            if (meta >= 7)
	            {
	                world.setBlock(x, y, z, this, meta - 4, 3);
	                EntityItem entityitem = new EntityItem(world, player.posX, player.posY - 1.0D, player.posZ, new ItemStack(YummyItems.Coconut, 1));
	                world.spawnEntityInWorld(entityitem);
	                if (!(player instanceof FakePlayer))
	                    entityitem.onCollideWithPlayer(player);
	            }
	        }
	    }

	    /* Right-click harvests berries */
	    @Override
	    public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
	    {
	        /*if (world.isRemote)
	        	return false;*/

	        int meta = world.getBlockMetadata(x, y, z);
	        if (meta >= 7)
	        {
	            if (world.isRemote)
	                return true;

	            world.setBlock(x, y, z, this, meta - 4, 3);
	            EntityItem entityitem = new EntityItem(world, player.posX, player.posY - 1.0D, player.posZ, new ItemStack(YummyItems.Coconut, 1));
	            world.spawnEntityInWorld(entityitem);
	            if (!(player instanceof FakePlayer))
	                entityitem.onCollideWithPlayer(player);
	            return true;
	        }
	        return false;
	    }		
		
}


