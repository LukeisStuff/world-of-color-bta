package luke.color.entity;

import org.useless.dragonfly.helper.ModelHelper;
import turniplabs.halplibe.helper.EntityHelper;

import static luke.color.ColorMod.MOD_ID;

public class ColorEntities {
	private static int entityID = 120;

	public void initializeEntities() {
		EntityHelper.createEntity(EntityParrot.class, entityID++, "Parrot", () -> new ParrotRenderer(ModelHelper.getOrCreateEntityModel(MOD_ID, "entity/parrot.json", ModelParrot.class)));
    }
}
