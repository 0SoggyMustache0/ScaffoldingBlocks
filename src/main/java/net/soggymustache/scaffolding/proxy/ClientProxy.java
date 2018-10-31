package net.soggymustache.scaffolding.proxy;

import net.soggymustache.scaffolding.init.block.ScaffoldingBlock;
import net.soggymustache.scaffolding.init.item.ScaffoldingItem;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders() {
		ScaffoldingItem.registerRenders();
		ScaffoldingBlock.registerRenders();
	}
}
