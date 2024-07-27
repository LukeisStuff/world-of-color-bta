package luke.color;

import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static luke.color.ColorMod.MOD_ID;

public class ColorRecipes implements RecipeEntrypoint {

	public void initializeRecipes() {


		for (int color = 0; color < 16; color++) {
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(new ItemStack(Item.dye, 1, 15 - color))
				.addInput(Block.sand)
				.addInput(Block.sand)
				.addInput(Block.sand)
				.addInput(Block.sand)
				.addInput(Block.gravel)
				.addInput(Block.gravel)
				.addInput(Block.gravel)
				.addInput(Block.gravel)
				.create("painted_concrete_powder", new ItemStack(ColorBlocks.concretePowder, 8, color));
		}

		RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("bed");
		RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("seat");

		RecipeBuilderShaped templateBed = new RecipeBuilderShaped(MOD_ID, "CCW", "PPP");
		templateBed.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 0)).create("white_bed", new ItemStack(ColorItems.bedWhite, 1));
		templateBed.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 1)).create("orange_bed", new ItemStack(ColorItems.bedOrange, 1));
		templateBed.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 2)).create("magenta_bed", new ItemStack(ColorItems.bedMagenta, 1));
		templateBed.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 3)).create("lightblue_bed", new ItemStack(ColorItems.bedLightblue, 1));
		templateBed.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 4)).create("yellow_bed", new ItemStack(ColorItems.bedYellow, 1));
		templateBed.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 5)).create("lime_bed", new ItemStack(ColorItems.bedLime, 1));
		templateBed.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 6)).create("pink_bed", new ItemStack(ColorItems.bedPink, 1));
		templateBed.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 7)).create("gray_bed", new ItemStack(ColorItems.bedGray, 1));
		templateBed.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 8)).create("silver_bed", new ItemStack(ColorItems.bedSilver, 1));
		templateBed.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 9)).create("cyan_bed", new ItemStack(ColorItems.bedCyan, 1));
		templateBed.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 10)).create("purple_bed", new ItemStack(ColorItems.bedPurple, 1));
		templateBed.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 11)).create("blue_bed", new ItemStack(ColorItems.bedBlue, 1));
		templateBed.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 12)).create("brown_bed", new ItemStack(ColorItems.bedBrown, 1));
		templateBed.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 13)).create("green_bed", new ItemStack(ColorItems.bedGreen, 1));
		templateBed.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 14)).create("red_bed", new ItemStack(Item.bed, 1));
		templateBed.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 15)).create("black_bed", new ItemStack(ColorItems.bedBlack, 1));

		RecipeBuilderShaped templateSeat = new RecipeBuilderShaped(MOD_ID, "CWC", "P P");
		templateSeat.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 0)).create("white_seat", new ItemStack(ColorItems.seatWhite, 1));
		templateSeat.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 1)).create("orange_seat", new ItemStack(ColorItems.seatOrange, 1));
		templateSeat.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 2)).create("magenta_seat", new ItemStack(ColorItems.seatMagenta, 1));
		templateSeat.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 3)).create("lightblue_seat", new ItemStack(ColorItems.seatLightblue, 1));
		templateSeat.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 4)).create("yellow_seat", new ItemStack(ColorItems.seatYellow, 1));
		templateSeat.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 5)).create("lime_seat", new ItemStack(ColorItems.seatLime, 1));
		templateSeat.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 6)).create("pink_seat", new ItemStack(ColorItems.seatPink, 1));
		templateSeat.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 7)).create("gray_seat", new ItemStack(ColorItems.seatGray, 1));
		templateSeat.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 8)).create("silver_seat", new ItemStack(ColorItems.seatSilver, 1));
		templateSeat.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 9)).create("cyan_seat", new ItemStack(ColorItems.seatCyan, 1));
		templateSeat.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 10)).create("purple_seat", new ItemStack(ColorItems.seatPurple, 1));
		templateSeat.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 11)).create("blue_seat", new ItemStack(ColorItems.seatBlue, 1));
		templateSeat.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 12)).create("brown_seat", new ItemStack(ColorItems.seatBrown, 1));
		templateSeat.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 13)).create("green_seat", new ItemStack(ColorItems.seatGreen, 1));
		templateSeat.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 14)).create("red_seat", new ItemStack(Item.seat, 1));
		templateSeat.addInput('C', Item.cloth).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Block.wool, 1, 15)).create("black_seat", new ItemStack(ColorItems.seatBlack, 1));


		RecipeBuilder.initNameSpace(MOD_ID);
	}


	@Override
	public void onRecipesReady() {
		initializeRecipes();
	}

	@Override
	public void initNamespaces() {
			RecipeBuilder.initNameSpace(MOD_ID);
			RecipeBuilder.getRecipeNamespace(MOD_ID);
		}

}
