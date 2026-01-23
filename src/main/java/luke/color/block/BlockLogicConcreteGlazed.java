package luke.color.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicFullyRotatable;
import net.minecraft.core.block.IPainted;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.NotNull;

public class BlockLogicConcreteGlazed extends BlockLogicFullyRotatable implements IPainted {
    public static final int MASK_DIRECTION = 0x07;
    public static final int MASK_COLOR = 0xF0;
    public static final int SHIFT_COLOR = 4;

    public BlockLogicConcreteGlazed(Block<?> block, Material material) {
        super(block, material);
    }

    public static int makeMeta(Direction dir, int color) {
        return (dir.getId() & MASK_DIRECTION) | ((color & 15) << SHIFT_COLOR);
    }

    public static int getColor(int meta) {
        return (meta >> SHIFT_COLOR) & 15;
    }

    @Override
    public void onBlockPlacedByMob(World world, int x, int y, int z, @NotNull Side side, Mob mob, double xPlaced, double yPlaced) {
        Direction dir = mob.getPlacementDirection(side).getOpposite();
        int meta = world.getBlockMetadata(x, y, z);

        meta = (meta & MASK_COLOR) | (dir.getId() & MASK_DIRECTION);

        world.setBlockMetadataWithNotify(x, y, z, meta);
    }

    @Override
    public void onBlockPlacedOnSide(World world, int x, int y, int z, @NotNull Side side, double xPlaced, double yPlaced) {
        Direction dir = side.getDirection();
        int meta = world.getBlockMetadata(x, y, z);

        meta = (meta & MASK_COLOR) | (dir.getId() & MASK_DIRECTION);

        world.setBlockMetadataWithNotify(x, y, z, meta);
    }

    @Override
    public int getPlacedBlockMetadata(Player player, ItemStack stack, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced) {
        int color = (stack.getMetadata() >> 4) & 15;
        Direction dir = player != null ? player.getPlacementDirection(side).getOpposite() : side.getDirection();

        return makeMeta(dir, color);
    }

    @Override
    public ItemStack[] getBreakResult(World world, EnumDropCause cause, int meta, TileEntity te) {
        int color = getColor(meta);
        int itemMeta = color << 4;
        return new ItemStack[]{new ItemStack(this, 1, itemMeta)};
    }

    @Override
    public DyeColor fromMetadata(int meta) {
        return DyeColor.colorFromBlockMeta(getColor(meta));
    }

    @Override
    public int toMetadata(DyeColor color) {
        return color.blockMeta << SHIFT_COLOR;
    }

    @Override
    public int stripColorFromMetadata(int meta) {
        return meta & MASK_DIRECTION;
    }

    @Override
    public void removeDye(World world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        world.setBlockMetadataWithNotify(x, y, z, meta & MASK_DIRECTION);
    }
}
