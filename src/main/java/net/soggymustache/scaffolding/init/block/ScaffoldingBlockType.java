package net.soggymustache.scaffolding.init.block;

import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.soggymustache.scaffolding.init.item.ScaffoldingItem;

public class ScaffoldingBlockType extends BlockDirectional {

	public ScaffoldingBlockType(String unloc) {
		super(Material.WOOD);
		this.setUnlocalizedName(unloc);
		this.setRegistryName(unloc);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		ScaffoldingBlock.BLOCKS.add(this);
		ScaffoldingItem.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

}
