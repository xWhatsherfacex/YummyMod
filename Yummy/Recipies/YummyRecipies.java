package com.rnh.Yummy.Recipies;

import java.util.Iterator;

import com.rnh.Yummy.YummyBlocks;
import com.rnh.Yummy.YummyItems;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;


public class YummyRecipies {
	
	public static void init() {
		
		//Smelting
		GameRegistry.addSmelting(new ItemStack(Items.dye,1,3), new ItemStack(YummyItems.RoastedCocoaBeans), .10F);
		GameRegistry.addSmelting(YummyItems.BreadDough, new ItemStack(Items.bread), .10F);
		
		//BakedCakes
		GameRegistry.addSmelting(YummyItems.FilledCakePan, new ItemStack(YummyItems.CarrotCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,1), new ItemStack(YummyItems.GoldenCarrotCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,2), new ItemStack(YummyItems.ChocolateCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,3), new ItemStack(YummyItems.PlainCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,4), new ItemStack(YummyItems.MarbleCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,5), new ItemStack(YummyItems.RedVelvetCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,6), new ItemStack(YummyItems.RainbowCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,7), new ItemStack(YummyItems.BlackCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,8), new ItemStack(YummyItems.RedCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,9), new ItemStack(YummyItems.GreenCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,10), new ItemStack(YummyItems.BrownCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,11), new ItemStack(YummyItems.BlueCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,12), new ItemStack(YummyItems.PurpleCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,13), new ItemStack(YummyItems.CyanCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,14), new ItemStack(YummyItems.SilverCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,15), new ItemStack(YummyItems.GrayCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,16), new ItemStack(YummyItems.PinkCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,17), new ItemStack(YummyItems.LimeCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,18), new ItemStack(YummyItems.YellowCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,19), new ItemStack(YummyItems.LightBlueCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,20), new ItemStack(YummyItems.MagentaCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,21), new ItemStack(YummyItems.OrangeCakePanBaked), .10F);
		GameRegistry.addSmelting( new ItemStack(YummyItems.FilledCakePan,1,22), new ItemStack(YummyItems.WhiteCakePanBaked), .10F);
		
		//Cheese Grater
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.gratedcarrot,1), new ItemStack(YummyItems.cheesegrater.setContainerItem(YummyItems.dirtycheesegrater)), Items.carrot);
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.gratedGoldenCarrot,1), new ItemStack(YummyItems.cheesegrater.setContainerItem(YummyItems.dirtycheesegrater)), Items.golden_carrot);
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.MilkChocolateShavings,1), new ItemStack(YummyItems.cheesegrater.setContainerItem(YummyItems.dirtycheesegrater)), YummyItems.milkchocolatebar);
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.ShreddedCheese,1), new ItemStack(YummyItems.cheesegrater.setContainerItem(YummyItems.dirtycheesegrater)), YummyItems.Cheese);

		//SlicedFruit
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.AppleSlice, 5), new Object[] {Items.apple});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.YellowAppleSlice, 5), new Object[] {YummyItems.YellowApple});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.GreenAppleSlice, 5), new Object[] {YummyItems.GreenApple});
		
		
		//Seeds
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.StrawberrySeeds, 1), new Object[] {YummyItems.Strawberry});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.AppleSeeds, 1), new Object[] {YummyItems.AppleCore});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.YellowAppleSeeds, 1), new Object[] {YummyItems.YellowAppleCore});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.GreenAppleSeeds, 1), new Object[] {YummyItems.GreenAppleCore});
		
		
		//Saplings
		GameRegistry.addShapelessRecipe(new ItemStack(YummyBlocks.AppleSapling,1,0), new Object[] {YummyItems.AppleSeeds ,Blocks.sapling});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyBlocks.AppleSapling,1,1), new Object[] {YummyItems.YellowAppleSeeds,Blocks.sapling});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyBlocks.AppleSapling,1,2), new Object[] {YummyItems.GreenAppleSeeds,Blocks.sapling});

		
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.cinnamon), new Object[] {YummyItems.cinnamonstick});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.cinnamonsugar), new Object[] {YummyItems.cinnamon ,Items.sugar});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.sunflowerseeds), new Object[] {new ItemStack(Blocks.double_plant, 1, 0)});
				
		//dyes
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 11), new Object[] {new ItemStack(Blocks.yellow_flower, 1, 0)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 1), new Object[] {new ItemStack(Blocks.red_flower, 1, 0)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 3, 15), new Object[] {Items.bone});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 9), new Object[] {new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 15)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 14), new Object[] {new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 11)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 10), new Object[] {new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 15)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 8), new Object[] {new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 15)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 7), new Object[] {new ItemStack(Items.dye, 1, 8), new ItemStack(Items.dye, 1, 15)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 3, 7), new Object[] {new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 15), new ItemStack(Items.dye, 1, 15)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 12), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 15)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 6), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 2)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 5), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 1)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 13), new Object[] {new ItemStack(Items.dye, 1, 5), new ItemStack(Items.dye, 1, 9)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 3, 13), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 9)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 4, 13), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 15)});
        	GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 12), new Object[] {new ItemStack(Blocks.red_flower, 1, 1)});
        	GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 13), new Object[] {new ItemStack(Blocks.red_flower, 1, 2)});
        	GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 7), new Object[] {new ItemStack(Blocks.red_flower, 1, 3)});
        	GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 1), new Object[] {new ItemStack(Blocks.red_flower, 1, 4)});
        	GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 14), new Object[] {new ItemStack(Blocks.red_flower, 1, 5)});
        	GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 7), new Object[] {new ItemStack(Blocks.red_flower, 1, 6)});
        	GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 9), new Object[] {new ItemStack(Blocks.red_flower, 1, 7)});
        	GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 7), new Object[] {new ItemStack(Blocks.red_flower, 1, 8)});
        	GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 11), new Object[] {new ItemStack(Blocks.double_plant, 1, 0)});
        	GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 13), new Object[] {new ItemStack(Blocks.double_plant, 1, 1)});
        	GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 9), new Object[] {new ItemStack(Blocks.double_plant, 1, 5)});
        		
        	
		//Apple Stuff
		GameRegistry.addShapedRecipe(new ItemStack(YummyItems.CaramelApple),
				" A ", " B ", " C ",  'A',YummyItems.caramel, 'B',Items.apple, 'C',Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(YummyItems.CaramelApple),
				" A ", " B ", " C ",  'A',YummyItems.caramel, 'B',YummyItems.YellowApple, 'C',Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(YummyItems.CaramelApple),
				" A ", " B ", " C ",  'A',YummyItems.caramel, 'B',YummyItems.GreenApple, 'C',Items.stick);
	
		
		
		//CakeBatter
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,0), new Object[]{YummyItems.gratedcarrot, new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,1), new Object[]{YummyItems.gratedGoldenCarrot, new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,2), new Object[]{YummyItems.CocoaPowder, new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapedRecipe(new ItemStack(YummyItems.CakeBatter, 1,3),
				" A ","BCD","EFG",'A', YummyItems.whisk.setContainerItem(YummyItems.dirtywhisk),'B', YummyItems.butter,'C', Items.sugar,'D', Items.egg,'E', YummyItems.flour,'F', Items.milk_bucket.setContainerItem(Items.bucket),'G', YummyItems.mixingbowl);
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,2,4), new Object[]{new ItemStack(YummyItems.CakeBatter,1,2), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,5), new Object[]{YummyItems.CocoaPowder, new ItemStack(Items.dye,1,1), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,6), new Object[]{new ItemStack(Items.dye,1,1), new ItemStack(Items.dye,1,14), new ItemStack(Items.dye,1,2),new ItemStack(Items.dye,1,11),new ItemStack(Items.dye,1,4),new ItemStack(Items.dye,1,5), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,7), new Object[]{new ItemStack(Items.dye,1,0), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,8), new Object[]{new ItemStack(Items.dye,1,1), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,9), new Object[]{new ItemStack(Items.dye,1,2), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,10), new Object[]{new ItemStack(Items.dye,1,3), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,11), new Object[]{new ItemStack(Items.dye,1,4), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,12), new Object[]{new ItemStack(Items.dye,1,5), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,13), new Object[]{new ItemStack(Items.dye,1,6), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,14), new Object[]{new ItemStack(Items.dye,1,7), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,15), new Object[]{new ItemStack(Items.dye,1,8), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,16), new Object[]{new ItemStack(Items.dye,1,9), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,17), new Object[]{new ItemStack(Items.dye,1,10), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,18), new Object[]{new ItemStack(Items.dye,1,11), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,19), new Object[]{new ItemStack(Items.dye,1,12), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,20), new Object[]{new ItemStack(Items.dye,1,13), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,21), new Object[]{new ItemStack(Items.dye,1,14), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CakeBatter,1,22), new Object[]{new ItemStack(Items.dye,1,15), new ItemStack(YummyItems.CakeBatter,1,3)});

		//cakepanfilled
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,0), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,0)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,1), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,1)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,2), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,2)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,3), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,3)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,4), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,4)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,5), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,5)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,6), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,6)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,7), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,7)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,8), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,8)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,9), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,9)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,10), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,10)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,11), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,11)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,12), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,12)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,13), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,13)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,14), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,14)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,15), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,15)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,16), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,16)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,17), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,17)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,18), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,18)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,19), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,19)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,20), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,20)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,21), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,21)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.FilledCakePan,1,22), new Object[]{YummyItems.cakepan.setContainerItem(YummyItems.dirtymixingbowl), new ItemStack(YummyItems.CakeBatter,1,22)});

		
		GameRegistry.addShapedRecipe(new ItemStack(YummyItems.CarrotCake),
				"A","B","B", 'A', YummyItems.creamcheesefrosting, 'B', new ItemStack(YummyItems.CakeSheet));
		GameRegistry.addShapedRecipe(new ItemStack(YummyItems.GoldenCarrotCake),
				"A","B","B", 'A', YummyItems.creamcheesefrosting, 'B', new ItemStack(YummyItems.CakeSheet,1,1));
		GameRegistry.addShapedRecipe(new ItemStack(YummyItems.ChocolateCake),
				"A","B","B", 'A', YummyItems.milkchocolatefrosting, 'B', new ItemStack(YummyItems.CakeSheet,1,2));
		GameRegistry.addShapedRecipe(new ItemStack(YummyItems.PlainCake),
				"A","B","B", 'A', new ItemStack(YummyItems.plainfrostingbag,1,22), 'B', new ItemStack(YummyItems.CakeSheet,1,3));
		GameRegistry.addShapedRecipe(new ItemStack(YummyItems.BlackForrestCake),
				"ABC","D","D", 'A', new ItemStack(YummyItems.Cherry), 'B',new ItemStack(YummyItems.plainfrostingbag,1,22),'C', new ItemStack(YummyItems.MilkChocolateShavings), 'D', new ItemStack(YummyItems.CakeSheet,1,2));
		GameRegistry.addShapedRecipe(new ItemStack(YummyItems.RainbowCake),
				"A","B","B", 'A', new ItemStack(YummyItems.plainfrostingbag,1,22), 'B', new ItemStack(YummyItems.CakeSheet,1,6));
		
		//Masher
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.mashedpotato), new Object[] { Items.baked_potato, YummyItems.masher.setContainerItem(YummyItems.dirtymasher),YummyItems.butter});
		GameRegistry.addShapedRecipe(new ItemStack(YummyItems.AppleSauce),
				" A ", "BCD", " E ", 'A',YummyItems.masher.setContainerItem(YummyItems.masher), 'B',Items.sugar, 'C',YummyItems.YellowAppleSlice, 'D', YummyItems.cinnamon, 'E', YummyItems.masonjar);
		
		//CandyBarMold
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.DarkChocolateBarMold), new Object []{YummyItems.DarkChocolateBucket, YummyItems.candybarmold.setContainerItem(Items.bucket)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.MilkChocolateBarMold), new Object []{YummyItems.MilkChocolateBucket, YummyItems.candybarmold.setContainerItem(Items.bucket)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.WhiteChocolateBarMold), new Object []{YummyItems.WhiteChocolateBucket, YummyItems.candybarmold.setContainerItem(Items.bucket)});
		
		//MorterAndPestle
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CocoaLiquor), new Object[]{YummyItems.CocoaNibs, Items.glass_bottle, YummyItems.MorterAndPestle.setContainerItem(YummyItems.DirtyMorterAndPestle)});
	
		//NutCracker
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CocoaNibs), new Object[]{YummyItems.RoastedCocoaBeans, YummyItems.NutCracker.setContainerItem(YummyItems.NutCracker)});

		//Strainer
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.CocoaButter), new Object[]{YummyItems.CocoaLiquor.setContainerItem(Items.glass_bottle), YummyItems.Strainer.setContainerItem(YummyItems.Strainer), Items.bowl});

		//Bread
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.BreadDough), new Object[]{Items.potionitem.setContainerItem(Items.glass_bottle),Items.sugar,YummyItems.flour,YummyItems.Yeast,YummyItems.salt});

		
		//Chocolate
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.MilkChocolateBucket), new Object[]{Items.sugar, YummyItems.MilkBottle.setContainerItem(Items.glass_bottle), YummyItems.CocoaLiquor.setContainerItem(Items.glass_bottle), YummyItems.CocoaButter.setContainerItem(Items.bowl)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.DarkChocolateBucket), new Object[]{Items.sugar, Items.bucket, YummyItems.CocoaLiquor.setContainerItem(Items.glass_bottle), YummyItems.CocoaButter.setContainerItem(Items.bowl)});
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.DarkChocolateBucket), new Object[]{Items.sugar, Items.bucket, YummyItems.CocoaButter.setContainerItem(Items.bowl)});

		//Milk
		GameRegistry.addShapelessRecipe(new ItemStack(YummyItems.MilkBottle,3), new Object[]{Items.glass_bottle, Items.glass_bottle, Items.glass_bottle, Items.milk_bucket});
	}

}
