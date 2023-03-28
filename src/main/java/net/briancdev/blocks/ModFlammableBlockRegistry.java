package net.briancdev.blocks;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.AMETHYST_LOG, 5, 5);
        registry.add(ModBlocks.AMETHYST_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_AMETHYST_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_AMETHYST_WOOD, 5, 5);

        registry.add(ModBlocks.AMETHYST_LEAVES, 30, 60);
        registry.add(ModBlocks.AMETHYST_PLANKS, 5, 20);

    }
}
