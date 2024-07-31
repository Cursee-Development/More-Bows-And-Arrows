package com.cursee.more_bows_and_arrows.core.entity.renderer;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.core.entity.custom.CactusArrow;
import com.cursee.more_bows_and_arrows.core.entity.custom.CoalArrow;
import com.cursee.more_bows_and_arrows.core.entity.custom.ObsidianArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class ObsidianArrowRenderer extends ArrowRenderer<ObsidianArrow> {

    public ObsidianArrowRenderer(EntityRendererProvider.Context p_173917_) {
        super(p_173917_);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull ObsidianArrow entity) {
        return new ResourceLocation(Constants.MOD_ID, "textures/entity/arrow/obsidian_arrow.png");
    }
}
