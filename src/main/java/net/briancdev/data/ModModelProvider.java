package net.briancdev.data;

import net.briancdev.blocks.ModBlocks;
import net.briancdev.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AMETHYST_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AMETHYST_ORE);


        blockStateModelGenerator.registerLog(ModBlocks.AMETHYST_LOG).log(ModBlocks.AMETHYST_LOG).wood(ModBlocks.AMETHYST_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_AMETHYST_LOG).log(ModBlocks.STRIPPED_AMETHYST_LOG).wood(ModBlocks.STRIPPED_AMETHYST_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AMETHYST_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AMETHYST_LEAVES);

       blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.AMETHYST_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AMETHYST, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_AMETHYST, Models.GENERATED);
    }
}
