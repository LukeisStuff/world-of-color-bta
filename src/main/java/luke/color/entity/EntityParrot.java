package luke.color.entity;

import com.mojang.nbt.CompoundTag;
import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.animal.EntityAnimal;
import net.minecraft.core.entity.animal.IAnimal;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.world.World;

import static luke.color.ColorMod.MOD_ID;

public class EntityParrot extends EntityAnimal implements IAnimal {
	public float field_752_b = 0.0f;
	public float destPos = 0.0f;
	public float field_757_d;
	public float field_756_e;
	public float field_755_h = 1.0f;

	public EntityParrot(World world) {
		super(world);
		this.textureIdentifier = new NamespaceID(MOD_ID, "parrot");
		this.setSize(0.4F, 0.4F);
		this.mobDrops.add(new WeightedRandomLootObject(Item.featherChicken.getDefaultStack(), 2, 4));
	}

	@Override
	public boolean interact(EntityPlayer entityplayer) {
		ItemStack itemstack = entityplayer.inventory.getCurrentItem();
		if (itemstack != null && itemstack.itemID == Item.foodCookie.id) {
			itemstack.consumeItem(entityplayer);
			this.damageEntity(10, DamageType.COMBAT);
			return true;
		}
		return super.interact(entityplayer);
	}

	@Override
	protected boolean makeStepSound() {
		return false;
	}

	public int getMaxHealth() {
		return 4;
	}

	@Override
	public void moveEntityWithHeading(float moveStrafing, float moveForward) {
		if (this.isInWater()) {
			this.moveRelative(moveStrafing, moveForward, 0.02f);
			this.move(this.xd, this.yd, this.zd);
			this.xd *= 0.8;
			this.yd *= 0.8;
			this.zd *= 0.8;
		} else if (this.isInLava()) {
			this.moveRelative(moveStrafing, moveForward, 0.02f);
			this.move(this.xd, this.yd, this.zd);
			this.xd *= 0.5;
			this.yd *= 0.5;
			this.zd *= 0.5;
		} else {
			float f2 = 0.91f;
			if (this.onGround) {
				f2 = 0.5460001f;
				int i = this.world.getBlockId(MathHelper.floor_double(this.x), MathHelper.floor_double(this.bb.minY) - 1, MathHelper.floor_double(this.z));
				if (i > 0) {
					f2 = Block.blocksList[i].movementScale * 0.91f;
				}
			}
			float f3 = 0.1627714f / (f2 * f2 * f2);
			this.moveRelative(moveStrafing, moveForward, this.onGround ? 0.1f * f3 : 0.02f);
			f2 = 0.91f;
			if (this.onGround) {
				f2 = 0.5460001f;
				int j = this.world.getBlockId(MathHelper.floor_double(this.x), MathHelper.floor_double(this.bb.minY) - 1, MathHelper.floor_double(this.z));
				if (j > 0) {
					f2 = Block.blocksList[j].movementScale * 0.91f;
				}
			}
			this.move(this.xd, this.yd, this.zd);
			this.xd *= f2;
			this.yd *= f2;
			this.zd *= f2;
		}
		this.prevLimbYaw = this.limbYaw;
		double d = this.x - this.xo;
		double d1 = this.z - this.zo;
		float f4 = MathHelper.sqrt_double(d * d + d1 * d1) * 4.0f;
		if (f4 > 1.0f) {
			f4 = 1.0f;
		}
		this.limbYaw += (f4 - this.limbYaw) * 0.4f;
		this.limbSwing += this.limbYaw;
	}

	@Override
	public boolean canClimb() {
		return false;
	}

	public boolean getCanSpawnHere() {
		int z;
		int y;
		int x = MathHelper.floor_double(this.x);
		int id = this.world.getBlockId(x, (y = MathHelper.floor_double(this.bb.minY)) - 1, z = MathHelper.floor_double(this.z));
		if (Block.blocksList[id] != null) {
			return Block.blocksList[id].hasTag(BlockTags.PASSIVE_MOBS_SPAWN) && this.world.getFullBlockLightValue(x, y, z) > 8 && super.getCanSpawnHere();
		}
		return false;
	}

    public void onLivingUpdate() {
		super.onLivingUpdate();
		this.field_756_e = this.field_752_b;
		this.field_757_d = this.destPos;
		this.destPos = (float)((double)this.destPos + (double)(this.onGround ? -1 : 4) * 0.3);
		if (this.destPos < 0.0f) {
			this.destPos = 0.0f;
		}
		if (this.destPos > 1.0f) {
			this.destPos = 1.0f;
		}
		if (!this.onGround && this.field_755_h < 1.0f) {
			this.field_755_h = 1.0f;
		}
		this.field_755_h = (float)((double)this.field_755_h * 0.9);
		if (!this.onGround && this.yd < 0.0) {
			this.yd *= 0.6;
		}
		this.field_752_b += this.field_755_h * 2.0f;
	}

	public void causeFallDamage(float f) {
	}

	public void addAdditionalSaveData(CompoundTag tag) {
		super.addAdditionalSaveData(tag);
	}

	public void readAdditionalSaveData(CompoundTag tag) {
		super.readAdditionalSaveData(tag);
	}

	public String getLivingSound() {
		return "color.parrotidle";
	}

	public String getHurtSound() {
		return "color.parrothurt";
	}

	public String getDeathSound() {
		return "color.parrotdeath";
	}

	public int getSkinVariant() {
		int skinVariantCount = 5;
		return this.entityData.getByte(1) % skinVariantCount;
	}

}
