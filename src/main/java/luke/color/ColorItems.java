package luke.color;

import luke.color.item.ItemColorBed;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemPlaceable;
import turniplabs.halplibe.helper.ItemBuilder;

import static luke.color.ColorMod.MOD_ID;

public class ColorItems {

	int itemID = 21200;

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
			.build(new ItemColorBed("bed.orange", "color:item/bed_orange", itemID++, ColorBlocks.bedOrange).setMaxStackSize(1));

		bedYellow = new ItemBuilder(MOD_ID)
			.build(new ItemColorBed("bed.yellow", "color:item/bed_yellow", itemID++, ColorBlocks.bedYellow).setMaxStackSize(1));

		bedLime = new ItemBuilder(MOD_ID)
			.build(new ItemColorBed("bed.lime", "color:item/bed_lime", itemID++, ColorBlocks.bedLime).setMaxStackSize(1));

		bedGreen = new ItemBuilder(MOD_ID)
			.build(new ItemColorBed("bed.green", "color:item/bed_green", itemID++, ColorBlocks.bedGreen).setMaxStackSize(1));

		bedCyan = new ItemBuilder(MOD_ID)
			.build(new ItemColorBed("bed.cyan", "color:item/bed_cyan", itemID++, ColorBlocks.bedCyan).setMaxStackSize(1));

		bedLightblue = new ItemBuilder(MOD_ID)
			.build(new ItemColorBed("bed.lightblue", "color:item/bed_lightblue", itemID++, ColorBlocks.bedLightblue).setMaxStackSize(1));

		bedBlue = new ItemBuilder(MOD_ID)
			.build(new ItemColorBed("bed.blue", "color:item/bed_blue", itemID++, ColorBlocks.bedBlue).setMaxStackSize(1));

		bedPurple = new ItemBuilder(MOD_ID)
			.build(new ItemColorBed("bed.purple", "color:item/bed_purple", itemID++, ColorBlocks.bedPurple).setMaxStackSize(1));

		bedMagenta = new ItemBuilder(MOD_ID)
			.build(new ItemColorBed("bed.magenta", "color:item/bed_magenta", itemID++, ColorBlocks.bedMagenta).setMaxStackSize(1));

		bedPink = new ItemBuilder(MOD_ID)
			.build(new ItemColorBed("bed.pink", "color:item/bed_pink", itemID++, ColorBlocks.bedPink).setMaxStackSize(1));

		bedBrown = new ItemBuilder(MOD_ID)
			.build(new ItemColorBed("bed.brown", "color:item/bed_brown", itemID++, ColorBlocks.bedBrown).setMaxStackSize(1));

		bedWhite = new ItemBuilder(MOD_ID)
			.build(new ItemColorBed("bed.white", "color:item/bed_white", itemID++, ColorBlocks.bedWhite).setMaxStackSize(1));

		bedSilver = new ItemBuilder(MOD_ID)
			.build(new ItemColorBed("bed.silver", "color:item/bed_silver", itemID++, ColorBlocks.bedSilver).setMaxStackSize(1));

		bedGray = new ItemBuilder(MOD_ID)
			.build(new ItemColorBed("bed.gray", "color:item/bed_gray", itemID++, ColorBlocks.bedGray).setMaxStackSize(1));

		bedBlack = new ItemBuilder(MOD_ID)
			.build(new ItemColorBed("bed.black", "color:item/bed_black", itemID++, ColorBlocks.bedBlack).setMaxStackSize(1));



		seatOrange = new ItemBuilder(MOD_ID)
			.build(new ItemPlaceable("seat.orange", "color:item/seat_orange", itemID++, ColorBlocks.seatOrange));

		seatYellow = new ItemBuilder(MOD_ID)
			.build(new ItemPlaceable("seat.yellow", "color:item/seat_yellow", itemID++, ColorBlocks.seatYellow));

		seatLime = new ItemBuilder(MOD_ID)
			.build(new ItemPlaceable("seat.lime", "color:item/seat_lime", itemID++, ColorBlocks.seatLime));

		seatGreen = new ItemBuilder(MOD_ID)
			.build(new ItemPlaceable("seat.green", "color:item/seat_green", itemID++, ColorBlocks.seatGreen));

		seatCyan = new ItemBuilder(MOD_ID)
			.build(new ItemPlaceable("seat.cyan", "color:item/seat_cyan", itemID++, ColorBlocks.seatCyan));

		seatLightblue = new ItemBuilder(MOD_ID)
			.build(new ItemPlaceable("seat.lightblue", "color:item/seat_lightblue", itemID++, ColorBlocks.seatLightblue));

		seatBlue = new ItemBuilder(MOD_ID)
			.build(new ItemPlaceable("seat.blue", "color:item/seat_blue", itemID++, ColorBlocks.seatBlue));

		seatPurple = new ItemBuilder(MOD_ID)
			.build(new ItemPlaceable("seat.purple", "color:item/seat_purple", itemID++, ColorBlocks.seatPurple));

		seatMagenta = new ItemBuilder(MOD_ID)
			.build(new ItemPlaceable("seat.magenta", "color:item/seat_magenta", itemID++, ColorBlocks.seatMagenta));

		seatPink = new ItemBuilder(MOD_ID)
			.build(new ItemPlaceable("seat.pink", "color:item/seat_pink", itemID++, ColorBlocks.seatPink));

		seatBrown = new ItemBuilder(MOD_ID)
			.build(new ItemPlaceable("seat.brown", "color:item/seat_brown", itemID++, ColorBlocks.seatBrown));

		seatWhite = new ItemBuilder(MOD_ID)
			.build(new ItemPlaceable("seat.white", "color:item/seat_white", itemID++, ColorBlocks.seatWhite));

		seatSilver = new ItemBuilder(MOD_ID)
			.build(new ItemPlaceable("seat.silver", "color:item/seat_silver", itemID++, ColorBlocks.seatSilver));

		seatGray = new ItemBuilder(MOD_ID)
			.build(new ItemPlaceable("seat.gray", "color:item/seat_gray", itemID++, ColorBlocks.seatGray));

		seatBlack = new ItemBuilder(MOD_ID)
			.build(new ItemPlaceable("seat.black", "color:item/seat_black", itemID++, ColorBlocks.seatBlack));



	}


}
