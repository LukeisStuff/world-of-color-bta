package luke.color.block;

import luke.color.item.ColorItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.sound.BlockSound;
import turniplabs.halplibe.helper.BlockBuilder;

import static luke.color.ColorConfig.blockID;
import static luke.color.ColorMod.MOD_ID;

public class ColorBlocks {

    public static Block<?> CONCRETE;
    public static Block<?> CONCRETE_POWDER;
    public static Block<?> CONCRETE_GLAZED;

    public static Block<?> BED_WHITE;
    public static Block<?> BED_ORANGE;
    public static Block<?> BED_MAGENTA;
    public static Block<?> BED_LIGHTBLUE;
    public static Block<?> BED_YELLOW;
    public static Block<?> BED_LIME;
    public static Block<?> BED_PINK;
    public static Block<?> BED_GRAY;
    public static Block<?> BED_SILVER;
    public static Block<?> BED_CYAN;
    public static Block<?> BED_PURPLE;
    public static Block<?> BED_BLUE;
    public static Block<?> BED_BROWN;
    public static Block<?> BED_GREEN;
    public static Block<?> BED_BLACK;

    public static Block<?> SEAT_WHITE;
    public static Block<?> SEAT_ORANGE;
    public static Block<?> SEAT_MAGENTA;
    public static Block<?> SEAT_LIGHTBLUE;
    public static Block<?> SEAT_YELLOW;
    public static Block<?> SEAT_LIME;
    public static Block<?> SEAT_PINK;
    public static Block<?> SEAT_GRAY;
    public static Block<?> SEAT_SILVER;
    public static Block<?> SEAT_CYAN;
    public static Block<?> SEAT_PURPLE;
    public static Block<?> SEAT_BLUE;
    public static Block<?> SEAT_BROWN;
    public static Block<?> SEAT_GREEN;
    public static Block<?> SEAT_BLACK;

    private static boolean hasInit = false;

    public static void init() {
        if (!hasInit) {
            hasInit = true;
            initializeBlocks();
        }
    }

