package net.briancdev.item;

import net.briancdev.BrianMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup BRIANMOD;
    public static void  registerItemGroups() {

        BRIANMOD = FabricItemGroup.builder(new Identifier(BrianMod.MOD_ID, "brianmodgroup"))
                .displayName(Text.translatable("itemgroup.brianmodgroup"))
                .icon(() -> new ItemStack(ModItems.AMETHYST)).build();

    }
}
