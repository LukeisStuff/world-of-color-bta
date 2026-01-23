package luke.color.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.IPainted;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.IItemConvertible;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class BlockLogicConcrete extends BlockLogic implements IPainted {
    private final @Nullable Supplier<? extends IItemConvertible> crushDrop;

    public BlockLogicConcrete(Block<?> block, @Nullable Supplier<? extends IItemConvertible> crushResult) {
        super(block, Material.stone);
        this.crushDrop = crushResult;
    }

    @Override
    public int getPlacedBlockMetadata(@Nullable Player player, ItemStack stack, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced) {
        return stack.getMetadata() & 15;
    }

    @Override
    public ItemStack @Nullable [] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
        if (this.crushDrop != null && dropCause == EnumDropCause.PISTON_CRUSH) {
            ItemStack drop = new ItemStack(this.crushDrop.get(), 1, meta & 15);
            return new ItemStack[]{drop};
        }
        return new ItemStack[]{new ItemStack(this, 1, meta)};
    }

    public DyeColor fromMetadata(int meta) {
        return DyeColor.colorFromBlockMeta(meta);
    }

    public int toMetadata(DyeColor color) {
        return color.blockMeta;
    }

    public int stripColorFromMetadata(int meta) {
        return 0;
    }

    public void removeDye(World world, int x, int y, int z) {
        world.setBlockMetadataWithNotify(x, y, z, 0);
    }
}
