package luke.color;

import luke.color.item.ItemColorBed;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemPlaceable;
import turniplabs.halplibe.helper.ItemBuilder;

import static luke.color.ColorMod.MOD_ID;

public class ColorItems {

	private int itemID(String blockName) {
		return ColorConfig.cfg.getInt("Item IDs." + blockName);
	}

	public static Item bedWhite;
	public static Item bedOrange;
	public static Item bedMagenta;
	public static Item bedLightblue;
	public static Item bedYellow;
	public static Item bedLime;
	public static Item bedPink;
	public static Item bedGray;
	public static Item bedSilver;
	public static Item bedCyan;
	public static Item bedPurple;
	public static Item bedBlue;
	public static Item bedBrown;
	public static Item bedGreen;
	public static Item bedBlack;

	public static Item seatWhite;
	public static Item seatOrange;
	public static Item seatMagenta;
	public static Item seatLightblue;
	public static Item seatYellow;
	public static Item seatLime;
	public static Item seatPink;
	public static Item seatGray;
	public static Item seatSilver;
	public static Item seatCyan;
	public static Item seatPurple;
	public static Item seatBlue;
	public static Item seatBrown;
	public static Item seatGreen;
	public static Item seatBlack;

	public void initilizeItems() {

		bedOrange = new ItemBuilder(MOD_ID)
			.setIcon("color:item/orange_bed")
			.build(new ItemColorBed("bed.orange", itemID("bedOrange"), ColorBlocks.bedOrange));

		bedYellow = new ItemBuilder(MOD_ID)
			.setIcon("color:item/yellow_bed")
			.build(new ItemColorBed("bed.yellow", itemID("bedYellow"), ColorBlocks.bedYellow));

		bedLime = new ItemBuilder(MOD_ID)
			.setIcon("color:item/lime_bed")
			.build(new ItemColorBed("bed.lime", itemID("bedLime"), ColorBlocks.bedLime));

		bedGreen = new ItemBuilder(MOD_ID)
			.setIcon("color:item/green_bed")
			.build(new ItemColorBed("bed.green", itemID("bedGreen"), ColorBlocks.bedGreen));

		bedCyan = new ItemBuilder(MOD_ID)
			.setIcon("color:item/cyan_bed")
			.build(new ItemColorBed("bed.cyan", itemID("bedCyan"), ColorBlocks.bedCyan));

		bedLightblue = new ItemBuilder(MOD_ID)
			.setIcon("color:item/lightblue_bed")
			.build(new ItemColorBed("bed.lightblue", itemID("bedLightblue"), ColorBlocks.bedLightblue));

		bedBlue = new ItemBuilder(MOD_ID)
			.setIcon("color:item/blue_bed")
			.build(new ItemColorBed("bed.blue", itemID("bedBlue"), ColorBlocks.bedBlue));

		bedPurple = new ItemBuilder(MOD_ID)
			.setIcon("color:item/purple_bed")
			.build(new ItemColorBed("bed.purple", itemID("bedPurple"), ColorBlocks.bedPurple));

		bedMagenta = new ItemBuilder(MOD_ID)
			.setIcon("color:item/magenta_bed")
			.build(new ItemColorBed("bed.magenta", itemID("bedMagenta"), ColorBlocks.bedMagenta));

		bedPink = new ItemBuilder(MOD_ID)
			.setIcon("color:item/pink_bed")
			.build(new ItemColorBed("bed.pink", itemID("bedPink"), ColorBlocks.bedPink));

		bedBrown = new ItemBuilder(MOD_ID)
			.setIcon("color:item/brown_bed")
			.build(new ItemColorBed("bed.brown", itemID("bedBrown"), ColorBlocks.bedBrown));

		bedWhite = new ItemBuilder(MOD_ID)
			.setIcon("color:item/white_bed")
			.build(new ItemColorBed("bed.white", itemID("bedWhite"), ColorBlocks.bedWhite));

		bedSilver = new ItemBuilder(MOD_ID)
			.setIcon("color:item/silver_bed")
			.build(new ItemColorBed("bed.silver", itemID("bedSilver"), ColorBlocks.bedSilver));

		bedGray = new ItemBuilder(MOD_ID)
			.setIcon("color:item/gray_bed")
			.build(new ItemColorBed("bed.gray", itemID("bedGray"), ColorBlocks.bedGray));

		bedBlack = new ItemBuilder(MOD_ID)
			.setIcon("color:item/black_bed")
			.build(new ItemColorBed("bed.black", itemID("bedBlack"), ColorBlocks.bedBlack));



		seatOrange = new ItemBuilder(MOD_ID)
			.setIcon("color:item/orange_seat")
			.build(new ItemPlaceable("seat.orange", itemID("seatOrange"), ColorBlocks.seatOrange));

		seatYellow = new ItemBuilder(MOD_ID)
			.setIcon("color:item/yellow_seat")
			.build(new ItemPlaceable("seat.yellow", itemID("seatYellow"), ColorBlocks.seatYellow));

		seatLime = new ItemBuilder(MOD_ID)
			.setIcon("color:item/lime_seat")
			.build(new ItemPlaceable("seat.lime", itemID("seatLime"), ColorBlocks.seatLime));

		seatGreen = new ItemBuilder(MOD_ID)
			.setIcon("color:item/green_seat")
			.build(new ItemPlaceable("seat.green", itemID("seatGreen"), ColorBlocks.seatGreen));

		seatCyan = new ItemBuilder(MOD_ID)
			.setIcon("color:item/cyan_seat")
			.build(new ItemPlaceable("seat.cyan", itemID("seatCyan"), ColorBlocks.seatCyan));

		seatLightblue = new ItemBuilder(MOD_ID)
			.setIcon("color:item/lightblue_seat")
			.build(new ItemPlaceable("seat.lightblue", itemID("seatLightblue"), ColorBlocks.seatLightblue));

		seatBlue = new ItemBuilder(MOD_ID)
			.setIcon("color:item/blue_seat")
			.build(new ItemPlaceable("seat.blue", itemID("seatBlue"), ColorBlocks.seatBlue));

		seatPurple = new ItemBuilder(MOD_ID)
			.setIcon("color:item/purple_seat")
			.build(new ItemPlaceable("seat.purple", itemID("seatPurple"), ColorBlocks.seatPurple));

		seatMagenta = new ItemBuilder(MOD_ID)
			.setIcon("color:item/magenta_seat")
			.build(new ItemPlaceable("seat.magenta", itemID("seatMagenta"), ColorBlocks.seatMagenta));

		seatPink = new ItemBuilder(MOD_ID)
			.setIcon("color:item/pink_seat")
			.build(new ItemPlaceable("seat.pink", itemID("seatPink"), ColorBlocks.seatPink));

		seatBrown = new ItemBuilder(MOD_ID)
			.setIcon("color:item/brown_seat")
			.build(new ItemPlaceable("seat.brown", itemID("seatBrown"), ColorBlocks.seatBrown));

		seatWhite = new ItemBuilder(MOD_ID)
			.setIcon("color:item/white_seat")
			.build(new ItemPlaceable("seat.white", itemID("seatWhite"), ColorBlocks.seatWhite));

		seatSilver = new ItemBuilder(MOD_ID)
			.setIcon("color:item/silver_seat")
			.build(new ItemPlaceable("seat.silver", itemID("seatSilver"), ColorBlocks.seatSilver));

		seatGray = new ItemBuilder(MOD_ID)
			.setIcon("color:item/gray_seat")
			.build(new ItemPlaceable("seat.gray", itemID("seatGray"), ColorBlocks.seatGray));

		seatBlack = new ItemBuilder(MOD_ID)
			.setIcon("color:item/black_seat")
			.build(new ItemPlaceable("seat.black", itemID("seatBlack"), ColorBlocks.seatBlack));



	}


}
