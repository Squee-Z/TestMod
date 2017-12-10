package net.modfun.register;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import net.modfun.Reference;
import net.modfun.block.BlockMulti;
import net.modfun.tileentity.TileMutli;


public class RegistBlock
{
	  //Using TFICore, basic blocks do not need a block-class on it's own.
		public static final Block POTATO_BLOCK = new BlockMulti();


	    //Compressed Blocks
	   

	    /*  If more data on a block is needed
	     *  Example 1:
	     *  public static final Block compressedCobbleWithData = new CompressedBlock(Material.ROCK, MapColor.GRAY, Reference.MOD_ID, "cobble_compr", 2.0f, 10.0f, null).setLightLevel(0.8f);
	     *  Using Ex1, you can easily add one or two things without having to make an extra class.
	     *  Example 2:
	     *  public static final Block compressedCobbleWithData = new CompressedCobbleBlock(Material.ROCK, MapColor.GRAY, Reference.MOD_ID, "cobble_compr", 2.0f, 10.0f, null);
	     *  Using Ex2, you extend the base class and add your extra data in the constructor of that class.
	     */

		public static void init() {
			registerBlock(POTATO_BLOCK);
	        

	        
	        
	    }
		
		public static void renderInit() {
	       
		}

	    public static void registerTileEntity() {
	        GameRegistry.registerTileEntity(TileMutli.class, "compressor");
	        
	    }

	    private static void registerItemBlockRenderer(Item block, String name) {
	        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, name), "inventory"));
	        
	    }

	    private static void registerBuiltIn(Block block) {
	        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().getModelManager().getBlockModelShapes().registerBuiltInBlocks(block);
	    }

	    public static void registerBlock(Block block) {
	        BlockRegistrationHandler.blocks.add(block);
	    }

	    public static void registerBlock(Block block, ItemBlock itemBlock) {
	        ForgeRegistries.BLOCKS.register(block);
	        itemBlock.setRegistryName(block.getRegistryName());
	        ForgeRegistries.ITEMS.register(itemBlock);
	    }

	    @Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	    public static class BlockRegistrationHandler {
	        public static final Set<Block> BLOCK_LIST = new HashSet<>();
	        public static final Set<Item> ITEM_LIST = new HashSet<>();

	        private static final Set<Block> registeredBlockList = new HashSet<>();
	        public static final List<Block> blocks = new ArrayList<>();

	        @SubscribeEvent
	        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
	            final IForgeRegistry<Block> reg = event.getRegistry();

	            for (final Block block : blocks) {
	                reg.register(block);
	                BLOCK_LIST.add(block);
	            }
	        }

	        @SubscribeEvent
	        public static void registerItems(final RegistryEvent.Register<Item> event) {
	            final IForgeRegistry<Item> reg = event.getRegistry();

	            for (final Block item : blocks) {
	                ItemBlock itemBlock = (ItemBlock) new ItemBlock(item).setRegistryName(item.getRegistryName());
	                
	                reg.register(itemBlock);
	                ITEM_LIST.add(itemBlock);
	            }
	        }

	        @SubscribeEvent
	        public static void registerModels(final ModelRegistryEvent event) {
	            for (Block block : BLOCK_LIST) {
	                if (!registeredBlockList.contains(block)) {
	                    registerBlockModel(block);

	            }
	                }
	            }

	            
	        }

	        private static void registerBlockModel(final Block block) {
	            final String registryName = block.getRegistryName().toString();
	            final ModelResourceLocation location = new ModelResourceLocation(registryName, "inventory");
	            registerBlockModel(block, location);
	        }

	        private static void registerBlockModel(final Block block, final ModelResourceLocation modelResourceLocation) {
	            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, modelResourceLocation);
	           
	        }

	        public static void registerBlockModelVariants(Block block, int meta, String filename) {
	            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, filename), "inventory"));
	        }
	        @SubscribeEvent
	        public void registerBlocks(RegistryEvent.Register<Block> event) {
	            event.getRegistry().register(POTATO_BLOCK);
	            
	        }
	    }

