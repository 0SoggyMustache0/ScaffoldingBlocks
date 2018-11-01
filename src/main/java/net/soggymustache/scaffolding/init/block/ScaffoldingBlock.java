package net.soggymustache.scaffolding.init.block;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.soggymustache.scaffolding.Reference;



public class ScaffoldingBlock {
	

	public static Block scaffolding_block;
	
	public static void init() {


		scaffolding_block = new ScaffoldingBlockType().setUnlocalizedName("scaffolding_block").setCreativeTab(CreativeTabs.tabBlock);
	}
	
	public static void register()
	{

		GameRegistry.registerBlock(scaffolding_block, scaffolding_block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{

		registerRenders(scaffolding_block);
	}
	
	public static void registerRenders(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory")); 						
	}
}
