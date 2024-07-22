package luke.color.block;

import luke.color.ColorBlocks;
import net.minecraft.core.block.BlockSand;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockPowder extends BlockSand {


	public BlockPowder(String key, int id) {
		super(key, id);
	}

	public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
			this.onBlockAdded(world, x, y, z);
		}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		return new ItemStack[]{new ItemStack(this, 1, meta)};
	}

	public void updateTick(World world, int x, int y, int z, Random rand) {
		this.tryToFall(world, x, y, z);
	}

	private void tryToFall(World world, int i, int j, int k) {
		if (canFallBelow(world, i, j - 1, k) && j >= 0) {
			byte byte0 = 32;
			int meta = world.getBlockMetadata(i, j, k);
			if (!fallInstantly && world.areBlocksLoaded(i - byte0, j - byte0, k - byte0, i + byte0, j + byte0, k + byte0)) {
				EntityFallingPowder entityfallingpowder = new EntityFallingPowder(world, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, this.id, meta);
				world.entityJoinedWorld(entityfallingpowder);
			} else {
				world.setBlockAndMetadataWithNotify(i, j, k, 0, meta);

				while(canFallBelow(world, i, j - 1, k) && j > 0) {
					--j;
				}

				if (j > 0) {
					world.setBlockAndMetadataWithNotify(i, j, k, this.id, meta);
				}
			}
		}

	}

	public void onBlockAdded(World world, int x, int y, int z) {
		super.onBlockAdded(world, x, y, z);
		if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water) {
			world.setBlockAndMetadataWithNotify(x, y, z, ColorBlocks.concrete.id, world.getBlockMetadata(x, y, z));
		}
	}
}
