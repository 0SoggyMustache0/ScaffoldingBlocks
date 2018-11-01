package net.soggymustache.scaffolding.init.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.soggymustache.scaffolding.Reference;

public class ScaffoldingItem
{

	
	
	
	public static void init()
	{

		
		
		
	}

	private static void register(Item item)
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}

	public static void registerRenderers()
	{
		

	}

	public static void registerItemRenderer(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}