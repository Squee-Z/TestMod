package net.modfun.item;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
@Mod.EventBusSubscriber
public class ItemRegistry {
	
    public static Map<String, Item> ITEMS = new HashMap<String, Item>();

    public static final Item copper = new ItemCopper();
    public static final Item copperWrench = new ItemCopperWrench();

    
    
    /**
     * Register all the items into the event handler before the pre-init
     * @param event
     */

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(copper);
        registry.register(copperWrench);
        
        regItemModels(copper, copperWrench);
    }

    

    /**
     * Render the models for the items
     * @param items
     */
    public static void regItemModels(Item...items){
        for(Item item : items){
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }

   
}
