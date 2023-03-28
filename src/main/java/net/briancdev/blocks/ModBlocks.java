package net.briancdev.blocks;

import net.briancdev.BrianMod;
import net.briancdev.item.ModItemGroup;
import net.briancdev.world.tree.AmethystSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    // register new blocks

    public static final Block AMETHYST_BLOCK = registerBlock("amethyst_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.BRIANMOD);

    public static final Block AMETHYST_ORE = registerBlock("amethyst_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.BRIANMOD);

    public static final Block AMETHYST_LOG = registerBlock("amethyst_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.BRIANMOD);
    public static final Block AMETHYST_WOOD = registerBlock("amethyst_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.BRIANMOD);
    public static final Block STRIPPED_AMETHYST_LOG = registerBlock("stripped_amethyst_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.BRIANMOD);
    public static final Block STRIPPED_AMETHYST_WOOD = registerBlock("stripped_amethyst_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.BRIANMOD);


    public static final Block AMETHYST_PLANKS = registerBlock("amethyst_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.BRIANMOD);
    public static final Block AMETHYST_LEAVES = registerBlock("amethyst_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()), ModItemGroup.BRIANMOD);


    public static final Block AMETHYST_SAPLING = registerBlock("amethyst_sapling",
            new SaplingBlock(new AmethystSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()), ModItemGroup.BRIANMOD);


    // parameters
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(BrianMod.MOD_ID, name), block);
    }

    // register blocks
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(BrianMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    // console
    public static void registerModBlocks(){
        BrianMod.LOGGER.info("Registering ModBlocks for " + BrianMod.MOD_ID);
    }
}