    public static void initializeBlocks() {

        CONCRETE = new BlockBuilder(MOD_ID)
            .setHardness(5.0f)
            .setResistance(25.0f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .setBlockItem(block -> new ItemBlockPainted<>(block, false))
            .build("concrete", "concrete", blockID("CONCRETE"), BlockLogicConcrete::new);

        CONCRETE_POWDER = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
            .setHardness(0.5f)
            .setResistance(0.5f)
            .setTags(BlockTags.MINEABLE_BY_SHOVEL)
            .setBlockItem(block -> new ItemBlockPainted<>(block, false))
            .build("concrete.powder", "concrete_powder", blockID("CONCRETE_POWDER"), BlockLogicPowder::new);

        CONCRETE_GLAZED = new BlockBuilder(MOD_ID)
            .setHardness(5.0f)
            .setResistance(25.0f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .setBlockItem(block -> new ItemBlockPainted<>(block, true))
            .build("concrete.glazed", "concrete_glazed", blockID("CONCRETE_GLAZED"), block -> new BlockLogicConcreteGlazed(block, Material.stone));

        BlockBuilder bedBuilder = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(0.2f)
            .setResistance(1.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU);

        BED_WHITE = bedBuilder.build("bed.white", "bed_white", blockID("BED_WHITE"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.BED_WHITE)));
        BED_ORANGE = bedBuilder.build("bed.orange", "bed_orange", blockID("BED_ORANGE"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.BED_ORANGE)));
        BED_MAGENTA = bedBuilder.build("bed.magenta", "bed_magenta", blockID("BED_MAGENTA"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.BED_MAGENTA)));
        BED_LIGHTBLUE = bedBuilder.build("bed.lightblue", "bed_lightblue", blockID("BED_LIGHTBLUE"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.BED_LIGHTBLUE)));
        BED_YELLOW = bedBuilder.build("bed.yellow", "bed_yellow", blockID("BED_YELLOW"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.BED_YELLOW)));
        BED_LIME = bedBuilder.build("bed.lime", "bed_lime", blockID("BED_LIME"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.BED_LIME)));
        BED_PINK = bedBuilder.build("bed.pink", "bed_pink", blockID("BED_PINK"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.BED_PINK)));
        BED_GRAY = bedBuilder.build("bed.gray", "bed_gray", blockID("BED_GRAY"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.BED_GRAY)));
        BED_SILVER = bedBuilder.build("bed.silver", "bed_silver", blockID("BED_SILVER"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.BED_SILVER)));
        BED_CYAN = bedBuilder.build("bed.cyan", "bed_cyan", blockID("BED_CYAN"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.BED_CYAN)));
        BED_PURPLE = bedBuilder.build("bed.purple", "bed_purple", blockID("BED_PURPLE"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.BED_PURPLE)));
        BED_BLUE = bedBuilder.build("bed.blue", "bed_blue", blockID("BED_BLUE"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.BED_BLUE)));
        BED_BROWN = bedBuilder.build("bed.brown", "bed_brown", blockID("BED_BROWN"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.BED_BROWN)));
        BED_GREEN = bedBuilder.build("bed.green", "bed_green", blockID("BED_GREEN"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.BED_GREEN)));
        BED_BLACK = bedBuilder.build("bed.black", "bed_black", blockID("BED_BLACK"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.BED_BLACK)));

        SEAT_WHITE = bedBuilder.build("seat.white", "seat_white", blockID("SEAT_WHITE"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.SEAT_WHITE)));
        SEAT_ORANGE = bedBuilder.build("seat.orange", "seat_orange", blockID("SEAT_ORANGE"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.SEAT_ORANGE)));
        SEAT_MAGENTA = bedBuilder.build("seat.magenta", "seat_magenta", blockID("SEAT_MAGENTA"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.SEAT_MAGENTA)));
        SEAT_LIGHTBLUE = bedBuilder.build("seat.lightblue", "seat_lightblue", blockID("SEAT_LIGHTBLUE"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.SEAT_LIGHTBLUE)));
        SEAT_YELLOW = bedBuilder.build("seat.yellow", "seat_yellow", blockID("SEAT_YELLOW"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.SEAT_YELLOW)));
        SEAT_LIME = bedBuilder.build("seat.lime", "seat_lime", blockID("SEAT_LIME"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.SEAT_LIME)));
        SEAT_PINK = bedBuilder.build("seat.pink", "seat_pink", blockID("SEAT_PINK"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.SEAT_PINK)));
        SEAT_GRAY = bedBuilder.build("seat.gray", "seat_gray", blockID("SEAT_GRAY"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.SEAT_GRAY)));
        SEAT_SILVER = bedBuilder.build("seat.silver", "seat_silver", blockID("SEAT_SILVER"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.SEAT_SILVER)));
        SEAT_CYAN = bedBuilder.build("seat.cyan", "seat_cyan", blockID("SEAT_CYAN"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.SEAT_CYAN)));
        SEAT_PURPLE = bedBuilder.build("seat.purple", "seat_purple", blockID("SEAT_PURPLE"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.SEAT_PURPLE)));
        SEAT_BLUE = bedBuilder.build("seat.blue", "seat_blue", blockID("SEAT_BLUE"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.SEAT_BLUE)));
        SEAT_BROWN = bedBuilder.build("seat.brown", "seat_brown", blockID("SEAT_BROWN"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.SEAT_BROWN)));
        SEAT_GREEN = bedBuilder.build("seat.green", "seat_green", blockID("SEAT_GREEN"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.SEAT_GREEN)));
        SEAT_BLACK = bedBuilder.build("seat.black", "seat_black", blockID("SEAT_BLACK"), b -> new BlockLogicBedColored(b, new ItemStack(ColorItems.SEAT_BLACK)));
    }
}
