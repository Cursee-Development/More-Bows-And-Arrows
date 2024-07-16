//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.cursee.more_bows_and_arrows.renderer.projectile;

import com.cursee.more_bows_and_arrows.entity.projectile.EnderPearlArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class EnderPearlArrowRenderer extends ArrowRenderer<EnderPearlArrowEntity> {
    public EnderPearlArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    public ResourceLocation getTextureLocation(EnderPearlArrowEntity entity) {
        return ResourceLocation.fromNamespaceAndPath("more_bows_and_arrows", "textures/entities/projectiles/arrows/ender_pearl_arrow.png");
    }
}
