package luke.color.entity;

import net.minecraft.client.render.entity.LivingRenderer;
import net.minecraft.client.render.model.ModelBase;
import org.useless.dragonfly.helper.ModelHelper;

import static luke.color.ColorMod.MOD_ID;

public class ParrotRenderer extends LivingRenderer<EntityParrot> {

	public ParrotRenderer(ModelBase modelbase) {
		super(modelbase, 0.2F);
		setRenderPassModel(ModelHelper.getOrCreateEntityModel(MOD_ID, "entity/parrot.json", ModelParrot.class));
	}

}
