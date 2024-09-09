package luke.color;

import luke.color.block.BlockConcrete;
import luke.color.block.BlockPowder;
import luke.color.blockmodel.*;
import net.minecraft.client.render.block.model.BlockModelSeat;
import net.minecraft.client.render.block.model.BlockModelStandard;
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

public class ColorBlocks {
	public int blockID(String blockName) {
		return ColorConfig.cfg.getInt("Block IDs." + blockName);
	}

	public static Block concrete;

	public static Block concretePowderWhite;
	public static Block concretePowderOrange;
	public static Block concretePowderMagenta;
	public static Block concretePowderLightblue;
	public static Block concretePowderYellow;
	public static Block concretePowderLime;
	public static Block concretePowderPink;
	public static Block concretePowderGray;
	public static Block concretePowderSilver;
	public static Block concretePowderCyan;
	public static Block concretePowderPurple;
	public static Block concretePowderBlue;
	public static Block concretePowderBrown;
	public static Block concretePowderGreen;
	public static Block concretePowderRed;
	public static Block concretePowderBlack;

	public static Block bedWhite;
	public static Block bedOrange;
	public static Block bedMagenta;
	public static Block bedLightblue;
	public static Block bedYellow;
	public static Block bedLime;
	public static Block bedPink;
	public static Block bedGray;
	public static Block bedSilver;
	public static Block bedCyan;
	public static Block bedPurple;
	public static Block bedBlue;
	public static Block bedBrown;
	public static Block bedGreen;
	public static Block bedBlack;

	public static Block seatWhite;
	public static Block seatOrange;
	public static Block seatMagenta;
	public static Block seatLightblue;
	public static Block seatYellow;
	public static Block seatLime;
	public static Block seatPink;
	public static Block seatGray;
	public static Block seatSilver;
	public static Block seatCyan;
	public static Block seatPurple;
	public static Block seatBlue;
	public static Block seatBrown;
	public static Block seatGreen;
	public static Block seatBlack;


	public void initializeBlockDetails() {

		for (int color = 1; color < 17; color++) {
			CreativeHelper.setParent(concrete, color - 1, concretePowderBlack, 0);
		}

	}

	public void initializeBlocks() {

		BlockBuilder powder = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
			.setHardness(0.5f)
			.setResistance(0.5f)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL);

