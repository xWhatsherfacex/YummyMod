package com.rnh.Yummy.Blocks;

import java.util.List;
import java.util.Random;

import com.rnh.Yummy.Yummy;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.util.ForgeDirection;

public class PalmLeaves extends BlockLeaves {
	
	Random random;
    public IIcon[] fastIcons;
    public IIcon[] fancyIcons;
    public static String[] textureNames = new String[] {"PalmLeaves"};

	public PalmLeaves(Material material) {
		super();
		this.setBlockTextureName(Yummy.MODID + ":" + "PalmLeaves");
		this.setBlockName("PalmLeaves");
	}
	@SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons (IIconRegister iconRegister)
    {
        this.fastIcons = new IIcon[textureNames.length];
        this.fancyIcons = new IIcon[textureNames.length];

        for (int i = 0; i < this.fastIcons.length; i++)
        {
            this.fastIcons[i] = iconRegister.registerIcon(Yummy.MODID + ":" + textureNames[i] + "_fast");
            this.fancyIcons[i] = iconRegister.registerIcon(Yummy.MODID + ":" + textureNames[i] + "_fancy");
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon (int side, int metadata)
    {
        if (field_150121_P)
        {
            if (metadata < 12)
            {
                return fancyIcons[metadata % 1];
            }
            else
            {
                return fancyIcons[metadata % 1 ];
            }
        }
        else
        {
            if (metadata < 12)
            {
                return fastIcons[metadata % 1];
            }
            else
            {
                return fastIcons[metadata % 1 ];
            }
        }
    }
	@Override
	public String[] func_150125_e() {
		// TODO Auto-generated method stub
		return null;
	}
}
