package com.rnh.Yummy.CreativeTabs;


import com.rnh.Yummy.YummyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsYummy extends CreativeTabs {
	
	public CreativeTabsYummy(String tabLabel)
	{
	super(tabLabel);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
	return YummyItems.flour;
	}
	
}
	

