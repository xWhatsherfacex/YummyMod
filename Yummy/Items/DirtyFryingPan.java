package com.rnh.Yummy.Items;

import com.rnh.Yummy.Yummy;
import com.rnh.Yummy.YummyItems;

import ibxm.Player;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class DirtyFryingPan extends Item {
	public DirtyFryingPan(){
		setUnlocalizedName("DirtyFryingPan")
		.setCreativeTab(Yummy.tabYummy)
		.setMaxStackSize(1)
		.setTextureName(Yummy.MODID + ":" + "DirtyFryingPan");
		}
	

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
        MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(world, player, true);

        if (movingobjectposition == null)
        {
            return itemstack;
        }
        else
        {
            if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK)
            {
                int i = movingobjectposition.blockX;
                int j = movingobjectposition.blockY;
                int k = movingobjectposition.blockZ;

                if (!world.canMineBlock(player, i, j, k))
                {
                    return itemstack;
                }

                if (!player.canPlayerEdit(i, j, k, movingobjectposition.sideHit, itemstack))
                {
                    return itemstack;
                }

                if (world.getBlock(i, j, k).getMaterial() == Material.water)
                {
                    --itemstack.stackSize;

                    if (itemstack.stackSize <= 0)
                    {
                        return new ItemStack(YummyItems.fryingpan);
                    }

                    if (!player.inventory.addItemStackToInventory(new ItemStack(YummyItems.fryingpan)))
                    {
                        player.dropPlayerItemWithRandomChoice(new ItemStack(YummyItems.fryingpan), false);
                    }
                }
            }

            return itemstack;
        }
    }			
    	
}
