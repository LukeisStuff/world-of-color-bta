package luke.color.block;

import luke.color.ColorBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicSand;
import net.minecraft.core.block.IPainted;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.EntityFallingBlock;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class BlockLogicPowder extends BlockLogicSand implements IPainted {

	public BlockLogicPowder(Block<?> block) {
		super(block);
    }

	public int getPlacedBlockMetadata(@Nullable Player player, ItemStack stack, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced) {
		return stack.getMetadata() & 15;
	}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
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

	public void updateTick(World world, int x, int y, int z, Random rand) {
		this.onBlockAdded(world, x, y, z);
		this.tryToFall(world, x, y, z);
	}

	private void tryToFall(World world, int x, int y, int z) {
		if (canFallBelow(world, x, y - 1, z) && y >= 0) {
			byte byte0 = 32;
			if (!fallInstantly && world.areBlocksLoaded(x - byte0, y - byte0, z - byte0, x + byte0, y + byte0, z + byte0)) {
				EntityFallingBlock entityFallingBlock = new EntityFallingBlock(world, (double)x + 0.5, (double)y + 0.5, (double)z + 0.5, this.block.id(), world.getBlockMetadata(x, y, z), null);
				world.entityJoinedWorld(entityFallingBlock);
			} else {
				world.setBlockWithNotify(x, y, z, world.getBlockMetadata(x, y, z));

				while(canFallBelow(world, x, y - 1, z) && y > 0) {
					--y;
				}

				if (y > 0) {
					world.setBlockAndMetadataWithNotify(x, y, z, this.block.id(), world.getBlockMetadata(x, y, z));
				}
			}
		}

	}

	public void onBlockAdded(World world, int x, int y, int z) {
		world.scheduleBlockUpdate(x, y, z, this.id(), this.tickDelay());
		if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water) {
			world.setBlockAndMetadataWithNotify(x, y, z, ColorBlocks.concrete.id(), world.getBlockMetadata(x, y, z));
		}
	}

}
