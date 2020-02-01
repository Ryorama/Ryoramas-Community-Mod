package net.mcreator.ryoramas_community_mod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@Elementsryoramas_community_mod.ModElement.Tag
public class MCreatorSunfragment extends Elementsryoramas_community_mod.ModElement {
	@ObjectHolder("ryoramas_community_mod:sunfragment")
	public static final Item block = null;

	public MCreatorSunfragment(Elementsryoramas_community_mod instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MCreatorRyorama.tab).maxStackSize(4));
			setRegistryName("sunfragment");
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
