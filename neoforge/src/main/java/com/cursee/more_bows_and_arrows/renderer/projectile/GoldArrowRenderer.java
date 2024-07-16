//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.cursee.more_bows_and_arrows.renderer.projectile;

import com.cursee.more_bows_and_arrows.entity.projectile.GoldArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class GoldArrowRenderer extends ArrowRenderer<GoldArrowEntity> {
    public GoldArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    public ResourceLocation getTextureLocation(GoldArrowEntity entity) {
        return ResourceLocation.fromNamespaceAndPath("more_bows_and_arrows", "textures/entities/projectiles/arrows/gold_arrow.png");
    }
}
