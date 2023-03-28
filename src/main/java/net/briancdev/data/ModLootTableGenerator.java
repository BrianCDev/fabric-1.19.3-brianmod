package net.briancdev.data;

import net.briancdev.item.ModBlocks;
import net.briancdev.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {

    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.AMETHYST_BLOCK);

        addDrop(ModBlocks.AMETHYST_ORE, oreDrops(ModBlocks.AMETHYST_BLOCK, ModItems.RAW_AMETHYST));

    }
}
