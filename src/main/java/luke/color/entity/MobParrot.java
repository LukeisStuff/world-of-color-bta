package luke.color.entity;

import com.mojang.nbt.tags.CompoundTag;
import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.entity.animal.MobAnimal;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.item.tag.ItemTags;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.NotNull;

public class MobParrot extends MobAnimal {
	public float flap = 0.0F;
	public float flapSpeed = 0.0F;
	public float oFlapSpeed;
	public float oFlap;
	public float flapping = 1.0F;

	public MobParrot(World world) {
		super(world);
		this.textureIdentifier = new NamespaceID("color", "parrot");
		this.setSize(0.4F, 0.4F);
		this.mobDrops.add(new WeightedRandomLootObject(Items.FEATHER_CHICKEN.getDefaultStack(), 2, 4));
	}

	public int getMaxHealth() {
		return 4;
	}

	@Override
	public boolean interact(Player entityplayer) {
		ItemStack itemstack = entityplayer.inventory.getCurrentItem();
		if (itemstack != null && itemstack.itemID == Items.FOOD_COOKIE.id) {
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

	public void onLivingUpdate() {
		super.onLivingUpdate();
		this.oFlap = this.flap;
		this.oFlapSpeed = this.flapSpeed;
		this.flapSpeed = (float)((double)this.flapSpeed + (double)(this.onGround ? -1 : 4) * 0.3);
		if (this.flapSpeed < 0.0F) {
			this.flapSpeed = 0.0F;
		}

		if (this.flapSpeed > 1.0F) {
			this.flapSpeed = 1.0F;
		}

		if (!this.onGround && this.flapping < 1.0F) {
			this.flapping = 1.0F;
		}

		this.flapping = (float)((double)this.flapping * 0.9);
		if (!this.onGround && this.yd < 0.0) {
			this.yd *= 0.6;
		}

		this.flap += this.flapping * 2.0F;
	}

	public void causeFallDamage(float distance) {
	}

	public void addAdditionalSaveData(@NotNull CompoundTag tag) {
		super.addAdditionalSaveData(tag);
	}

	public void readAdditionalSaveData(@NotNull CompoundTag tag) {
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

	public boolean isFavouriteItem(ItemStack itemStack) {
		return itemStack != null && itemStack.getItem().hasTag(ItemTags.CHICKENS_FAVOURITE_ITEM);
	}

}
