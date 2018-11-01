package net.soggymustache.scaffolding.init.item;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ScaffoldingItem {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	public static void registerItems() {
		ForgeRegistries.ITEMS.registerAll(ITEMS.toArray(new Item[ITEMS.size()]));
	}

	public static void registerRenders() {
		for (Item itm : ScaffoldingItem.ITEMS) {
			ModelLoader.setCustomModelResourceLocation(itm, 0, new ModelResourceLocation(itm.getRegistryName(), "inventory"));
		}
	}
}