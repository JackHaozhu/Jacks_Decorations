package name.jacksdecorations.item;

import name.jacksdecorations.JacksDecorations;
import name.jacksdecorations.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
//    public static final Item EXAMPLE = registerItem("example", new Item(new FabricItemSettings()));

    private static void addItemsToBuildingBlocks(FabricItemGroupEntries entries) {
//        entries.add(ModItems.EXAMPLE);
        entries.add(ModBlocks.DECORATIVE_SPAWNER);
        entries.add(ModBlocks.DECORATIVE_BEDROCK);
        entries.add(ModBlocks.DECORATIVE_BARRIER);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(JacksDecorations.MOD_ID, name), item);
    }
    public static void registerModItems() {
        JacksDecorations.LOGGER.info("Registering Mod Items for " + JacksDecorations.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlocks);
    }
}
