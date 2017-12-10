package net.modfun.register;

import com.google.common.collect.Lists;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.modfun.Reference;

@Mod.EventBusSubscriber
public class RegistRecipe {

    public static void init() {
        copperwrench = CraftingManager.getRecipe(new ResourceLocation(Reference.MOD_ID, "copperwrench"));

    }

    private static IRecipe copperwrench;


    @SubscribeEvent
    public static void onPickupItem(EntityItemPickupEvent event) {
        if(event.getEntityPlayer() instanceof EntityPlayerMP) {
            EntityPlayerMP player = (EntityPlayerMP) event.getEntityPlayer();
            ItemStack stack = event.getItem().getItem();
            player.addVelocity(0, 2, 0);
            
            
        }
    }
}
