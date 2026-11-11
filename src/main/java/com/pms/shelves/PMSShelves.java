package com.pms.shelves;

import dev.shelves.backport.block.ShelfBlock;
import dev.shelves.backport.registry.ModBlockEntities;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.ArrayList;
import java.util.List;

@Mod(PMSShelves.MOD_ID)
public final class PMSShelves {
    public static final String MOD_ID = "pmsshelves";
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);
    private static final List<DeferredBlock<ShelfBlock>> SHELVES = new ArrayList<>();

    private static DeferredBlock<ShelfBlock> shelf(String name) {
        DeferredBlock<ShelfBlock> block = BLOCKS.registerBlock(name + "_shelf", ShelfBlock::new,
            BlockBehaviour.Properties.of().strength(2.0F).noOcclusion());
        ITEMS.registerSimpleBlockItem(block);
        SHELVES.add(block);
        return block;
    }

    // Stable registry IDs: existing shelves preserve saved-world compatibility.
    private static final DeferredBlock<ShelfBlock> SHELF_BOP_DEAD = shelf("bop_dead");
    private static final DeferredBlock<ShelfBlock> SHELF_BOP_EMPYREAL = shelf("bop_empyreal");
    private static final DeferredBlock<ShelfBlock> SHELF_BOP_FIR = shelf("bop_fir");
    private static final DeferredBlock<ShelfBlock> SHELF_BOP_HELLBARK = shelf("bop_hellbark");
    private static final DeferredBlock<ShelfBlock> SHELF_BOP_JACARANDA = shelf("bop_jacaranda");
    private static final DeferredBlock<ShelfBlock> SHELF_BOP_MAGIC = shelf("bop_magic");
    private static final DeferredBlock<ShelfBlock> SHELF_BOP_MAHOGANY = shelf("bop_mahogany");
    private static final DeferredBlock<ShelfBlock> SHELF_BOP_MAPLE = shelf("bop_maple");
    private static final DeferredBlock<ShelfBlock> SHELF_BOP_PALM = shelf("bop_palm");
    private static final DeferredBlock<ShelfBlock> SHELF_BOP_PINE = shelf("bop_pine");
    private static final DeferredBlock<ShelfBlock> SHELF_BOP_REDWOOD = shelf("bop_redwood");
    private static final DeferredBlock<ShelfBlock> SHELF_BOP_UMBRAN = shelf("bop_umbran");
    private static final DeferredBlock<ShelfBlock> SHELF_BOP_WILLOW = shelf("bop_willow");
    private static final DeferredBlock<ShelfBlock> SHELF_NS_ASPEN = shelf("ns_aspen");
    private static final DeferredBlock<ShelfBlock> SHELF_NS_CEDAR = shelf("ns_cedar");
    private static final DeferredBlock<ShelfBlock> SHELF_NS_COCONUT = shelf("ns_coconut");
    private static final DeferredBlock<ShelfBlock> SHELF_NS_CYPRESS = shelf("ns_cypress");
    private static final DeferredBlock<ShelfBlock> SHELF_NS_FIR = shelf("ns_fir");
    private static final DeferredBlock<ShelfBlock> SHELF_NS_GHAF = shelf("ns_ghaf");
    private static final DeferredBlock<ShelfBlock> SHELF_NS_JOSHUA = shelf("ns_joshua");
    private static final DeferredBlock<ShelfBlock> SHELF_NS_LARCH = shelf("ns_larch");
    private static final DeferredBlock<ShelfBlock> SHELF_NS_MAHOGANY = shelf("ns_mahogany");
    private static final DeferredBlock<ShelfBlock> SHELF_NS_MAPLE = shelf("ns_maple");
    private static final DeferredBlock<ShelfBlock> SHELF_NS_OLIVE = shelf("ns_olive");
    private static final DeferredBlock<ShelfBlock> SHELF_NS_PALO_VERDE = shelf("ns_palo_verde");
    private static final DeferredBlock<ShelfBlock> SHELF_NS_REDWOOD = shelf("ns_redwood");
    private static final DeferredBlock<ShelfBlock> SHELF_NS_SAXAUL = shelf("ns_saxaul");
    private static final DeferredBlock<ShelfBlock> SHELF_NS_SUGI = shelf("ns_sugi");
    private static final DeferredBlock<ShelfBlock> SHELF_NS_WILLOW = shelf("ns_willow");
    private static final DeferredBlock<ShelfBlock> SHELF_NS_WISTERIA = shelf("ns_wisteria");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_ASPEN = shelf("bwg_aspen");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_BAOBAB = shelf("bwg_baobab");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_BLUE_ENCHANTED = shelf("bwg_blue_enchanted");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_CIKA = shelf("bwg_cika");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_CYPRESS = shelf("bwg_cypress");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_EBONY = shelf("bwg_ebony");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_FIR = shelf("bwg_fir");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_FLORUS = shelf("bwg_florus");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_GREEN_ENCHANTED = shelf("bwg_green_enchanted");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_HOLLY = shelf("bwg_holly");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_IRONWOOD = shelf("bwg_ironwood");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_JACARANDA = shelf("bwg_jacaranda");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_MAHOGANY = shelf("bwg_mahogany");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_MAPLE = shelf("bwg_maple");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_PALM = shelf("bwg_palm");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_PINE = shelf("bwg_pine");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_RAINBOW_EUCALYPTUS = shelf("bwg_rainbow_eucalyptus");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_REDWOOD = shelf("bwg_redwood");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_SAKURA = shelf("bwg_sakura");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_SKYRIS = shelf("bwg_skyris");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_SPIRIT = shelf("bwg_spirit");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_WHITE_MANGROVE = shelf("bwg_white_mangrove");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_WILLOW = shelf("bwg_willow");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_WITCH_HAZEL = shelf("bwg_witch_hazel");
    private static final DeferredBlock<ShelfBlock> SHELF_BWG_ZELKOVA = shelf("bwg_zelkova");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_ALPHA = shelf("ru_alpha");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_BAOBAB = shelf("ru_baobab");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_BLACK_PAINTED = shelf("ru_black_painted");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_BLACKWOOD = shelf("ru_blackwood");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_BLUE_BIOSHROOM = shelf("ru_blue_bioshroom");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_BLUE_PAINTED = shelf("ru_blue_painted");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_BRIMWOOD = shelf("ru_brimwood");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_BROWN_PAINTED = shelf("ru_brown_painted");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_COBALT = shelf("ru_cobalt");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_CYAN_PAINTED = shelf("ru_cyan_painted");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_CYPRESS = shelf("ru_cypress");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_DEAD = shelf("ru_dead");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_EUCALYPTUS = shelf("ru_eucalyptus");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_GRAY_PAINTED = shelf("ru_gray_painted");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_GREEN_BIOSHROOM = shelf("ru_green_bioshroom");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_GREEN_PAINTED = shelf("ru_green_painted");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_JOSHUA = shelf("ru_joshua");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_KAPOK = shelf("ru_kapok");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_LARCH = shelf("ru_larch");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_LIGHT_BLUE_PAINTED = shelf("ru_light_blue_painted");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_LIGHT_GRAY_PAINTED = shelf("ru_light_gray_painted");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_LIME_PAINTED = shelf("ru_lime_painted");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_MAGENTA_PAINTED = shelf("ru_magenta_painted");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_MAGNOLIA = shelf("ru_magnolia");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_MAPLE = shelf("ru_maple");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_ORANGE_PAINTED = shelf("ru_orange_painted");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_PALM = shelf("ru_palm");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_PINE = shelf("ru_pine");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_PINK_BIOSHROOM = shelf("ru_pink_bioshroom");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_PINK_PAINTED = shelf("ru_pink_painted");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_PURPLE_PAINTED = shelf("ru_purple_painted");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_RED_PAINTED = shelf("ru_red_painted");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_REDWOOD = shelf("ru_redwood");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_SOCOTRA = shelf("ru_socotra");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_WHITE_PAINTED = shelf("ru_white_painted");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_WILLOW = shelf("ru_willow");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_WISTERIA = shelf("ru_wisteria");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_YELLOW_BIOSHROOM = shelf("ru_yellow_bioshroom");
    private static final DeferredBlock<ShelfBlock> SHELF_RU_YELLOW_PAINTED = shelf("ru_yellow_painted");
    private static final DeferredBlock<ShelfBlock> SHELF_MB_BLACK_CHERRY = shelf("mb_black_cherry");
    private static final DeferredBlock<ShelfBlock> SHELF_MB_LAVENDER = shelf("mb_lavender");
    private static final DeferredBlock<ShelfBlock> SHELF_MB_MAPLE = shelf("mb_maple");
    private static final DeferredBlock<ShelfBlock> SHELF_MB_PEACH = shelf("mb_peach");
    private static final DeferredBlock<ShelfBlock> SHELF_MB_SEA_FOAM = shelf("mb_sea_foam");
    private static final DeferredBlock<ShelfBlock> SHELF_MB_SPRING = shelf("mb_spring");
    private static final DeferredBlock<ShelfBlock> SHELF_MB_STRAWBERRY = shelf("mb_strawberry");
    private static final DeferredBlock<ShelfBlock> SHELF_MB_TROPICAL = shelf("mb_tropical");
    private static final DeferredBlock<ShelfBlock> SHELF_MB_VANILLA = shelf("mb_vanilla");
    private static final DeferredBlock<ShelfBlock> SHELF_DL_HARU = shelf("dl_haru");
    private static final DeferredBlock<ShelfBlock> SHELF_DL_IPE_AMARELO = shelf("dl_ipe_amarelo");
    private static final DeferredBlock<ShelfBlock> SHELF_DL_JACARANDA = shelf("dl_jacaranda");
    private static final DeferredBlock<ShelfBlock> SHELF_DL_PAU_BRASIL = shelf("dl_pau_brasil");

    public PMSShelves(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
        bus.addListener(this::onAddValidBlocks);
        bus.addListener(this::onCreativeTabs);
    }

    private void onAddValidBlocks(BlockEntityTypeAddBlocksEvent event) {
        event.modify(ModBlockEntities.SHELF.get(), SHELVES.stream().map(DeferredBlock::get).toArray(ShelfBlock[]::new));
    }

    private void onCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            for (DeferredBlock<ShelfBlock> shelf : SHELVES) event.accept(shelf);
        }
    }
}
