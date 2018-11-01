package net.soggymustache.scaffolding.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.soggymustache.scaffolding.init.block.ScaffoldingBlock;
import net.soggymustache.scaffolding.init.item.ScaffoldingItem;
import net.soggymustache.scaffolding.init.item.craft.ScaffoldingCrafting;

public class CommonProxy {
	

	public void preInit(FMLPreInitializationEvent event)
	{
		ScaffoldingItem.init();
		ScaffoldingBlock.init();
		ScaffoldingBlock.register();
	}
	
	public void init(FMLInitializationEvent event)	
	{
		
		ScaffoldingCrafting.init(event);
		
	}
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	public void registerRenders() {

		ScaffoldingItem.registerRenderers();
		ScaffoldingBlock.registerRenders();
	}

}
