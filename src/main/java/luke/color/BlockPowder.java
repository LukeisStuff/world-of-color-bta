package luke.color;

import net.minecraft.core.block.BlockSand;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

public class BlockPowder extends BlockSand {


	public BlockPowder(String key, int id) {
		super(key, id);
	}

	public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
			this.onBlockAdded(world, x, y, z);
		}

	public void onBlockAdded(World world, int x, int y, int z) {
		super.onBlockAdded(world, x, y, z);
		if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water) {
			world.setBlockAndMetadataWithNotify(x, y, z, ColorBlocks.concrete.id, world.getBlockMetadata(x, y, z));
		}
	}
}
