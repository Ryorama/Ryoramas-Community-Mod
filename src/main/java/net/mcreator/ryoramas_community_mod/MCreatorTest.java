package net.mcreator.ryoramas_community_mod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@Elementsryoramas_community_mod.ModElement.Tag
public class MCreatorTest extends Elementsryoramas_community_mod.ModElement {
	@ObjectHolder("ryoramas_community_mod:test")
	public static final Item block = null;

	public MCreatorTest(Elementsryoramas_community_mod instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(null).maxStackSize(64));
			setRegistryName("test");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
