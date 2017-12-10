package net.modfun.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.modfun.ExampleMod;

public class TMBlock extends Block
{
    public TMBlock(String name)
    {
        super(Material.ROCK);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ExampleMod.modTab);
    }
}
