package luke.color;

import luke.color.block.BlockLogicConcrete;
import luke.color.block.BlockLogicPowder;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicBed;
import net.minecraft.core.block.BlockLogicSeat;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.CreativeHelper;

import static luke.color.ColorMod.MOD_ID;

public class ColorBlocks {

	int blockID = 1120;

	public static Block<?> concrete;

	public static Block<?> concretePowder;

	public static Block<?> bedWhite;
	public static Block<?> bedOrange;
	public static Block<?> bedMagenta;
	public static Block<?> bedLightblue;
	public static Block<?> bedYellow;
	public static Block<?> bedLime;
	public static Block<?> bedPink;
	public static Block<?> bedGray;
	public static Block<?> bedSilver;
	public static Block<?> bedCyan;
	public static Block<?> bedPurple;
	public static Block<?> bedBlue;
	public static Block<?> bedBrown;
	public static Block<?> bedGreen;
	public static Block<?> bedBlack;

	public static Block<?> seatWhite;
	public static Block<?> seatOrange;
	public static Block<?> seatMagenta;
	public static Block<?> seatLightblue;
	public static Block<?> seatYellow;
	public static Block<?> seatLime;
	public static Block<?> seatPink;
	public static Block<?> seatGray;
	public static Block<?> seatSilver;
	public static Block<?> seatCyan;
	public static Block<?> seatPurple;
	public static Block<?> seatBlue;
	public static Block<?> seatBrown;
	public static Block<?> seatGreen;
	public static Block<?> seatBlack;


	public void initializeBlockDetails() {

		for (int color = 1; color < 17; color++) {
			CreativeHelper.setParent(concrete, color - 1, concretePowder, 0);
		}

	}

	public void initializeBlocks() {

		BlockBuilder powder = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
			.setHardness(0.5f)
			.setResistance(0.5f)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL);

		BlockBuilder bed = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
			.setHardness(0.2f)
			.setResistance(1.0f)
			.setUseInternalLight()
			.setVisualUpdateOnMetadata()
			.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU);

		concrete = new BlockBuilder(MOD_ID)
			.setHardness(5.0f)
			.setResistance(25.0f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockItem(block -> new ItemBlockPainted<>(block, false))
			.build("concrete", "block/concrete", blockID++, b -> new BlockLogicConcrete(b));

		concretePowder = powder
			.setBlockItem(block -> new ItemBlockPainted<>(block, false))
			.build("concrete.powder", "block/concrete_powder", blockID++, b -> new BlockLogicPowder(b));


		bedOrange = bed
			.build("bed.orange","bed_orange", blockID++, b -> new BlockLogicBed(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedOrange)};
				}
		});

		bedYellow = bed
			.build("bed.yellow","bed_yellow", blockID++, b -> new BlockLogicBed(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedYellow)};
				}
			});

		bedLime = bed
			.build("bed.lime","bed_lime", blockID++, b -> new BlockLogicBed(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedLime)};
				}
			});

		bedGreen = bed
			.build("bed.green","bed_green", blockID++, b -> new BlockLogicBed(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedGreen)};
				}
			});

		bedCyan = bed
			.build("bed.cyan","bed_cyan", blockID++, b -> new BlockLogicBed(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedCyan)};
				}
			});

		bedLightblue = bed
			.build("bed.lightblue","bed_lightblue", blockID++, b -> new BlockLogicBed(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedLightblue)};
				}
			});

		bedBlue = bed
			.build("bed.blue","bed_blue", blockID++, b -> new BlockLogicBed(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedBlue)};
				}
			});

		bedPurple = bed
			.build("bed.purple","bed_purple", blockID++, b -> new BlockLogicBed(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedPurple)};
				}
			});

		bedMagenta = bed
			.build("bed.magenta","bed_magenta", blockID++, b -> new BlockLogicBed(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedMagenta)};
				}
			});

		bedPink = bed
			.build("bed.pink","bed_pink", blockID++, b -> new BlockLogicBed(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedPink)};
				}
			});

		bedBrown = bed
			.build("bed.brown","bed_brown", blockID++, b -> new BlockLogicBed(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedBrown)};
				}
			});

		bedWhite = bed
			.build("bed.white","bed_white", blockID++, b -> new BlockLogicBed(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedWhite)};
				}
			});

		bedSilver = bed
			.build("bed.silver","bed_silver", blockID++, b -> new BlockLogicBed(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedSilver)};
				}
			});

		bedGray = bed
			.build("bed.gray","bed_gray", blockID++, b -> new BlockLogicBed(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedGray)};
				}
			});

		bedBlack = bed
			.build("bed.black","bed_black", blockID++, b -> new BlockLogicBed(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedBlack)};
				}
			});



		seatOrange = bed
			.build("seat.orange","seat_orange", blockID++, b -> new BlockLogicSeat(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatOrange)};
				}
			});

		seatYellow = bed
			.build("seat.yellow","seat_yellow", blockID++, b -> new BlockLogicSeat(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatYellow)};
				}
			});

		seatLime = bed
			.build("seat.lime","seat_lime", blockID++, b -> new BlockLogicSeat(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatLime)};
				}
			});

		seatGreen = bed
			.build("seat.green","seat_green", blockID++, b -> new BlockLogicSeat(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatGreen)};
				}
			});

		seatCyan = bed
			.build("seat.cyan","seat_cyan", blockID++, b -> new BlockLogicSeat(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatCyan)};
				}
			});

		seatLightblue = bed
			.build("seat.lightblue","seat_lightblue", blockID++, b -> new BlockLogicSeat(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatLightblue)};
				}
			});

		seatBlue = bed
			.build("seat.blue","seat_blue", blockID++, b -> new BlockLogicSeat(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatBlue)};
				}
			});

		seatPurple = bed
			.build("seat.purple","seat_purple", blockID++, b -> new BlockLogicSeat(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatPurple)};
				}
			});

		seatMagenta = bed
			.build("seat.magenta","seat_magenta", blockID++, b -> new BlockLogicSeat(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatMagenta)};
				}
			});

		seatPink = bed
			.build("seat.pink","seat_pink", blockID++, b -> new BlockLogicSeat(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatPink)};
				}
			});

		seatBrown = bed
			.build("seat.brown","seat_brown", blockID++, b -> new BlockLogicSeat(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatBrown)};
				}
			});

		seatWhite = bed
			.build("seat.white","seat_white", blockID++, b -> new BlockLogicSeat(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatWhite)};
				}
			});

		seatSilver = bed
			.build("seat.silver","seat_silver", blockID++, b -> new BlockLogicSeat(b) {
					public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
						return new ItemStack[]{new ItemStack(ColorItems.seatSilver)};
					}
				});

		seatGray = bed
			.build("seat.gray","seat_gray", blockID++, b -> new BlockLogicSeat(b) {
					public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
						return new ItemStack[]{new ItemStack(ColorItems.seatGray)};
					}
				});

		seatBlack = bed
			.build("seat.black","seat_black", blockID++, b -> new BlockLogicSeat(b) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.seatBlack)};
				}
			});

	}

}
