package net.briancdev.item;

import net.briancdev.BrianMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    //register items
    public static final Item AMETHYST = registerItem("amethyst",
            new Item(new FabricItemSettings()));

    public static final Item RAW_AMETHYST = registerItem("raw_amethyst",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BrianMod.MOD_ID, name), item);
    }

    //set items group
    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.BRIANMOD, AMETHYST);
        addToItemGroup(ModItemGroup.BRIANMOD, RAW_AMETHYST);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems(){
        BrianMod.LOGGER.info("Registering Mod Items for " + BrianMod.MOD_ID);

        addItemsToItemGroup();
    }
}
