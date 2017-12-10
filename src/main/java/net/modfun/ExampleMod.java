package net.modfun;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.modfun.item.ItemRegistry;
import net.modfun.proxy.CommonProxy;
import net.modfun.register.RegistRecipe;

@Mod(modid = Reference.MOD_ID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = Reference.MOD_ID;
    public static final String VERSION = "1.0";
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
        RegistRecipe.init();
        
    }
    public static final CreativeTabs modTab = new CreativeTabs("modtabs"){

        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemRegistry.copperWrench);
        }
    };
}
