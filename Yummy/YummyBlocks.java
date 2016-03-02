package com.rnh.Yummy.Blocks;

import com.rnh.Yummy.Blocks.Churn;
import com.rnh.Yummy.Blocks.PepperoniPizzaBlock;
import com.rnh.Yummy.ItemBlocks.ItemTropicalSaplingBlocks;
import com.rnh.Yummy.ItemBlocks.ItemAppleSaplingBlocks;
import com.rnh.Yummy.ItemBlocks.ItemBlockYummyLogs;
import com.rnh.Yummy.ItemBlocks.ItemDeadBabySheepBlocks;
import com.rnh.Yummy.ItemBlocks.ItemDeadSheepBlocks;
import com.rnh.Yummy.ItemBlocks.ItemFruitSaplingBlocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class YummyBlocks {
	//Cake
	public static Block CarrotCakeBlock = new com.rnh.Yummy.Blocks.CarrotCakeBlock("CarrotCakeBlock", Material.cake);
	public static Block GoldenCarrotCakeBlock = new com.rnh.Yummy.Blocks.GoldenCarrotCakeBlock("GoldenCarrotCakeBlock", Material.cake);
	public static Block ChocolateCakeBlock = new com.rnh.Yummy.Blocks.ChocolateCakeBlock("ChocolateCakeBlock", Material.cake);
	public static Block RedVelvetCakeBlock = new com.rnh.Yummy.Blocks.RedVelvetCakeBlock("RedVelvetCakeBlock", Material.cake);
	public static Block MarbleCakeBlock = new com.rnh.Yummy.Blocks.MarbleCakeBlock("MarbleCakeBlock", Material.cake);
	public static Block PlainCakeBlock = new com.rnh.Yummy.Blocks.PlainCakeBlock("PlainCakeBlock", Material.cake);
	public static Block CreeperCakeBlock = new com.rnh.Yummy.Blocks.CreeperCakeBlock("CreeperCakeBlock", Material.cake);
	public static Block SkeletonCakeBlock;
	public static Block ZombieCakeBlock;
	public static Block EndermanCakeBlock;
	public static Block SteveCakeBlock;
	public static Block PigCakeBlock;
	public static Block CowCakeBlock;
	public static Block SheepCakeBlock;
	public static Block ChickenCakeBlock;
	public static Block WolfCakeBlock;
	public static Block OcelotCakeBlock;
	public static Block RainbowCakeBlock = new com.rnh.Yummy.Blocks.RainbowCakeBlock("RainbowCakeBlock", Material.cake);
	public static Block BiPrideCakeBlock = new com.rnh.Yummy.Blocks.BiPrideCakeBlock("BiPrideCakeBlock", Material.cake);
	public static Block AcePrideCakeBlock;
	public static Block TransPrideCakeBlock = new com.rnh.Yummy.Blocks.TransPrideCakeBlock("TransPrideCakeBlock", Material.cake);
	public static Block BlackForrestCakeBlock = new com.rnh.Yummy.Blocks.BlackForrestCakeBlock("BlackForrestCakeBlock", Material.cake);
	
	//Saplings
    public static Block AppleSapling = new com.rnh.Yummy.Blocks.AppleSapling();
    public static Block TropicalSapling = new com.rnh.Yummy.Blocks.TropicalSapling();
    public static Block FruitSapling = new com.rnh.Yummy.Blocks.FruitSapling();

	//Leaves
	public static Block AppleLeaves = new com.rnh.Yummy.Blocks.AppleLeaves().setCreativeTab(Yummy.tabYummy);
	public static Block GreenAppleLeaves = new com.rnh.Yummy.Blocks.GreenAppleLeaves().setCreativeTab(Yummy.tabYummy);
	public static Block PalmLeaves = new com.rnh.Yummy.Blocks.PalmLeaves(null).setCreativeTab(Yummy.tabYummy);
	public static Block YellowAppleLeaves = new com.rnh.Yummy.Blocks.YellowAppleLeaves().setCreativeTab(Yummy.tabYummy);
	public static Block GoldenAppleLeaves = new com.rnh.Yummy.Blocks.GoldenAppleLeaves().setCreativeTab(Yummy.tabYummy);
	public static Block CherryLeaves = new com.rnh.Yummy.Blocks.CherryLeaves().setCreativeTab(Yummy.tabYummy);
   
	//Logs
	public static Block YummyLogs = new com.rnh.Yummy.Blocks.YummyLogs().setBlockName("YummyLogs").setCreativeTab(Yummy.tabYummy);
	public static Block Churn = new com.rnh.Yummy.Blocks.Churn(Material.wood);
   
	//Fruit
	public static Block BananaBunch = new com.rnh.Yummy.Blocks.BananaBunch().setBlockName("BananaBunch");
    public static Block CoconutBlock = new com.rnh.Yummy.Blocks.Coconut().setBlockName("CoconutBlock");
    public static Block MangoBlock = new com.rnh.Yummy.Blocks.Mango().setBlockName("MangoBlock");
    public static Block PapayaBlock = new com.rnh.Yummy.Blocks.Papaya().setBlockName("PapayaBlock");
    //Plants
    public static Block CornStalk = new com.rnh.Yummy.Blocks.CornStalk().setBlockName("CornStalk");;		
   	public static Block StrawberryBush = new com.rnh.Yummy.Blocks.StrawberryBush().setBlockName("StrawberryBush");

    //Pie
    public static Block PumpkinPieBlock = new com.rnh.Yummy.Blocks.PumpkinPieBlock("PumpkinPieBlock", Material.cake);
	public static Block ApplePieBlock = new com.rnh.Yummy.Blocks.ApplePieBlock("ApplePieBlock", Material.cake);
	
	//Pizza
	public static Block CheesePizzaBlock = new com.rnh.Yummy.Blocks.CheesePizzaBlock(null, null);
	public static Block PepperoniPizzaBlock = new PepperoniPizzaBlock(null, null);
	public static Block SausagePizzaBlock = new com.rnh.Yummy.Blocks.SausagePizzaBlock(null, null);
    
    //Dead Block
	public static Block DeadSheepBlock = new com.rnh.Yummy.Blocks.DeadSheepBlock(null, null);
	public static Block DeadBabySheepBlock = new com.rnh.Yummy.Blocks.DeadBabySheepBlock(null, null);
	public static Block DeadCowBlock = new com.rnh.Yummy.Blocks.DeadCowBlock(null);
	public static Block DeadBabyCowBlock = new com.rnh.Yummy.Blocks.DeadBabyCowBlock(null);
    public static Block DeadBabyPigBlock = new com.rnh.Yummy.Blocks.DeadBabyPigBlock(null);
    public static Block DeadPigBlock = new com.rnh.Yummy.Blocks.DeadPigBlock(null);
    public static Block DeadChickenBlock = new com.rnh.Yummy.Blocks.DeadChickenBlock(null);
    public static Block DeadBabyChickenBlock = new com.rnh.Yummy.Blocks.DeadBabyChickenBlock(null);
	public static Block DeadSquidBlock = new com.rnh.Yummy.Blocks.DeadSquidBlock(null);

    public static void init(){
    	//Animals
		GameRegistry.registerBlock(DeadSheepBlock, ItemDeadSheepBlocks.class, DeadSheepBlock.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(DeadBabySheepBlock, ItemDeadBabySheepBlocks.class, DeadBabySheepBlock.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(DeadCowBlock, "DeadCowBlock");
    	GameRegistry.registerBlock(DeadBabyCowBlock, "DeadbabyCowBlock");
    	GameRegistry.registerBlock(DeadBabyPigBlock, "DeadBabyPigBlock");
    	GameRegistry.registerBlock(DeadPigBlock, "DeadPigBlock");
    	GameRegistry.registerBlock(DeadChickenBlock, "DeadChickenBlock");
    	GameRegistry.registerBlock(DeadBabyChickenBlock, "DeadBabyChickenBlock");
    	GameRegistry.registerBlock(DeadSquidBlock, "DeadSquidBlock");

		//Saplings
    	GameRegistry.registerBlock(AppleSapling, ItemAppleSaplingBlocks.class, AppleSapling.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(FruitSapling, ItemFruitSaplingBlocks.class, FruitSapling.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(TropicalSapling, ItemTropicalSaplingBlocks.class, TropicalSapling.getUnlocalizedName().substring(5));
	   
	    //Logs
	    GameRegistry.registerBlock(YummyLogs, ItemBlockYummyLogs.class, YummyLogs.getUnlocalizedName().substring(5));
	    GameRegistry.registerBlock(Churn, "Churn");
	
	    //Leaves
	    GameRegistry.registerBlock(AppleLeaves, "AppleLeaves");
	    GameRegistry.registerBlock(YellowAppleLeaves, "YellowAppleLeaves");
	    GameRegistry.registerBlock(GreenAppleLeaves, "GreenAppleLeaves");
	    GameRegistry.registerBlock(GoldenAppleLeaves, "GoldenAppleLeaves");
        GameRegistry.registerBlock(PalmLeaves, "PalmLeaves");
	    GameRegistry.registerBlock(CherryLeaves, "CherryLeaves");

	    //Plants
	    GameRegistry.registerBlock(StrawberryBush, "StrawberryBush");
	    GameRegistry.registerBlock(CornStalk, "CornStalk");

	    //Cake
	    GameRegistry.registerBlock(BananaBunch, "BananaBunch");
	    GameRegistry.registerBlock(CoconutBlock, "CoconutBlock");
	    GameRegistry.registerBlock(MangoBlock, "MangoBlock");
	    GameRegistry.registerBlock(PapayaBlock, "PapayaBlock");
	    GameRegistry.registerBlock(CarrotCakeBlock, "CarrotCakeBlock");
	    GameRegistry.registerBlock(GoldenCarrotCakeBlock, "GoldenCarrotCakeBlock");
	    GameRegistry.registerBlock(ChocolateCakeBlock, "ChocolateCakeBlock");
	    GameRegistry.registerBlock(RedVelvetCakeBlock, "RedVelvetCakeBlock");
	    GameRegistry.registerBlock(MarbleCakeBlock, "MarbleCakeBlock");
	    GameRegistry.registerBlock(ApplePieBlock,"ApplePieBlock");
	    GameRegistry.registerBlock(PumpkinPieBlock,"PumpkinPieBlock");
	    GameRegistry.registerBlock(PlainCakeBlock, "PlainCakeBlock");		
	    GameRegistry.registerBlock(CreeperCakeBlock, "CreeperCakeBlock");
	    GameRegistry.registerBlock(RainbowCakeBlock, "RainBowCakeBLock");
	    GameRegistry.registerBlock(BiPrideCakeBlock, "BiPrideCakeBlock");
	    GameRegistry.registerBlock(TransPrideCakeBlock, "TransPrideCakeBlock");
	    GameRegistry.registerBlock(BlackForrestCakeBlock, "BlackForrestCakeBlock");
	    GameRegistry.registerBlock(CheesePizzaBlock, "CheesePizzaBlock");
	    GameRegistry.registerBlock(PepperoniPizzaBlock, "PepperoniPizzaBlock");
	    GameRegistry.registerBlock(SausagePizzaBlock, "SausagePizzaBlock");
	}
}
