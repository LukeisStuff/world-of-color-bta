package luke.color.entity;

import net.minecraft.client.render.model.Cube;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.core.util.helper.MathHelper;

public class ModelParrot extends ModelBase {
	public Cube head;
	public Cube headTop;
	public Cube feather;
	public Cube beak;
	public Cube body;
	public Cube tail;
	public Cube rightLeg;
	public Cube leftLeg;
	public Cube rightWing;
	public Cube leftWing;

	public ModelParrot() {
		this.head = new Cube(2, 2);
		this.head.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2);
		this.head.setRotationPoint(0.0F, 16.0f, -1.0F);

		this.headTop = new Cube(10, 0);
		this.headTop.addBox(-1.0F, -3.0F, -3.0F, 2, 1, 4);
		this.headTop.setRotationPoint(0.0F, 16.0f, -1.0F);

		this.feather = new Cube(2, 18);
		this.feather.addBox(0.0F, -7.5F, -2.0F, 0, 5, 4);
		this.feather.setRotationPoint(0.0F, 16.0f, -1.0F);

		this.beak = new Cube(11, 6);
		this.beak.addBox(-0.5F, -2.0F, -3.0F, 1, 2, 2);
		this.beak.setRotationPoint(0.0F, 16.0f, -1.0F);

		this.body = new Cube(2, 8);
		this.body.addBox(-1.5F, -3.0F, -1.5F, 3, 6, 3);
		this.body.setRotationPoint(0.0F, 19.0f, 0.0F);

		this.tail = new Cube(22, 1);
		this.tail.addBox(-1.5F, 0.0F, 1.5F, 3, 4, 1);
		this.tail.setRotationPoint(0.0F, 19.0f, 0.0F);

		this.rightLeg = new Cube(14, 18);
		this.rightLeg.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1);
		this.rightLeg.setRotationPoint(-1.0F, 22.0f, 0.0F);
		this.leftLeg = new Cube(14, 18);
		this.leftLeg.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1);
		this.leftLeg.setRotationPoint(1.0F, 22.0f, 0.0F);

		this.rightWing = new Cube(19, 8);
		this.rightWing.addBox(-1.0F, 0.0F, -1.0F, 1, 5, 3);
		this.rightWing.setRotationPoint(-1.5F, 16.5f, -1.0F);
		this.leftWing = new Cube(19, 8);
		this.leftWing.addBox(0.0F, 0.0F, -1.0F, 1, 5, 3);
		this.leftWing.setRotationPoint(1.5F, 16.5f, -1.0F);
	}

	public void render(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbYaw, limbPitch, headYaw, headPitch, scale);
		this.head.render(scale);
		this.headTop.render(scale);
		this.feather.render(scale);
		this.beak.render(scale);
		this.body.render(scale);
		this.tail.render(scale);
		this.rightLeg.render(scale);
		this.leftLeg.render(scale);
		this.rightWing.render(scale);
		this.leftWing.render(scale);
	}

	public void setRotationAngles(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		this.head.xRot = headPitch / 57.29578F;
		this.head.yRot = headYaw / 57.29578F;
		this.headTop.xRot = this.head.xRot;
		this.headTop.yRot = this.head.yRot;
		this.feather.xRot = this.head.xRot;
		this.feather.yRot = this.head.yRot;
		this.beak.xRot = this.head.xRot;
		this.beak.yRot = this.head.yRot;
		this.rightLeg.xRot = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbYaw;
		this.leftLeg.xRot = MathHelper.cos(limbSwing * 0.6662F + 3.141593F) * 1.4F * limbYaw;

		this.body.xRot = 0.25F;

		this.leftWing.xRot = this.body.xRot + 0.10F;
		this.leftWing.yRot = this.body.yRot;
		this.rightWing.xRot = this.body.xRot + 0.10F;
		this.rightWing.yRot = this.body.yRot;
		this.rightWing.zRot = limbPitch;
		this.leftWing.zRot = -limbPitch;

		this.tail.xRot = this.body.xRot + 0.25F;
		this.tail.yRot = this.body.yRot;
	}

}
