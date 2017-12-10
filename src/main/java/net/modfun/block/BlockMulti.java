package net.modfun.block;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.modfun.ExampleMod;
import net.modfun.tileentity.TileMutli;

public class BlockMulti extends TMBlockContainer
{
    public BlockMulti()
    {
        super("blockmulti");
        
        setUnlocalizedName(ExampleMod.MODID+"multi");
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta)
    {
        return new TileMutli();
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        TileMutli te = (TileMutli) worldIn.getTileEntity(pos);
        BlockPos tep = te.getPos();
        if(playerIn.getHeldItemMainhand().isItemEqual(new ItemStack(Item.getByNameOrId("Coal"))))
        {
        	EntityItem item = new EntityItem(worldIn, tep.getX(), tep.getY(), tep.getZ(), new ItemStack(Item.getByNameOrId("Diamond"), 1));
        	worldIn.spawnEntity(item);
        }
        return true;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        TileMutli te = (TileMutli) worldIn.getTileEntity(pos);
       
    }
}
