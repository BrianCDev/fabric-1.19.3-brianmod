package net.briancdev;

import net.briancdev.item.ModBlocks;
import net.briancdev.item.ModItemGroup;
import net.briancdev.item.ModItems;
import net.fabricmc.api.ModInitializer;

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

	}
}