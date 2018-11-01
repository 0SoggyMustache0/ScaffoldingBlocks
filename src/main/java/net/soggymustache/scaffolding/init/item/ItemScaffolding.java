package net.soggymustache.scaffolding.init.item;

import net.minecraft.item.Item;

public class ItemScaffolding extends Item{
	
	public ItemScaffolding(String unloc) {
		this.setUnlocalizedName(unloc);
		this.setRegistryName(unloc);
		ScaffoldingItem.ITEMS.add(this);
	}
}
