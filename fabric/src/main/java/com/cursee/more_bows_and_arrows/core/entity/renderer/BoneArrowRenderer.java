package com.cursee.more_bows_and_arrows.core.entity.renderer;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.core.entity.custom.BoneArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class BoneArrowRenderer extends ArrowRenderer<BoneArrow> {

    public BoneArrowRenderer(EntityRendererProvider.Context p_173917_) {
        super(p_173917_);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull BoneArrow entity) {
        return new ResourceLocation(Constants.MOD_ID, "textures/entity/arrow/bone_arrow.png");
    }
}
