package luke.color;

import luke.color.blockmodel.*;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.BlockModelSeat;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static luke.color.ColorBlocks.*;
import static luke.color.ColorMod.MOD_ID;

public class ColorModels implements ModelEntrypoint {
	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {
		ModelHelper.setBlockModel(concrete, () -> new BlockModelConcretePainted<>(concrete));
		ModelHelper.setBlockModel(concretePowder, () -> new BlockModelConcretePowder<>(concretePowder));

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
		ModelHelper.setItemModel(ColorItems.bedWhite, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.bedWhite, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/white_bed"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.bedSilver, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.bedSilver, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/silver_bed"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.bedGray, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.bedGray, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/gray_bed"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.bedBlack, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.bedBlack, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/black_bed"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.bedBrown, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.bedBrown, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/brown_bed"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.bedOrange, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.bedOrange, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/orange_bed"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.bedYellow, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.bedYellow, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/yellow_bed"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.bedLime, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.bedLime, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/lime_bed"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.bedGreen, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.bedGreen, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/green_bed"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.bedCyan, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.bedCyan, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/cyan_bed"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.bedLightblue, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.bedLightblue, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/lightblue_bed"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.bedBlue, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.bedBlue, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/blue_bed"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.bedPurple, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.bedPurple, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/purple_bed"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.bedMagenta, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.bedMagenta, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/magenta_bed"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.bedPink, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.bedPink, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/pink_bed"));
			return itemModelStandard;
		});



		ModelHelper.setItemModel(ColorItems.seatWhite, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.seatWhite, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/white_seat"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.seatSilver, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.seatSilver, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/silver_seat"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.seatGray, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.seatGray, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/gray_seat"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.seatBlack, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.seatBlack, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/black_seat"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.seatBrown, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.seatBrown, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/brown_seat"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.seatOrange, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.seatOrange, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/orange_seat"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.seatYellow, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.seatYellow, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/yellow_seat"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.seatLime, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.seatLime, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/lime_seat"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.seatGreen, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.seatGreen, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/green_seat"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.seatCyan, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.seatCyan, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/cyan_seat"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.seatLightblue, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.seatLightblue, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/lightblue_seat"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.seatBlue, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.seatBlue, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/blue_seat"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.seatPurple, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.seatPurple, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/purple_seat"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.seatMagenta, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.seatMagenta, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/magenta_seat"));
			return itemModelStandard;
		});
		ModelHelper.setItemModel(ColorItems.seatPink, () -> {
			ItemModelStandard itemModelStandard = new ItemModelStandard(ColorItems.seatPink, MOD_ID);
			itemModelStandard.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/pink_seat"));
			return itemModelStandard;
		});


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
