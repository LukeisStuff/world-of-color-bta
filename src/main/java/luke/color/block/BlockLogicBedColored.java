package luke.color.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicBed;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockLogicBedColored extends BlockLogicBed {
    private final ItemStack dropItem;

    public BlockLogicBedColored(Block<?> block, ItemStack dropItem) {
        super(block);
        this.dropItem = dropItem;
    }

    @Override
    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return new ItemStack[]{dropItem.copy()};
    }
}
