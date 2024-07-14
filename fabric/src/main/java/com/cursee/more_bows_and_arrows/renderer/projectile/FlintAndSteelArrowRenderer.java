//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.cursee.more_bows_and_arrows.renderer.projectile;

import com.cursee.more_bows_and_arrows.entity.projectile.FlintAndSteelArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class FlintAndSteelArrowRenderer extends ArrowRenderer<FlintAndSteelArrowEntity> {
    public FlintAndSteelArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    public ResourceLocation getTextureLocation(FlintAndSteelArrowEntity entity) {
        return new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows/flint_and_steel_arrow.png");
    }
}
