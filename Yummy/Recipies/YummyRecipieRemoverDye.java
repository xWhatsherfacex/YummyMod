package com.rnh.Yummy.Recipies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

public class YummyRecipieRemoverDye {
	
	
	public static void init(){
	
	List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
	
	Iterator<IRecipe> Leash = recipes.iterator();{
        
		while (Leash.hasNext()) {
			ItemStack is = Leash.next().getRecipeOutput();
			if (is != null && is.getItem() == Items.dye)
				Leash.remove();
			};
		}
	}
}


