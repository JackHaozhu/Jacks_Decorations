package name.jacksdecorations.item;

import name.jacksdecorations.JacksDecorations;
import name.jacksdecorations.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup JACKS_DECORATIONS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(JacksDecorations.MOD_ID, "jacksdecorations"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.jacksdecorations"))
                    .icon(() -> new ItemStack(ModBlocks.DECORATIVE_SPAWNER)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DECORATIVE_SPAWNER);
                        entries.add(ModBlocks.DECORATIVE_BEDROCK);
                    }).build());
    public static void registerItemGroups() {
        JacksDecorations.LOGGER.info("Registering Mod Item Groups for " + JacksDecorations.MOD_ID);
    }
}
