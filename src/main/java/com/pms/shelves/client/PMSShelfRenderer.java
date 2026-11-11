package com.pms.shelves.client;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.shelves.backport.block.entity.ShelfBlockEntity;
import dev.shelves.backport.client.ShelfBlockEntityRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.registries.BuiltInRegistries;
import com.pms.shelves.PMSShelves;

/** Experimental alignment correction, affecting PMS blocks only. */
public final class PMSShelfRenderer extends ShelfBlockEntityRenderer {
    private static final double PMS_ITEM_Y_OFFSET = 2.5 / 16.0;

    public PMSShelfRenderer(BlockEntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public void render(ShelfBlockEntity shelf, float partialTick, PoseStack pose,
                       MultiBufferSource buffers, int packedLight, int packedOverlay) {
        if (!PMSShelves.MOD_ID.equals(BuiltInRegistries.BLOCK
                .getKey(shelf.getBlockState().getBlock()).getNamespace())) {
            super.render(shelf, partialTick, pose, buffers, packedLight, packedOverlay);
            return;
        }
        pose.pushPose();
        try {
            // The original renderer is otherwise unchanged. Shift only PMS items up.
            pose.translate(0.0, PMS_ITEM_Y_OFFSET, 0.0);
            super.render(shelf, partialTick, pose, buffers, packedLight, packedOverlay);
        } finally {
            pose.popPose();
        }
    }
}
