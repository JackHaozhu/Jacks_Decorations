package name.jacksdecorations.block;

import name.jacksdecorations.JacksDecorations;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block DECORATIVE_SPAWNER = registerBlock("decorative_spawner",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.STONE).nonOpaque()));
    public static final Block DECORATIVE_BEDROCK = registerBlock("decorative_bedrock",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block DECORATIVE_BARRIER = registerBlock("decorative_barrier",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.STONE).nonOpaque()));
    public static final Block DECORATIVE_REINFORCED_DEEPSLATE = registerBlock("decorative_reinforced_deepslate",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block DECORATIVE_COMMAND_BLOCK = registerBlock("decorative_command_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).requiresTool().strength(4.0f, 3600000.0f)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(JacksDecorations.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(JacksDecorations.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        JacksDecorations.LOGGER.info("Registering Mod Blocks for " + JacksDecorations.MOD_ID);
    }
}
