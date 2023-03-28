package net.briancdev;

import net.briancdev.blocks.ModBlocks;
import net.briancdev.blocks.ModFlammableBlockRegistry;
import net.briancdev.item.ModItemGroup;
import net.briancdev.item.ModItems;
import net.briancdev.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrianMod implements ModInitializer {


	public static final String MOD_ID = "brianmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("brianmod");

	@Override
	public void onInitialize() {

		ModItemGroup.registerItemGroups();
		ModBlocks.registerModBlocks();
		LOGGER.info("Brian Mod is running");
		ModItems.registerModItems();

		ModWorldGeneration.generateModWorldGen();


		ModFlammableBlockRegistry.registerFlammableBlocks();
		StrippableBlockRegistry.register(ModBlocks.AMETHYST_LOG, ModBlocks.STRIPPED_AMETHYST_LOG);
		StrippableBlockRegistry.register(ModBlocks.AMETHYST_WOOD, ModBlocks.STRIPPED_AMETHYST_WOOD);

	}
}