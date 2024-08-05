package luke.color.mixin;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockSeat;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.entity.TileEntitySeat;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = TileEntitySeat.class, remap = false)
public class TileEntitySeatMixin extends TileEntity {

	@Shadow private Entity passenger;

	@Inject(method = "tick", at = @At("HEAD"), cancellable = true)
	private void injectTick(CallbackInfo ci) {
		Block block = this.worldObj.getBlock(this.x, this.y, this.z);

		//If block is a colored seat
		if (block != Block.seat && block instanceof BlockSeat) {

			//Copied from original method
			if (this.passenger != null) {
				this.worldObj.updateEntity(this.passenger);
			}

			//Return in order to not updateEntity twice or eject from seat
			ci.cancel();
		}
	}

}
