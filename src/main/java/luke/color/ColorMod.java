package luke.color;

import luke.color.entity.ColorEntities;
import luke.color.entity.MobParrot;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.gui.guidebook.mobs.MobInfoRegistry;
import net.minecraft.core.entity.SpawnListEntry;
import net.minecraft.core.enums.MobCategory;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.world.biome.Biomes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.SoundHelper;
import turniplabs.halplibe.util.ClientStartEntrypoint;
import turniplabs.halplibe.util.GameStartEntrypoint;


public class ColorMod implements ModInitializer, ClientStartEntrypoint, GameStartEntrypoint {
    public static final String MOD_ID = "color";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
		Biomes.OVERWORLD_RAINFOREST.getSpawnableList(MobCategory.creature).add(new SpawnListEntry(MobParrot.class, 102));

		SoundHelper.addSound(MOD_ID, "parrotidle1.ogg");
		SoundHelper.addSound(MOD_ID, "parrotidle2.ogg");
		SoundHelper.addSound(MOD_ID, "parrotidle3.ogg");
		SoundHelper.addSound(MOD_ID, "parrotidle4.ogg");

		SoundHelper.addSound(MOD_ID, "parrothurt1.ogg");
		SoundHelper.addSound(MOD_ID, "parrothurt2.ogg");

		SoundHelper.addSound(MOD_ID, "parrotdeath1.ogg");
		SoundHelper.addSound(MOD_ID, "parrotdeath2.ogg");
        LOGGER.info("World of Color initialized.");
    }

	@Override
	public void beforeGameStart() {
		new ColorBlocks().initializeBlocks();
		new ColorItems().initilizeItems();
		new ColorEntities().initializeEntities();
	}

	@Override
	public void afterGameStart() {
		new ColorBlocks().initializeBlockDetails();

		MobInfoRegistry.register(MobParrot.class, "parrot.name", "parrot.desc",
			10, 400, new MobInfoRegistry.MobDrop[]{new MobInfoRegistry.MobDrop(new ItemStack(Items.FEATHER_CHICKEN),
				1.0f, 2, 4)});
	}

	@Override
	public void beforeClientStart() {
	}

	@Override
	public void afterClientStart() {

	}
}