		BlockBuilder bed = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
			.setHardness(0.2f)
			.setResistance(1.0f)
			.setUseInternalLight()
			.setVisualUpdateOnMetadata()
			.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU);

		concrete = new BlockBuilder(MOD_ID)
			.setHardness(5.0f)
			.setResistance(25.0f)
			.setBlockModel(BlockModelConcretePainted::new)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setItemBlock(block -> new ItemBlockPainted(block, false))
			.build(new BlockConcrete("concrete", blockID("concrete"), Material.stone));

		concretePowderWhite = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("color:block/powder_white"))
			.build(new BlockPowder("concrete.powder.white", blockID("concretePowderWhite"),0));

		concretePowderOrange = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("color:block/powder_orange"))
			.build(new BlockPowder("concrete.powder.orange", blockID("concretePowderOrange"),1));

		concretePowderMagenta = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("color:block/powder_magenta"))
			.build(new BlockPowder("concrete.powder.magenta", blockID("concretePowderMagenta"),2));

		concretePowderLightblue = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("color:block/powder_lightblue"))
			.build(new BlockPowder("concrete.powder.lightblue", blockID("concretePowderLightblue"),3));

		concretePowderYellow = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("color:block/powder_yellow"))
			.build(new BlockPowder("concrete.powder.yellow", blockID("concretePowderYellow"),4));

		concretePowderLime = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("color:block/powder_lime"))
			.build(new BlockPowder("concrete.powder.lime", blockID("concretePowderLime"),5));

		concretePowderPink = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("color:block/powder_pink"))
			.build(new BlockPowder("concrete.powder.pink", blockID("concretePowderPink"),6));

		concretePowderGray = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("color:block/powder_gray"))
			.build(new BlockPowder("concrete.powder.gray", blockID("concretePowderGray"),7));

		concretePowderSilver = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("color:block/powder_silver"))
			.build(new BlockPowder("concrete.powder.silver", blockID("concretePowderSilver"),8));

		concretePowderCyan = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("color:block/powder_cyan"))
			.build(new BlockPowder("concrete.powder.cyan", blockID("concretePowderCyan"),9));

		concretePowderPurple = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("color:block/powder_purple"))
			.build(new BlockPowder("concrete.powder.purple", blockID("concretePowderPurple"),10));

		concretePowderBlue = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("color:block/powder_blue"))
			.build(new BlockPowder("concrete.powder.blue", blockID("concretePowderBlue"),11));

		concretePowderBrown = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("color:block/powder_brown"))
			.build(new BlockPowder("concrete.powder.brown", blockID("concretePowderBrown"),12));

		concretePowderGreen = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("color:block/powder_green"))
			.build(new BlockPowder("concrete.powder.green", blockID("concretePowderGreen"),13));

		concretePowderRed = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("color:block/powder_red"))
			.build(new BlockPowder("concrete.powder.red", blockID("concretePowderRed"),14));

		concretePowderBlack = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("color:block/powder_black"))
			.build(new BlockPowder("concrete.powder.black", blockID("concretePowderBlack"),15));


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

		bedLime = bed
			.setBlockModel(BlockModelLimeBed::new)
			.build(new BlockBed("bed.lime", blockID("bedLime")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedLime)};
				}
			});

		bedGreen = bed
			.setBlockModel(BlockModelGreenBed::new)
			.build(new BlockBed("bed.green", blockID("bedGreen")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedGreen)};
				}
			});

		bedCyan = bed
			.setBlockModel(BlockModelCyanBed::new)
			.build(new BlockBed("bed.cyan", blockID("bedCyan")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedCyan)};
				}
			});

		bedLightblue = bed
			.setBlockModel(BlockModelLightblueBed::new)
			.build(new BlockBed("bed.lightblue", blockID("bedLightblue")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedLightblue)};
				}
			});

		bedBlue = bed
			.setBlockModel(BlockModelBlueBed::new)
			.build(new BlockBed("bed.blue", blockID("bedBlue")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedBlue)};
				}
			});

		bedPurple = bed
			.setBlockModel(BlockModelPurpleBed::new)
			.build(new BlockBed("bed.purple", blockID("bedPurple")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedPurple)};
				}
			});

		bedMagenta = bed
			.setBlockModel(BlockModelMagentaBed::new)
			.build(new BlockBed("bed.magenta", blockID("bedMagenta")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedMagenta)};
				}
			});

		bedPink = bed
			.setBlockModel(BlockModelPinkBed::new)
			.build(new BlockBed("bed.pink", blockID("bedPink")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedPink)};
				}
			});

		bedBrown = bed
			.setBlockModel(BlockModelBrownBed::new)
			.build(new BlockBed("bed.brown", blockID("bedBrown")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedBrown)};
				}
			});

		bedWhite = bed
			.setBlockModel(BlockModelWhiteBed::new)
			.build(new BlockBed("bed.white", blockID("bedWhite")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedWhite)};
				}
			});

		bedSilver = bed
			.setBlockModel(BlockModelSilverBed::new)
			.build(new BlockBed("bed.silver", blockID("bedSilver")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedSilver)};
				}
			});

		bedGray = bed
			.setBlockModel(BlockModelGrayBed::new)
			.build(new BlockBed("bed.gray", blockID("bedGray")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedGray)};
				}
			});

		bedBlack = bed
			.setBlockModel(BlockModelBlackBed::new)
			.build(new BlockBed("bed.black", blockID("bedBlack")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedBlack)};
				}
			});



		seatOrange = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("color:block/seat/seat_orange_top", "minecraft:block/planks_oak", "color:block/bed/bed_orange_foot_front"))
			.build(new BlockSeat("seat.orange", blockID("seatOrange")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatOrange)};
				}
			});

		seatYellow = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("color:block/seat/seat_yellow_top", "minecraft:block/planks_oak", "color:block/bed/bed_yellow_foot_front"))
			.build(new BlockSeat("seat.yellow", blockID("seatYellow")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatYellow)};
				}
			});

		seatLime = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("color:block/seat/seat_lime_top", "minecraft:block/planks_oak", "color:block/bed/bed_lime_foot_front"))
			.build(new BlockSeat("seat.lime", blockID("seatLime")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatLime)};
				}
			});

		seatGreen = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("color:block/seat/seat_green_top", "minecraft:block/planks_oak", "color:block/bed/bed_green_foot_front"))
			.build(new BlockSeat("seat.green", blockID("seatGreen")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatGreen)};
				}
			});

		seatCyan = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("color:block/seat/seat_cyan_top", "minecraft:block/planks_oak", "color:block/bed/bed_cyan_foot_front"))
			.build(new BlockSeat("seat.cyan", blockID("seatCyan")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatCyan)};
				}
			});

		seatLightblue = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("color:block/seat/seat_lightblue_top", "minecraft:block/planks_oak", "color:block/bed/bed_lightblue_foot_front"))
			.build(new BlockSeat("seat.lightblue", blockID("seatLightblue")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatLightblue)};
				}
			});

		seatBlue = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("color:block/seat/seat_blue_top", "minecraft:block/planks_oak", "color:block/bed/bed_blue_foot_front"))
			.build(new BlockSeat("seat.blue", blockID("seatBlue")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatBlue)};
				}
			});

		seatPurple = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("color:block/seat/seat_purple_top", "minecraft:block/planks_oak", "color:block/bed/bed_purple_foot_front"))
			.build(new BlockSeat("seat.purple", blockID("seatPurple")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatPurple)};
				}
			});

		seatMagenta = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("color:block/seat/seat_magenta_top", "minecraft:block/planks_oak", "color:block/bed/bed_magenta_foot_front"))
			.build(new BlockSeat("seat.magenta", blockID("seatMagenta")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatMagenta)};
				}
			});

		seatPink = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("color:block/seat/seat_pink_top", "minecraft:block/planks_oak", "color:block/bed/bed_pink_foot_front"))
			.build(new BlockSeat("seat.pink", blockID("seatPink")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatPink)};
				}
			});

		seatBrown = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("color:block/seat/seat_brown_top", "minecraft:block/planks_oak", "color:block/bed/bed_brown_foot_front"))
			.build(new BlockSeat("seat.brown", blockID("seatBrown")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatBrown)};
				}
			});

		seatWhite = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("color:block/seat/seat_white_top", "minecraft:block/planks_oak", "color:block/bed/bed_white_foot_front"))
			.build(new BlockSeat("seat.white", blockID("seatWhite")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatWhite)};
				}
			});

		seatSilver = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("color:block/seat/seat_silver_top", "minecraft:block/planks_oak", "color:block/bed/bed_silver_foot_front"))
			.build(new BlockSeat("seat.silver", blockID("seatSilver")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatSilver)};
				}
			});

		seatGray = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("color:block/seat/seat_gray_top", "minecraft:block/planks_oak", "color:block/bed/bed_gray_foot_front"))
			.build(new BlockSeat("seat.gray", blockID("seatGray")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatGray)};
				}
			});

		seatBlack = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("color:block/seat/seat_black_top", "minecraft:block/planks_oak", "color:block/bed/bed_black_foot_front"))
			.build(new BlockSeat("seat.black", blockID("seatBlack")) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatBlack)};
				}
			});

	}

}
