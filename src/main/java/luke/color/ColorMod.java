package luke.color;

import luke.color.block.ColorBlocks;
import luke.color.entity.ColorEntities;
import luke.color.entity.MobParrot;
import luke.color.item.ColorItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.gui.guidebook.mobs.MobInfoRegistry;
import net.minecraft.client.sound.SoundRepository;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.sound.SoundTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.ClientStartEntrypoint;
import turniplabs.halplibe.util.GameStartEntrypoint;

public class ColorMod implements ModInitializer, ClientStartEntrypoint, GameStartEntrypoint {
    public static final String MOD_ID = "color";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("World of Color initialized.");
    }

    @Override
    public void beforeGameStart() {
        ColorConfig.init();
        ColorBlocks.init();
        ColorItems.init();
        ColorEntities.init();
        SoundTypes.loadSoundsJson(MOD_ID);
    }

    @Override
    public void afterGameStart() {
        Items.BED.setMaxStackSize(64);
    }

    @Override
    public void beforeClientStart() {
        SoundRepository.registerNamespace(MOD_ID);
    }

    @Override
    public void afterClientStart() {
        MobInfoRegistry.register(MobParrot.class, "parrot.name", "parrot.desc", 10, 400,
            new MobInfoRegistry.MobDrop[]{new MobInfoRegistry.MobDrop(new ItemStack(Items.FEATHER_CHICKEN), 1.0f, 2, 4)});
    }
}
