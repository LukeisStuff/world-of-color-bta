package luke.color.model;

import net.minecraft.client.render.block.model.BlockModelBed;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.util.helper.DyeColor;

public class BlockModelBedColored<T extends BlockLogic> extends BlockModelBed<T> {
    public BlockModelBedColored(Block<T> block, DyeColor color) {
        super(block);
        String colorId = color.colorID;

        this.bedTextures[0] = get(colorId + "_foot_front");
        this.bedTextures[1] = get(colorId + "_foot_side");
        this.bedTextures[2] = get(colorId + "_foot_top");
        this.bedTextures[3] = TextureRegistry.getTexture("minecraft:block/bed/head_front");
        this.bedTextures[4] = get(colorId + "_head_side");
        this.bedTextures[5] = get(colorId + "_head_top");
    }

    private IconCoordinate get(String suffix) {
        return TextureRegistry.getTexture("color:block/bed/bed_" + suffix);
    }
}
