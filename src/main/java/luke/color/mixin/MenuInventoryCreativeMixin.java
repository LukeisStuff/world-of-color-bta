package luke.color.mixin;

import luke.color.ColorBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.inventory.container.ContainerInventory;
import net.minecraft.core.player.inventory.menu.MenuInventory;
import net.minecraft.core.player.inventory.menu.MenuInventoryCreative;
import net.minecraft.core.util.helper.DyeColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;

import static net.minecraft.core.player.inventory.menu.MenuInventoryCreative.creativeItems;
import static net.minecraft.core.player.inventory.menu.MenuInventoryCreative.creativeItemsCount;

@Mixin(MenuInventoryCreative.class)
public class MenuInventoryCreativeMixin extends MenuInventory {

	@Inject(method = "<clinit>", at = @At("TAIL"))
	private static void injected(CallbackInfo ci) {


		List<ItemStack> paintedConcrete = new ArrayList<>();
		List<ItemStack> paintedConcretePowder = new ArrayList<>();

		for (int i = 0; i < DyeColor.COLOR_AMOUNT; i++) {

			paintedConcrete.add(new ItemStack(ColorBlocks.concrete, 1, i));
			paintedConcretePowder.add(new ItemStack(ColorBlocks.concretePowder, 1, i));

		}

		int index1 = -1;
		int index2 = -1;
		int index3 = -1;
		for (int i = 0; i < creativeItems.size(); i++) {
			if (creativeItems.get(i).itemID == Blocks.WOOL.id()) {
				index1 = i;
			} else if (creativeItems.get(i).itemID == Blocks.GLASS.id()) {
				index2 = i;
			} else if (creativeItems.get(i).itemID == Blocks.STAIRS_BRICK_LAPIS.id()) {
				index3 = i;
			}
		}

		List<ItemStack> sectionBeforeAll = new ArrayList<>(creativeItems.subList(0, index1 + 1));
		List<ItemStack> section2 = new ArrayList<>(creativeItems.subList(index1 + 1, index2 + 1));
		List<ItemStack> section3 = new ArrayList<>(creativeItems.subList(index2 + 1, index3 + 1));
		List<ItemStack> sectionAfterAll = new ArrayList<>(creativeItems.subList(index3 + 1, creativeItems.size()));

		creativeItems = new ArrayList<>();
		creativeItems.addAll(sectionBeforeAll);
		creativeItems.addAll(section2);
		creativeItems.addAll(section3);
		creativeItems.addAll(paintedConcrete);
		creativeItems.addAll(paintedConcretePowder);
		creativeItems.addAll(sectionAfterAll);
		creativeItemsCount  = creativeItems.size();

	}

	public MenuInventoryCreativeMixin(ContainerInventory inventory) {
		super(inventory);
	}

}
