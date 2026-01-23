package luke.color.entity;

import net.minecraft.core.util.collection.NamespaceID;
import turniplabs.halplibe.helper.EntityHelper;

import static luke.color.ColorMod.MOD_ID;

public class ColorEntities {
    private static boolean hasInit = false;

    public static void init() {
        if (!hasInit) {
            hasInit = true;
            initializeEntities();
        }

    }

    public static void initializeEntities() {
        EntityHelper.createEntity(MobParrot.class, NamespaceID.getPermanent(MOD_ID, "parrot"), "guidebook.section.mob.parrot.name");

    }
}
