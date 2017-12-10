<<<<<<< HEAD
package net.modfun.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.modfun.ExampleMod;
import net.modfun.Reference;

public class ItemCopperWrench extends Item {

	public ItemCopperWrench() {
		super();
		ResourceLocation name = this.getRegistryName();
		setRegistryName("copperwrench");
		setCreativeTab(ExampleMod.modTab);
		setUnlocalizedName(Reference.MOD_ID+":"+"copper_wrench");
		setMaxStackSize(1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		// TODO Auto-generated method stub
		

		 RayTraceResult result = playerIn.rayTrace(100, 10);
	        BlockPos pos = result.getBlockPos();
	        Entity entity = result.entityHit;
	        double x = playerIn.posX - (pos.getX() + playerIn.getLook(1.0F).x * 4.0F);
	        double y = playerIn.getEntityBoundingBox().minY + (playerIn.height / 2F) - (0.5D + pos.getY() + (pos.getY() / 2F));
	        double z = playerIn.posZ - (pos.getZ() + playerIn.getLook(1.0F).z * 4.0F);
        		worldIn.destroyBlock(pos, true);
		return super.onItemRightClick(worldIn, playerIn, handIn);
		
	}

	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player) {
		// TODO Auto-generated method stub
		player.getEntityWorld().destroyBlock(pos, true);
		return super.onBlockStartBreak(itemstack, pos, player);
	}

}
=======
package net.modfun.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.modfun.ExampleMod;
import net.modfun.Reference;

public class ItemCopperWrench extends Item {

	public ItemCopperWrench() {
		super();
		ResourceLocation name = this.getRegistryName();
		setRegistryName("copperwrench");
		setCreativeTab(ExampleMod.modTab);
		setUnlocalizedName(Reference.MOD_ID+":"+"copper_wrench");
		setMaxStackSize(1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		// TODO Auto-generated method stub
		

		 RayTraceResult result = playerIn.rayTrace(100, 10);
	        BlockPos pos = result.getBlockPos();
	        Entity entity = result.entityHit;
	        double x = playerIn.posX - (pos.getX() + playerIn.getLook(1.0F).x * 4.0F);
	        double y = playerIn.getEntityBoundingBox().minY + (playerIn.height / 2F) - (0.5D + pos.getY() + (pos.getY() / 2F));
	        double z = playerIn.posZ - (pos.getZ() + playerIn.getLook(1.0F).z * 4.0F);
        		worldIn.destroyBlock(pos, true);
		return super.onItemRightClick(worldIn, playerIn, handIn);
		
	}

	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player) {
		// TODO Auto-generated method stub
		player.getEntityWorld().destroyBlock(pos, true);
		return super.onBlockStartBreak(itemstack, pos, player);
	}

}
>>>>>>> 50f63d79c60a0648d97b62332b3b90395e396f0e
