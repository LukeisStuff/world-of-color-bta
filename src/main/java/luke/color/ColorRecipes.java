package luke.color;

import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;
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
