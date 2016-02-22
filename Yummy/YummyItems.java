package com.rnh.Yummy;

import java.lang.ref.Reference;

import com.rnh.Yummy.Items.DarkChocolateBarMold;
import com.rnh.Yummy.Items.DirtyCandyBarMold;
import com.rnh.Yummy.Items.DirtyCheeseGrater;
import com.rnh.Yummy.Items.DirtyCookieSheet;
import com.rnh.Yummy.Items.DirtyCupcakePan;
import com.rnh.Yummy.Items.DirtyFryingPan;
import com.rnh.Yummy.Items.DirtyMasher;
import com.rnh.Yummy.Items.DirtyMasonJar;
import com.rnh.Yummy.Items.DirtyPieTin;
import com.rnh.Yummy.Items.DirtyPizzaPan;
import com.rnh.Yummy.Items.MilkChocolateBarMold;
import com.rnh.Yummy.Items.PlainFrostingBag;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.main.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class YummyItems {
	
	//Cake
	public static Item CakeBatter = new com.rnh.Yummy.Items.CakeBatter();
	public static Item FilledCakePan = new com.rnh.Yummy.Items.FilledCakePan();
	public static Item CakeSheet = new com.rnh.Yummy.Items.CakeSheet();
	public static Item CarrotCake = new com.rnh.Yummy.Items.CarrotCake();
	public static Item CarrotCakePanBaked = new com.rnh.Yummy.Items.CarrotCakePanBaked();
	public static Item GoldenCarrotCake = new com.rnh.Yummy.Items.GoldenCarrotCake();
	public static Item GoldenCarrotCakePanBaked = new com.rnh.Yummy.Items.GoldenCarrotCakePanBaked();
	public static Item ChocolateCake = new com.rnh.Yummy.Items.ChocolateCake();
	public static Item ChocolateCakePanBaked = new com.rnh.Yummy.Items.ChocolateCakePanBaked();
	public static Item RedVelvetCake = new com.rnh.Yummy.Items.RedVelvetCake();
	public static Item RedVelvetCakePanBaked = new com.rnh.Yummy.Items.RedVelvetCakePanBaked();
	public static Item MarbleCake = new com.rnh.Yummy.Items.MarbleCake();
	public static Item MarbleCakePanBaked = new com.rnh.Yummy.Items.MarbleCakePanBaked();
	public static Item PlainCake = new com.rnh.Yummy.Items.PlainCake();
	public static Item PlainCakePanBaked = new com.rnh.Yummy.Items.PlainCakePanBaked();
	public static Item RedCakePanBaked = new com.rnh.Yummy.Items.RedCakePanBaked();
	public static Item OrangeCakePanBaked = new com.rnh.Yummy.Items.OrangeCakePanBaked();
	public static Item YellowCakePanBaked = new com.rnh.Yummy.Items.YellowCakePanBaked();
	public static Item LimeCakePanBaked = new com.rnh.Yummy.Items.LimeCakePanBaked();
	public static Item GreenCakePanBaked = new com.rnh.Yummy.Items.GreenCakePanBaked();
	public static Item LightBlueCakePanBaked = new com.rnh.Yummy.Items.LightBlueCakePanBaked();
	public static Item BlueCakePanBaked = new com.rnh.Yummy.Items.BlueCakePanBaked();
	public static Item CyanCakePanBaked = new com.rnh.Yummy.Items.CyanCakePanBaked();
	public static Item PurpleCakePanBaked = new com.rnh.Yummy.Items.PurpleCakePanBaked();
	public static Item MagentaCakePanBaked = new com.rnh.Yummy.Items.MagentaCakePanBaked();
	public static Item PinkCakePanBaked = new com.rnh.Yummy.Items.PinkCakePanBaked();
	public static Item BrownCakePanBaked = new com.rnh.Yummy.Items.BrownCakePanBaked();
	public static Item SilverCakePanBaked = new com.rnh.Yummy.Items.SilverCakePanBaked();
	public static Item GrayCakePanBaked = new com.rnh.Yummy.Items.GrayCakePanBaked();
	public static Item WhiteCakePanBaked = new com.rnh.Yummy.Items.WhiteCakePanBaked();
	public static Item BlackCakePanBaked = new com.rnh.Yummy.Items.BlackCakePanBaked();
	public static Item CreeperCake = new com.rnh.Yummy.Items.CreeperCake();
	public static Item RainbowCake = new com.rnh.Yummy.Items.RainbowCake();
	public static Item RainbowCakePanBaked = new com.rnh.Yummy.Items.RainbowCakePanBaked();
	public static Item BiPrideCake = new com.rnh.Yummy.Items.BiPrideCake();
	public static Item TransPrideCake = new com.rnh.Yummy.Items.TransPrideCake();
	public static Item BlackForrestCake = new com.rnh.Yummy.Items.BlackForrestCake();
	
	//Pie
	public static Item PieTinfilled;
	public static Item ApplePieUncooked;
	public static Item ApplePieCooked;
	public static Item ApplePie = new com.rnh.Yummy.Items.ApplePie();
	public static Item PumpkinPieUncooked;
	public static Item PumpkinPieCooked;
	public static Item PumpkinPie = new com.rnh.Yummy.Items.PumpkinPie();
	
	//Dairy
	public static Item butter = new Item()
			.setUnlocalizedName("Butter")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "butter");
    public static Item buttermilk = new Item()
			.setUnlocalizedName("buttermilk")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "buttermilk");
	public static Item MilkBottle = new com.rnh.Yummy.Items.MilkBottle();
	public static Item creamcheese = new Item()
			.setUnlocalizedName("creamcheese")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "creamcheese");
	public static Item Cheese = new ItemFood(4, .3F, false)
			.setUnlocalizedName("Cheese")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Cheese");
	public static Item ShreddedCheese = new ItemFood(4, .3F, false)
			.setUnlocalizedName("ShreddedCheese")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "ShreddedCheese");
	
	//Baking
	public static Item powderedsugar= new Item()
			.setUnlocalizedName("powderedsugar")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "powderedsugar");
	public static Item flour = new Item()
			.setUnlocalizedName("Flour")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "flour");
	public static Item Yeast = new ItemFood(4, .3F, false)
			.setUnlocalizedName("Yeast")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Yeast");
	public static Item vinegar = new Item()
			.setUnlocalizedName("vinegar")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "vinegar");

	//Sweets
	public static Item caramel = new ItemFood(4, .3F, false)
			.setUnlocalizedName("Caramel")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "caramel");
	
	//Spices
	public static Item cinnamonstick = new Item()
			.setUnlocalizedName("CinnamonStick")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "cinnamonstick");
	public static Item cinnamon = new Item()
			.setUnlocalizedName("Cinnamon")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "cinnamon");
	public static Item vanillabean= new Item()
			.setUnlocalizedName("vanillabean")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "vanillabean");
	public static Item cinnamonsugar = new Item()
			.setUnlocalizedName("Cinnamonsugar")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "cinnamonsugar");
	public static Item salt = new Item()
			.setUnlocalizedName("salt")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "salt");

	//Carrot
	public static Item gratedcarrot = new Item()
			.setUnlocalizedName("gratedcarrot")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "gratedcarrot");
	
	//Cherry
	public static Item Cherry = new ItemFood(4, .3F, false)
			.setUnlocalizedName("Cherry")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Cherry");
	
	//Potato
	public static Item mashedpotato = new ItemFood(4, .3F, false)
			.setUnlocalizedName("mashedpotato")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "mashedpotato");

	//Dough
	public static Item BreadDough = new ItemFood(4, .3F, false)
			.setUnlocalizedName("BreadDough")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "BreadDough");
	public static Item PieDough;
	public static Item PizzaDough;


	//Berries
	public static Item Strawberry = new ItemFood(4, .3F, false)
			.setUnlocalizedName("Strawberry")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Strawberry");
	
	//Fruit
	public static Item Pineapple = new ItemFood(4, .3F, false)
			.setUnlocalizedName("Pineapple")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Pineapple");
	public static Item Banana = new ItemFood(4, .3F, false)
			.setUnlocalizedName("Banana")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Banana");
	public static Item Coconut = new ItemFood(4, .3F, false)
			.setUnlocalizedName("Coconut")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Coconut");
	public static Item Papaya = new ItemFood(4, .3F, false)
			.setUnlocalizedName("Papaya")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Papaya");
	public static Item Mango = new ItemFood(4, .3F, false)
			.setUnlocalizedName("Mango")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Mango");
	
	//Chocolate
	public static Item MilkChocolateBucket = new Item()
			.setUnlocalizedName("MilkChocolateBucket")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "MilkChocolateBucket");
	public static Item MilkChocolateChunk= new ItemFood(4, .3F, false)
			.setUnlocalizedName("MilkChocolateChunk")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "MilkChocolateChunk");
	public static Item MilkChocolateBits= new ItemFood(4, .3F, false)
			.setUnlocalizedName("MilkChocolateBits")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "MilkChocolateBits");
	public static Item milkchocolatebar= new ItemFood(4, .3F, false)
			.setUnlocalizedName("milkchocolatebar")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "milkchocolatebar");
	public static Item MilkChocolateBarMold = new MilkChocolateBarMold();
	public static Item MilkChocolateShavings = new ItemFood(4, .3F, false)
			.setUnlocalizedName("MilkChocolateShavings")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "MilkChocolateShavings");
	public static Item DarkChocolateBucket = new Item()
			.setUnlocalizedName("DarkChocolateBucket")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "DarkChocolateBucket");
	public static Item DarkChocolateChunk= new ItemFood(4, .3F, false)
			.setUnlocalizedName("DarkChocolateChunk")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "DarkChocolateChunk");
	public static Item DarkChocolateBits = new ItemFood(4, .3F, false)
	.setUnlocalizedName("DarkChocolateBits")
	.setCreativeTab(Yummy.tabYummy)
	.setTextureName(Yummy.MODID + ":" + "DarkChocolateBits");
	public static Item darkchocolatebar= new ItemFood(4, .3F, false)
			.setUnlocalizedName("darkchocolatebar")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "darkchocolatebar");
	public static Item DarkChocolateBarMold = new DarkChocolateBarMold();
	public static Item WhiteChocolateBucket = new Item()
			.setUnlocalizedName("WhiteChocolateBucket")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "WhiteChocolateBucket");
	public static Item WhiteChocolateChunk = new ItemFood(4, .3F, false)
			.setUnlocalizedName("WhiteChocolateChunk")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "WhiteChocolateChunk");
	public static Item WhiteChocolateBits= new ItemFood(4, .3F, false)
			.setUnlocalizedName("WhiteChocolateBits")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "WhiteChocolateBits");
	public static Item whitechocolatebar = new ItemFood(4, .3F, false)
			.setUnlocalizedName("whitechocolatebar")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "whitechocolatebar");
	public static Item WhiteChocolateBarMold = new com.rnh.Yummy.Items.WhiteChocolateBarMold();
	public static Item CocoaButter = new Item()
			.setUnlocalizedName("CocoaButter")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "CocoaButter");
	public static Item chocolatemilk = new Item()
			.setUnlocalizedName("chocolatemilk")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "chocolatemilk");
	public static Item CocoaPowder = new Item()
			.setUnlocalizedName("CocoaPowder")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "CocoaPowder");
	public static Item 	RoastedCocoaBeans = new Item()
			.setUnlocalizedName("RoastedCocoaBeans")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "RoastedCocoaBeans");
	public static Item CocoaNibs = new Item()
			.setUnlocalizedName("CocoaNibs")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "CocoaNibs");
	public static Item CocoaLiquor = new Item()
			.setUnlocalizedName("CocoaLiquor")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "CocoaLiquor");
	
	//Frosting
	public static Item plainfrostingbag = new PlainFrostingBag();
	public static Item milkchocolatefrosting= new Item()
			.setUnlocalizedName("milkchocolatefrosting")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "frostingbag");
	public static Item creamcheesefrosting = new Item()
			.setUnlocalizedName("creamcheesefrosting")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "frostingbag");
	
	//Vegetables
	public static Item Brocolli = new ItemFood(4, .3F, false)
			.setUnlocalizedName("Brocolli")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Brocolli");
	
	//Corn
	public static Item Corn = new Item()
			.setUnlocalizedName("Corn")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Corn");
	public static Item CornCooked = new ItemFood(4, .3F, false)
			.setUnlocalizedName("CornCooked")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "CornCooked");
	public static Item CornCob = new Item()
			.setUnlocalizedName("CornCob")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "CornCob");
	
	//Apples
	public static Item AppleCore= new Item()
			.setUnlocalizedName("AppleCore")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "AppleCore");
	public static Item AppleSlice= new ItemFood(1, 0.3f, false)
			.setUnlocalizedName("AppleSlice")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "AppleSlice");
	public static Item YellowApple = new com.rnh.Yummy.Items.YellowApple(4, 0.3f, false);
	public static Item YellowAppleCore= new Item()
			.setUnlocalizedName("YellowAppleCore")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "YellowAppleCore");
	public static Item YellowAppleSlice= new ItemFood(1, 0.3f, false)
			.setUnlocalizedName("YellowAppleSlice")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "YellowAppleSlice");
	public static Item GreenApple = new com.rnh.Yummy.Items.GreenApple(4, 0.3f, false);
	public static Item GreenAppleCore= new Item()
			.setUnlocalizedName("GreenAppleCore")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "GreenAppleCore");
	public static Item GreenAppleSlice= new ItemFood(1, 0.3f, false)
			.setUnlocalizedName("GreenAppleSlice")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "GreenAppleSlice");
	public static Item AppleSauce = new com.rnh.Yummy.Items.AppleSauce(4, 0.3f, false);
	public static Item CaramelApple = new com.rnh.Yummy.Items.CaramelApple(4, 0.3f, false);
	
	//Seeds
	public static Item StrawberrySeeds = new ItemSeeds(YummyBlocks.StrawberryBush, Blocks.farmland)
			.setUnlocalizedName("StrawberrySeeds")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "StrawberrySeeds");
	public static Item CornSeeds = new ItemSeeds(YummyBlocks.CornStalk, Blocks.farmland)
			.setUnlocalizedName("CornSeeds")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "CornSeeds");
	public static Item 	sunflowerseeds = new Item()
			.setUnlocalizedName("sunflowerseeds")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Sunflowerseeds");
	public static Item RoastedSunflowerSeeds = new ItemFood(1, 0.3f, false)
			.setUnlocalizedName("roastedsunflowerseeds")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "roastedsunflowerseeds");
	public static Item GreenAppleSeeds= new Item()
			.setUnlocalizedName("GreenAppleSeeds")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "AppleSeeds");
	public static Item YellowAppleSeeds= new Item()
			.setUnlocalizedName("YellowAppleSeeds")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "AppleSeeds");
	public static Item AppleSeeds= new Item()
			.setUnlocalizedName("AppleSeeds")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "AppleSeeds");
	
	//Gold
	public static Item GoldFlakes = new Item()
			.setUnlocalizedName("GoldFlakes")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "GoldFlakes");
	public static Item goldenbacon = new Item()
			.setUnlocalizedName("goldenbacon")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "goldenbacon");
	public static Item goldencarrotcupcakepan = new Item()
			.setUnlocalizedName("goldencarrotcupcakepan")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "goldencarrotcupcakepan");
	public static Item goldencarrotcupcakepanbaked = new Item()
			.setUnlocalizedName("goldencarrotcupcakepanbaked")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "goldencarrotcupcakepanbaked");
	public static Item goldencarrotcupcake = new Item()
			.setUnlocalizedName("goldencarrotcupcake")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "goldencarrotcupcake");
	public static Item gratedGoldenCarrot = new Item()
			.setUnlocalizedName("gratedGoldenCarrot")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "gratedGoldenCarrot");
	
	//Utensils 
	public static Item pietin = new Item()
			.setUnlocalizedName("PieTin")
			.setMaxStackSize(1)
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "pietin");
	public static Item masonjar = new Item()
			.setUnlocalizedName("MasonJar")
			.setMaxStackSize(1)
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "masonjar");
	public static Item masher = new Item()
			.setUnlocalizedName("Masher")
			.setMaxStackSize(1)
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "masher");;
	public static Item cookiesheet = new Item()
			.setUnlocalizedName("CookieSheet")
			.setMaxStackSize(1)
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "CookieSheet");;
	public static Item cakepan = new Item()
			.setUnlocalizedName("CakePan")
			.setMaxStackSize(1)
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "CakePan");
	public static Item candybarmold = new Item()
			.setUnlocalizedName("candybarmold")
			.setMaxStackSize(1)
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "candybarmold");
	public static Item fryingpan= new Item()
			.setUnlocalizedName("fryingpan")
			.setMaxStackSize(1)
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "fryingpan");
	public static Item mixingbowl = new Item()
			.setUnlocalizedName("mixingbowl")
			.setMaxStackSize(1)
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "mixingbowl");;
	public static Item whisk = new Item()
			.setUnlocalizedName("whisk")
			.setMaxStackSize(1)
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "whisk");
	public static Item cupcakepan = new Item()
			.setUnlocalizedName("cupcakepan")
			.setMaxStackSize(1)
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "cupcakepan");
	public static Item cheesegrater = new Item()
			.setUnlocalizedName("cheesegrater")
			.setMaxStackSize(1)
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "cheesegrater");
	public static Item pizzapan = new Item()
			.setUnlocalizedName("pizzapan")
			.setMaxStackSize(1)
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "pizzapan");
	public static Item MorterAndPestle = new Item()
			.setUnlocalizedName("MorterAndPestle")
			.setMaxStackSize(1)
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "MorterAndPestle");;
	public static Item NutCracker= new Item()
			.setUnlocalizedName("NutCracker")
			.setMaxStackSize(1)
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "NutCracker");
	public static Item Strainer= new Item()
			.setUnlocalizedName("Strainer")
			.setMaxStackSize(1)
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Strainer");
	
	//DirtyDishes	
    public static Item dirtycakepan = new com.rnh.Yummy.Items.DirtyCakePan();
	public static Item dirtycookiesheet = new DirtyCookieSheet();
	public static Item dirtymasher = new DirtyMasher();
	public static Item dirtymasonjar = new DirtyMasonJar();
	public static Item dirtypietin = new DirtyPieTin();
	public static Item dirtycandybarmold = new DirtyCandyBarMold();
	public static Item DirtyMorterAndPestle = new com.rnh.Yummy.Items.DirtyMorterAndPestle();
	public static Item dirtypizzapan = new DirtyPizzaPan();
	public static Item dirtycupcakepan = new DirtyCupcakePan();
	public static Item dirtycheesegrater = new DirtyCheeseGrater();
	public static Item dirtywhisk = new com.rnh.Yummy.Items.DirtyWhisk();
	public static Item dirtymixingbowl = new com.rnh.Yummy.Items.DirtyMixingBowl();
	public static Item dirtyfryingpan = new DirtyFryingPan();

	
	//Pig
			
	public static Item Bacon = new ItemFood(4, .3F, false)
			.setUnlocalizedName("Bacon")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Bacon");
	public static Item RawBacon = new Item()
			.setUnlocalizedName("RawBacon")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "RawBacon");
	public static Item Ham = new Item()
			.setUnlocalizedName("Ham")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Ham");
	public static Item Ribs = new Item()
			.setUnlocalizedName("Ribs")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Ribs");
	public static Item Sausage = new Item()
			.setUnlocalizedName("Sausage")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Sausage");
	
	//Cow
	public static Item Sirloin = new Item()
			.setUnlocalizedName("Sirloin")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Sirloin");
	public static Item Tenderloin = new Item()
			.setUnlocalizedName("Tenderloin")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Tenderloin");
	public static Item GroundBeef = new Item()
			.setUnlocalizedName("GroundBeef")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "GroundBeef");
	public static Item Veal = new Item()
			.setUnlocalizedName("Veal")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Veal");

	//Chicken
	public static Item Breast = new Item()
			.setUnlocalizedName("Breast")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Breast");
	public static Item Drumstick = new Item()
			.setUnlocalizedName("Drumstick")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Drumstick");
	public static Item Wing = new Item()
			.setUnlocalizedName("Wing")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Wing");
	public static Item Thigh = new Item()
			.setUnlocalizedName("Thigh")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Thigh");
	
	//Sheep
	public static Item Lamb  = new Item()
			.setUnlocalizedName("Lamb")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Lamb");
	public static Item Mutton = new Item()
			.setUnlocalizedName("Mutton")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "Mutton");
	
	//Pizza
	public static Item PizzaPanFull = new ItemFood(4,0.3f,false)
			.setUnlocalizedName("PizzaPanFull")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "PizzaPanFull");	
	public static Item CheesePizza = new com.rnh.Yummy.Items.CheesePizza();
	public static Item CheesePizzaSlice = new ItemFood(4, .3F, false)
			.setUnlocalizedName("CheesePizzaSlice")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "CheesePizzaSlice");
	public static Item CheesePizzaPanUncooked = new Item()
			.setUnlocalizedName("CheesePizzaPanUncooked")
			.setMaxStackSize(1)
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "CheesePizzaPanUncooked");
	public static Item CheesePizzaPanCooked = new com.rnh.Yummy.Items.CheesePizzaPanCooked();
	public static Item PepperoniPizza = new com.rnh.Yummy.Items.PepperoniPizza();
	public static Item PepperoniPizzaSlice = new ItemFood(4, .3F, false)
			.setUnlocalizedName("PepperoniPizzaSlice")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "PepperoniPizzaSlice");
	public static Item PepperoniPizzaPanUncooked = new Item()
			.setUnlocalizedName("PepperoniPizzaPanUncooked")
			.setMaxStackSize(1)
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "PepperoniPizzaPanUncooked");;
	public static Item PepperoniPizzaPanCooked = new com.rnh.Yummy.Items.PepperoniPizza();
	public static Item SausagePizza = new com.rnh.Yummy.Items.SausagePizza();
	public static Item SausagePizzaSlice = new ItemFood(4, .3F, false)
			.setUnlocalizedName("SausagePizzaSlice")
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "SausagePizzaSlice");
	public static Item SausagePizzaPanUncooked = new Item()
			.setUnlocalizedName("SausagePizzaPanUncooked")
			.setMaxStackSize(1)
			.setCreativeTab(Yummy.tabYummy)
			.setTextureName(Yummy.MODID + ":" + "SausagePizzaPanUncooked");
	public static Item SausagePizzaPanCooked = new com.rnh.Yummy.Items.SausagePizzaPanCooked();
	
	public static final void init() {
		
		
		//Cakes
		GameRegistry.registerItem(CakeBatter, "CakeBatter");
		GameRegistry.registerItem(FilledCakePan, "FilledCakePan");
		GameRegistry.registerItem(CakeSheet, "CakeSheet");
		GameRegistry.registerItem(CarrotCake, "CarrotCake");
		GameRegistry.registerItem(CarrotCakePanBaked, "CarrotCakePanBaked");
		GameRegistry.registerItem(GoldenCarrotCake, "GoldenCarrotCake");
		GameRegistry.registerItem(GoldenCarrotCakePanBaked, "GoldenCarrotCakePanBaked");
		GameRegistry.registerItem(ChocolateCake, "ChocolateCake");
		GameRegistry.registerItem(ChocolateCakePanBaked, "ChocolateCakePanBaked");
		GameRegistry.registerItem(RedVelvetCake, "RedVelvetCake");
		GameRegistry.registerItem(RedVelvetCakePanBaked, "RedVelvetCakePanBaked");
		GameRegistry.registerItem(MarbleCake, "MarbleCake");
		GameRegistry.registerItem(MarbleCakePanBaked, "MarbleCakePanBaked");	
		GameRegistry.registerItem(PlainCake, "PlainCake");
		GameRegistry.registerItem(PlainCakePanBaked, "PlainCakePanBaked");
		GameRegistry.registerItem(RedCakePanBaked, "RedCakePanBaked");	
		GameRegistry.registerItem(OrangeCakePanBaked, "OrangeCakePanBaked");	
		GameRegistry.registerItem(YellowCakePanBaked, "YellowCakePanBaked");	
		GameRegistry.registerItem(LimeCakePanBaked, "LimeCakePanBaked");	
		GameRegistry.registerItem(GreenCakePanBaked, "GreenCakePanBaked");	
		GameRegistry.registerItem(LightBlueCakePanBaked, "LightBlueCakePanBaked");
		GameRegistry.registerItem(BlueCakePanBaked, "BlueCakePanBaked");
		GameRegistry.registerItem(CyanCakePanBaked, "CyanCakePanBaked");
		GameRegistry.registerItem(PurpleCakePanBaked, "PurpleCakePanBaked");
		GameRegistry.registerItem(MagentaCakePanBaked, "MagentaCakePanBaked");
		GameRegistry.registerItem(PinkCakePanBaked, "PinkCakePanBaked");
		GameRegistry.registerItem(BrownCakePanBaked, "BrownCakePanBaked");
		GameRegistry.registerItem(SilverCakePanBaked, "SilverCakePanBaked");
		GameRegistry.registerItem(GrayCakePanBaked, "GrayCakePanBaked");
		GameRegistry.registerItem(WhiteCakePanBaked, "WhiteCakePanBaked");
		GameRegistry.registerItem(BlackCakePanBaked, "BlackCakePanBaked");
		GameRegistry.registerItem(CreeperCake, "CreeperCake");
		GameRegistry.registerItem(RainbowCake, "RainbowCake");
		GameRegistry.registerItem(RainbowCakePanBaked, "RainbowCakePanBaked");
		GameRegistry.registerItem(BiPrideCake, "BiPrideCake");
		GameRegistry.registerItem(TransPrideCake, "TransPrideCake");
		GameRegistry.registerItem(BlackForrestCake, "BlackForrestCake");
		
		//Pies
		GameRegistry.registerItem(ApplePie, "ApplePie");
		GameRegistry.registerItem(PumpkinPie, "PumpkinPie");
		
		//Pizza
		GameRegistry.registerItem(CheesePizza, "CheesePizza");
		GameRegistry.registerItem(CheesePizzaSlice, "CheesePizzaSlice");
		GameRegistry.registerItem(CheesePizzaPanCooked, "CheesePizzaPanCooked");
	    GameRegistry.registerItem(CheesePizzaPanUncooked, "CheesePizzaPanUncooked");
		
	    //Apples
		GameRegistry.registerItem(YellowApple,"YellowApple");
		GameRegistry.registerItem(GreenApple,"GreenApple");
		
		//Utensils
		GameRegistry.registerItem(pietin, "PieTin");
		GameRegistry.registerItem(dirtypietin, "DirtyPieTin");
		GameRegistry.registerItem(dirtymasonjar, "dirtyMasonJar");
		GameRegistry.registerItem(masonjar, "MasonJar");
		GameRegistry.registerItem(masher,"Masher");
		GameRegistry.registerItem(dirtymasher,"DirtyMasher");
		GameRegistry.registerItem(cookiesheet, "CookieSheet");
		GameRegistry.registerItem(dirtycookiesheet, "dirtyCookieSheet");
		GameRegistry.registerItem(cakepan, "CakePan");
		GameRegistry.registerItem(dirtycakepan, "DirtyCakePan");
		GameRegistry.registerItem(candybarmold, "candybarmold");
		GameRegistry.registerItem(dirtycandybarmold, "dirtycandybarmold");
		GameRegistry.registerItem(fryingpan, "fryingpan");
		GameRegistry.registerItem(dirtyfryingpan, "dirtyfryingpan");
		GameRegistry.registerItem(mixingbowl, "mixingbowl");
		GameRegistry.registerItem(dirtymixingbowl, "dirtymixingbowl");
		GameRegistry.registerItem(whisk, "whisk");
		GameRegistry.registerItem(dirtywhisk, "DirtyWhisk");
		GameRegistry.registerItem(cheesegrater, "cheesegrater");
		GameRegistry.registerItem(dirtycheesegrater, "dirtycheesegrater");
		GameRegistry.registerItem(pizzapan, "pizzapan");
		GameRegistry.registerItem(dirtypizzapan, "dirtypizzapan");
		GameRegistry.registerItem(MorterAndPestle, "MorterAndPestle");
		GameRegistry.registerItem(DirtyMorterAndPestle, "DirtyMorterAndPestle");
		GameRegistry.registerItem(NutCracker, "NutCracker");
		GameRegistry.registerItem(Strainer, "Strainer");
		GameRegistry.registerItem(cupcakepan, "cupcakepan");
		GameRegistry.registerItem(dirtycupcakepan, "DirtyCupcakePan");
		
		//Frosting
		GameRegistry.registerItem(plainfrostingbag, "plainfrostingbag");
		
		//Gold
		GameRegistry.registerItem(GoldFlakes, "GoldFlakes");
		GameRegistry.registerItem(goldenbacon, "goldenbacon");
		GameRegistry.registerItem(goldencarrotcupcakepan, "goldencarrotcupcakepan");
		GameRegistry.registerItem(goldencarrotcupcakepanbaked, "goldencarrotcupcakepanbaked");
		GameRegistry.registerItem(goldencarrotcupcake, "goldencarrotcupcake");

		
		//Frosting
		GameRegistry.registerItem(milkchocolatefrosting, "milkchocolatefrosting");
		GameRegistry.registerItem(creamcheesefrosting, "creamcheesefrosting");
		
		//Apples
		GameRegistry.registerItem(AppleCore, "AppleCore");
		GameRegistry.registerItem(YellowAppleCore, "YellowAppleCore");
		GameRegistry.registerItem(GreenAppleCore, "GreenAppleCore");
		
	
		GameRegistry.registerItem(AppleSlice, "AppleSlice");
		GameRegistry.registerItem(YellowAppleSlice, "YellowAppleSlice");
		GameRegistry.registerItem(GreenAppleSlice, "GreenAppleSlice");
		
		GameRegistry.registerItem(AppleSeeds, "AppleSeeds");
		
	
		GameRegistry.registerItem(YellowAppleSeeds, "YellowAppleSeeds");
		
		
		GameRegistry.registerItem(GreenAppleSeeds, "GreenAppleSeeds");
		

		GameRegistry.registerItem(AppleSauce, "AppleSauce");
		GameRegistry.registerItem(CaramelApple, "CaramelApple");
			
		
		GameRegistry.registerItem(flour, "Flour");
		
		
		GameRegistry.registerItem(butter, "Butter");
		
		GameRegistry.registerItem(caramel, "Caramel");
		
		
		GameRegistry.registerItem(cinnamonstick, "CinnamonStick");
		
		
		GameRegistry.registerItem(cinnamon, "Cinnamon");
		
		
		GameRegistry.registerItem(cinnamonsugar, "CinnamonSugar");
	
	
		GameRegistry.registerItem(vanillabean, "vanillabean");
		
		
		
		GameRegistry.registerItem(powderedsugar, "powderedsugar");
		

		GameRegistry.registerItem(sunflowerseeds, "Sunflowerseeds");
		
		GameRegistry.registerItem(RoastedSunflowerSeeds, "roastedsunflowerseeds");
		
		GameRegistry.registerItem(vinegar, "vinegar");	
		
	
		GameRegistry.registerItem(buttermilk, "buttermilk");	
		
		
		GameRegistry.registerItem(creamcheese, "creamcheese");	
		
		
		GameRegistry.registerItem(salt, "salt");	

	
		GameRegistry.registerItem(gratedcarrot, "gratedcarrot");	
		
		GameRegistry.registerItem(gratedGoldenCarrot, "gratedGoldenCarrot");	
		
		GameRegistry.registerItem(mashedpotato, "mashedpotato");
	
		GameRegistry.registerItem(Cheese, "Cheese");
		
		
		GameRegistry.registerItem(ShreddedCheese, "ShreddedCheese");
		
		GameRegistry.registerItem(Yeast, "Yeast");


		GameRegistry.registerItem(BreadDough, "BreadDough");

		GameRegistry.registerItem(MilkBottle, "milkbottle");
	
		
		GameRegistry.registerItem(Cherry, "Cherry");
	
		GameRegistry.registerItem(Strawberry, "Strawberry");
		
		//Fruit
		GameRegistry.registerItem(Pineapple, "Pineapple");
		GameRegistry.registerItem(Banana, "Banana");
		GameRegistry.registerItem(Coconut, "Coconut");
		GameRegistry.registerItem(Mango, "Mango");
		GameRegistry.registerItem(Papaya, "Papaya");
		
		
		
		GameRegistry.registerItem(Brocolli, "Brocolli");
		
		//Corn
		GameRegistry.registerItem(Corn, "Corn");
		GameRegistry.registerItem(CornCooked, "CornCooked");
		GameRegistry.registerItem(CornCob, "CornCob");
		
		//Seeds
		GameRegistry.registerItem(StrawberrySeeds, "StrawberrySeeds");
		GameRegistry.registerItem(CornSeeds, "CornSeeds");
		
		//Chocolate
		GameRegistry.registerItem(RoastedCocoaBeans, "RoastedCocoaBeans");
		GameRegistry.registerItem(CocoaNibs, "CocoaNibs");
		GameRegistry.registerItem(CocoaLiquor, "CocoaLiquor");
		GameRegistry.registerItem(MilkChocolateBucket, "MilkChocolateBucket");
		GameRegistry.registerItem(DarkChocolateBucket, "DarkChocolateBucket");
		GameRegistry.registerItem(WhiteChocolateBucket, "WhiteChocolateBucket");
		GameRegistry.registerItem(MilkChocolateChunk, "MilkChocolateChunk");
		GameRegistry.registerItem(DarkChocolateChunk, "DarkChocolateChunk");
		GameRegistry.registerItem(WhiteChocolateChunk, "WhiteChocolateChunk");
		GameRegistry.registerItem(MilkChocolateBits, "MilkChocolateBits");
		GameRegistry.registerItem(DarkChocolateBits, "DarkChocolateBits");
		GameRegistry.registerItem(WhiteChocolateBits, "WhiteChocolateBits");
		GameRegistry.registerItem(CocoaButter, "CocoaButter");
		GameRegistry.registerItem(CocoaPowder, "CocoaPowder");
		GameRegistry.registerItem(milkchocolatebar, "milkchocolatebar");
		GameRegistry.registerItem(darkchocolatebar, "darkchocolatebar");
		GameRegistry.registerItem(whitechocolatebar, "whitechocolatebar");
		GameRegistry.registerItem(MilkChocolateShavings, "MilkChocolateShavings");
		GameRegistry.registerItem(MilkChocolateBarMold, "MilkChocolateBarMold");
		GameRegistry.registerItem(DarkChocolateBarMold, "DarkChocolateBarMold");
		GameRegistry.registerItem(WhiteChocolateBarMold, "WhiteChocolateBarMold");
		//Cow
		GameRegistry.registerItem(Sirloin, "Sirloin");
		GameRegistry.registerItem(Tenderloin, "Tenderloin");
		GameRegistry.registerItem(GroundBeef, "GroundBeef");
		GameRegistry.registerItem(Veal, "Veal");

		//Chicken
		GameRegistry.registerItem(Breast, "Breast");
		GameRegistry.registerItem(Drumstick, "Drumstick");
		GameRegistry.registerItem(Wing, "Wing");
		GameRegistry.registerItem(Thigh, "Thigh");
		
		//Sheep
		GameRegistry.registerItem(Lamb, "Lamb");
		GameRegistry.registerItem(Mutton, "Mutton");
		
		//Pizza
		GameRegistry.registerItem(PepperoniPizza, "PepperoniPizza");
		GameRegistry.registerItem(PepperoniPizzaSlice, "PepperoniPizzaSlice");
		GameRegistry.registerItem(PepperoniPizzaPanUncooked, "PepperoniPizzaPanUncooked");
		GameRegistry.registerItem(PepperoniPizzaPanCooked, "PepperoniPizzaPanCooked");
		GameRegistry.registerItem(SausagePizza, "SausagePizza");
		GameRegistry.registerItem(SausagePizzaSlice, "SausagePizzaSlice");
		GameRegistry.registerItem(SausagePizzaPanUncooked, "SausagePizzaPanUncooked");
		GameRegistry.registerItem(SausagePizzaPanCooked, "SausagePizzaPanCooked");
	
	}		
	
}

