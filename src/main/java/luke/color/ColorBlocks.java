package luke.color;

import luke.color.block.BlockConcrete;
import luke.color.block.BlockPowder;
import luke.color.blockmodel.*;
import net.minecraft.client.render.block.model.BlockModelSeat;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockBed;
import net.minecraft.core.block.BlockSeat;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.world.World;
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

	public static Block bedOrange;
	public static Block bedYellow;
	public static Block bedLime;
	public static Block bedGreen;
	public static Block bedCyan;
	public static Block bedLightblue;
	public static Block bedBlue;
	public static Block bedPurple;
	public static Block bedMagenta;
	public static Block bedPink;
	public static Block bedBrown;
	public static Block bedWhite;
	public static Block bedSilver;
	public static Block bedGray;
	public static Block bedBlack;

	public static Block seatOrange;
	public static Block seatYellow;
	public static Block seatLime;
	public static Block seatGreen;
	public static Block seatCyan;
	public static Block seatLightblue;
	public static Block seatBlue;
	public static Block seatPurple;
	public static Block seatMagenta;
	public static Block seatPink;
	public static Block seatBrown;
	public static Block seatWhite;
	public static Block seatSilver;
	public static Block seatGray;
	public static Block seatBlack;


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

		BlockBuilder bed = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
			.setHardness(0.2f)
			.setResistance(1.0f)
			.setUseInternalLight()
			.setVisualUpdateOnMetadata()
			.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU);

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



		bedOrange = bed
			.setBlockModel(BlockModelOrangeBed::new)
			.build(new BlockBed("bed.orange", blockID("bedOrange")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedOrange)};
				}
		});

		bedYellow = bed
			.setBlockModel(BlockModelYellowBed::new)
			.build(new BlockBed("bed.yellow", blockID("bedYellow")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedYellow)};
				}
			});









		seatOrange = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("color:block/seat_orange_top", "minecraft:block/planks_oak", "color:block/bed_orange_foot_front"))
			.build(new BlockSeat("seat.orange", blockID("seatOrange")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatOrange)};
				}
			});

	}

}
