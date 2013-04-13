// Date: 2/18/2013 3:41:41 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX





package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.bird.EnumWing;
import pixelmon.client.models.animations.bird.ModuleWing;
import pixelmon.client.models.animations.bird.SkeletonBird;

public class ModelArcheops extends PixelmonModelBase
{
  //fields
    PixelmonModelRenderer Body;
  
  public ModelArcheops()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Body = new PixelmonModelRenderer(this, "Body");
      Body.setRotationPoint(0,14,-2);
      PixelmonModelRenderer neck_feathers_bottom = new PixelmonModelRenderer(this, 46, 0);
      neck_feathers_bottom.addBox(-2.5F, 0.2666667F, -6.133333F, 5, 1, 4);
      neck_feathers_bottom.setTextureSize(128, 64);
      neck_feathers_bottom.mirror = true;
      setRotation(neck_feathers_bottom, 0.5235988F, 0F, 0F);
      PixelmonModelRenderer neck_feathers_side_R_2 = new PixelmonModelRenderer(this, 65, 8);
      neck_feathers_side_R_2.addBox(-2.1F, -1.333333F, -5.9F, 1, 3, 4);
      neck_feathers_side_R_2.setTextureSize(128, 64);
      neck_feathers_side_R_2.mirror = true;
      setRotation(neck_feathers_side_R_2, 0.1919862F, 0.6283185F, -0.7504916F);
      PixelmonModelRenderer neck_feathers_side_L_2 = new PixelmonModelRenderer(this, 65, 0);
      neck_feathers_side_L_2.addBox(1.066667F, -1.333333F, -5.866667F, 1, 3, 4);
      neck_feathers_side_L_2.setTextureSize(128, 64);
      neck_feathers_side_L_2.mirror = true;
      setRotation(neck_feathers_side_L_2, 0.1919862F, -0.6283185F, 0.7504916F);
      PixelmonModelRenderer neck_feathers_side_L = new PixelmonModelRenderer(this, 76, 6);
      neck_feathers_side_L.addBox(0.6F, -0.6F, -4.866667F, 1, 3, 4);
      neck_feathers_side_L.setTextureSize(128, 64);
      neck_feathers_side_L.mirror = true;
      setRotation(neck_feathers_side_L, -0.715585F, -0.7853982F, 0.0698132F);
      PixelmonModelRenderer neck_feathers_side_R = new PixelmonModelRenderer(this, 87, 6);
      neck_feathers_side_R.addBox(-1.633333F, -0.6F, -4.866667F, 1, 3, 4);
      neck_feathers_side_R.setTextureSize(128, 64);
      neck_feathers_side_R.mirror = true;
      setRotation(neck_feathers_side_R, -0.715585F, 0.7853982F, -0.0698132F);
      PixelmonModelRenderer tail_base_feathers_side_2_L = new PixelmonModelRenderer(this, 96, 22);
      tail_base_feathers_side_2_L.addBox(-6F, -2.666667F, 5.866667F, 1, 3, 3);
      tail_base_feathers_side_2_L.setTextureSize(128, 64);
      tail_base_feathers_side_2_L.mirror = true;
      setRotation(tail_base_feathers_side_2_L, -1.082104F, 0.9075712F, -0.418879F);
      PixelmonModelRenderer tail_base_feathers_side_2_R = new PixelmonModelRenderer(this, 105, 22);
      tail_base_feathers_side_2_R.addBox(5F, -2.666667F, 5.866667F, 1, 3, 3);
      tail_base_feathers_side_2_R.setTextureSize(128, 64);
      tail_base_feathers_side_2_R.mirror = true;
      setRotation(tail_base_feathers_side_2_R, -1.082104F, -0.9075712F, 0.418879F);
      PixelmonModelRenderer tail_base_feathers_side_L = new PixelmonModelRenderer(this, 98, 14);
      tail_base_feathers_side_L.addBox(-2.8F, 3.733333F, 4.733333F, 1, 3, 4);
      tail_base_feathers_side_L.setTextureSize(128, 64);
      tail_base_feathers_side_L.mirror = true;
      setRotation(tail_base_feathers_side_L, 0.1047198F, 0.3490659F, -0.3141593F);
      PixelmonModelRenderer tail_base_feathers_side_R = new PixelmonModelRenderer(this, 98, 6);
      tail_base_feathers_side_R.addBox(1.8F, 3.733333F, 4.733333F, 1, 3, 4);
      tail_base_feathers_side_R.setTextureSize(128, 64);
      tail_base_feathers_side_R.mirror = true;
      setRotation(tail_base_feathers_side_R, 0.1047198F, -0.3490659F, 0.3141593F);
      PixelmonModelRenderer tail_base_feathers_top = new PixelmonModelRenderer(this, 95, 0);
      tail_base_feathers_top.addBox(-2F, 4.4F, 5.8F, 4, 1, 4);
      tail_base_feathers_top.setTextureSize(128, 64);
      tail_base_feathers_top.mirror = true;
      setRotation(tail_base_feathers_top, 0.0872665F, 0F, 0F);
      PixelmonModelRenderer neck_feathers_top = new PixelmonModelRenderer(this, 76, 0);
      neck_feathers_top.addBox(-2.5F, -1.266667F, -4.6F, 5, 1, 4);
      neck_feathers_top.setTextureSize(128, 64);
      neck_feathers_top.mirror = true;
      setRotation(neck_feathers_top, -1.151917F, 0F, 0F);
      PixelmonModelRenderer lower_body = new PixelmonModelRenderer(this, 0, 41);
      lower_body.addBox(-2.5F, -2.666667F, 3.066667F, 5, 5, 5);
      lower_body.setTextureSize(128, 64);
      lower_body.mirror = true;
      setRotation(lower_body, -0.7853982F, 0F, 0F);
      PixelmonModelRenderer main_body = new PixelmonModelRenderer(this, 0, 52);
      main_body.addBox(-3F, -2F, -2F, 6, 6, 6);
      main_body.setTextureSize(128, 64);
      main_body.mirror = true;
      setRotation(main_body, -0.5759587F, 0F, 0F);
      PixelmonModelRenderer neck_base = new PixelmonModelRenderer(this, 0, 32);
      neck_base.addBox(-2.5F, -2.666667F, -1.266667F, 5, 5, 3);
      neck_base.setRotationPoint(0F, 0F, -2F);
      neck_base.setTextureSize(128, 64);
      neck_base.mirror = true;
      setRotation(neck_base, -0.4537856F, 0F, 0F);
      PixelmonModelRenderer neck_1 = new PixelmonModelRenderer(this, 0, 23);
      neck_1.addBox(-2F, -2.133333F, -3.266667F, 4, 4, 4);
      neck_1.setRotationPoint(0F, -1F, -3F);
      neck_1.setTextureSize(128, 64);
      neck_1.mirror = true;
      setRotation(neck_1, -0.5235988F, 0F, 0F);
      PixelmonModelRenderer neck_2 = new PixelmonModelRenderer(this, 0, 15);
      neck_2.addBox(-1.5F, -1.6F, -2.866667F, 3, 3, 4);
      neck_2.setRotationPoint(0F, -3F, -6F);
      neck_2.setTextureSize(128, 64);
      neck_2.mirror = true;
      setRotation(neck_2, -0.4363323F, 0F, 0F);
      Body.addChild(neck_feathers_bottom);
      Body.addChild(neck_feathers_side_R_2);
      Body.addChild(neck_feathers_side_L_2);
      Body.addChild(neck_feathers_side_L);
      Body.addChild(neck_feathers_side_R);
      Body.addChild(tail_base_feathers_side_2_L);
      Body.addChild(tail_base_feathers_side_2_R);
      Body.addChild(tail_base_feathers_side_L);
      Body.addChild(tail_base_feathers_side_R);
      Body.addChild(tail_base_feathers_top);
      Body.addChild(neck_feathers_top);
      Body.addChild(lower_body);
      Body.addChild(main_body);
      Body.addChild(neck_base);
      Body.addChild(neck_2);
      Body.addChild(neck_1);
      
      
      PixelmonModelRenderer Head = new PixelmonModelRenderer(this, "Head");
      Head.setRotationPoint(0,-4,-9);
      PixelmonModelRenderer  head = new PixelmonModelRenderer(this, 25, 59);
      head.addBox(-2F, -1.3F, -1F, 4, 3, 2);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0.2792527F, 0F, 0F);
      PixelmonModelRenderer  upper_jaw = new PixelmonModelRenderer(this, 24, 53);
      upper_jaw.addBox(-1F, -1.7F, -4.6F, 2, 2, 3);
      upper_jaw.setTextureSize(128, 64);
      upper_jaw.mirror = true;
      setRotation(upper_jaw, 0.418879F, 0F, 0F);
      PixelmonModelRenderer  upper_jaw_tooth_L = new PixelmonModelRenderer(this, 26, 0);
      upper_jaw_tooth_L.addBox(1.7F, 0.1F, -3.666667F, 1, 1, 1);
      upper_jaw_tooth_L.setTextureSize(128, 64);
      upper_jaw_tooth_L.mirror = true;
      setRotation(upper_jaw_tooth_L, 0.3316126F, 0.3665191F, 0.1919862F);
      PixelmonModelRenderer  upper_jaw_tooth_R = new PixelmonModelRenderer(this, 31, 0);
      upper_jaw_tooth_R.addBox(-2.7F, 0.1F, -3.666667F, 1, 1, 1);
      upper_jaw_tooth_R.setTextureSize(128, 64);
      upper_jaw_tooth_R.mirror = true;
      setRotation(upper_jaw_tooth_R, 0.3316126F, -0.3665191F, -0.1919862F);
      PixelmonModelRenderer  lower_jaw_tooth_R = new PixelmonModelRenderer(this, 36, 0);
      lower_jaw_tooth_R.addBox(-2F, -1.033333F, -1.966667F, 1, 1, 1);
      lower_jaw_tooth_R.setRotationPoint(0F, 1.2F, -0.06667F);
      lower_jaw_tooth_R.setTextureSize(128, 64);
      lower_jaw_tooth_R.mirror = true;
      setRotation(lower_jaw_tooth_R, 0.7330383F, -0.3316126F, -0.0523599F);
      PixelmonModelRenderer  lower_jaw_tooth_L = new PixelmonModelRenderer(this, 41, 0);
      lower_jaw_tooth_L.addBox(1F, -1.033333F, -1.966667F, 1, 1, 1);
      lower_jaw_tooth_L.setRotationPoint(0F, 1.2F, -0.06667F);
      lower_jaw_tooth_L.setTextureSize(128, 64);
      lower_jaw_tooth_L.mirror = true;
      setRotation(lower_jaw_tooth_L, 0.7330383F, 0.3316126F, 0.0523599F);
      PixelmonModelRenderer  head_side_top_L = new PixelmonModelRenderer(this, 29, 25);
      head_side_top_L.addBox(0.3F, -2.6F, -1.533333F, 1, 1, 3);
      head_side_top_L.setTextureSize(128, 64);
      head_side_top_L.mirror = true;
      setRotation(head_side_top_L, 0.418879F, 0.122173F, 0.6457718F);
      PixelmonModelRenderer  head_side_top_R = new PixelmonModelRenderer(this, 29, 25);
      head_side_top_R.addBox(-1.3F, -2.6F, -1.533333F, 1, 1, 3);
      head_side_top_R.setTextureSize(128, 64);
      head_side_top_R.mirror = true;
      setRotation(head_side_top_R, 0.418879F, -0.122173F, -0.6457718F);
      PixelmonModelRenderer  head_side_back_L = new PixelmonModelRenderer(this, 28, 15);
      head_side_back_L.addBox(1.7F, -1.366667F, -0.9F, 1, 2, 2);
      head_side_back_L.setTextureSize(128, 64);
      head_side_back_L.mirror = true;
      setRotation(head_side_back_L, 0.2268928F, -0.3490659F, -0.122173F);
      PixelmonModelRenderer  head_side_back_R = new PixelmonModelRenderer(this, 28, 15);
      head_side_back_R.addBox(-2.7F, -1.366667F, -0.9F, 1, 2, 2);
      head_side_back_R.setTextureSize(128, 64);
      head_side_back_R.mirror = true;
      setRotation(head_side_back_R, 0.2268928F, 0.3490659F, 0.122173F);
      PixelmonModelRenderer  head_top_2 = new PixelmonModelRenderer(this, 24, 20);
      head_top_2.addBox(-1.5F, -2F, -1.3F, 3, 1, 3);
      head_top_2.setTextureSize(128, 64);
      head_top_2.mirror = true;
      setRotation(head_top_2, 0.0698132F, 0F, 0F);
      PixelmonModelRenderer  head_top_1 = new PixelmonModelRenderer(this, 15, 14);
      head_top_1.addBox(-1F, -2.366667F, -4.266667F, 2, 1, 4);
      head_top_1.setTextureSize(128, 64);
      head_top_1.mirror = true;
      setRotation(head_top_1, 0.5585054F, 0F, 0F);
      PixelmonModelRenderer  head_side_R = new PixelmonModelRenderer(this, 16, 20);
      head_side_R.addBox(-2.6F, -1.3F, -4F, 1, 2, 5);
      head_side_R.setTextureSize(128, 64);
      head_side_R.mirror = true;
      setRotation(head_side_R, 0.3316126F, -0.3316126F, -0.0523599F);
      PixelmonModelRenderer  head_side_L = new PixelmonModelRenderer(this, 17, 28);
      head_side_L.addBox(1.6F, -1.3F, -4F, 1, 2, 5);
      head_side_L.setTextureSize(128, 64);
      head_side_L.mirror = true;
      setRotation(head_side_L, 0.3316126F, 0.3316126F, 0.0523599F);
      PixelmonModelRenderer  lower_jaw_R = new PixelmonModelRenderer(this, 17, 36);
      lower_jaw_R.addBox(-2F, -0.5666667F, -2.9F, 1, 1, 3);
      lower_jaw_R.setRotationPoint(0F, 1.2F, -0.06667F);
      lower_jaw_R.setTextureSize(128, 64);
      lower_jaw_R.mirror = true;
      setRotation(lower_jaw_R, 0.7679449F, -0.3316126F, -0.0349066F);
      PixelmonModelRenderer  lower_jaw_L = new PixelmonModelRenderer(this, 16, 41);
      lower_jaw_L.addBox(1F, -0.5666667F, -2.9F, 1, 1, 3);
      lower_jaw_L.setRotationPoint(0F, 1.2F, -0.06667F);
      lower_jaw_L.setTextureSize(128, 64);
      lower_jaw_L.mirror = true;
      setRotation(lower_jaw_L, 0.7679449F, 0.3316126F, 0.0349066F);
      PixelmonModelRenderer  lower_jaw = new PixelmonModelRenderer(this, 21, 47);
      lower_jaw.addBox(-1F, -0.5666667F, -3.5F, 2, 1, 4);
      lower_jaw.setRotationPoint(0F, 1.2F, -0.06667F);
      lower_jaw.setTextureSize(128, 64);
      lower_jaw.mirror = true;
      setRotation(lower_jaw, 0.715585F, 0F, 0F);
      Head.addChild(head);
      Head.addChild(upper_jaw);
      Head.addChild(upper_jaw_tooth_L);
      Head.addChild(upper_jaw_tooth_R);
      Head.addChild(lower_jaw_tooth_R);
      Head.addChild(lower_jaw_tooth_L);
      Head.addChild(head_side_top_L);
      Head.addChild(head_side_top_R);
      Head.addChild(head_side_back_L);
      Head.addChild(head_side_back_R);
      Head.addChild(head_top_2);
      Head.addChild(head_top_1);
      Head.addChild(head_side_R);
      Head.addChild(head_side_L);
      Head.addChild(lower_jaw_R);
      Head.addChild(lower_jaw_L);
      Head.addChild(lower_jaw);
      Body.addChild(Head);
      
      PixelmonModelRenderer Tail = new PixelmonModelRenderer(this, "Tail");
      Tail.setRotationPoint(0,5,6);
      PixelmonModelRenderer  tail_1 = new PixelmonModelRenderer(this, 112, 0);
      tail_1.addBox(-2F, -1.6F, -0.4F, 4, 4, 4);
      tail_1.setTextureSize(128, 64);
      tail_1.mirror = true;
      setRotation(tail_1, -0.4363323F, 0F, 0F);
      PixelmonModelRenderer  tail_2 = new PixelmonModelRenderer(this, 114, 9);
      tail_2.addBox(-1.5F, -1.666667F, -0.8F, 3, 3, 4);
      tail_2.setRotationPoint(0F, 1.66667F, 3.266667F);
      tail_2.setTextureSize(128, 64);
      tail_2.mirror = true;
      setRotation(tail_2, -0.296706F, 0F, 0F);
      PixelmonModelRenderer  tail_3 = new PixelmonModelRenderer(this, 114, 17);
      tail_3.addBox(-1F, -0.8666667F, -0.06666667F, 2, 2, 5);
      tail_3.setRotationPoint(0F, 2.13333F, 6.4F);
      tail_3.setTextureSize(128, 64);
      tail_3.mirror = true;
      setRotation(tail_3, -0.1047198F, 0F, 0F);
      PixelmonModelRenderer  tail_feathers = new PixelmonModelRenderer(this, 84, 53);
      tail_feathers.addBox(-6F, -0.6F, 3.666667F, 12, 1, 10);
      tail_feathers.setRotationPoint(0F, 2.8F, 10.53333F);
      tail_feathers.setTextureSize(128, 64);
      tail_feathers.mirror = true;
      setRotation(tail_feathers, 0.0349066F, 0F, 0F);
      PixelmonModelRenderer  tail_4 = new PixelmonModelRenderer(this, 114, 25);
      tail_4.addBox(-0.5F, -0.8F, 0.4666667F, 1, 1, 6);
      tail_4.setRotationPoint(0F, 2.8F, 10.53333F);
      tail_4.setTextureSize(128, 64);
      tail_4.mirror = true;
      setRotation(tail_4, 0.0523599F, 0F, 0F);
      Tail.addChild(tail_1);
      Tail.addChild(tail_3);
      Tail.addChild(tail_2);
      Tail.addChild(tail_feathers);
      Tail.addChild(tail_4);
      Body.addChild(Tail);
      
      PixelmonModelRenderer LeftLeg = new PixelmonModelRenderer(this, "Left Leg");
      LeftLeg.setRotationPoint(2.533333F, 6F, 4F);
      PixelmonModelRenderer leg_1_L = new PixelmonModelRenderer(this, 35, 3);
      leg_1_L.addBox(0.5F, 0.7F, -1.266667F, 1, 2, 4);
      leg_1_L.setTextureSize(128, 64);
      leg_1_L.mirror = true;
      setRotation(leg_1_L, -0.837758F, -0.3316126F, 0F);
      PixelmonModelRenderer leg_2_L = new PixelmonModelRenderer(this, 44, 6);
      leg_2_L.addBox(0F, -2F, -3F, 2, 3, 5);
      leg_2_L.setTextureSize(128, 64);
      leg_2_L.mirror = true;
      setRotation(leg_2_L, 0.6283185F, -0.3316126F, -0.0174533F);
      PixelmonModelRenderer foot_L_1 = new PixelmonModelRenderer(this, 56, 12);
      foot_L_1.addBox(0.5F, 3F, -3.266667F, 1, 1, 4);
      foot_L_1.setTextureSize(128, 64);
      foot_L_1.mirror = true;
      setRotation(foot_L_1, 0F, -0.4537856F, 0F);
      PixelmonModelRenderer foot_L_2 = new PixelmonModelRenderer(this, 55, 6);
      foot_L_2.addBox(0.5F, 3F, -3.466667F, 1, 1, 3);
      foot_L_2.setTextureSize(128, 64);
      foot_L_2.mirror = true;
      setRotation(foot_L_2, 0F, -0.8901179F, 0F);
      PixelmonModelRenderer foot_L_3 = new PixelmonModelRenderer(this, 55, 6);
      foot_L_3.addBox(0.5F, 3F, -2.6F, 1, 1, 3);
      foot_L_3.setTextureSize(128, 64);
      foot_L_3.mirror = true;
      setRotation(foot_L_3, 0F, 0.122173F, 0F);
      PixelmonModelRenderer leg_feathers_2_L = new PixelmonModelRenderer(this, 99, 40);
      leg_feathers_2_L.addBox(0.4333333F, 0.8F, -0.7333333F, 1, 5, 7);
      leg_feathers_2_L.setTextureSize(128, 64);
      leg_feathers_2_L.mirror = true;
      setRotation(leg_feathers_2_L, 0.2268928F, -0.122173F, -0.3141593F);
      PixelmonModelRenderer leg_feathers_1_L = new PixelmonModelRenderer(this, 116, 43);
      leg_feathers_1_L.addBox(-2.633333F, 0.2F, -2.2F, 1, 4, 5);
      leg_feathers_1_L.setTextureSize(128, 64);
      leg_feathers_1_L.mirror = true;
      setRotation(leg_feathers_1_L, -0.5235988F, -0.2268928F, -1.169371F);
      LeftLeg.addChild(leg_1_L);
      LeftLeg.addChild(leg_2_L);
      LeftLeg.addChild(foot_L_1);
      LeftLeg.addChild(foot_L_2);
      LeftLeg.addChild(foot_L_3);
      LeftLeg.addChild(leg_feathers_2_L);
      LeftLeg.addChild(leg_feathers_1_L);
      Body.addChild(LeftLeg);
      
      PixelmonModelRenderer RightLeg = new PixelmonModelRenderer(this, "Right Leg");
      RightLeg.setRotationPoint(-2.466667F, 6, 4F);
      PixelmonModelRenderer leg_2_R = new PixelmonModelRenderer(this, 46, 20);
      leg_2_R.addBox(-2F, -2F, -3F, 2, 3, 5);
      leg_2_R.setTextureSize(128, 64);
      leg_2_R.mirror = true;
      setRotation(leg_2_R, 0.6283185F, 0.3316126F, 0.0174533F);
      PixelmonModelRenderer leg_1_R = new PixelmonModelRenderer(this, 60, 18);
      leg_1_R.addBox(-1.5F, 0.7F, -1.266667F, 1, 2, 4);
      leg_1_R.setTextureSize(128, 64);
      leg_1_R.mirror = true;
      setRotation(leg_1_R, -0.837758F, 0.3316126F, 0F);
      PixelmonModelRenderer foot_R_1 = new PixelmonModelRenderer(this, 56, 12);
      foot_R_1.addBox(-1.5F, 3F, -3.333333F, 1, 1, 4);
      foot_R_1.setTextureSize(128, 64);
      foot_R_1.mirror = true;
      setRotation(foot_R_1, 0F, 0.3839724F, 0F);
      PixelmonModelRenderer foot_R_2 = new PixelmonModelRenderer(this, 55, 6);
      foot_R_2.addBox(-1.5F, 3F, -3.666667F, 1, 1, 3);
      foot_R_2.setTextureSize(128, 64);
      foot_R_2.mirror = true;
      setRotation(foot_R_2, 0F, 0.8901179F, 0F);
      PixelmonModelRenderer foot_R_3 = new PixelmonModelRenderer(this, 55, 6);
      foot_R_3.addBox(-1.5F, 3F, -2.266667F, 1, 1, 3);
      foot_R_3.setTextureSize(128, 64);
      foot_R_3.mirror = true;
      setRotation(foot_R_3, 0F, -0.122173F, 0F);
      PixelmonModelRenderer leg_feathers_2_R = new PixelmonModelRenderer(this, 99, 33);
      leg_feathers_2_R.addBox(-1.4F, 0.7666667F, -0.7333333F, 1, 5, 7);
      leg_feathers_2_R.setTextureSize(128, 64);
      leg_feathers_2_R.mirror = true;
      setRotation(leg_feathers_2_R, 0.2268928F, 0.122173F, 0.3141593F);
      PixelmonModelRenderer leg_feathers_1_R = new PixelmonModelRenderer(this, 116, 33);
      leg_feathers_1_R.addBox(1.6F, 0.2F, -2.2F, 1, 4, 5);
      leg_feathers_1_R.setTextureSize(128, 64);
      leg_feathers_1_R.mirror = true;
      setRotation(leg_feathers_1_R, -0.5235988F, 0.2268928F, 1.169371F);
      RightLeg.addChild(leg_2_R);
      RightLeg.addChild(leg_1_R);
      RightLeg.addChild(foot_R_1);
      RightLeg.addChild(foot_R_2);
      RightLeg.addChild(foot_R_3);
      RightLeg.addChild(leg_feathers_2_R);
      RightLeg.addChild(leg_feathers_1_R);
      Body.addChild(RightLeg);
      
      
      PixelmonModelRenderer LeftWing = new PixelmonModelRenderer(this, "Left Wing");
      LeftWing.setRotationPoint(3F, 0F, -1F);
      PixelmonModelRenderer wing_1_L = new PixelmonModelRenderer(this, 77, 57);
      wing_1_L.addBox(0F, -0.4666667F, -1.066667F, 1, 5, 2);
      wing_1_L.setTextureSize(128, 64);
      wing_1_L.mirror = true;
      setRotation(wing_1_L, 0.0872665F, 0.2443461F, -0.7679449F);
      PixelmonModelRenderer wing_feathers_1_L = new PixelmonModelRenderer(this, 65, 41);
      wing_feathers_1_L.addBox(-0.5F, -0.4666667F, -1.066667F, 1, 7, 6);
      wing_feathers_1_L.setTextureSize(128, 64);
      wing_feathers_1_L.mirror = true;
      setRotation(wing_feathers_1_L, 0.0872665F, 0.2443461F, -0.7679449F);
      PixelmonModelRenderer wing_2_L = new PixelmonModelRenderer(this, 68, 54);
      wing_2_L.addBox(-0.7F, -0.4666667F, -1.666667F, 1, 7, 3);
      wing_2_L.setRotationPoint(4F,3F, -0.533333F);
      wing_2_L.setTextureSize(128, 64);
      wing_2_L.mirror = true;
      setRotation(wing_2_L, -0.1047198F, 0.4712389F, -0.7679449F);
      PixelmonModelRenderer wing_feathers_2_L = new PixelmonModelRenderer(this, 80, 37);
      wing_feathers_2_L.addBox(-1.166667F, -0.5F, 0.3333333F, 1, 8, 8);
      wing_feathers_2_L.setRotationPoint(4F,3F, -0.533333F);
      wing_feathers_2_L.setTextureSize(128, 64);
      wing_feathers_2_L.mirror = true;
      setRotation(wing_feathers_2_L, -0.1047198F, 0.4712389F, -0.7679449F);
      PixelmonModelRenderer wing_3_L = new PixelmonModelRenderer(this, 55, 54);
      wing_3_L.addBox(-0.7F, 3.533333F, -3F, 1, 5, 5);
      wing_3_L.setRotationPoint(4F,3F, -0.533333F);
      wing_3_L.setTextureSize(128, 64);
      wing_3_L.mirror = true;
      setRotation(wing_3_L, -0.1047198F, 0.4712389F, -0.7330383F);
      PixelmonModelRenderer L_claw_1 = new PixelmonModelRenderer(this, 0, 0);
      L_claw_1.addBox(0F, 0F, 0F, 1, 2, 1);
      L_claw_1.setRotationPoint(6F, 7F, -3F);
      L_claw_1.setTextureSize(128, 64);
      L_claw_1.mirror = true;
      setRotation(L_claw_1, 0.8203047F, 0F, -0.0872665F);
      PixelmonModelRenderer L_claw_2 = new PixelmonModelRenderer(this, 0, 0);
      L_claw_2.addBox(0F, 0F, 0F, 1, 2, 1);
      L_claw_2.setRotationPoint(6F, 7F, -3F);
      L_claw_2.setTextureSize(128, 64);
      L_claw_2.mirror = true;
      setRotation(L_claw_2, -0.6457718F, 0.418879F, 0F);
      PixelmonModelRenderer L_claw_3 = new PixelmonModelRenderer(this, 0, 0);
      L_claw_3.addBox(0F, 0F, 0F, 1, 2, 1);
      L_claw_3.setRotationPoint(6F, 7F, -3F);
      L_claw_3.setTextureSize(128, 64);
      L_claw_3.mirror = true;
      setRotation(L_claw_3, 0F, 0F, 0F);
      LeftWing.addChild(wing_2_L);
      LeftWing.addChild(wing_1_L);
      LeftWing.addChild(wing_feathers_2_L);
      LeftWing.addChild(wing_feathers_1_L);
      LeftWing.addChild(wing_3_L);
      LeftWing.addChild(L_claw_1);
      LeftWing.addChild(L_claw_2);
      LeftWing.addChild(L_claw_3);
      Body.addChild(LeftWing);
      
      
      PixelmonModelRenderer RightWing = new PixelmonModelRenderer(this, "Right Wing");
      RightWing.setRotationPoint(-3F, 0F, -1F);
      PixelmonModelRenderer wing_1_R = new PixelmonModelRenderer(this, 77, 57);
      wing_1_R.addBox(-1F, -0.4666667F, -1.066667F, 1, 5, 2);
      wing_1_R.setTextureSize(128, 64);
      wing_1_R.mirror = true;
      setRotation(wing_1_R, 0.0872665F, -0.2443461F, 0.7679449F);
      PixelmonModelRenderer wing_feathers_1_R = new PixelmonModelRenderer(this, 66, 29);
      wing_feathers_1_R.addBox(-0.5F, -0.4666667F, -1.066667F, 1, 7, 6);
      wing_feathers_1_R.setTextureSize(128, 64);
      wing_feathers_1_R.mirror = true;
      setRotation(wing_feathers_1_R, 0.0872665F, -0.2443461F, 0.7679449F);
      PixelmonModelRenderer wing_2_R = new PixelmonModelRenderer(this, 68, 54);
      wing_2_R.addBox(-0.3F, -0.4666667F, -1.666667F, 1, 7, 3);
      wing_2_R.setRotationPoint(-4F, 3, -0.533333F);
      wing_2_R.setTextureSize(128, 64);
      wing_2_R.mirror = true;
      setRotation(wing_2_R, -0.1047198F, -0.4712389F, 0.7679449F);
      PixelmonModelRenderer wing_feathers_2_R = new PixelmonModelRenderer(this, 81, 21);
      wing_feathers_2_R.addBox(0.1666667F, -0.5F, 0.3333333F, 1, 8, 8);
      wing_feathers_2_R.setRotationPoint(-4F, 3, -0.533333F);
      wing_feathers_2_R.setTextureSize(128, 64);
      wing_feathers_2_R.mirror = true;
      setRotation(wing_feathers_2_R, -0.1047198F, -0.4712389F, 0.7679449F);
      PixelmonModelRenderer wing_3_R = new PixelmonModelRenderer(this, 52, 43);
      wing_3_R.addBox(-0.3F, 3.533333F, -3F, 1, 5, 5);
      wing_3_R.setRotationPoint(-4F, 3, -0.533333F);
      wing_3_R.setTextureSize(128, 64);
      wing_3_R.mirror = true;
      setRotation(wing_3_R, -0.1047198F, -0.4712389F, 0.7330383F);
      PixelmonModelRenderer R_claw_1 = new PixelmonModelRenderer(this, 0, 0);
      R_claw_1.addBox(-1F, 0F, 0F, 1, 2, 1);
      R_claw_1.setRotationPoint(-6F, 7F, -3F);
      R_claw_1.setTextureSize(128, 64);
      R_claw_1.mirror = true;
      setRotation(R_claw_1, 0.8203047F, 0F, 0.0872665F);
      PixelmonModelRenderer R_claw_3 = new PixelmonModelRenderer(this, 0, 0);
      R_claw_3.addBox(-1F, 0F, 0F, 1, 2, 1);
      R_claw_3.setRotationPoint(-6F, 7F, -3F);
      R_claw_3.setTextureSize(128, 64);
      R_claw_3.mirror = true;
      setRotation(R_claw_3, 0F, 0F, 0F);
      PixelmonModelRenderer R_claw_2 = new PixelmonModelRenderer(this, 0, 0);
      R_claw_2.addBox(-1F, 0F, 0F, 1, 2, 1);
      R_claw_2.setRotationPoint(-6F, 7F, -3F);
      R_claw_2.setTextureSize(128, 64);
      R_claw_2.mirror = true;
      setRotation(R_claw_2, -0.6457718F, -0.418879F, 0F);
      RightWing.addChild(wing_1_R);
      RightWing.addChild(wing_2_R);
      RightWing.addChild(wing_feathers_2_R);
      RightWing.addChild(wing_feathers_1_R);
      RightWing.addChild(wing_3_R);
      RightWing.addChild(R_claw_1);
      RightWing.addChild(R_claw_3);
      RightWing.addChild(R_claw_2);
      Body.addChild(RightWing);
      
      
      ModuleHead headModule = new ModuleHead(Head);
      ModuleWing rightWingModule = new ModuleWing(RightWing, EnumWing.Right, EnumWing.Verticle, 0.25F, 1.3F);
      ModuleWing leftWingModule = new ModuleWing(LeftWing, EnumWing.Left, EnumWing.Verticle,  0.25F, 1.3F);
		
      skeleton = new SkeletonBird(Body, headModule, leftWingModule, rightWingModule, LeftLeg, RightLeg);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    Body.render(f5);
  }
  
  private void setRotation(PixelmonModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  

}
