package luke.color;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;
import turniplabs.halplibe.util.RecipeEntrypoint;

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

            RecipeBuilder.Shaped(MOD_ID, "CCC", "CDC", "CCC")
                .addInput('D', new ItemStack(Items.DYE, 1, 15 - color))
                .addInput('C', ("color:block/concrete_powder"))
                .create("concrete_powder_redye", new ItemStack(ColorBlocks.CONCRETE_POWDER, 8, color));
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


        RecipeBuilder.initNameSpace(MOD_ID);
    }


    @Override
    public void onRecipesReady() {
        initializeRecipes();
    }

    @Override
    public void initNamespaces() {

        Registries.ITEM_GROUPS.register("color:block/concrete_powder", Registries.stackListOf(
            new ItemStack(ColorBlocks.CONCRETE_POWDER, 1, 1),
            new ItemStack(ColorBlocks.CONCRETE_POWDER, 1, 2),
            new ItemStack(ColorBlocks.CONCRETE_POWDER, 1, 3),
            new ItemStack(ColorBlocks.CONCRETE_POWDER, 1, 4),
            new ItemStack(ColorBlocks.CONCRETE_POWDER, 1, 5),
            new ItemStack(ColorBlocks.CONCRETE_POWDER, 1, 6),
            new ItemStack(ColorBlocks.CONCRETE_POWDER, 1, 7),
            new ItemStack(ColorBlocks.CONCRETE_POWDER, 1, 8),
            new ItemStack(ColorBlocks.CONCRETE_POWDER, 1, 9),
            new ItemStack(ColorBlocks.CONCRETE_POWDER, 1, 10),
            new ItemStack(ColorBlocks.CONCRETE_POWDER, 1, 11),
            new ItemStack(ColorBlocks.CONCRETE_POWDER, 1, 12),
            new ItemStack(ColorBlocks.CONCRETE_POWDER, 1, 13),
            new ItemStack(ColorBlocks.CONCRETE_POWDER, 1, 14),
            new ItemStack(ColorBlocks.CONCRETE_POWDER, 1, 15),
            new ItemStack(ColorBlocks.CONCRETE_POWDER, 1, 0)));

        RecipeBuilder.initNameSpace(MOD_ID);
        RecipeBuilder.getRecipeNamespace(MOD_ID);
    }

}
