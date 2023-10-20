package name.jacksdecorations.datagen;

import name.jacksdecorations.block.ModBlocks;
import name.jacksdecorations.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
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
    }
}
