package luke.color.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicSeat;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockLogicSeatColored extends BlockLogicSeat {
    private final ItemStack dropItem;

    public BlockLogicSeatColored(Block<?> block, ItemStack dropItem) {
        super(block);
        this.dropItem = dropItem;
    }

    @Override
    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return new ItemStack[]{dropItem.copy()};
    }
}
