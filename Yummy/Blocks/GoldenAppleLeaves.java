package com.rnh.Yummy.Blocks;

import java.util.List;
import java.util.Random;

import com.rnh.Yummy.Yummy;
import com.rnh.Yummy.YummyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
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

public class GoldenAppleLeaves extends BlockLeavesBase implements IPlantable
{
    Random random;
    public IIcon[] fastIcons;
    public IIcon[] fancyIcons;
    public static String[] textureNames = new String[] { "GoldenAppleLeaves","GoldenAppleLeaves_ripe" };

    public GoldenAppleLeaves()
    {
        super(Material.leaves, false);
        this.setTickRandomly(true);
        random = new Random();
        this.setHardness(0.3F);
        this.setStepSound(Block.soundTypeGrass);
        this.setBlockName("GoldenAppleLeaves");
        this.setCreativeTab(Yummy.tabYummy);
    }

    /* Berries show up at meta 12-15 */

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
                return fancyIcons[metadata % 1 + 1];
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
                return fastIcons[metadata % 1 + 1];
            }
        }
    }

    /* Bushes are stored by size then type */
    @Override
    public int damageDropped (int metadata)
    {
        return metadata % 4;
    }
 

    /* Left-click harvests berries */
    @Override
    public void onBlockClicked (World world, int x, int y, int z, EntityPlayer player)
    {
        if (!world.isRemote)
        {
            int meta = world.getBlockMetadata(x, y, z);
            if (meta >= 12)
            {
                world.setBlock(x, y, z, this, meta - 4, 3);
                EntityItem entityitem = new EntityItem(world, player.posX, player.posY - 1.0D, player.posZ, new ItemStack(Items.golden_apple));
                world.spawnEntityInWorld(entityitem);
                if (!(player instanceof FakePlayer))
                    entityitem.onCollideWithPlayer(player);
            }
        }
    }

    /* Right-click harvests berries */
    @Override
    public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
        /*if (world.isRemote)
        	return false;*/

        int meta = world.getBlockMetadata(x, y, z);
        if (meta >= 12)
        {
            if (world.isRemote)
                return true;

            world.setBlock(x, y, z, this, meta - 4, 3);
            EntityItem entityitem = new EntityItem(world, player.posX, player.posY - 1.0D, player.posZ, new ItemStack(Items.golden_apple));
            world.spawnEntityInWorld(entityitem);
            if (!(player instanceof FakePlayer))
                entityitem.onCollideWithPlayer(player);
            return true;
        }
        return false;
    }

    /* Render logic */

    @Override
    public boolean isOpaqueCube ()
    {
        return false;
    }

    public void setGraphicsLevel (boolean flag)
    {
        field_150121_P = flag;
        //this.blockIndexInTexture = this.icon + (flag ? 0 : 32);
    }

    @Override
    public boolean renderAsNormalBlock ()
    {
        return false;
    }

    

    @Override
    public boolean shouldSideBeRendered (IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        if (l > 7 || field_150121_P)
        {
            return super.shouldSideBeRendered(iblockaccess, i, j, k, l);
        }
        else
        {
            return true;
        }
    }

    /* Bush growth */

    @Override
    public void updateTick (World world, int x, int y, int z, Random random1)
    {
        if (world.isRemote)
        {
            return;
        }

        int height;

        for (height = 1; world.getBlock(x, y - height, z) == this; ++height)
        {
            ;
        }

        if (random1.nextInt(20) == 0 && world.getBlockLightValue(x, y, z) >= 8)
        {
            int md = world.getBlockMetadata(x, y, z);
            if (md < 12)
            {
                world.setBlock(x, y, z, this, md + 4, 3);
            }
            
        }
    }

    public boolean canSustainPlant (World world, int x, int y, int z, ForgeDirection direction, IPlantable plant)
    {
        if (plant instanceof GoldenAppleLeaves)
            return (world.getBlockMetadata(x, y, z) > 7);
        return super.canSustainPlant(world, x, y, z, direction, plant);
    }

    /* Resistance to fire */

    @Override
    public int getFlammability (IBlockAccess world, int x, int y, int z, ForgeDirection face)
    {
        return 25;
    }

    @Override
    public boolean isFlammable (IBlockAccess world, int x, int y, int z, ForgeDirection face)
    {
        return true;
    }

    @Override
    public int getFireSpreadSpeed (IBlockAccess world, int x, int y, int z, ForgeDirection face)
    {
        return 4;
    }

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks (Item par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int var4 = 3; var4 < 4; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }

    @Override
    public EnumPlantType getPlantType (IBlockAccess world, int x, int y, int z)
    {
        return EnumPlantType.Plains;
    }

    @Override
    public Block getPlant (IBlockAccess world, int x, int y, int z)
    {
        return this;
    }

    @Override
    public int getPlantMetadata (IBlockAccess world, int x, int y, int z)
    {
        return world.getBlockMetadata(x, y, z) - 4;
    }

    
}
