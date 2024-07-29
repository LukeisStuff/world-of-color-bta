package luke.color.entity;

import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.entity.EntityFlying;
import net.minecraft.core.item.Item;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.world.World;

import static luke.color.ColorMod.MOD_ID;

public class EntityParrot extends EntityFlying {
	public EntityParrot(World world) {
		super(world);
		this.textureIdentifier = new NamespaceID(MOD_ID, "parrot");
		this.setSize(0.4F, 0.8F);
		this.mobDrops.add(new WeightedRandomLootObject(Item.featherChicken.getDefaultStack(), 2, 4));
	}

	public int getSkinVariant() {
		int skinVariantCount = 5;
		return this.entityData.getByte(1) % skinVariantCount;
	}

}
