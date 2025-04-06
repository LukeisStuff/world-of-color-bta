package luke.color;

import luke.color.blockmodel.*;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.BlockModelSeat;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static luke.color.ColorBlocks.*;

public class ColorModels implements ModelEntrypoint {
	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {
		ModelHelper.setBlockModel(concrete, () -> new BlockModelConcretePainted<>(concrete));
		ModelHelper.setBlockModel(concretePowder, () -> new BlockModelConcretePowder<>(concretePowder));
		ModelHelper.setBlockModel(concreteBaked, () -> new BlockModelConcreteBaked<>(concreteBaked));

		ModelHelper.setBlockModel(bedWhite, () -> new BlockModelWhiteBed<>(bedWhite));
		ModelHelper.setBlockModel(bedOrange, () -> new BlockModelOrangeBed<>(bedOrange));
		ModelHelper.setBlockModel(bedMagenta, () -> new BlockModelMagentaBed<>(bedMagenta));
		ModelHelper.setBlockModel(bedYellow, () -> new BlockModelYellowBed<>(bedYellow));
		ModelHelper.setBlockModel(bedSilver, () -> new BlockModelSilverBed<>(bedSilver));
		ModelHelper.setBlockModel(bedPurple, () -> new BlockModelPurpleBed<>(bedPurple));
		ModelHelper.setBlockModel(bedPink, () -> new BlockModelPinkBed<>(bedPink));
		ModelHelper.setBlockModel(bedLime, () -> new BlockModelLimeBed<>(bedLime));
		ModelHelper.setBlockModel(bedLightblue, () -> new BlockModelLightblueBed<>(bedLightblue));
		ModelHelper.setBlockModel(bedGreen, () -> new BlockModelGreenBed<>(bedGreen));
		ModelHelper.setBlockModel(bedGray, () -> new BlockModelGrayBed<>(bedGray));
		ModelHelper.setBlockModel(bedCyan, () -> new BlockModelCyanBed<>(bedCyan));
		ModelHelper.setBlockModel(bedBlack, () -> new BlockModelBlackBed<>(bedBlack));
		ModelHelper.setBlockModel(bedBlue, () -> new BlockModelBlueBed<>(bedBlue));
		ModelHelper.setBlockModel(bedBrown, () -> new BlockModelBrownBed<>(bedBrown));



		ModelHelper.setBlockModel(seatWhite, () -> new BlockModelSeat<>(seatWhite)
			.setTex(0, "color:block/seat/seat_white_top", Side.TOP)
			.setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
			.setTex(0, "color:block/bed/bed_white_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

		ModelHelper.setBlockModel(seatOrange, () -> new BlockModelSeat<>(seatOrange)
			.setTex(0, "color:block/seat/seat_orange_top", Side.TOP)
			.setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
			.setTex(0, "color:block/bed/bed_orange_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

		ModelHelper.setBlockModel(seatMagenta, () -> new BlockModelSeat<>(seatMagenta)
			.setTex(0, "color:block/seat/seat_magenta_top", Side.TOP)
			.setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
			.setTex(0, "color:block/bed/bed_magenta_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

		ModelHelper.setBlockModel(seatYellow, () -> new BlockModelSeat<>(seatYellow)
			.setTex(0, "color:block/seat/seat_yellow_top", Side.TOP)
			.setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
			.setTex(0, "color:block/bed/bed_yellow_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

		ModelHelper.setBlockModel(seatSilver, () -> new BlockModelSeat<>(seatSilver)
			.setTex(0, "color:block/seat/seat_silver_top", Side.TOP)
			.setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
			.setTex(0, "color:block/bed/bed_silver_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

		ModelHelper.setBlockModel(seatGray, () -> new BlockModelSeat<>(seatGray)
			.setTex(0, "color:block/seat/seat_gray_top", Side.TOP)
			.setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
			.setTex(0, "color:block/bed/bed_gray_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

		ModelHelper.setBlockModel(seatBlack, () -> new BlockModelSeat<>(seatBlack)
			.setTex(0, "color:block/seat/seat_black_top", Side.TOP)
			.setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
			.setTex(0, "color:block/bed/bed_black_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

		ModelHelper.setBlockModel(seatBrown, () -> new BlockModelSeat<>(seatBrown)
			.setTex(0, "color:block/seat/seat_brown_top", Side.TOP)
			.setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
			.setTex(0, "color:block/bed/bed_brown_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

		ModelHelper.setBlockModel(seatGreen, () -> new BlockModelSeat<>(seatGreen)
			.setTex(0, "color:block/seat/seat_green_top", Side.TOP)
			.setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
			.setTex(0, "color:block/bed/bed_green_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

		ModelHelper.setBlockModel(seatLime, () -> new BlockModelSeat<>(seatLime)
			.setTex(0, "color:block/seat/seat_lime_top", Side.TOP)
			.setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
			.setTex(0, "color:block/bed/bed_lime_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

		ModelHelper.setBlockModel(seatBlue, () -> new BlockModelSeat<>(seatBlue)
			.setTex(0, "color:block/seat/seat_blue_top", Side.TOP)
			.setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
			.setTex(0, "color:block/bed/bed_blue_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

		ModelHelper.setBlockModel(seatCyan, () -> new BlockModelSeat<>(seatCyan)
			.setTex(0, "color:block/seat/seat_cyan_top", Side.TOP)
			.setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
			.setTex(0, "color:block/bed/bed_cyan_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

		ModelHelper.setBlockModel(seatPurple, () -> new BlockModelSeat<>(seatPurple)
			.setTex(0, "color:block/seat/seat_purple_top", Side.TOP)
			.setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
			.setTex(0, "color:block/bed/bed_purple_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

		ModelHelper.setBlockModel(seatPink, () -> new BlockModelSeat<>(seatPink)
			.setTex(0, "color:block/seat/seat_pink_top", Side.TOP)
			.setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
			.setTex(0, "color:block/bed/bed_pink_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

		ModelHelper.setBlockModel(seatLightblue, () -> new BlockModelSeat<>(seatLightblue)
			.setTex(0, "color:block/seat/seat_lightblue_top", Side.TOP)
			.setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
			.setTex(0, "color:block/bed/bed_lightblue_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));



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
