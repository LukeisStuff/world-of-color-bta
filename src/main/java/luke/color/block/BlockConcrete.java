package luke.color.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockConcrete extends Block {

	public BlockConcrete(String key, int id, Material material) {
		super(key, id, material);
	}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		return new ItemStack[]{new ItemStack(this, 1, meta)};
	}

	public static int func_21034_c(int i) {
		return ~i & 15;
	}

	public static int getMetadataForColour(int i) {
		return ~i & 15;
	}

}
