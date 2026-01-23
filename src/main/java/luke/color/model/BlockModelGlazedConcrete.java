package luke.color.model;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.block.model.BlockModelFullyRotatable;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicFullyRotatable;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;
import org.jspecify.annotations.Nullable;


@Environment(EnvType.CLIENT)
public class BlockModelGlazedConcrete<T extends BlockLogic> extends BlockModelFullyRotatable<T> {
    protected static final IconCoordinate[] TEX = new IconCoordinate[16];

    public BlockModelGlazedConcrete(Block<T> block) {
        super(block);
    }

    @Override
    public boolean render(Tessellator tessellator, int x, int y, int z) {
        int meta = renderBlocks.blockAccess.getBlockMetadata(x, y, z);

        int dirMeta = meta & BlockLogicFullyRotatable.MASK_DIRECTION;
        Direction dir = BlockLogicFullyRotatable.metaToDirection(dirMeta);

        switch (dir) {
            case DOWN:
                renderBlocks.uvRotateEast = 3;
                renderBlocks.uvRotateWest = 3;
                renderBlocks.uvRotateSouth = 3;
                renderBlocks.uvRotateNorth = 3;
                break;
            case NORTH:
                renderBlocks.uvRotateSouth = 1;
                renderBlocks.uvRotateNorth = 2;
                break;
            case SOUTH:
                renderBlocks.uvRotateSouth = 2;
                renderBlocks.uvRotateNorth = 1;
                renderBlocks.uvRotateTop = 3;
                renderBlocks.uvRotateBottom = 3;
                break;
            case WEST:
                renderBlocks.uvRotateEast = 1;
                renderBlocks.uvRotateWest = 2;
                renderBlocks.uvRotateTop = 2;
                renderBlocks.uvRotateBottom = 1;
                break;
            case EAST:
                renderBlocks.uvRotateEast = 2;
                renderBlocks.uvRotateWest = 1;
                renderBlocks.uvRotateTop = 1;
                renderBlocks.uvRotateBottom = 2;
        }

        boolean result = renderStandardBlock(tessellator, block.getBlockBoundsFromState(renderBlocks.blockAccess, x, y, z), x, y, z);
        resetRenderBlocks();
        return result;
    }

    @Override
    public void renderBlockOnInventory(Tessellator tessellator, int metadata, float brightness, float alpha, @Nullable Integer lightmapCoordinate) {
        int meta = (metadata & 15) << 3;
        super.renderBlockOnInventory(tessellator, meta, brightness, alpha, lightmapCoordinate);
    }

    @Override
    public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
        int color = (data >> 3) & 15;
        return TEX[color];
    }

    static {
        for (DyeColor c : DyeColor.blockOrderedColors()) {
            TEX[c.blockMeta] = TextureRegistry.getTexture("color:block/concrete_glazed/" + c.colorID);
        }
    }
}
