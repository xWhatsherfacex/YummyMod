package com.rnh.Yummy.Items;

import java.util.List;

import com.rnh.Yummy.Yummy;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

public class FilledCakePan extends Item
{
    public static final String[] names = new String[] {"Carrot", "GoldenCarrot", "Chocolate", "Plain", "Marble", "RedVelvet", "Rainbow", "black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white", "BlackForrest"};
    public static final String[] color = new String[] {"Carrot", "GoldenCarrot", "Chocolate", "Plain", "Marble", "RedVelvet", "Rainbow", "black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightblue", "magenta", "orange", "white", "BlackForrest"};
    public static final int[] field_150922_c = new int[] {1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 11250603, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320};
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;
    private static final String __OBFID = "CL_00000022";

    public FilledCakePan()
    {
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(Yummy.tabYummy);
        this.setMaxStackSize(1);
        this.setUnlocalizedName("CakePan");
        
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int x)
    {
        int j = MathHelper.clamp_int(x, 0, 22);
        return this.icons[j];
    }

 
    public String getUnlocalizedName(ItemStack itemstack)
    {
        int i = MathHelper.clamp_int(itemstack.getItemDamage(), 0, 22);
        return super.getUnlocalizedName() + "_" + names[i];
    }


    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tabs, List list)
    {
        for (int i = 0; i < 23; ++i)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon)
    {
        this.icons = new IIcon[color.length];

        for (int i = 0; i < color.length; ++i)
        {
            this.icons[i] = icon.registerIcon(Yummy.MODID + ":CakePanFull_" + color[i]);
        }
    }
}