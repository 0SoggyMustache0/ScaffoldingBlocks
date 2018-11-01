package net.soggymustache.scaffolding.init.block;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ScaffoldingBlock {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SCAFFOLDING_BLOCK = new ScaffoldingBlockType("scaffolding_block");
	
	
	public static void registerBlocks() {
		ForgeRegistries.BLOCKS.registerAll(BLOCKS.toArray(new Block[BLOCKS.size()]));
	}
	
	public static void registerRenders() {
		for(Block itm : ScaffoldingBlock.BLOCKS) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(itm), 0, new ModelResourceLocation(itm.getRegistryName(), "inventory"));
		}
	}
	
}
