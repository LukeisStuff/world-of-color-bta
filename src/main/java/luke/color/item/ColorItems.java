package luke.color.item;

import luke.color.block.ColorBlocks;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemPlaceable;
import turniplabs.halplibe.helper.ItemBuilder;

import static luke.color.ColorConfig.itemID;
import static luke.color.ColorMod.MOD_ID;

public class ColorItems {

    public static Item BED_WHITE;
    public static Item BED_ORANGE;
    public static Item BED_MAGENTA;
    public static Item BED_LIGHTBLUE;
    public static Item BED_YELLOW;
    public static Item BED_LIME;
    public static Item BED_PINK;
    public static Item BED_GRAY;
    public static Item BED_SILVER;
    public static Item BED_CYAN;
    public static Item BED_PURPLE;
    public static Item BED_BLUE;
    public static Item BED_BROWN;
    public static Item BED_GREEN;
    public static Item BED_BLACK;

    public static Item SEAT_WHITE;
    public static Item SEAT_ORANGE;
    public static Item SEAT_MAGENTA;
    public static Item SEAT_LIGHTBLUE;
    public static Item SEAT_YELLOW;
    public static Item SEAT_LIME;
    public static Item SEAT_PINK;
    public static Item SEAT_GRAY;
    public static Item SEAT_SILVER;
    public static Item SEAT_CYAN;
    public static Item SEAT_PURPLE;
    public static Item SEAT_BLUE;
    public static Item SEAT_BROWN;
    public static Item SEAT_GREEN;
    public static Item SEAT_BLACK;

    private static boolean hasInit = false;

    public static void init() {
        if (!hasInit) {
            hasInit = true;
            initializeItems();
        }
    }

    public static String itemKey(String string) {
        return MOD_ID + ":item/" + string;
    }

