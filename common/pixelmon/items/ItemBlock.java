package pixelmon.items;

import pixelmon.blocks.BlockHealer;
import pixelmon.blocks.BlockPC;
import pixelmon.config.PixelmonBlocks;
import net.minecraft.src.Block;
import net.minecraft.src.BlockBed;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.World;

public class ItemBlock extends Item {
	Block block;
	public ItemBlock(int par1, Block block) {
		super(par1);
		this.block = block;
	}

	/**
	 * Callback for item usage. If the item does something special on right
	 * clicking, he will have one of those. Return True if something happen and
	 * false if it don't. This is for ITEMS, not BLOCKS !
	 */
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int x, int y, int z, int par7) {
		if (par7 != 1) {
			return false;
		} else {
			++y;
			int var6 = MathHelper.floor_double((double) (par2EntityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
			int var9 = 0;
			if (var6 == 0) {
				var9 = 2;
			}

			if (var6 == 1) {
				var9 = 1;
			}

			if (var6 == 2) {
				var9 = 3;
			}

			if (var6 == 3) {
				var9 = 0;
			}

			if (par2EntityPlayer.canPlayerEdit(x, y, z) && par2EntityPlayer.canPlayerEdit(x, y + 1, z)) {
				if (par3World.isAirBlock(x, y, z) && par3World.isAirBlock(x, y + 1, z) && par3World.isBlockNormalCube(x, y - 1, z) && par3World.getBlockId(x, y - 1, z) != block.blockID) {
					par3World.setBlockAndMetadataWithNotify(x, y, z, block.blockID, var9);
					if (par3World.getBlockId(x, y, z) == block.blockID && block instanceof BlockPC) {
						par3World.setBlockAndMetadataWithNotify(x, y + 1, z, block.blockID, var9 - 6);
					}

					--par1ItemStack.stackSize;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}
}
