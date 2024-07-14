//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.cursee.more_bows_and_arrows.renderer.projectile;

import com.cursee.more_bows_and_arrows.entity.projectile.LapisArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class LapisArrowRenderer extends ArrowRenderer<LapisArrowEntity> {
    public LapisArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    public ResourceLocation getTextureLocation(LapisArrowEntity entity) {
        return new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows/lapis_arrow.png");
    }
}
