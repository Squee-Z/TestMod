package net.modfun.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.modfun.ExampleMod;

public class BlockRandom extends TMBlock
{
    private Random rand = new Random();

    public BlockRandom()
    {
        super("blockrandom");
        setRegistryName("random");
        setUnlocalizedName(ExampleMod.MODID+"random");
    }

    /**
     * Called after the block is set in the Chunk data, but before the Tile Entity is set
     */
    @Override
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
        Block randBlock = Block.REGISTRY.getRandomObject(rand);
        worldIn.setBlockState(pos, randBlock.getDefaultState());
    }
}