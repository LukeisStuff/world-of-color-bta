package luke.color.blockmodel;

import net.minecraft.client.render.block.model.BlockModelBed;
import net.minecraft.client.render.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;

public class BlockModelBlackBed<T extends Block> extends BlockModelBed<T> {
	public BlockModelBlackBed(Block block) {
		super(block);
		this.atlasIndices[0] = TextureRegistry.getTexture("color:block/bed/bed_black_foot_front");
		this.atlasIndices[1] = TextureRegistry.getTexture("color:block/bed/bed_black_foot_side");
		this.atlasIndices[2] = TextureRegistry.getTexture("color:block/bed/bed_black_foot_top");
		this.atlasIndices[3] = TextureRegistry.getTexture("minecraft:block/bed_head_front");
		this.atlasIndices[4] = TextureRegistry.getTexture("color:block/bed/bed_black_head_side");
		this.atlasIndices[5] = TextureRegistry.getTexture("color:block/bed/bed_black_head_top");
	}
}
