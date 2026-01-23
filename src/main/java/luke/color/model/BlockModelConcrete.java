package luke.color.model;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;

@Environment(EnvType.CLIENT)
public class BlockModelConcrete<T extends BlockLogic> extends BlockModelStandard<T> {
    private final IconCoordinate[] texCoords = new IconCoordinate[16];

    public BlockModelConcrete(Block<T> block, String basePath) {
        super(block);
        for (DyeColor color : DyeColor.blockOrderedColors()) {
            String texturePath = "color:block/" + basePath + "/" + color.colorID;
            texCoords[color.blockMeta] = TextureRegistry.getTexture(texturePath);
        }
    }

    @Override
    public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int meta) {
        return texCoords[meta & 15];
    }
}
