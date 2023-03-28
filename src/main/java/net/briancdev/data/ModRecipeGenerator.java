package net.briancdev.data;

import net.briancdev.blocks.ModBlocks;
import net.briancdev.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_AMETHYST), RecipeCategory.MISC, ModItems.AMETHYST,
                0.3f,200,"brianmodgroup");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.AMETHYST, RecipeCategory.DECORATIONS,
                ModBlocks.AMETHYST_BLOCK);

    }
}
