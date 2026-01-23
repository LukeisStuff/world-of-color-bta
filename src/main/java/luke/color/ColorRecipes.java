package luke.color;

import luke.color.block.ColorBlocks;
import luke.color.item.ColorItems;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryDyeing;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryUndyeing;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.util.helper.DyeColor;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;
import turniplabs.halplibe.util.RecipeEntrypoint;

import java.util.List;

import static luke.color.ColorMod.MOD_ID;

public class ColorRecipes implements RecipeEntrypoint {

    public void initializeRecipes() {

        for (int color = 0; color < 16; color++) {
            RecipeBuilder.Shapeless(MOD_ID)
                .addInput(Blocks.SAND)
                .addInput(Blocks.SAND)
                .addInput(Blocks.SAND)
                .addInput(Blocks.SAND)
                .addInput(Blocks.GRAVEL)
                .addInput(Blocks.GRAVEL)
                .addInput(Blocks.GRAVEL)
                .addInput(Blocks.GRAVEL)
                .addInput(new ItemStack(Items.DYE, 1, 15 - color))
                .create("concrete_powder", new ItemStack(ColorBlocks.CONCRETE_POWDER, 8, color));
        }

        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("bed");
        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("seat");

        RecipeBuilderShaped templateBed = new RecipeBuilderShaped(MOD_ID, "CCW", "PPP");
        templateBed.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 0)).create("white_bed", new ItemStack(ColorItems.BED_WHITE, 1));
        templateBed.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 1)).create("orange_bed", new ItemStack(ColorItems.BED_ORANGE, 1));
        templateBed.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 2)).create("magenta_bed", new ItemStack(ColorItems.BED_MAGENTA, 1));
        templateBed.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 3)).create("lightblue_bed", new ItemStack(ColorItems.BED_LIGHTBLUE, 1));
        templateBed.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 4)).create("yellow_bed", new ItemStack(ColorItems.BED_YELLOW, 1));
        templateBed.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 5)).create("lime_bed", new ItemStack(ColorItems.BED_LIME, 1));
        templateBed.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 6)).create("pink_bed", new ItemStack(ColorItems.BED_PINK, 1));
        templateBed.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 7)).create("gray_bed", new ItemStack(ColorItems.BED_GRAY, 1));
        templateBed.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 8)).create("silver_bed", new ItemStack(ColorItems.BED_SILVER, 1));
        templateBed.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 9)).create("cyan_bed", new ItemStack(ColorItems.BED_CYAN, 1));
        templateBed.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 10)).create("purple_bed", new ItemStack(ColorItems.BED_PURPLE, 1));
        templateBed.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 11)).create("blue_bed", new ItemStack(ColorItems.BED_BLUE, 1));
        templateBed.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 12)).create("brown_bed", new ItemStack(ColorItems.BED_BROWN, 1));
        templateBed.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 13)).create("green_bed", new ItemStack(ColorItems.BED_GREEN, 1));
        templateBed.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 14)).create("red_bed", new ItemStack(Items.BED, 1));
        templateBed.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 15)).create("black_bed", new ItemStack(ColorItems.BED_BLACK, 1));


        RecipeBuilderShaped templateSeat = new RecipeBuilderShaped(MOD_ID, "CWC", "P P");
        templateSeat.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 0)).create("white_seat", new ItemStack(ColorItems.SEAT_WHITE, 1));
        templateSeat.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 1)).create("orange_seat", new ItemStack(ColorItems.SEAT_ORANGE, 1));
        templateSeat.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 2)).create("magenta_seat", new ItemStack(ColorItems.SEAT_MAGENTA, 1));
        templateSeat.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 3)).create("lightblue_seat", new ItemStack(ColorItems.SEAT_LIGHTBLUE, 1));
        templateSeat.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 4)).create("yellow_seat", new ItemStack(ColorItems.SEAT_YELLOW, 1));
        templateSeat.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 5)).create("lime_seat", new ItemStack(ColorItems.SEAT_LIME, 1));
        templateSeat.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 6)).create("pink_seat", new ItemStack(ColorItems.SEAT_PINK, 1));
        templateSeat.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 7)).create("gray_seat", new ItemStack(ColorItems.SEAT_GRAY, 1));
        templateSeat.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 8)).create("silver_seat", new ItemStack(ColorItems.SEAT_SILVER, 1));
        templateSeat.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 9)).create("cyan_seat", new ItemStack(ColorItems.SEAT_CYAN, 1));
        templateSeat.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 10)).create("purple_seat", new ItemStack(ColorItems.SEAT_PURPLE, 1));
        templateSeat.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 11)).create("blue_seat", new ItemStack(ColorItems.SEAT_BLUE, 1));
        templateSeat.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 12)).create("brown_seat", new ItemStack(ColorItems.SEAT_BROWN, 1));
        templateSeat.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 13)).create("green_seat", new ItemStack(ColorItems.SEAT_GREEN, 1));
        templateSeat.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 14)).create("red_seat", new ItemStack(Items.SEAT, 1));
        templateSeat.addInput('C', Items.CLOTH).addInput('P', ("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 15)).create("black_seat", new ItemStack(ColorItems.SEAT_BLACK, 1));

        for (int color = 0; color < 16; color++) {
            String colorName = DyeColor.values()[color].name().toLowerCase();

            RecipeBuilder.Furnace(MOD_ID)
                .setInput(new ItemStack(ColorBlocks.CONCRETE, 1, color))
                .create(
                    colorName + "_concrete_to_" + colorName + "_glazed_concrete",
                    new ItemStack(ColorBlocks.CONCRETE_GLAZED, 1, color * 16));

            RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(new ItemStack(ColorBlocks.CONCRETE, 1, color))
                .create(
                    colorName + "_concrete_to_" + colorName + "_glazed_concrete",
                    new ItemStack(ColorBlocks.CONCRETE_GLAZED, 1, color * 16));
        }

        RecipeBuilder.initNameSpace(MOD_ID);
    }

    public static void concreteDyeingRecipes() {
        Registries.RECIPES.addCustomRecipe(
            "color:workbench/concrete_powder_dyeing",
            new RecipeEntryDyeing(
                new RecipeSymbol("color:concrete_powder"),
                ColorBlocks.CONCRETE_POWDER.getDefaultStack(),
                false,
                false
            )
        );

        Registries.RECIPES.addCustomRecipe(
            "color:workbench/concrete_powder_undyeing",
            new RecipeEntryUndyeing(
                new RecipeSymbol("color:concrete_powder"),
                new ItemStack(ColorBlocks.CONCRETE_POWDER, 1, 0)
            )
        );

        Registries.RECIPES.addCustomRecipe(
            "color:workbench/concrete_glazed_dyeing",
            new RecipeEntryDyeing(
                new RecipeSymbol("color:concrete_glazed"),
                ColorBlocks.CONCRETE_GLAZED.getDefaultStack(),
                true,
                false
            )
        );

        Registries.RECIPES.addCustomRecipe(
            "color:workbench/concrete_glazed_undyeing",
            new RecipeEntryUndyeing(
                new RecipeSymbol("color:concrete_glazed"),
                new ItemStack(ColorBlocks.CONCRETE_GLAZED, 1, 0)
            )
        );

        Registries.RECIPES.addCustomRecipe(
            "color:workbench/concrete_dyeing",
            new RecipeEntryDyeing(
                new RecipeSymbol("color:concrete"),
                ColorBlocks.CONCRETE.getDefaultStack(),
                false,
                false
            )
        );

        Registries.RECIPES.addCustomRecipe(
            "color:workbench/concrete_undyeing",
            new RecipeEntryUndyeing(
                new RecipeSymbol("color:concrete"),
                new ItemStack(ColorBlocks.CONCRETE, 1, 0)
            )
        );

//        Registries.RECIPES.addCustomRecipe(
//            "color:workbench/beds_dyeing",
//            new RecipeEntryDyeing(
//                new RecipeSymbol("color:beds"),
//                new ItemStack(ColorItems.BED_WHITE),
//                false,
//                true
//            )
//        );
//
//        Registries.RECIPES.addCustomRecipe(
//            "color:workbench/beds_undyeing",
//            new RecipeEntryUndyeing(
//                new RecipeSymbol("color:beds"),
//                new ItemStack(ColorItems.BED_WHITE)
//            )
//        );
//
//        Registries.RECIPES.addCustomRecipe(
//            "color:workbench/seats_dyeing",
//            new RecipeEntryDyeing(
//                new RecipeSymbol("color:seat"),
//                new ItemStack(ColorItems.SEAT_WHITE),
//                false,
//                true
//            )
//        );
//
//        Registries.RECIPES.addCustomRecipe(
//            "color:workbench/seats_undyeing",
//            new RecipeEntryUndyeing(
//                new RecipeSymbol("color:seat"),
//                new ItemStack(ColorItems.SEAT_WHITE)
//            )
//        );

    }


    @Override
    public void onRecipesReady() {
        initializeRecipes();
        concreteDyeingRecipes();
    }

    @Override
    public void initNamespaces() {

        List<ItemStack> concrete = Registries.stackListOf(ColorBlocks.CONCRETE);
        List<ItemStack> concretePowder = Registries.stackListOf(ColorBlocks.CONCRETE_POWDER);

        List<ItemStack> concreteGlazed = Registries.stackListOf(ColorBlocks.CONCRETE_GLAZED);

        List<ItemStack> beds = Registries.stackListOf(
            ColorItems.BED_WHITE,
            ColorItems.BED_ORANGE,
            ColorItems.BED_MAGENTA,
            ColorItems.BED_LIGHTBLUE,
            ColorItems.BED_YELLOW,
            ColorItems.BED_LIME,
            ColorItems.BED_PINK,
            ColorItems.BED_GRAY,
            ColorItems.BED_SILVER,
            ColorItems.BED_CYAN,
            ColorItems.BED_PURPLE,
            ColorItems.BED_BLUE,
            ColorItems.BED_BROWN,
            ColorItems.BED_GREEN,
            Items.BED,
            ColorItems.BED_BLACK
        );

        List<ItemStack> seats = Registries.stackListOf(
            ColorItems.SEAT_WHITE,
            ColorItems.SEAT_ORANGE,
            ColorItems.SEAT_MAGENTA,
            ColorItems.SEAT_LIGHTBLUE,
            ColorItems.SEAT_YELLOW,
            ColorItems.SEAT_LIME,
            ColorItems.SEAT_PINK,
            ColorItems.SEAT_GRAY,
            ColorItems.SEAT_SILVER,
            ColorItems.SEAT_CYAN,
            ColorItems.SEAT_PURPLE,
            ColorItems.SEAT_BLUE,
            ColorItems.SEAT_BROWN,
            ColorItems.SEAT_GREEN,
            Items.SEAT,
            ColorItems.SEAT_BLACK
        );


        for (DyeColor dyeColor : DyeColor.values()) {
            concrete.add(new ItemStack(ColorBlocks.CONCRETE, 1, dyeColor.blockMeta));
            concretePowder.add(new ItemStack(ColorBlocks.CONCRETE_POWDER, 1, dyeColor.blockMeta));

            concreteGlazed.add(new ItemStack(ColorBlocks.CONCRETE_GLAZED, 1, dyeColor.blockMeta << 4));
        }

        Registries.ITEM_GROUPS.register("color:concrete", concrete);
        Registries.ITEM_GROUPS.register("color:concrete_powder", concretePowder);
        Registries.ITEM_GROUPS.register("color:concrete_glazed", concreteGlazed);

        Registries.ITEM_GROUPS.register("color:beds", beds);
        Registries.ITEM_GROUPS.register("color:seat", seats);

        RecipeBuilder.initNameSpace(MOD_ID);
        RecipeBuilder.getRecipeNamespace(MOD_ID);
    }

}
