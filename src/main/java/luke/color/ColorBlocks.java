package luke.color;

import luke.color.blockmodel.BlockModelConcretePainted;
import luke.color.blockmodel.BlockModelPowderPainted;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.sound.BlockSound;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.CreativeHelper;

import static luke.color.ColorMod.MOD_ID;
import static net.minecraft.core.block.Block.trommelIdle;

public class ColorBlocks {
	private int blockID(String blockName) {
		return ColorConfig.cfg.getInt("Block IDs." + blockName);
	}

	public static Block concrete;
	public static Block concretePowder;
	public void initializeBlockDetails() {

		for (int color = 1; color < 17; color++) {
			CreativeHelper.setParent(concrete, color - 1, trommelIdle, 0);
		}

		for (int color = 1; color < 17; color++) {
			CreativeHelper.setParent(concretePowder, color - 1, trommelIdle, 0);
		}
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
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setItemBlock(block -> new ItemBlockPainted(block, false))
			.build(new BlockConcrete("concrete", blockID("concrete"), Material.stone));

		concretePowder = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
			.setHardness(0.5f)
			.setResistance(0.5f)
			.setBlockModel(BlockModelPowderPainted::new)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setItemBlock(block -> new ItemBlockPainted(block, false))
			.build(new BlockPowder("concrete.powder", blockID("concretePowder")));
	}

}
