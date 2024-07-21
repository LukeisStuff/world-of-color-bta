package luke.color;

import luke.color.blockmodel.BlockModelConcretePainted;
import luke.color.blockmodel.BlockModelPowderPainted;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSound;
import turniplabs.halplibe.helper.BlockBuilder;

import static luke.color.ColorMod.MOD_ID;

public class ColorBlocks {
	private int blockID(String blockName) {
		return ColorConfig.cfg.getInt("Block IDs." + blockName);
	}

	public static Block concrete;
	public static Block concretePowder;
	public void initializeBlockDetails() {
	}

	public void initializeBlocks() {
		BlockBuilder stone = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
			.setHardness(1.5f)
			.setResistance(10.0f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);

		concrete = stone
			.setHardness(5.0f)
			.setResistance(25.0f)
			.setBlockModel(BlockModelConcretePainted::new)
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("color:block/concrete"))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("concrete", blockID("concrete"), Material.stone));

		concretePowder = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
			.setHardness(0.5f)
			.setResistance(0.5f)
			.setBlockModel(BlockModelPowderPainted::new)
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("color:block/concrete_powder"))
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.build(new BlockPowder("concrete.powder", blockID("concretePowder")));
	}

}
