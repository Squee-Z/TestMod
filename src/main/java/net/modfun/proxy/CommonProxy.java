package net.modfun.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.modfun.ExampleMod;
import net.modfun.register.RegistBlock;
import net.modfun.register.RestHandler;

public class CommonProxy {

	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(ExampleMod.MODID + ":" + id, "inventory"));
	}
	public void preInit(FMLPreInitializationEvent event) 
	{
		
		
	}
	public void init(FMLInitializationEvent event)
	{
		RegistBlock.init();
		RegistBlock.registerTileEntity();
		RegistBlock.renderInit();
		
	}
	public void postInit(FMLPostInitializationEvent event)
    {
		
        
    }
}
