package com.rnh.Yummy.DropHandler;

import java.util.Random;

import com.rnh.Yummy.YummyBlocks;
import com.rnh.Yummy.YummyItems;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class YummySheepDropHandler{

	public static Random random;
	public static int dropped;
	
		@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
		public void onEvent(LivingDropsEvent event)
		{
			if (event.entity instanceof EntitySheep)
			{
				// DEBUG
				System.out.println("EntitySheep drops event");
				event.drops.clear();
			}
		}
		 

		@SubscribeEvent
		public void onEntityDrop(LivingDropsEvent event){
			if(event.entity instanceof EntitySheep) {
				if (((EntityAgeable) event.entity).getGrowingAge() < 0)
				event.entity.entityDropItem(new ItemStack(YummyBlocks.DeadBabySheepBlock,1,((EntitySheep)event.entity).getFleeceColor()), 0.0F);
			else
                event.entityLiving.entityDropItem(new ItemStack(YummyBlocks.DeadSheepBlock,1,((EntitySheep)event.entity).getFleeceColor()), 0.0F);
                        }
			}
	}

