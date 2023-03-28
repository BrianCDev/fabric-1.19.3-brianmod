package net.briancdev;

import net.briancdev.blocks.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BrianModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        //Cut leaves and sapling unused pixels

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AMETHYST_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AMETHYST_SAPLING, RenderLayer.getCutout());


    }
}