    public static void initializeItems() {

        BED_WHITE = new ItemBuilder(MOD_ID)
            .build(new ItemColorBed("bed.white", itemKey("bed_white"), itemID("BED_WHITE"), ColorBlocks.BED_WHITE).setMaxStackSize(1));

        BED_ORANGE = new ItemBuilder(MOD_ID)
            .build(new ItemColorBed("bed.orange", itemKey("bed_orange"), itemID("BED_ORANGE"), ColorBlocks.BED_ORANGE).setMaxStackSize(1));

        BED_MAGENTA = new ItemBuilder(MOD_ID)
            .build(new ItemColorBed("bed.magenta", itemKey("bed_magenta"), itemID("BED_MAGENTA"), ColorBlocks.BED_MAGENTA).setMaxStackSize(1));

        BED_LIGHTBLUE = new ItemBuilder(MOD_ID)
            .build(new ItemColorBed("bed.lightblue", itemKey("bed_lightblue"), itemID("BED_LIGHTBLUE"), ColorBlocks.BED_LIGHTBLUE).setMaxStackSize(1));

        BED_YELLOW = new ItemBuilder(MOD_ID)
            .build(new ItemColorBed("bed.yellow", itemKey("bed_yellow"), itemID("BED_YELLOW"), ColorBlocks.BED_YELLOW).setMaxStackSize(1));

        BED_LIME = new ItemBuilder(MOD_ID)
            .build(new ItemColorBed("bed.lime", itemKey("bed_lime"), itemID("BED_LIME"), ColorBlocks.BED_LIME).setMaxStackSize(1));

        BED_PINK = new ItemBuilder(MOD_ID)
            .build(new ItemColorBed("bed.pink", itemKey("bed_pink"), itemID("BED_PINK"), ColorBlocks.BED_PINK).setMaxStackSize(1));

        BED_GRAY = new ItemBuilder(MOD_ID)
            .build(new ItemColorBed("bed.gray", itemKey("bed_gray"), itemID("BED_GRAY"), ColorBlocks.BED_GRAY).setMaxStackSize(1));

        BED_SILVER = new ItemBuilder(MOD_ID)
            .build(new ItemColorBed("bed.silver", itemKey("bed_silver"), itemID("BED_SILVER"), ColorBlocks.BED_SILVER).setMaxStackSize(1));

        BED_CYAN = new ItemBuilder(MOD_ID)
            .build(new ItemColorBed("bed.cyan", itemKey("bed_cyan"), itemID("BED_CYAN"), ColorBlocks.BED_CYAN).setMaxStackSize(1));

        BED_PURPLE = new ItemBuilder(MOD_ID)
            .build(new ItemColorBed("bed.purple", itemKey("bed_purple"), itemID("BED_PURPLE"), ColorBlocks.BED_PURPLE).setMaxStackSize(1));

        BED_BLUE = new ItemBuilder(MOD_ID)
            .build(new ItemColorBed("bed.blue", itemKey("bed_blue"), itemID("BED_BLUE"), ColorBlocks.BED_BLUE).setMaxStackSize(1));

        BED_BROWN = new ItemBuilder(MOD_ID)
            .build(new ItemColorBed("bed.brown", itemKey("bed_brown"), itemID("BED_BROWN"), ColorBlocks.BED_BROWN).setMaxStackSize(1));

        BED_GREEN = new ItemBuilder(MOD_ID)
            .build(new ItemColorBed("bed.green", itemKey("bed_green"), itemID("BED_GREEN"), ColorBlocks.BED_GREEN).setMaxStackSize(1));

        BED_BLACK = new ItemBuilder(MOD_ID)
            .build(new ItemColorBed("bed.black", itemKey("bed_black"), itemID("BED_BLACK"), ColorBlocks.BED_BLACK).setMaxStackSize(1));


        SEAT_WHITE = new ItemBuilder(MOD_ID)
            .build(new ItemPlaceable("seat.white", itemKey("seat_white"), itemID("SEAT_WHITE"), ColorBlocks.SEAT_WHITE).setMaxStackSize(1));

        SEAT_ORANGE = new ItemBuilder(MOD_ID)
            .build(new ItemPlaceable("seat.orange", itemKey("seat_orange"), itemID("SEAT_ORANGE"), ColorBlocks.SEAT_ORANGE).setMaxStackSize(1));

        SEAT_MAGENTA = new ItemBuilder(MOD_ID)
            .build(new ItemPlaceable("seat.magenta", itemKey("seat_magenta"), itemID("SEAT_MAGENTA"), ColorBlocks.SEAT_MAGENTA).setMaxStackSize(1));

        SEAT_LIGHTBLUE = new ItemBuilder(MOD_ID)
            .build(new ItemPlaceable("seat.lightblue", itemKey("seat_lightblue"), itemID("SEAT_LIGHTBLUE"), ColorBlocks.SEAT_LIGHTBLUE).setMaxStackSize(1));

        SEAT_YELLOW = new ItemBuilder(MOD_ID)
            .build(new ItemPlaceable("seat.yellow", itemKey("seat_yellow"), itemID("SEAT_YELLOW"), ColorBlocks.SEAT_YELLOW).setMaxStackSize(1));

        SEAT_LIME = new ItemBuilder(MOD_ID)
            .build(new ItemPlaceable("seat.lime", itemKey("seat_lime"), itemID("SEAT_LIME"), ColorBlocks.SEAT_LIME).setMaxStackSize(1));

        SEAT_PINK = new ItemBuilder(MOD_ID)
            .build(new ItemPlaceable("seat.pink", itemKey("seat_pink"), itemID("SEAT_PINK"), ColorBlocks.SEAT_PINK).setMaxStackSize(1));

        SEAT_GRAY = new ItemBuilder(MOD_ID)
            .build(new ItemPlaceable("seat.gray", itemKey("seat_gray"), itemID("SEAT_GRAY"), ColorBlocks.SEAT_GRAY).setMaxStackSize(1));

        SEAT_SILVER = new ItemBuilder(MOD_ID)
            .build(new ItemPlaceable("seat.silver", itemKey("seat_silver"), itemID("SEAT_SILVER"), ColorBlocks.SEAT_SILVER).setMaxStackSize(1));

        SEAT_CYAN = new ItemBuilder(MOD_ID)
            .build(new ItemPlaceable("seat.cyan", itemKey("seat_cyan"), itemID("SEAT_CYAN"), ColorBlocks.SEAT_CYAN).setMaxStackSize(1));

        SEAT_PURPLE = new ItemBuilder(MOD_ID)
            .build(new ItemPlaceable("seat.purple", itemKey("seat_purple"), itemID("SEAT_PURPLE"), ColorBlocks.SEAT_PURPLE).setMaxStackSize(1));

        SEAT_BLUE = new ItemBuilder(MOD_ID)
            .build(new ItemPlaceable("seat.blue", itemKey("seat_blue"), itemID("SEAT_BLUE"), ColorBlocks.SEAT_BLUE).setMaxStackSize(1));

        SEAT_BROWN = new ItemBuilder(MOD_ID)
            .build(new ItemPlaceable("seat.brown", itemKey("seat_brown"), itemID("SEAT_BROWN"), ColorBlocks.SEAT_BROWN).setMaxStackSize(1));

        SEAT_GREEN = new ItemBuilder(MOD_ID)
            .build(new ItemPlaceable("seat.green", itemKey("seat_green"), itemID("SEAT_GREEN"), ColorBlocks.SEAT_GREEN).setMaxStackSize(1));

        SEAT_BLACK = new ItemBuilder(MOD_ID)
            .build(new ItemPlaceable("seat.black", itemKey("seat_black"), itemID("SEAT_BLACK"), ColorBlocks.SEAT_BLACK).setMaxStackSize(1));

    }


}
