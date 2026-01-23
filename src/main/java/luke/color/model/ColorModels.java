package luke.color.model;

import luke.color.block.ColorBlocks;
import luke.color.entity.MobParrot;
import luke.color.entity.MobRendererParrot;
import luke.color.entity.ModelParrot;
import luke.color.item.ColorItems;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.BlockModelSeat;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static luke.color.block.ColorBlocks.*;

public class ColorModels implements ModelEntrypoint {
    @Override
    public void initBlockModels(BlockModelDispatcher dispatcher) {
        dispatcher.addDispatch(CONCRETE, new BlockModelConcrete<>(CONCRETE, "concrete"));
        dispatcher.addDispatch(CONCRETE_POWDER, new BlockModelConcrete<>(CONCRETE_POWDER, "concrete_powder"));
        ModelHelper.setBlockModel(CONCRETE_GLAZED, () -> new BlockModelGlazedConcrete<>(CONCRETE_GLAZED));

        dispatcher.addDispatch(BED_WHITE, new BlockModelBedColored<>(BED_WHITE, DyeColor.WHITE));
        dispatcher.addDispatch(BED_ORANGE, new BlockModelBedColored<>(BED_ORANGE, DyeColor.ORANGE));
        dispatcher.addDispatch(BED_MAGENTA, new BlockModelBedColored<>(BED_MAGENTA, DyeColor.MAGENTA));
        dispatcher.addDispatch(BED_YELLOW, new BlockModelBedColored<>(BED_YELLOW, DyeColor.YELLOW));
        dispatcher.addDispatch(BED_SILVER, new BlockModelBedColored<>(BED_SILVER, DyeColor.SILVER));
        dispatcher.addDispatch(BED_PURPLE, new BlockModelBedColored<>(BED_PURPLE, DyeColor.PURPLE));
        dispatcher.addDispatch(BED_PINK, new BlockModelBedColored<>(BED_PINK, DyeColor.PINK));
        dispatcher.addDispatch(BED_LIME, new BlockModelBedColored<>(BED_LIME, DyeColor.LIME));
        dispatcher.addDispatch(BED_LIGHTBLUE, new BlockModelBedColored<>(BED_LIGHTBLUE, DyeColor.LIGHT_BLUE));
        dispatcher.addDispatch(BED_GREEN, new BlockModelBedColored<>(BED_GREEN, DyeColor.GREEN));
        dispatcher.addDispatch(BED_GRAY, new BlockModelBedColored<>(BED_GRAY, DyeColor.GRAY));
        dispatcher.addDispatch(BED_CYAN, new BlockModelBedColored<>(BED_CYAN, DyeColor.CYAN));
        dispatcher.addDispatch(BED_BLACK, new BlockModelBedColored<>(BED_BLACK, DyeColor.BLACK));
        dispatcher.addDispatch(BED_BLUE, new BlockModelBedColored<>(BED_BLUE, DyeColor.BLUE));
        dispatcher.addDispatch(BED_BROWN, new BlockModelBedColored<>(BED_BROWN, DyeColor.BROWN));


        dispatcher.addDispatch(ColorBlocks.SEAT_WHITE, new BlockModelSeat<>(ColorBlocks.SEAT_WHITE)
            .setTex(0, "color:block/seat/seat_white_top", Side.TOP)
            .setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
            .setTex(0, "color:block/bed/bed_white_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

        dispatcher.addDispatch(ColorBlocks.SEAT_ORANGE, new BlockModelSeat<>(ColorBlocks.SEAT_ORANGE)
            .setTex(0, "color:block/seat/seat_orange_top", Side.TOP)
            .setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
            .setTex(0, "color:block/bed/bed_orange_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

        dispatcher.addDispatch(ColorBlocks.SEAT_MAGENTA, new BlockModelSeat<>(ColorBlocks.SEAT_MAGENTA)
            .setTex(0, "color:block/seat/seat_magenta_top", Side.TOP)
            .setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
            .setTex(0, "color:block/bed/bed_magenta_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

        dispatcher.addDispatch(ColorBlocks.SEAT_LIGHTBLUE, new BlockModelSeat<>(ColorBlocks.SEAT_LIGHTBLUE)
            .setTex(0, "color:block/seat/seat_lightblue_top", Side.TOP)
            .setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
            .setTex(0, "color:block/bed/bed_lightblue_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

        dispatcher.addDispatch(ColorBlocks.SEAT_YELLOW, new BlockModelSeat<>(ColorBlocks.SEAT_YELLOW)
            .setTex(0, "color:block/seat/seat_yellow_top", Side.TOP)
            .setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
            .setTex(0, "color:block/bed/bed_yellow_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

        dispatcher.addDispatch(ColorBlocks.SEAT_LIME, new BlockModelSeat<>(ColorBlocks.SEAT_LIME)
            .setTex(0, "color:block/seat/seat_lime_top", Side.TOP)
            .setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
            .setTex(0, "color:block/bed/bed_lime_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

        dispatcher.addDispatch(ColorBlocks.SEAT_PINK, new BlockModelSeat<>(ColorBlocks.SEAT_PINK)
            .setTex(0, "color:block/seat/seat_pink_top", Side.TOP)
            .setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
            .setTex(0, "color:block/bed/bed_pink_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

        dispatcher.addDispatch(ColorBlocks.SEAT_GRAY, new BlockModelSeat<>(ColorBlocks.SEAT_GRAY)
            .setTex(0, "color:block/seat/seat_gray_top", Side.TOP)
            .setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
            .setTex(0, "color:block/bed/bed_gray_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

        dispatcher.addDispatch(ColorBlocks.SEAT_SILVER, new BlockModelSeat<>(ColorBlocks.SEAT_SILVER)
            .setTex(0, "color:block/seat/seat_silver_top", Side.TOP)
            .setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
            .setTex(0, "color:block/bed/bed_silver_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

        dispatcher.addDispatch(ColorBlocks.SEAT_CYAN, new BlockModelSeat<>(ColorBlocks.SEAT_CYAN)
            .setTex(0, "color:block/seat/seat_cyan_top", Side.TOP)
            .setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
            .setTex(0, "color:block/bed/bed_cyan_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

        dispatcher.addDispatch(ColorBlocks.SEAT_PURPLE, new BlockModelSeat<>(ColorBlocks.SEAT_PURPLE)
            .setTex(0, "color:block/seat/seat_purple_top", Side.TOP)
            .setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
            .setTex(0, "color:block/bed/bed_purple_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

        dispatcher.addDispatch(ColorBlocks.SEAT_BLUE, new BlockModelSeat<>(ColorBlocks.SEAT_BLUE)
            .setTex(0, "color:block/seat/seat_blue_top", Side.TOP)
            .setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
            .setTex(0, "color:block/bed/bed_blue_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

        dispatcher.addDispatch(ColorBlocks.SEAT_BROWN, new BlockModelSeat<>(ColorBlocks.SEAT_BROWN)
            .setTex(0, "color:block/seat/seat_brown_top", Side.TOP)
            .setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
            .setTex(0, "color:block/bed/bed_brown_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

        dispatcher.addDispatch(ColorBlocks.SEAT_GREEN, new BlockModelSeat<>(ColorBlocks.SEAT_GREEN)
            .setTex(0, "color:block/seat/seat_green_top", Side.TOP)
            .setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
            .setTex(0, "color:block/bed/bed_green_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));

        dispatcher.addDispatch(ColorBlocks.SEAT_BLACK, new BlockModelSeat<>(ColorBlocks.SEAT_BLACK)
            .setTex(0, "color:block/seat/seat_black_top", Side.TOP)
            .setTex(0, "minecraft:block/seat/bottom", Side.BOTTOM)
            .setTex(0, "color:block/bed/bed_black_foot_front", Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST));
    }

    @Override
    public void initItemModels(ItemModelDispatcher dispatcher) {
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.BED_WHITE, null).setIcon("color:item/white_bed"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.BED_ORANGE, null).setIcon("color:item/orange_bed"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.BED_MAGENTA, null).setIcon("color:item/magenta_bed"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.BED_LIGHTBLUE, null).setIcon("color:item/lightblue_bed"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.BED_YELLOW, null).setIcon("color:item/yellow_bed"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.BED_LIME, null).setIcon("color:item/lime_bed"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.BED_PINK, null).setIcon("color:item/pink_bed"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.BED_GRAY, null).setIcon("color:item/gray_bed"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.BED_SILVER, null).setIcon("color:item/silver_bed"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.BED_CYAN, null).setIcon("color:item/cyan_bed"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.BED_PURPLE, null).setIcon("color:item/purple_bed"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.BED_BLUE, null).setIcon("color:item/blue_bed"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.BED_BROWN, null).setIcon("color:item/brown_bed"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.BED_GREEN, null).setIcon("color:item/green_bed"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.BED_BLACK, null).setIcon("color:item/black_bed"));

        dispatcher.addDispatch(new ItemModelStandard(ColorItems.SEAT_WHITE, null).setIcon("color:item/white_seat"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.SEAT_ORANGE, null).setIcon("color:item/orange_seat"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.SEAT_MAGENTA, null).setIcon("color:item/magenta_seat"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.SEAT_LIGHTBLUE, null).setIcon("color:item/lightblue_seat"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.SEAT_YELLOW, null).setIcon("color:item/yellow_seat"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.SEAT_LIME, null).setIcon("color:item/lime_seat"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.SEAT_PINK, null).setIcon("color:item/pink_seat"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.SEAT_GRAY, null).setIcon("color:item/gray_seat"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.SEAT_SILVER, null).setIcon("color:item/silver_seat"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.SEAT_CYAN, null).setIcon("color:item/cyan_seat"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.SEAT_PURPLE, null).setIcon("color:item/purple_seat"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.SEAT_BLUE, null).setIcon("color:item/blue_seat"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.SEAT_BROWN, null).setIcon("color:item/brown_seat"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.SEAT_GREEN, null).setIcon("color:item/green_seat"));
        dispatcher.addDispatch(new ItemModelStandard(ColorItems.SEAT_BLACK, null).setIcon("color:item/black_seat"));

    }

    @Override
    public void initEntityModels(EntityRenderDispatcher dispatcher) {
        ModelHelper.setEntityModel(MobParrot.class, () -> new MobRendererParrot(new ModelParrot(), 0.2f));
    }

    @Override
    public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {
    }

    @Override
    public void initBlockColors(BlockColorDispatcher dispatcher) {
    }
}
