package luke.color.entity;

import net.minecraft.client.render.entity.LivingRenderer;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.util.helper.MathHelper;

public class ParrotRenderer extends LivingRenderer<EntityParrot> {
	public ParrotRenderer(ModelBase modelbase, float f) {
		super(modelbase, f);
	}

	public void renderParrot(EntityParrot entityparrot, double d, double d1, double d2, float f, float f1) {
		super.render(entityparrot, d, d1, d2, f, f1);
	}

	protected float getWingRotation(EntityParrot entityparrot, float f) {
		float f1 = entityparrot.field_756_e + (entityparrot.field_752_b - entityparrot.field_756_e) * f;
		float f2 = entityparrot.field_757_d + (entityparrot.destPos - entityparrot.field_757_d) * f;
		return (MathHelper.sin(f1) + 1.0F) * f2;
	}

	protected float ticksExisted(EntityParrot entityparrot, float partialTick) {
		return this.getWingRotation(entityparrot, partialTick);
	}

	public void render(EntityParrot entityparrot, double x, double y, double z, float yaw, float partialTick) {
		this.renderParrot(entityparrot, x, y, z, yaw, partialTick);
	}

	public void doRender(Tessellator tessellator, EntityParrot entityparrot, double x, double y, double z, float yaw, float partialTick) {
		this.renderParrot(entityparrot, x, y, z, yaw, partialTick);
	}
}
