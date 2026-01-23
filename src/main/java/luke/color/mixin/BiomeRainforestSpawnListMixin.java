package luke.color.mixin;

import luke.color.entity.MobParrot;
import net.minecraft.core.entity.SpawnListEntry;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.BiomeRainforest;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = BiomeRainforest.class, remap = false)
public class BiomeRainforestSpawnListMixin extends Biome {

    public BiomeRainforestSpawnListMixin(String key) {
        super(key);
    }

    @Inject(method = "<init>", at = @At("TAIL"))
    public void injectMethod(String key, CallbackInfo ci) {
        this.spawnableCreatureList.add(new SpawnListEntry(MobParrot.class, 102));
    }
}
