package luke.color.block;

import luke.color.ColorBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicFullyRotatable;
import net.minecraft.core.block.IPainted;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.NotNull;

public class BlockLogicConcreteGlazed extends BlockLogicFullyRotatable implements IPainted {
    public static final int MASK_DIRECTION = 7;

    public BlockLogicConcreteGlazed(Block<?> block) {
        super(block, Material.stone);
    }

    @Override
    public void onBlockPlacedByMob(World world, int x, int y, int z, @NotNull Side side, Mob mob, double xPlaced, double yPlaced) {
        Direction direction = mob.getPlacementDirection(side).getOpposite();
        world.setBlockMetadataWithNotify(x, y, z, directionToMeta(direction));
    }

    @Override
    public void onBlockPlacedOnSide(World world, int x, int y, int z, @NotNull Side side, double xPlaced, double yPlaced) {
        world.setBlockMetadataWithNotify(x, y, z, directionToMeta(side.getDirection()));
    }

    public static int directionToMeta(Direction direction) {
        return direction.getId() & 15;
    }

    public static Direction metaToDirection(int meta) {
        return Direction.getDirectionById(meta & 7);
    }

    @Override
    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
        int color = (meta >> 3) & 15;
        return new ItemStack[]{new ItemStack(this.block, 1, color)};
    }

    public DyeColor fromMetadata(int meta) {
        return DyeColor.colorFromBlockMeta((meta >> 3) & 15);
    }

    public int toMetadata(DyeColor color) {
        return color.blockMeta << 3;
    }

    public int stripColorFromMetadata(int meta) {
        return meta & MASK_DIRECTION;
    }

    public void removeDye(World world, int x, int y, int z) {
        int meta = stripColorFromMetadata(world.getBlockMetadata(x, y, z));
        world.setBlockAndMetadataWithNotify(x, y, z, ColorBlocks.CONCRETE_GLAZED.id(), meta);
    }

    @Override
    public void setColor(World world, int x, int y, int z, DyeColor color) {
        int meta = world.getBlockMetadata(x, y, z);
        int dir = meta & MASK_DIRECTION;

        int newMeta = (color.blockMeta << 3) | dir;
        world.setBlockMetadataWithNotify(x, y, z, newMeta);
    }
}
