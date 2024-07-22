package luke.color;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class ColorMod implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "color";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("World of Color initialized.");
    }

	@Override
	public void beforeGameStart() {
		new ColorBlocks().initializeBlocks();
		new ColorItems().initilizeItems();
	}

	@Override
	public void afterGameStart() {
		new ColorBlocks().initializeBlockDetails();
	}

	@Override
	public void onRecipesReady() {

	}

	@Override
	public void initNamespaces() {

	}
}
