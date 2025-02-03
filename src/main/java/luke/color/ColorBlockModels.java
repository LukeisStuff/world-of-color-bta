package luke.color;

import luke.color.blockmodel.BlockModelConcreteBaked;
import luke.color.blockmodel.BlockModelConcretePainted;
import luke.color.blockmodel.BlockModelConcretePowder;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static luke.color.ColorBlocks.*;

public class ColorBlockModels implements ModelEntrypoint {
	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {
		ModelHelper.setBlockModel(concrete, () -> new BlockModelConcretePainted<>(concrete));
		ModelHelper.setBlockModel(concretePowder, () -> new BlockModelConcretePowder<>(concretePowder));
		ModelHelper.setBlockModel(concreteBaked, () -> new BlockModelConcreteBaked<>(concreteBaked));
	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {
	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {
	}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {
	}
}
