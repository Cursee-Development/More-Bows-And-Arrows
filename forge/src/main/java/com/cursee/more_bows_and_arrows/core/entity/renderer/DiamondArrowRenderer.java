package com.cursee.more_bows_and_arrows.core.entity.renderer;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.core.entity.custom.CactusArrow;
import com.cursee.more_bows_and_arrows.core.entity.custom.CoalArrow;
import com.cursee.more_bows_and_arrows.core.entity.custom.DiamondArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class DiamondArrowRenderer extends ArrowRenderer<DiamondArrow> {

    public DiamondArrowRenderer(EntityRendererProvider.Context p_173917_) {
        super(p_173917_);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull DiamondArrow entity) {
        return new ResourceLocation(Constants.MOD_ID, "textures/entity/arrow/diamond_arrow.png");
    }
}
