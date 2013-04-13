// Date: 2/10/2013 11:11:36 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.client.models.pokemon;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.animations.EnumArm;
import pixelmon.client.models.animations.EnumLeg;
import pixelmon.client.models.animations.EnumPhase;
import pixelmon.client.models.animations.ModuleArm;
import pixelmon.client.models.animations.ModuleLeg;
import pixelmon.client.models.animations.Biped.SkeletonBiped;

public class ModelClefable extends PixelmonModelBase {
	// fieldsS
	ModelRenderer Body;

	public ModelClefable() {
		textureWidth = 128;
		textureHeight = 64;

		Body = new ModelRenderer(this, "Body");
		Body.setRotationPoint(0, 9, -1);
		ModelRenderer main_body = new ModelRenderer(this, 0, 43);
		main_body.addBox(-6F, 0F, -5F, 11, 10, 11);
		main_body.setTextureSize(128, 64);
		main_body.mirror = true;
		setRotation(main_body, 0.0523599F, 0F, 0F);
		Body.addChild(main_body);
		ModelRenderer head = new ModelRenderer(this, 0, 25);
		head.addBox(-5F, -5F, -4.666667F, 9, 7, 10);
		head.setTextureSize(128, 64);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		Body.addChild(head);
		ModelRenderer body_2 = new ModelRenderer(this, 41, 26);
		body_2.addBox(-4.5F, -4F, -5.466667F, 8, 12, 2);
		body_2.setTextureSize(128, 64);
		body_2.mirror = true;
		setRotation(body_2, 0F, 0F, 0F);
		Body.addChild(body_2);
		ModelRenderer body_3 = new ModelRenderer(this, 45, 42);
		body_3.addBox(-6.2F, -4F, -4F, 2, 13, 9);
		body_3.setTextureSize(128, 64);
		body_3.mirror = true;
		setRotation(body_3, 0.0523599F, 0F, 0.0523599F);
		Body.addChild(body_3);
		ModelRenderer body_4 = new ModelRenderer(this, 45, 42);
		body_4.addBox(3.466667F, -4F, -4F, 2, 13, 9);
		body_4.setTextureSize(128, 64);
		body_4.mirror = true;
		setRotation(body_4, 0.0523599F, 0F, -0.0523599F);
		Body.addChild(body_4);
		ModelRenderer body_5 = new ModelRenderer(this, 42, 10);
		body_5.addBox(-4.5F, -4F, 4.4F, 8, 13, 2);
		body_5.setTextureSize(128, 64);
		body_5.mirror = true;
		setRotation(body_5, 0.0872665F, 0F, 0F);
		Body.addChild(body_5);
		ModelRenderer body_6 = new ModelRenderer(this, 9, 16);
		body_6.addBox(-4F, 9.533334F, -2.2F, 7, 1, 7);
		body_6.setTextureSize(128, 64);
		body_6.mirror = true;
		setRotation(body_6, 0F, 0F, 0F);
		Body.addChild(body_6);
		ModelRenderer Shape1 = new ModelRenderer(this, 0, 18);
		Shape1.addBox(-3F, -5.466667F, -3F, 5, 1, 5);
		Shape1.setTextureSize(128, 64);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Body.addChild(Shape1);
		ModelRenderer hair_curl = new ModelRenderer(this, 116, 35);
		hair_curl.addBox(2.466667F, -5.466667F, -8.866667F, 1, 5, 5);
		hair_curl.setTextureSize(128, 64);
		hair_curl.mirror = true;
		setRotation(hair_curl, -0.3316126F, 0.8552113F, 0F);
		Body.addChild(hair_curl);
		ModelRenderer L_wing = new ModelRenderer(this, 92, 0);
		L_wing.addBox(0F, -5F, 0F, 12, 12, 0);
		L_wing.setRotationPoint(0, 0, 6F);
		L_wing.setTextureSize(128, 64);
		L_wing.mirror = true;
		setRotation(L_wing, 0F, -0.2094395F, -0.1396263F);
		Body.addChild(L_wing);
		ModelRenderer R_wing = new ModelRenderer(this, 104, 0);
		R_wing.addBox(-12F, -5F, 0F, 12, 12, 0);
		R_wing.setRotationPoint(0, 0, 6F);
		R_wing.setTextureSize(128, 64);
		R_wing.mirror = true;
		setRotation(R_wing, 0F, 0.2094395F, 0.1396263F);
		Body.addChild(R_wing);
		ModelRenderer L_ear = new ModelRenderer(this, 76, 0);
		L_ear.addBox(4.733333F, -2.6F, -0.8666667F, 3, 4, 4);
		L_ear.setTextureSize(128, 64);
		L_ear.mirror = true;
		setRotation(L_ear, 0F, 0F, -0.6806784F);
		Body.addChild(L_ear);
		ModelRenderer L_ear_2 = new ModelRenderer(this, 76, 9);
		L_ear_2.addBox(6.733333F, -2.2F, -0.2F, 3, 3, 3);
		L_ear_2.setTextureSize(128, 64);
		L_ear_2.mirror = true;
		setRotation(L_ear_2, 0F, 0F, -0.6806784F);
		Body.addChild(L_ear_2);
		ModelRenderer L_ear_3 = new ModelRenderer(this, 76, 16);
		L_ear_3.addBox(-10.33333F, -1.866667F, 0.2F, 3, 2, 2);
		L_ear_3.setRotationPoint(0, -2, -1);
		L_ear_3.setTextureSize(128, 64);
		L_ear_3.mirror = true;
		setRotation(L_ear_3, 0F, 0F, 2.460914F);
		Body.addChild(L_ear_3);
		ModelRenderer R_ear = new ModelRenderer(this, 76, 0);
		R_ear.addBox(-8.333333F, -2.2F, -0.8666667F, 3, 4, 4);
		R_ear.setTextureSize(128, 64);
		R_ear.mirror = true;
		setRotation(R_ear, 0F, 0F, 0.6806784F);
		Body.addChild(R_ear);
		ModelRenderer R_ear_2 = new ModelRenderer(this, 76, 9);
		R_ear_2.addBox(-10.26667F, -1.733333F, -0.2F, 3, 3, 3);
		R_ear_2.setTextureSize(128, 64);
		R_ear_2.mirror = true;
		setRotation(R_ear_2, 0F, 0F, 0.6806784F);
		Body.addChild(R_ear_2);
		ModelRenderer R_ear_3 = new ModelRenderer(this, 76, 16);
		R_ear_3.addBox(-12.33333F, -1.2F, 0.2F, 3, 2, 2);
		R_ear_3.setTextureSize(128, 64);
		R_ear_3.mirror = true;
		setRotation(R_ear_3, 0F, 0F, 0.6806784F);
		Body.addChild(R_ear_3);

		ModelRenderer Tail = new ModelRenderer(this, "Tail");
		Tail.setRotationPoint(0, 5, 7);
		ModelRenderer tail = new ModelRenderer(this, 104, 46);
		tail.addBox(-0.8F, -4F, -1F, 3, 9, 9);
		tail.setTextureSize(128, 64);
		tail.mirror = true;
		setRotation(tail, -0.3490659F, 0.7853982F, 0F);
		Tail.addChild(tail);
		Body.addChild(Tail);

		ModelRenderer LeftLeg = new ModelRenderer(this, "Left Leg");
		LeftLeg.setRotationPoint(4, 9, 1);
		ModelRenderer L_leg_1 = new ModelRenderer(this, 104, 13);
		L_leg_1.addBox(-3.2F, -1F, -4F, 5, 5, 7);
		L_leg_1.setTextureSize(128, 64);
		L_leg_1.mirror = true;
		setRotation(L_leg_1, 0F, 0F, 0.0698132F);
		LeftLeg.addChild(L_leg_1);
		ModelRenderer L_leg_2 = new ModelRenderer(this, 112, 26);
		L_leg_2.addBox(-2.866667F, 1.333333F, -2.533333F, 4, 5, 4);
		L_leg_2.setTextureSize(128, 64);
		L_leg_2.mirror = true;
		setRotation(L_leg_2, 0F, 0F, 0.0523599F);
		LeftLeg.addChild(L_leg_2);
		ModelRenderer L_toe = new ModelRenderer(this, 0, 9);
		L_toe.addBox(-1.866667F, 5.266667F, -3.466667F, 2, 1, 1);
		L_toe.setTextureSize(128, 64);
		L_toe.mirror = true;
		setRotation(L_toe, 0F, 0F, 0F);
		LeftLeg.addChild(L_toe);
		Body.addChild(LeftLeg);

		ModelRenderer RightLeg = new ModelRenderer(this, "Right Leg");
		RightLeg.setRotationPoint(-5, 9, 1);
		ModelRenderer R_leg_1 = new ModelRenderer(this, 104, 13);
		R_leg_1.addBox(-1.4F, -1F, -4F, 5, 5, 7);
		R_leg_1.setTextureSize(128, 64);
		R_leg_1.mirror = true;
		setRotation(R_leg_1, 0F, 0F, -0.0698132F);
		RightLeg.addChild(R_leg_1);
		ModelRenderer R_leg_2 = new ModelRenderer(this, 112, 26);
		R_leg_2.addBox(-0.8666667F, 1.333333F, -2.866667F, 4, 5, 4);
		R_leg_2.setTextureSize(128, 64);
		R_leg_2.mirror = true;
		setRotation(R_leg_2, 0F, 0F, -0.0523599F);
		RightLeg.addChild(R_leg_2);
		ModelRenderer R_toe = new ModelRenderer(this, 0, 9);
		R_toe.addBox(0.1333333F, 5.266667F, -3.466667F, 2, 1, 1);
		R_toe.setTextureSize(128, 64);
		R_toe.mirror = true;
		setRotation(R_toe, 0F, 0F, 0F);
		RightLeg.addChild(R_toe);
		Body.addChild(RightLeg);

		ModelRenderer LeftArm = new ModelRenderer(this, "Left Arm");
		LeftArm.setRotationPoint(5, 2, -2);
		ModelRenderer L_arm_1 = new ModelRenderer(this, 16, 0);
		L_arm_1.addBox(-0.3333333F, -1F, -2.466667F, 3, 4, 4);
		L_arm_1.setTextureSize(128, 64);
		L_arm_1.mirror = true;
		setRotation(L_arm_1, 0F, 0.1396263F, 0.418879F);
		LeftArm.addChild(L_arm_1);
		ModelRenderer L_arm_2 = new ModelRenderer(this, 31, 0);
		L_arm_2.addBox(1.666667F, -0.7333333F, -2.2F, 3, 3, 3);
		L_arm_2.setTextureSize(128, 64);
		L_arm_2.mirror = true;
		setRotation(L_arm_2, 0F, 0.1396263F, 0.5061455F);
		LeftArm.addChild(L_arm_2);
		ModelRenderer L_finger_1 = new ModelRenderer(this, 0, 55);
		L_finger_1.addBox(4.6F, -0.7666667F, 0.06666667F, 1, 1, 1);
		L_finger_1.setTextureSize(128, 64);
		L_finger_1.mirror = true;
		setRotation(L_finger_1, 0F, 0.6806784F, 0.6457718F);
		LeftArm.addChild(L_finger_1);
		ModelRenderer L_finger_2 = new ModelRenderer(this, 0, 55);
		L_finger_2.addBox(4.8F, -0.8333333F, -0.8F, 1, 1, 1);
		L_finger_2.setTextureSize(128, 64);
		L_finger_2.mirror = true;
		setRotation(L_finger_2, 0F, 0.4712389F, 0.9075712F);
		LeftArm.addChild(L_finger_2);
		Body.addChild(LeftArm);

		ModelRenderer RightArm = new ModelRenderer(this, "RightArm");
		RightArm.setRotationPoint(-6, 2, -2);
		ModelRenderer R_arm_1 = new ModelRenderer(this, 16, 0);
		R_arm_1.addBox(-2.866667F, -1F, -2.466667F, 3, 4, 4);
		R_arm_1.setTextureSize(128, 64);
		R_arm_1.mirror = true;
		setRotation(R_arm_1, 0F, -0.1396263F, -0.418879F);
		RightArm.addChild(R_arm_1);
		ModelRenderer R_arm_2 = new ModelRenderer(this, 31, 0);
		R_arm_2.addBox(-5.066667F, -0.7333333F, -2.2F, 3, 3, 3);
		R_arm_2.setTextureSize(128, 64);
		R_arm_2.mirror = true;
		setRotation(R_arm_2, 0F, -0.1396263F, -0.5061455F);
		RightArm.addChild(R_arm_2);
		ModelRenderer R_finger_1 = new ModelRenderer(this, 0, 55);
		R_finger_1.addBox(-6.1F, -0.7333333F, 0.06666667F, 1, 1, 1);
		R_finger_1.setTextureSize(128, 64);
		R_finger_1.mirror = true;
		setRotation(R_finger_1, 0F, -0.6806784F, -0.6457718F);
		RightArm.addChild(R_finger_1);
		ModelRenderer R_finger_2 = new ModelRenderer(this, 0, 55);
		R_finger_2.addBox(-6.2F, -0.9F, -0.8F, 1, 1, 1);
		R_finger_2.setTextureSize(128, 64);
		R_finger_2.mirror = true;
		setRotation(R_finger_2, 0F, -0.4712389F, -0.9075712F);
		RightArm.addChild(R_finger_2);
		Body.addChild(RightArm);

		ModuleArm leftArmModule = new ModuleArm(LeftArm, EnumArm.Left);
		ModuleArm rightArmModule = new ModuleArm(RightArm, EnumArm.Right);

		float legspeed = 0.65F;
		float legRotationLimit = 1.4F;

		ModuleLeg leftLegModule = new ModuleLeg(LeftLeg, EnumLeg.FrontLeft,
				EnumPhase.InPhase, legRotationLimit, legspeed);
		ModuleLeg rightLegModule = new ModuleLeg(RightLeg, EnumLeg.FrontRight,
				EnumPhase.InPhase, legRotationLimit, legspeed);

		skeleton = new SkeletonBiped(Body, null, leftArmModule, rightArmModule,
				leftLegModule, rightLegModule);

	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		Body.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
