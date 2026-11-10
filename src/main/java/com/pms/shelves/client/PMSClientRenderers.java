package com.pms.shelves.client;

import com.pms.shelves.PMSShelves;
import dev.shelves.backport.registry.ModBlockEntities;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

/** Register the wrapper for the preexisting shelf block-entity type. */
@EventBusSubscriber(modid = PMSShelves.MOD_ID,
        bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class PMSClientRenderers {
    private PMSClientRenderers() {}

    @SubscribeEvent
    public static void register(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.SHELF.get(), PMSShelfRenderer::new);
    }
}
