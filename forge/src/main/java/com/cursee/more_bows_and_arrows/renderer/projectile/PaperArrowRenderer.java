//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.cursee.more_bows_and_arrows.renderer.projectile;

import com.cursee.more_bows_and_arrows.entity.projectile.PaperArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class PaperArrowRenderer extends ArrowRenderer<PaperArrowEntity> {
    public PaperArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    public ResourceLocation getTextureLocation(PaperArrowEntity entity) {
        return ResourceLocation.fromNamespaceAndPath("more_bows_and_arrows", "textures/entities/projectiles/arrows/paper_arrow.png");
    }
}
