package name.jacksdecorations.datagen;

import name.jacksdecorations.block.ModBlocks;
import name.jacksdecorations.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DECORATIVE_SPAWNER, 1)
                .pattern("CCC")
                .pattern("CTC")
                .pattern("CCC")
                .input('C', Items.CHAIN)
                .input('T', Items.TORCHFLOWER)
                .criterion(hasItem(Items.TORCHFLOWER), conditionsFromItem(Items.TORCHFLOWER))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DECORATIVE_SPAWNER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DECORATIVE_BEDROCK, 1)
                .pattern("OOO")
                .pattern("OOO")
                .pattern("OOO")
                .input('O', Items.OBSIDIAN)
                .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DECORATIVE_BEDROCK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DECORATIVE_BARRIER, 8)
                .pattern("GGG")
                .pattern("GTG")
                .pattern("GGG")
                .input('G', Items.GLASS)
                .input('T', Items.TORCHFLOWER)
                .criterion(hasItem(Items.TORCHFLOWER), conditionsFromItem(Items.TORCHFLOWER))
                .criterion(hasItem(Items.GLASS), conditionsFromItem(Items.GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DECORATIVE_BARRIER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DECORATIVE_REINFORCED_DEEPSLATE, 1)
                .pattern("DDD")
                .pattern("DDD")
                .pattern("DDD")
                .input('D', Items.DEEPSLATE)
                .criterion(hasItem(Items.DEEPSLATE), conditionsFromItem(Items.DEEPSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DECORATIVE_REINFORCED_DEEPSLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DECORATIVE_COMMAND_BLOCK, 1)
                .pattern("EDE")
                .pattern("BFC")
                .pattern("EAE")
                .input('A', Items.COPPER_BLOCK)
                .input('B', Items.IRON_BLOCK)
                .input('C', Items.GOLD_BLOCK)
                .input('D', Items.DIAMOND)
                .input('E', Items.OBSIDIAN)
                .input('F', Items.NETHERITE_INGOT)
                .criterion(hasItem(Items.COPPER_BLOCK), conditionsFromItem(Items.COPPER_BLOCK))
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DECORATIVE_COMMAND_BLOCK)));
    }
}
