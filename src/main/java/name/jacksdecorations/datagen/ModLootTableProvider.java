package name.jacksdecorations.datagen;

import name.jacksdecorations.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.DECORATIVE_BEDROCK);
        addDrop(ModBlocks.DECORATIVE_SPAWNER);
        addDrop(ModBlocks.DECORATIVE_BARRIER);
    }
}
