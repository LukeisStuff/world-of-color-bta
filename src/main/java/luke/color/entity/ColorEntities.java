package luke.color.entity;

import net.minecraft.core.util.collection.NamespaceID;
import turniplabs.halplibe.helper.EntityHelper;

public class ColorEntities {

	public void initializeEntities() {
		EntityHelper.createEntity(MobParrot.class, NamespaceID.getPermanent("color", "parrot"), "guidebook.section.mob.parrot.name");

	}
}
