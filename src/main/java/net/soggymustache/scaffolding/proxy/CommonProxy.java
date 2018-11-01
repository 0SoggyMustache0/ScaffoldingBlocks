package net.soggymustache.scaffolding.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.soggymustache.scaffolding.init.block.ScaffoldingBlock;
import net.soggymustache.scaffolding.init.item.ScaffoldingItem;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		ScaffoldingBlock.registerBlocks();
		ScaffoldingItem.registerItems();
	}

	public void init(FMLInitializationEvent event) {
		
	}

	public void postInit(FMLPostInitializationEvent event) {

	}

	public void registerRenders() {

	}

}
