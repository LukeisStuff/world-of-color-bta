package luke.color.blockmodel;

import net.minecraft.client.render.block.model.BlockModelBed;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;

public class BlockModelPurpleBed<T extends BlockLogic> extends BlockModelBed<T> {
	public BlockModelPurpleBed(Block<T> block) {
		super(block);
		this.bedTextures[0] = TextureRegistry.getTexture("color:block/bed/bed_purple_foot_front");
		this.bedTextures[1] = TextureRegistry.getTexture("color:block/bed/bed_purple_foot_side");
		this.bedTextures[2] = TextureRegistry.getTexture("color:block/bed/bed_purple_foot_top");
		this.bedTextures[3] = TextureRegistry.getTexture("minecraft:block/bed/head_front");
		this.bedTextures[4] = TextureRegistry.getTexture("color:block/bed/bed_purple_head_side");
		this.bedTextures[5] = TextureRegistry.getTexture("color:block/bed/bed_purple_head_top");
	}
}
