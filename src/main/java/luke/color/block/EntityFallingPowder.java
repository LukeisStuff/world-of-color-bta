package luke.color.block;

import com.mojang.nbt.CompoundTag;
import luke.color.ColorBlocks;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class EntityFallingPowder extends Entity {
	public int blockID;
	public int fallTime;
	public boolean hasRemovedBlock = false;

	public EntityFallingPowder(World world) {
		super(world);
		this.blockID = ColorBlocks.concretePowder.id;
		this.fallTime = 0;
	}

	public EntityFallingPowder(World world, double d, double d1, double d2, int i, int k) {
		super(world);
		this.fallTime = 0;
		this.blockID = i;
		this.blocksBuilding = true;
		this.setSize(0.98F, 0.98F);
		this.heightOffset = this.bbHeight / 2.0F;
		this.setPos(d, d1, d2);
		this.xd = 0.0;
		this.yd = 0.0;
		this.zd = 0.0;
		this.xo = d;
		this.yo = d1;
		this.zo = d2;
	}

	protected boolean makeStepSound() {
		return false;
	}

	protected void init() {
	}

	public boolean isPickable() {
		return !this.removed;
	}

	public void tick() {
		int metaID = world.getBlockMetadata((int) this.x, (int) this.y, (int) this.z);
		if (this.blockID == 0) {
			this.remove();
		} else {
			this.xo = this.x;
			this.yo = this.y;
			this.zo = this.z;
			++this.fallTime;
			this.yd -= 0.04;
			this.move(this.xd, this.yd, this.zd);
			this.xd *= 0.98;
			this.yd *= 0.98;
			this.zd *= 0.98;
			int i = MathHelper.floor_double(this.x);
			int j = MathHelper.floor_double(this.y);
			int k = MathHelper.floor_double(this.z);
			if (this.world.getBlockId(i, j, k) == this.blockID) {
				this.world.setBlockWithNotify(i, j, k, 0);
				this.hasRemovedBlock = true;
			}

			if (this.onGround) {
				this.xd *= 0.7;
				this.zd *= 0.7;
				this.yd *= -0.5;
				this.remove();
				if ((!this.world.canBlockBePlacedAt(this.blockID, i, j, k, true, Side.TOP) || BlockPowder.canFallBelow(this.world, i, j - 1, k) || !this.world.setBlockAndMetadataWithNotify(i, j, k, this.blockID, metaID)) && !this.world.isClientSide && this.hasRemovedBlock) {
					this.spawnAtLocation(new ItemStack(this.blockID, 1, metaID), 0);
				}
			} else if (this.fallTime > 100 && !this.world.isClientSide) {
				if (this.hasRemovedBlock) {
					this.spawnAtLocation(new ItemStack(this.blockID, 1, metaID), 0);
				}

				this.remove();
			}

		}
	}

	public void addAdditionalSaveData(CompoundTag tag) {
		tag.putShort("Tile", (short)this.blockID);
	}

	public void readAdditionalSaveData(CompoundTag tag) {
		this.blockID = tag.getShort("Tile") & 16383;
	}

	public float getShadowHeightOffs() {
		return 0.0F;
	}

	public boolean showBoundingBoxOnHover() {
		return true;
	}
}
