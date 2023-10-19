package name.jacksdecorations;

import name.jacksdecorations.block.ModBlocks;
import name.jacksdecorations.item.ModItemGroups;
import name.jacksdecorations.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JacksDecorations implements ModInitializer {
	public static final String MOD_ID = "jacksdecorations";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}