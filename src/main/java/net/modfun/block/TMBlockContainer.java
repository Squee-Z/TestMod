<<<<<<< HEAD
package net.modfun.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumBlockRenderType;
import net.modfun.ExampleMod;

public abstract class TMBlockContainer extends BlockContainer
{
    protected TMBlockContainer(String name)
    {
        super(Material.ROCK);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ExampleMod.modTab);
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.MODEL;
    }
=======
package net.modfun.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumBlockRenderType;
import net.modfun.ExampleMod;

public abstract class TMBlockContainer extends BlockContainer
{
    protected TMBlockContainer(String name)
    {
        super(Material.ROCK);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ExampleMod.modTab);
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.MODEL;
    }
>>>>>>> 50f63d79c60a0648d97b62332b3b90395e396f0e
}