# PMS Shelf Variants v0.4.0 – all wood variants

Standalone NeoForge 1.21.1 addon for Shelf Backport 1.0.0. Total **107** shelves.

The proven **2.5 / 16.0** visual alignment setting from v0.3.0 is preserved. The original three registry IDs are unchanged, so worlds retaining those blocks do not need replacement.

## Included woods

- **Biomes O’ Plenty** (biomesoplenty): 13: dead, empyreal, fir, hellbark, jacaranda, magic, mahogany, maple, palm, pine, redwood, umbran, willow

- **Nature’s Spirit** (natures_spirit): 17: aspen, cedar, coconut, cypress, fir, ghaf, joshua, larch, mahogany, maple, olive, palo_verde, redwood, saxaul, sugi, willow, wisteria

- **Oh The Biomes We’ve Gone** (biomeswevegone): 25: aspen, baobab, blue_enchanted, cika, cypress, ebony, fir, florus, green_enchanted, holly, ironwood, jacaranda, mahogany, maple, palm, pine, rainbow_eucalyptus, redwood, sakura, skyris, spirit, white_mangrove, willow, witch_hazel, zelkova

- **Regions Unexplored** (regions_unexplored): 39: alpha, baobab, black_painted, blackwood, blue_bioshroom, blue_painted, brimwood, brown_painted, cobalt, cyan_painted, cypress, dead, eucalyptus, gray_painted, green_bioshroom, green_painted, joshua, kapok, larch, light_blue_painted, light_gray_painted, lime_painted, magenta_painted, magnolia, maple, orange_painted, palm, pine, pink_bioshroom, pink_painted, purple_painted, red_painted, redwood, socotra, white_painted, willow, wisteria, yellow_bioshroom, yellow_painted

- **Mystic’s Biomes** (mysticsbiomes): 9: black_cherry, lavender, maple, peach, sea_foam, spring, strawberry, tropical, vanilla

- **Distant Lands** (distantlandsmc): 4: haru, ipe_amarelo, jacaranda, pau_brasil

## Installation and build

Replace prior PMS Shelf Variants sources in the same GitHub repository, preserving `.github/workflows/build.yml` and its ClamAV scan. Upload the changed `src` files, `build.gradle`, and `neoforge.mods.toml`. Do not install simultaneously with older PMS Shelf Variants JARs.

All six source mods plus Shelf Backport are required on both client and server. These resources are built from source JAR assets; the actual generated shelf models follow Shelf Backport's existing shelf multipart template. Each source mod's planks texture is used for the shelf appearance; decorative repainting and rare wood families use matching planks as crafting ingredients when stripped logs are absent.

**Caution:** This is a code-complete, uncompiled source build; it has not been tested in Minecraft. Back up worlds before replacing shelf variants, and test all recipes in a test world first.
