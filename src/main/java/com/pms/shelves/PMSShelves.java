package com.pms.shelves;

import dev.shelves.backport.block.ShelfBlock;
import dev.shelves.backport.registry.ModBlockEntities;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(PMSShelves.MOD_ID)
public final class PMSShelves {
    public static final String MOD_ID = "pmsshelves";
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    // Reuse the *original* ShelfBlock, so all vanilla shelf interactions and redstone behavior apply.
    private static DeferredBlock<ShelfBlock> shelf(String name) {
        DeferredBlock<ShelfBlock> block = BLOCKS.registerBlock(name + "_shelf", ShelfBlock::new,
                BlockBehaviour.Properties.of().strength(2.0F).noOcclusion());
        ITEMS.registerSimpleBlockItem(block);
        return block;
    }

    private static final DeferredBlock<ShelfBlock> JACARANDA = shelf("bop_jacaranda");
    private static final DeferredBlock<ShelfBlock> REDWOOD = shelf("ru_redwood");
    private static final DeferredBlock<ShelfBlock> WISTERIA = shelf("ns_wisteria");

    public PMSShelves(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
        // This is a NeoForge-supported way to add blocks to an existing block entity type.
        bus.addListener(this::onAddValidBlocks);
        bus.addListener(this::onCreativeTabs);
    }

    private void onAddValidBlocks(BlockEntityTypeAddBlocksEvent event) {
        event.modify(ModBlockEntities.SHELF.get(), JACARANDA.get(), REDWOOD.get(), WISTERIA.get());
    }

    private void onCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(JACARANDA);
            event.accept(REDWOOD);
            event.accept(WISTERIA);
        }
    }
}
