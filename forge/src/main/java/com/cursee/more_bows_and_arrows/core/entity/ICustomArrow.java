package com.cursee.more_bows_and_arrows.core.entity;

import com.cursee.more_bows_and_arrows.core.entity.custom.EnderPearlArrow;
import com.cursee.more_bows_and_arrows.core.entity.custom.FlintAndSteelArrow;
import com.cursee.more_bows_and_arrows.core.entity.custom.TNTArrow;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.RelativeMovement;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import org.apache.logging.log4j.core.jmx.Server;

public interface ICustomArrow {

    @SuppressWarnings("all")
    default void checkHitResult(AbstractArrow arrow, HitResult result) {

        HitResult.Type type = result.getType();

        if (type == HitResult.Type.MISS || arrow.level().isClientSide() || arrow.getOwner() == null) {
            return;
        }

        switch (type) {
            case BLOCK -> processBlockInteraction(arrow, (BlockHitResult) result);
            case ENTITY -> processEntityInteraction(arrow, (EntityHitResult) result);
        }
    }

    @SuppressWarnings("all")
    default void processBlockInteraction(AbstractArrow arrow, BlockHitResult result) {

        Entity owner = arrow.getOwner();
        BlockPos pos = result.getBlockPos();
        BlockState state = arrow.level().getBlockState(pos);

        if (arrow instanceof EnderPearlArrow) {
            owner.teleportTo((ServerLevel) owner.level(), arrow.xo, arrow.yo, arrow.zo, RelativeMovement.ROTATION, owner.getYRot(), owner.getXRot());
        }
        else if (arrow instanceof FlintAndSteelArrow) {

            // todo: finish
        }
    }

    @SuppressWarnings("all")
    default void processEntityInteraction(AbstractArrow arrow, EntityHitResult result) {

        Entity owner = arrow.getOwner();
        Entity entity = result.getEntity();

        if (arrow instanceof EnderPearlArrow) {
            entity.teleportTo((ServerLevel) owner.level(), owner.xo, owner.yo, owner.zo, RelativeMovement.ROTATION, entity.getYRot(), entity.getXRot());
        }
        else if (arrow instanceof FlintAndSteelArrow) {
            entity.setSecondsOnFire(2);
        }
    }
}
