package net.soggymustache.scaffolding.init.block;

import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ScaffoldingBlockType extends BlockDirectional {
	
	public ScaffoldingBlockType() {
		 super(Material.wood);
	    // this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
	}
//	 public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
//	    {
//	        super.onBlockAdded(worldIn, pos, state);
//	    }    
//
//	    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
//	    {
//	        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
//	    }
//
//	    public IBlockState getStateFromMeta(int meta)
//	    {
//	        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
//	    }
//
//	    public int getMetaFromState(IBlockState state)
//	    {
//	        return ((EnumFacing)state.getValue(FACING)).getHorizontalIndex();
//	    }
//
//	    protected BlockStateContainer createBlockState()
//	    {
//	        return new BlockStateContainer(this, new IProperty[] {FACING});
//	    }
//	    
		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}
	
}


