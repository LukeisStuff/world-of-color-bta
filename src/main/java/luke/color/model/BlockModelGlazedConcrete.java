package luke.color.model;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelFullyRotatable;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;


@Environment(EnvType.CLIENT)
public class BlockModelGlazedConcrete<T extends BlockLogic> extends BlockModelFullyRotatable<T> {
    public static final IconCoordinate[] texCoords = new IconCoordinate[16];

    public BlockModelGlazedConcrete(Block<T> block) {
        super(block);
    }

    @Override
    public void renderBlockOnInventory(Tessellator tessellator, int metadata, float brightness, float alpha, @Nullable Integer lightmapCoordinate) {
        if (renderBlocks.useInventoryTint) {
            int color = BlockColorDispatcher.getInstance().getDispatch(this.block).getFallbackColor(metadata);
            float r = (float) (color >> 16 & 255) / 255.0F;
            float g = (float) (color >> 8 & 255) / 255.0F;
            float b = (float) (color & 255) / 255.0F;
            GL11.glColor4f(r * brightness, g * brightness, b * brightness, alpha);
        } else {
            GL11.glColor4f(brightness, brightness, brightness, alpha);
        }

        float yOffset = 0.5F;
        AABB bounds = this.getBlockBoundsForItemRender();
        GL11.glTranslatef(-0.5F, 0.0F - yOffset, -0.5F);
        this.renderBlockWithBounds(tessellator, bounds, metadata, brightness, alpha, lightmapCoordinate);
        GL11.glTranslatef(0.5F, yOffset, 0.5F);
    }

    @Override
    public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int meta) {
        int color = (meta >> 4) & 15;
        return texCoords[color];
    }

    static {
        for (DyeColor c : DyeColor.blockOrderedColors()) {
            texCoords[c.blockMeta] = TextureRegistry.getTexture("color:block/concrete_glazed/" + c.colorID);
        }
    }
}
