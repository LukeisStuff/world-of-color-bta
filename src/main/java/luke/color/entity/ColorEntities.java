package luke.color.entity;

import turniplabs.halplibe.helper.EntityHelper;

public class ColorEntities {
	private static int entityID = 120;

	public void initializeEntities() {
		EntityHelper.createEntity(EntityParrot.class, entityID++, "Parrot", () -> new ParrotRenderer(new ModelParrot(), 0.2f));
	}
}
