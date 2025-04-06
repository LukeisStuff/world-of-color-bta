package luke.color.entity;

import net.minecraft.client.render.entity.MobRenderer;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.core.util.helper.MathHelper;

public class MobRendererParrot extends MobRenderer<MobParrot> {
	public MobRendererParrot(ModelBase modelbase, float f) {
		super(modelbase, f);
	}

	public float limbSway(MobParrot entity, float partialTick) {
		float flap = entity.oFlap + (entity.flap - entity.oFlap) * partialTick;
		float flapSpeed = entity.oFlapSpeed + (entity.flapSpeed - entity.oFlapSpeed) * partialTick;
		return (MathHelper.sin(flap) + 1.0F) * flapSpeed;
	}
}
