# PMS Shelf Variants — Proof of Concept v0.1.0

**PMS = Psycho’s Minecraft Server.**

This is a **source project, not a ready-to-install Minecraft mod**. Do not put the ZIP in your client or server `mods` folder. A NeoForge build must succeed before a test JAR exists.

## Three proposed shelf variants

- `pmsshelves:bop_jacaranda_shelf` — Biomes O’ Plenty Jacaranda
- `pmsshelves:ru_redwood_shelf` — Regions Unexplored Redwood
- `pmsshelves:ns_wisteria_shelf` — Nature’s Spirit Wisteria

Designed for Minecraft **1.21.1**, NeoForge **21.1.265**, Shelf Backport **1.0.0**. Requires the underlying wood mods. Keep original Shelf Backport installed. The eventual addon must be installed on **client and server**, because it registers new blocks.

## Recommended path to a compiled JAR (no Java programming required)

This project includes `.github/workflows/build.yml`, which runs a Gradle build through GitHub Actions. Steps:

1. Create a private GitHub repository called `pms-shelf-variants`.
2. Upload **the contents of this extracted project**, retaining directories (including the hidden `.github/workflows/build.yml`). GitHub's browser upload may be awkward for nested folders; a GitHub Desktop commit/push is an alternative.
3. Open **Actions → Build PMS Shelf Variants → Run workflow** (or wait for the automatic run after pushing to `main`).
4. If the build succeeds, download the **pms-shelf-variants** artifact, unzip it, and locate the JAR within.
5. If the build fails, copy the failure details into chat so the source can be corrected. **The initial build is not verified.**

Alternative for an experienced helper: install Java 21 and Gradle 8.10.2, and run `gradle build` from the project directory, then check `build/libs/`.

## Once a valid JAR exists

Backup your test world; install the resulting addon JAR on your CurseForge profile **and** dedicated server alongside Shelf Backport, BOP, Regions Unexplored and Nature’s Spirit. Restart. Test item placement, item storage, redstone, connected shelves and inventory persistence after restart. Do not deploy to a live world without passing these tests.

## Project notes

- Reuses the existing `ShelfBlock` type and the NeoForge block-entity extension event.
- Includes three recipes, blockstates, models, loot tables and texture files.
- No Minecraft/NeoForge runtime test has been performed; errors may need correction.
- Source textures are based on Shelf Backport's original shelf assets; preserve the original project's license terms. No modded-wood JAR assets are redistributed.
