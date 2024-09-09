package luke.color.entity;

import com.mojang.nbt.CompoundTag;
import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.EntityFlying;
import net.minecraft.core.entity.animal.IAnimal;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.world.World;
import net.minecraft.core.world.season.Seasons;

import static luke.color.ColorMod.MOD_ID;

public class EntityParrot extends EntityFlying implements IAnimal {
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
	public int getMaxSpawnedInChunk() {
		if (this.world.getSeasonManager().getCurrentSeason() == Seasons.OVERWORLD_SPRING) {
			return 8;
		}
		if (this.world.getSeasonManager().getCurrentSeason() == Seasons.OVERWORLD_WINTER) {
			return 1;
		}
		return 4;
	}

    @Override
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

	@Override
	public int getTalkInterval() {
		return 120;
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
