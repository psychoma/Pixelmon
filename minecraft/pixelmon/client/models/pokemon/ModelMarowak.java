// Date: 4/13/2013 7:01:13 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX




package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.EnumArm;
import pixelmon.client.models.animations.EnumLeg;
import pixelmon.client.models.animations.EnumPhase;
import pixelmon.client.models.animations.ModuleArm;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.ModuleLeg;
import pixelmon.client.models.animations.ModuleTailBasic;
import pixelmon.client.models.animations.biped.SkeletonBiped;

public class ModelMarowak extends PixelmonModelBase
{
  //fields
    PixelmonModelRenderer Body;
  
  public ModelMarowak()
  {
    textureWidth = 64;
    textureHeight = 32;
    
    
      Body = new PixelmonModelRenderer(this, "Body");
      Body.setRotationPoint(-0.3F, 16.2F, -3F);
      PixelmonModelRenderer Body_Part_1 = new PixelmonModelRenderer(this, 0, 19);
      Body_Part_1.addBox(-2F, 0F, 0F, 4, 3, 3);
      Body_Part_1.setTextureSize(64, 32);
      Body_Part_1.mirror = true;
      setRotation(Body_Part_1, -0.3490659F, 0F, 0F);
      PixelmonModelRenderer Body_Part_2 = new PixelmonModelRenderer(this, 50, 25);
      Body_Part_2.addBox(-2F, 0F, -3F, 4, 4, 3);
      Body_Part_2.setRotationPoint(0F, 2.8F, 4F);
      Body_Part_2.setTextureSize(64, 32);
      Body_Part_2.mirror = true;
      setRotation(Body_Part_2, -0.122173F, 0F, 0F);
      PixelmonModelRenderer Body_Part_3 = new PixelmonModelRenderer(this, 0, 12);
      Body_Part_3.addBox(-1F, 0F, -3F, 2, 4, 3);
      Body_Part_3.setRotationPoint(-1.1F, -0.2F, 3F);
      Body_Part_3.setTextureSize(64, 32);
      Body_Part_3.mirror = true;
      setRotation(Body_Part_3, 0.122173F, 0F, 0.0872665F);
      PixelmonModelRenderer Body_Part_4 = new PixelmonModelRenderer(this, 0, 25);
      Body_Part_4.addBox(-2F, 0F, 0F, 4, 4, 3);
      Body_Part_4.setRotationPoint(0, 2.8F, -1F);
      Body_Part_4.setTextureSize(64, 32);
      Body_Part_4.mirror = true;
      setRotation(Body_Part_4, 0.4014257F, 0F, 0F);
      PixelmonModelRenderer Body_Part_5 = new PixelmonModelRenderer(this, 0, 0);
      Body_Part_5.addBox(-2F, 0F, -3F, 4, 4, 3);
      Body_Part_5.setRotationPoint(0F, 1.8F, 3F);
      Body_Part_5.setTextureSize(64, 32);
      Body_Part_5.mirror = true;
      setRotation(Body_Part_5, 0.1570796F, 0F, 0F);
      PixelmonModelRenderer Body_Part_6 = new PixelmonModelRenderer(this, 0, 12);
      Body_Part_6.addBox(-1F, 0F, -3F, 2, 4, 3);
      Body_Part_6.setRotationPoint(1.1F, -0.2F, 3F);
      Body_Part_6.setTextureSize(64, 32);
      Body_Part_6.mirror = true;
      setRotation(Body_Part_6, 0.122173F, 0F, -0.0872665F);
      PixelmonModelRenderer Body_Part_7 = new PixelmonModelRenderer(this, 36, 24);
      Body_Part_7.addBox(-2F, 0F, -3F, 4, 5, 3);
      Body_Part_7.setRotationPoint(0F, -0.8F, 3);
      Body_Part_7.setTextureSize(64, 32);
      Body_Part_7.mirror = true;
      setRotation(Body_Part_7, 0.2443461F, 0F, 0F);
      PixelmonModelRenderer Neck = new PixelmonModelRenderer(this, 36, 19);
      Neck.addBox(-2F, 0F, -3F, 3, 2, 3);
      Neck.setRotationPoint(0.5F, -1.8F, 3.3F);
      Neck.setTextureSize(64, 32);
      Neck.mirror = true;
      setRotation(Neck, -0.0349066F, 0F, 0F);
      Body.addChild(Body_Part_1);
      Body.addChild(Body_Part_2);
      Body.addChild(Body_Part_3);
      Body.addChild(Body_Part_4);
      Body.addChild(Body_Part_5);
      Body.addChild(Body_Part_6);
      Body.addChild(Body_Part_7);
      Body.addChild(Neck);
      
      PixelmonModelRenderer Head = new PixelmonModelRenderer(this, "Head");
      Head.setRotationPoint(0F, -1.8F, 1.3F);
      PixelmonModelRenderer Skull_Part_1 = new PixelmonModelRenderer(this, 20, 9);
      Skull_Part_1.addBox(-1.5F, 0F, -4F, 3, 2, 3);
      Skull_Part_1.setRotationPoint(0.1F, -3.6F, -2.4F);
      Skull_Part_1.setTextureSize(64, 32);
      Skull_Part_1.mirror = true;
      setRotation(Skull_Part_1, 0.3839724F, 0F, 0F);
      PixelmonModelRenderer Skull_Part_2 = new PixelmonModelRenderer(this, 24, 2);
      Skull_Part_2.addBox(-0.5F, 0F, -1F, 2, 2, 2);
      Skull_Part_2.setRotationPoint(-1.4F, -2F, -2F);
      Skull_Part_2.setTextureSize(64, 32);
      Skull_Part_2.mirror = true;
      setRotation(Skull_Part_2, 0F, -1.204277F, 0F);
      PixelmonModelRenderer Skull_Part_3 = new PixelmonModelRenderer(this, 35, 9);
      Skull_Part_3.addBox(-1.5F, 0F, -4F, 3, 1, 6);
      Skull_Part_3.setTextureSize(64, 32);
      Skull_Part_3.mirror = true;
      setRotation(Skull_Part_3, -0.2443461F, 0F, 0F);
      PixelmonModelRenderer Skull_Part_4 = new PixelmonModelRenderer(this, 19, 11);
      Skull_Part_4.addBox(-1.5F, 0F, 0F, 3, 2, 3);
      Skull_Part_4.setRotationPoint(0.1F, -2.1F, -5.2F);
      Skull_Part_4.setTextureSize(64, 32);
      Skull_Part_4.mirror = true;
      setRotation(Skull_Part_4, 0F, 0F, 0F);
      PixelmonModelRenderer Skull_Part_5 = new PixelmonModelRenderer(this, 35, 0);
      Skull_Part_5.addBox(-1.5F, 0F, -7F, 2, 2, 7);
      Skull_Part_5.setRotationPoint(-1.4F, -2F, 2F);
      Skull_Part_5.setTextureSize(64, 32);
      Skull_Part_5.mirror = true;
      setRotation(Skull_Part_5, 0F, -0.2268928F, 0F);
      PixelmonModelRenderer Skull_Part_6 = new PixelmonModelRenderer(this, 15, 7);
      Skull_Part_6.addBox(-1.5F, 0F, -1F, 3, 2, 1);
      Skull_Part_6.setRotationPoint(0.1F, 3.8F, 1.6F);
      Skull_Part_6.setTextureSize(64, 32);
      Skull_Part_6.mirror = true;
      setRotation(Skull_Part_6, 0.2617994F, 0F, 0F);
      PixelmonModelRenderer Skull_Part_7 = new PixelmonModelRenderer(this, 54, 5);
      Skull_Part_7.addBox(-0.7F, 0F, -4F, 2, 2, 3);
      Skull_Part_7.setRotationPoint(0.1F, -4F, 0.6F);
      Skull_Part_7.setTextureSize(64, 32);
      Skull_Part_7.mirror = true;
      setRotation(Skull_Part_7, 0.2094395F, 0F, 0F);
      PixelmonModelRenderer Skull_Part_8 = new PixelmonModelRenderer(this, 35, 0);
      Skull_Part_8.addBox(-0.5F, 0F, -6F, 2, 2, 7);
      Skull_Part_8.setRotationPoint(1.3F, -2F, 1.05F);
      Skull_Part_8.setTextureSize(64, 32);
      Skull_Part_8.mirror = true;
      setRotation(Skull_Part_8, 0F, 0.2094395F, 0F);
      PixelmonModelRenderer Skull_Part_9 = new PixelmonModelRenderer(this, 20, 8);
      Skull_Part_9.addBox(-1.5F, -0.5F, -4F, 3, 1, 5);
      Skull_Part_9.setRotationPoint(0.1F, -4F, 0.6F);
      Skull_Part_9.setTextureSize(64, 32);
      Skull_Part_9.mirror = true;
      setRotation(Skull_Part_9, 0.3141593F, 0F, 0F);
      PixelmonModelRenderer Skull_Part_10 = new PixelmonModelRenderer(this, 20, 9);
      Skull_Part_10.addBox(-1.5F, 0F, -4F, 3, 2, 1);
      Skull_Part_10.setRotationPoint(0.1F, -4, 0.6F);
      Skull_Part_10.setTextureSize(64, 32);
      Skull_Part_10.mirror = true;
      setRotation(Skull_Part_10, 0.2094395F, 0F, 0F);
      PixelmonModelRenderer Skull_Part_11 = new PixelmonModelRenderer(this, 54, 0);
      Skull_Part_11.addBox(-1.3F, 0F, -4F, 2, 2, 3);
      Skull_Part_11.setRotationPoint(0.1F, -4F, 0.6F);
      Skull_Part_11.setTextureSize(64, 32);
      Skull_Part_11.mirror = true;
      setRotation(Skull_Part_11, 0.2094395F, 0F, 0F);
      PixelmonModelRenderer Skull_Part_12 = new PixelmonModelRenderer(this, 20, 9);
      Skull_Part_12.addBox(-1.5F, 0F, -1F, 3, 2, 2);
      Skull_Part_12.setRotationPoint(0.1F, -4F, 0.6F);
      Skull_Part_12.setTextureSize(64, 32);
      Skull_Part_12.mirror = true;
      setRotation(Skull_Part_12, 0.2094395F, 0F, 0F);
      PixelmonModelRenderer Skull_Part_13 = new PixelmonModelRenderer(this, 24, 2);
      Skull_Part_13.addBox(-0.5F, 0F, 0F, 2, 2, 2);
      Skull_Part_13.setRotationPoint(0.3F, -2F, -1.6F);
      Skull_Part_13.setTextureSize(64, 32);
      Skull_Part_13.mirror = true;
      setRotation(Skull_Part_13, 0F, 1.047198F, 0F);
      PixelmonModelRenderer Skull_Part_14 = new PixelmonModelRenderer(this, 24, 2);
      Skull_Part_14.addBox(-0.5F, 0F, 0F, 2, 2, 2);
      Skull_Part_14.setRotationPoint(1F, -2F, -0.3F);
      Skull_Part_14.setTextureSize(64, 32);
      Skull_Part_14.mirror = true;
      setRotation(Skull_Part_14, 0F, 1.047198F, 0F);
      PixelmonModelRenderer Skull_Part_15 = new PixelmonModelRenderer(this, 24, 2);
      Skull_Part_15.addBox(-0.5F, 0F, 0F, 2, 2, 2);
      Skull_Part_15.setRotationPoint(-1.4F, -2F, -1F);
      Skull_Part_15.setTextureSize(64, 32);
      Skull_Part_15.mirror = true;
      setRotation(Skull_Part_15, 0F, -1.047198F, 0F);
      PixelmonModelRenderer Skull_Part_16 = new PixelmonModelRenderer(this, 15, 0);
      Skull_Part_16.addBox(-1F, -2F, 0F, 2, 2, 1);
      Skull_Part_16.setRotationPoint(0.05F, 0F, 1.1F);
      Skull_Part_16.setTextureSize(64, 32);
      Skull_Part_16.mirror = true;
      setRotation(Skull_Part_16, -0.0174533F, 0F, 0.0174533F);
      PixelmonModelRenderer Left_Ear = new PixelmonModelRenderer(this, 0, 8);
      Left_Ear.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      Left_Ear.setRotationPoint(1.3F, -3.4F, 1F);
      Left_Ear.setTextureSize(64, 32);
      Left_Ear.mirror = true;
      setRotation(Left_Ear, 0.6457718F, 0.6806784F, -2.96706F);
      PixelmonModelRenderer Right_Ear = new PixelmonModelRenderer(this, 0, 8);
      Right_Ear.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      Right_Ear.setRotationPoint(-1.1F, -3.4F, 1F);
      Right_Ear.setTextureSize(64, 32);
      Right_Ear.mirror = true;
      setRotation(Right_Ear, 0.6457718F, -0.6806784F, 2.96706F);
      Head.addChild(Skull_Part_1);
      Head.addChild(Skull_Part_2);
      Head.addChild(Skull_Part_3);
      Head.addChild(Skull_Part_4);
      Head.addChild(Skull_Part_5);
      Head.addChild(Skull_Part_6);
      Head.addChild(Skull_Part_7);
      Head.addChild(Skull_Part_8);
      Head.addChild(Skull_Part_9);
      Head.addChild(Skull_Part_10);
      Head.addChild(Skull_Part_11);
      Head.addChild(Skull_Part_12);
      Head.addChild(Skull_Part_13);
      Head.addChild(Skull_Part_14);
      Head.addChild(Skull_Part_15);
      Head.addChild(Skull_Part_16);
      Head.addChild(Left_Ear);
      Head.addChild(Right_Ear);
      Body.addChild(Head);
      
      PixelmonModelRenderer LeftArm = new PixelmonModelRenderer(this, "Left Arm");
      LeftArm.setRotationPoint(1.3F, -1.2F, 2);
      PixelmonModelRenderer Left_Arm_Part_1 = new PixelmonModelRenderer(this, 18, 25);
      Left_Arm_Part_1.addBox(-0.5F, -6F, -0.5F, 1, 6, 1);
      Left_Arm_Part_1.setTextureSize(64, 32);
      Left_Arm_Part_1.mirror = true;
      setRotation(Left_Arm_Part_1, 0F, 0F, 2.408554F);
      PixelmonModelRenderer Left_Arm_Part_2 = new PixelmonModelRenderer(this, 14, 24);
      Left_Arm_Part_2.addBox(-0.5F, 0F, -0.5F, 1, 7, 1);
      Left_Arm_Part_2.setRotationPoint(-1F, 0.5F, 0F);
      Left_Arm_Part_2.setTextureSize(64, 32);
      Left_Arm_Part_2.mirror = true;
      setRotation(Left_Arm_Part_2, 0F, 0F, -0.9250245F);
      PixelmonModelRenderer Left_Hand = new PixelmonModelRenderer(this, 14, 17);
      Left_Hand.addBox(-0.5F, -2F, -0.5F, 1, 2, 2);
      Left_Hand.setRotationPoint(3F, 3.5F, 0F);
      Left_Hand.setTextureSize(64, 32);
      Left_Hand.mirror = true;
      setRotation(Left_Hand, 0F, 0F, 2.251475F);
      PixelmonModelRenderer Left_Thumb = new PixelmonModelRenderer(this, 10, 16);
      Left_Thumb.addBox(-0.5F, -1.5F, -0.5F, 1, 1, 1);
      Left_Thumb.setRotationPoint(3F, 3.6F, 0F);
      Left_Thumb.setTextureSize(64, 32);
      Left_Thumb.mirror = true;
      setRotation(Left_Thumb, 1.972222F, 0F, 0.1396263F);
      LeftArm.addChild(Left_Arm_Part_1);
      LeftArm.addChild(Left_Arm_Part_2);
      LeftArm.addChild(Left_Hand);
      LeftArm.addChild(Left_Thumb);
      Body.addChild(LeftArm);
      
      PixelmonModelRenderer RightArm = new PixelmonModelRenderer(this, "Right Arm");
      RightArm.setRotationPoint(-1.6F, -1.7F, 2);
      PixelmonModelRenderer  Right_Arm_Part_1 = new PixelmonModelRenderer(this, 14, 24);
      Right_Arm_Part_1.addBox(-0.5F, 0F, -0.5F, 1, 6, 1);
      Right_Arm_Part_1.setTextureSize(64, 32);
      Right_Arm_Part_1.mirror = true;
      setRotation(Right_Arm_Part_1, 0F, 0F, 0.7853982F);
      PixelmonModelRenderer  Right_Arm_Part_2 = new PixelmonModelRenderer(this, 18, 25);
      Right_Arm_Part_2.addBox(-0.5F, -6F, -0.5F, 1, 6, 1);
      Right_Arm_Part_2.setRotationPoint(-4.1F, 4F, 0F);
      Right_Arm_Part_2.setTextureSize(64, 32);
      Right_Arm_Part_2.mirror = true;
      setRotation(Right_Arm_Part_2, 0F, 0F, 0.9250245F);
      PixelmonModelRenderer  Right_Hand = new PixelmonModelRenderer(this, 55, 17);
      Right_Hand.addBox(-0.5F, -2F, -0.5F, 1, 2, 2);
      Right_Hand.setRotationPoint(-3.6F, 3.6F, 0F);
      Right_Hand.setTextureSize(64, 32);
      Right_Hand.mirror = true;
      setRotation(Right_Hand, 0F, 0F, -2.251475F);
      PixelmonModelRenderer  Right_Thumb = new PixelmonModelRenderer(this, 10, 16);
      Right_Thumb.addBox(-0.5F, -1.5F, -0.5F, 1, 2, 1);
      Right_Thumb.setRotationPoint(-3.1F, 3.5F, 0F);
      Right_Thumb.setTextureSize(64, 32);
      Right_Thumb.mirror = true;
      setRotation(Right_Thumb, 3.141593F, 0F, -0.2443461F);
      PixelmonModelRenderer  Bone_Part_1 = new PixelmonModelRenderer(this, 14, 22);
      Bone_Part_1.addBox(-0.5F, -1F, 0F, 1, 1, 1);
      Bone_Part_1.setRotationPoint(-5F, 5.15F, -4.6F);
      Bone_Part_1.setTextureSize(64, 32);
      Bone_Part_1.mirror = true;
      setRotation(Bone_Part_1, 0F, 2.530727F, -1.570796F);
      PixelmonModelRenderer  Bone_Part_2 = new PixelmonModelRenderer(this, 22, 23);
      Bone_Part_2.addBox(-0.5F, -2F, 0F, 1, 8, 1);
      Bone_Part_2.setRotationPoint(-4.3F, 5.1F, 1F);
      Bone_Part_2.setTextureSize(64, 32);
      Bone_Part_2.mirror = true;
      setRotation(Bone_Part_2, 0F, 1.58825F, -1.570796F);
      PixelmonModelRenderer  Bone_Part_3 = new PixelmonModelRenderer(this, 14, 22);
      Bone_Part_3.addBox(-0.5F, -1F, 0F, 1, 1, 1);
      Bone_Part_3.setRotationPoint(-3.5F, 5.1F, 2.7F);
      Bone_Part_3.setTextureSize(64, 32);
      Bone_Part_3.mirror = true;
      setRotation(Bone_Part_3, 0F, -0.5934119F, -1.570796F);
      PixelmonModelRenderer  Bone_Part_4 = new PixelmonModelRenderer(this, 14, 22);
      Bone_Part_4.addBox(-0.5F, -1F, 0F, 1, 1, 1);
      Bone_Part_4.setRotationPoint(-3.6F, 5.15F, -5.6F);
      Bone_Part_4.setTextureSize(64, 32);
      Bone_Part_4.mirror = true;
      setRotation(Bone_Part_4, 0F, 0.9948377F, -1.570796F);
      PixelmonModelRenderer  Bone_Part_5 = new PixelmonModelRenderer(this, 14, 22);
      Bone_Part_5.addBox(-0.5F, -1F, 0F, 1, 1, 1);
      Bone_Part_5.setRotationPoint(-3.4F, 5.1F, 2F);
      Bone_Part_5.setTextureSize(64, 32);
      Bone_Part_5.mirror = true;
      setRotation(Bone_Part_5, 0F, 0.9075712F, -1.570796F);
      RightArm.addChild(Right_Arm_Part_1);
      RightArm.addChild(Right_Arm_Part_2);
      RightArm.addChild(Right_Hand);
      RightArm.addChild(Right_Thumb);
      RightArm.addChild(Bone_Part_1);
      RightArm.addChild(Bone_Part_2);
      RightArm.addChild(Bone_Part_3);
      RightArm.addChild(Bone_Part_4);
      RightArm.addChild(Bone_Part_5);
      Body.addChild(RightArm);
      
      
      PixelmonModelRenderer LeftLeg = new PixelmonModelRenderer(this, "Left Leg");
      LeftLeg.setRotationPoint(1.6F, 3.8F, 3);
      PixelmonModelRenderer Left_Leg = new PixelmonModelRenderer(this, 26, 25);
      Left_Leg.addBox(-1F, 0F, -3F, 2, 4, 3);
      Left_Leg.setTextureSize(64, 32);
      Left_Leg.mirror = true;
      setRotation(Left_Leg, 0.0698132F, -0.5934119F, 0F);
      PixelmonModelRenderer Left_Toe = new PixelmonModelRenderer(this, 18, 22);
      Left_Toe.addBox(-1F, 0F, -3F, 1, 1, 1);
      Left_Toe.setRotationPoint(0.7F, 3F, 0F);
      Left_Toe.setTextureSize(64, 32);
      Left_Toe.mirror = true;
      setRotation(Left_Toe, 0.0698132F, -0.5934119F, 0F);
      LeftLeg.addChild(Left_Leg);
      LeftLeg.addChild(Left_Toe);
      Body.addChild(LeftLeg);
      
      
      PixelmonModelRenderer RightLeg = new PixelmonModelRenderer(this, "Right Leg");
      RightLeg.setRotationPoint(-1.7F, 3.8F, 3);
      PixelmonModelRenderer  Right_Leg_ = new PixelmonModelRenderer(this, 26, 25);
      Right_Leg_.addBox(-1F, 0F, -3F, 2, 4, 3);
      Right_Leg_.setTextureSize(64, 32);
      Right_Leg_.mirror = true;
      setRotation(Right_Leg_, 0.0698132F, 0.5934119F, 0F);
      PixelmonModelRenderer Right_Toe = new PixelmonModelRenderer(this, 18, 22);
      Right_Toe.addBox(-1F, 0F, -3F, 1, 1, 1);
      Right_Toe.setRotationPoint(0.3F, 3F, -0.5F);
      Right_Toe.setTextureSize(64, 32);
      Right_Toe.mirror = true;
      setRotation(Right_Toe, 0.0698132F, 0.5934119F, 0F);
      RightLeg.addChild(Right_Leg_);
      RightLeg.addChild(Right_Toe);
      Body.addChild(RightLeg);
      
      
      
      PixelmonModelRenderer  Tail_Part_1 = new PixelmonModelRenderer(this, 26, 23);
      Tail_Part_1.addBox(-0.5F, 0F, 0F, 1, 1, 1);
      Tail_Part_1.setRotationPoint(0F, 3.1F, 6.5F);
      Tail_Part_1.setTextureSize(64, 32);
      Tail_Part_1.mirror = true;
      setRotation(Tail_Part_1, 0.122173F, 0F, 0F);
      PixelmonModelRenderer  Tail_Part_2 = new PixelmonModelRenderer(this, 52, 19);
      Tail_Part_2.addBox(-1.5F, 0F, -3F, 3, 3, 3);
      Tail_Part_2.setRotationPoint(0F, 3.3F, 6F);
      Tail_Part_2.setTextureSize(64, 32);
      Tail_Part_2.mirror = true;
      setRotation(Tail_Part_2, -0.0349066F, 0F, 0F);
      PixelmonModelRenderer  Tail_Part_3 = new PixelmonModelRenderer(this, 54, 14);
      Tail_Part_3.addBox(-1F, 0F, -3F, 2, 2, 3);
      Tail_Part_3.setRotationPoint(0F, 3.3F, 7F);
      Tail_Part_3.setTextureSize(64, 32);
      Tail_Part_3.mirror = true;
      setRotation(Tail_Part_3, 0.2094395F, 0F, 0F);
      PixelmonModelRenderer  Tail_Part_4 = new PixelmonModelRenderer(this, 22, 19);
      Tail_Part_4.addBox(-0.5F, 0F, -3F, 1, 1, 3);
      Tail_Part_4.setRotationPoint(0F, 3.1F, 8.5F);
      Tail_Part_4.setTextureSize(64, 32);
      Tail_Part_4.mirror = true;
      setRotation(Tail_Part_4, 0.418879F, 0F, 0F);
      Body.addChild(Tail_Part_1); //not right, unable to animate tail with all tail parts being independent parts that are a piece of the body
      Body.addChild(Tail_Part_2); // Should be Body.addChild(Tail_Part_1); Tail_Part_1.addChild(Tail_Part_2); etc.
      Body.addChild(Tail_Part_3); // Doing this also requires that all the child pieces have to have new locations relative to the parent
      Body.addChild(Tail_Part_4);
      
      ModuleHead headModule = new ModuleHead(Head);

		ModuleArm leftArmModule = new ModuleArm(LeftArm, EnumArm.Left, 0, 0, 0);
		ModuleArm rightArmModule = new ModuleArm(RightArm, EnumArm.Right, 0, 0, 0);

		float legspeed = 0.65F;
		float legRotationLimit = 0.6F;

		ModuleLeg leftLegModule = new ModuleLeg(LeftLeg, EnumLeg.FrontLeft,
				EnumPhase.InPhase, legRotationLimit, legspeed);
		ModuleLeg rightLegModule = new ModuleLeg(RightLeg, EnumLeg.FrontRight,
				EnumPhase.InPhase, legRotationLimit, legspeed);

		skeleton = new SkeletonBiped(Body, headModule, leftArmModule,
				rightArmModule, leftLegModule, rightLegModule, null);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
  }
  
  private void setRotation(PixelmonModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
  }

}
