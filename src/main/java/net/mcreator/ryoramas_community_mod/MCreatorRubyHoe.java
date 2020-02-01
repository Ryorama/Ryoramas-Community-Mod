package net.mcreator.ryoramas_community_mod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

@Elementsryoramas_community_mod.ModElement.Tag
public class MCreatorRubyHoe extends Elementsryoramas_community_mod.ModElement {
	@ObjectHolder("ryoramas_community_mod:rubyhoe")
	public static final Item block = null;

	public MCreatorRubyHoe(Elementsryoramas_community_mod instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 660;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return null;
			}
		}, 9f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("rubyhoe"));
	}
}
