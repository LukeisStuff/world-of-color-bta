package luke.color;

import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.util.ConfigUpdater;
import turniplabs.halplibe.util.TomlConfigHandler;
import turniplabs.halplibe.util.toml.Toml;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ColorConfig {
	public static ConfigUpdater updater = ConfigUpdater.fromProperties();
	private static final Toml properties = new Toml("World of Color TOML Config");
	public static TomlConfigHandler cfg;

	private static int blockIDs = 11200;

	static {
		properties.addCategory("World of Color")
			.addEntry("cfgVersion", 5);

		properties.addCategory("Block IDs");
		properties.addEntry("Block IDs.startingID", 11200);


		List<Field> blockFields = Arrays.stream(ColorBlocks.class.getDeclaredFields()).filter((F)-> Block.class.isAssignableFrom(F.getType())).collect(Collectors.toList());
		for (Field blockField : blockFields) {
			properties.addEntry("Block IDs." + blockField.getName(), blockIDs++);
		}

		cfg = new TomlConfigHandler(updater, ColorMod.MOD_ID, properties);

	}
}
