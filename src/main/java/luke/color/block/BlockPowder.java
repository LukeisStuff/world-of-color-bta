package luke.color.block;

import luke.color.ColorBlocks;
import net.minecraft.core.block.BlockSand;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.EntityFallingSand;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockPowder extends BlockSand {
	public int metaID;

	public BlockPowder(String key, int id, int metaID) {
		super(key, id);
		this.metaID = metaID;
	}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		return new ItemStack[]{new ItemStack(this, 1)};
	}

	public void updateTick(World world, int x, int y, int z, Random rand) {
		this.onBlockAdded(world, x, y, z);
		this.tryToFall(world, x, y, z);
	}

	private void tryToFall(World world, int i, int j, int k) {
		if (canFallBelow(world, i, j - 1, k) && j >= 0) {
			byte byte0 = 32;
			if (!fallInstantly && world.areBlocksLoaded(i - byte0, j - byte0, k - byte0, i + byte0, j + byte0, k + byte0)) {
				EntityFallingSand entityfallingsand = new EntityFallingSand(world, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, this.id);
				world.entityJoinedWorld(entityfallingsand);
			} else {
				world.setBlockWithNotify(i, j, k, 0);

				while(canFallBelow(world, i, j - 1, k) && j > 0) {
					--j;
				}

				if (j > 0) {
					world.setBlockWithNotify(i, j, k, this.id);
				}
			}
		}

	}


	public void onBlockAdded(World world, int x, int y, int z) {
		world.scheduleBlockUpdate(x, y, z, this.id, this.tickRate());
		if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water) {
			world.setBlockAndMetadataWithNotify(x, y, z, ColorBlocks.concrete.id, metaID);
		}
	}

}
