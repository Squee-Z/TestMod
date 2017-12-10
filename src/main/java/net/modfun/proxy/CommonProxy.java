package net.modfun.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.modfun.ExampleMod;
import net.modfun.register.RegistBlock;

public class CommonProxy {

	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(ExampleMod.MODID + ":" + id, "inventory"));
	}
	public void postInit()
    {
        RegistBlock.voidLists();
    }
}
