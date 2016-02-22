package com.rnh.Yummy.Blocks;

import java.util.Random;

import com.rnh.Yummy.Yummy;
import com.rnh.Yummy.YummyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;

public class CornStalk extends BlockCrops{

	@SideOnly(Side.CLIENT)
	private IIcon[] iconArray;
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconregister){
		this.iconArray = new IIcon[4];
		
		for(int i = 0; i< this.iconArray.length; i++){
			this.iconArray[i] = iconregister.registerIcon(Yummy.MODID + ":" + this.getUnlocalizedName().substring(5) + (i + 1));
		}
	}
	
	
	
	public IIcon getIcon(int side, int meta){
		if(meta < 7){
			if (meta == 6) {
				meta = 5;
			}
			return this.iconArray[meta >> 1];
		}
		return this.iconArray[3];
	}
	
	public int quantityDropped (Random random){
		return 1;
	}
	
	protected Item func_149866_i(){
		return YummyItems.CornSeeds;
	}
	
	protected Item func_149865_P(){
		return null;
	}
	@Override
    public void onBlockClicked (World world, int x, int y, int z, EntityPlayer player)
    {
        if (!world.isRemote)
        {
            int meta = world.getBlockMetadata(x, y, z);
            if (meta >= 7)
            {
                world.setBlock(x, y, z, this, meta - 4, 3);
                EntityItem entityitem = new EntityItem(world, player.posX, player.posY - 1.0D, player.posZ, new ItemStack(YummyItems.Corn,5));
                world.spawnEntityInWorld(entityitem);
                if (!(player instanceof FakePlayer))
                    entityitem.onCollideWithPlayer(player);
            }
        }
    }
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
	            EntityItem entityitem = new EntityItem(world, player.posX, player.posY - 1.0D, player.posZ, new ItemStack(YummyItems.Corn,5));
	            world.spawnEntityInWorld(entityitem);
	            if (!(player instanceof FakePlayer))
	                entityitem.onCollideWithPlayer(player);
	            return true;
	        }
	        return false;
	    }
}