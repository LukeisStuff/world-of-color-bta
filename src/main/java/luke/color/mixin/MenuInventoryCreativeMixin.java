package luke.color.mixin;

import luke.color.block.ColorBlocks;
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

@Mixin(value = MenuInventoryCreative.class, remap = false)
public abstract class MenuInventoryCreativeMixin extends MenuInventory {
    protected MenuInventoryCreativeMixin(ContainerInventory inventory) {
        super(inventory);
    }

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void injected(CallbackInfo ci) {
        List<ItemStack> newCreativeItems = new ArrayList<>();

        for (ItemStack item : creativeItems) {
            if (item.getMetadata() == 0
                && (item.itemID == ColorBlocks.CONCRETE.id() || item.itemID == ColorBlocks.CONCRETE_POWDER.id())) {
                for (DyeColor dyeColor : DyeColor.blockOrderedColors()) {
                    newCreativeItems.add(new ItemStack(item.itemID, 1, dyeColor.blockMeta));
                }
            } else if (item.getMetadata() == 0
                && (item.itemID == ColorBlocks.CONCRETE_GLAZED.id())) {
                for (DyeColor dyeColor : DyeColor.blockOrderedColors()) {
                    newCreativeItems.add(new ItemStack(item.itemID, 1, dyeColor.blockMeta << 4));
                }
            } else newCreativeItems.add(item);
        }

        creativeItems = newCreativeItems;
        creativeItemsCount = creativeItems.size();
    }
}
