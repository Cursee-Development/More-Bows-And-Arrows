package com.cursee.more_bows_and_arrows.core.entity.renderer;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.core.entity.custom.NetheriteArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class NetheriteArrowRenderer extends ArrowRenderer<NetheriteArrow> {

    public NetheriteArrowRenderer(EntityRendererProvider.Context p_173917_) {
        super(p_173917_);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull NetheriteArrow entity) {
        return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "textures/entity/arrow/netherite_arrow.png");
    }
}
