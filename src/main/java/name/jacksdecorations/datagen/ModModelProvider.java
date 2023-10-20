package name.jacksdecorations.datagen;

import name.jacksdecorations.JacksDecorations;
import name.jacksdecorations.block.ModBlocks;
import name.jacksdecorations.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DECORATIVE_SPAWNER);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DECORATIVE_BEDROCK);
        blockStateModelGenerator.registerStateWithModelReference(ModBlocks.DECORATIVE_BEDROCK, Blocks.BEDROCK);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.DECORATIVE_BEDROCK, Identifier.tryParse("block/bedrock"));
        blockStateModelGenerator.registerStateWithModelReference(ModBlocks.DECORATIVE_SPAWNER, Blocks.SPAWNER);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.DECORATIVE_SPAWNER, Identifier.tryParse("block/spawner"));
        blockStateModelGenerator.registerStateWithModelReference(ModBlocks.DECORATIVE_BARRIER, Blocks.BARRIER);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.DECORATIVE_BARRIER, Identifier.tryParse("item/barrier"));
        blockStateModelGenerator.registerStateWithModelReference(ModBlocks.DECORATIVE_REINFORCED_DEEPSLATE, Blocks.REINFORCED_DEEPSLATE);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.DECORATIVE_REINFORCED_DEEPSLATE, Identifier.tryParse("item/reinforced_deepslate"));
        blockStateModelGenerator.registerStateWithModelReference(ModBlocks.DECORATIVE_COMMAND_BLOCK, Blocks.COMMAND_BLOCK);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.DECORATIVE_COMMAND_BLOCK, Identifier.tryParse("item/command_block"));

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
