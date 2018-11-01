package net.soggymustache.scaffolding.init.item.craft;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.soggymustache.scaffolding.init.block.ScaffoldingBlock;

public class ScaffoldingCrafting {
	public static void init(FMLInitializationEvent event) {
		  
		GameRegistry.addRecipe(new ItemStack(ScaffoldingBlock.scaffolding_block, 64), new Object[] {"WSW", "SWS", "WSW", 'S', Items.stick, 'W', Blocks.planks});
	}
}
