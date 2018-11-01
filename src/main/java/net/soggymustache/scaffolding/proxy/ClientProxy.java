package net.soggymustache.scaffolding.proxy;

import net.soggymustache.scaffolding.init.block.ScaffoldingBlock;
import net.soggymustache.scaffolding.init.item.ScaffoldingItem;

public class ClientProxy extends CommonProxy{
	
	public void init()
	{
		registerRenders();
	}
	
	@Override
	public void registerRenders() {
		ScaffoldingBlock.registerRenders();
		ScaffoldingItem.registerRenderers();
		}
}
