package com.rnh.Yummy.Blocks;

import java.util.List;

import com.rnh.Yummy.Yummy;
import com.rnh.Yummy.TileEntity.TileEntityChurn;
import com.rnh.Yummy.TileEntity.TileEntityDeadSheep;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class DeadSheepBlock extends Block {
	
	public static String[] names = new String[] {"white", "orange", "magenta", "lightblue", "yellow", "lime", "pink", "gray", "silver", "cyan", "purple", "blue", "brown", "green", "red", "black"};
	public static String[] color = new String[] {"white", "orange", "magenta", "lightblue", "yellow", "lime", "pink", "gray", "silver", "cyan", "purple", "blue", "brown", "green", "red", "black"};
	  @SideOnly(Side.CLIENT)
	    private IIcon[] icons;
	  
	  public DeadSheepBlock(String unlocalizedName, Material material) {
		  super(material.cloth);
		  this.setBlockName("DeadSheep");
		  this.setCreativeTab(Yummy.tabYummy); 
		  this.setHarvestLevel("sword", 0);
	  }

	  public IIcon getIcon(int side, int meta) {
		  if (meta > 15)
			  meta = 0;
		  return this.icons[meta];

}

@SideOnly(Side.CLIENT)
public void registerBlockIcons (IIconRegister iconRegister)
{
    this.icons = new IIcon[names.length];

    for (int i = 0; i < this.icons.length; ++i)
    {
        this.icons[i] = iconRegister.registerIcon("Yummy:" + "deadsheep" + names[i]);
    }
}

public int damageDropped(int meta) {
return meta;
}

public void getSubBlocks(Item item, CreativeTabs tab, List list) {
for (int i = 0; i < 16; i ++) {
list.add(new ItemStack(item, 1, i));
}
} 
}
