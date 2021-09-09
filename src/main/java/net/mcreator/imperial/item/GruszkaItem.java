
package net.mcreator.imperial.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.imperial.ImperialModElements;

@ImperialModElements.ModElement.Tag
public class GruszkaItem extends ImperialModElements.ModElement {
	@ObjectHolder("imperial:gruszka")
	public static final Item block = null;
	public GruszkaItem(ImperialModElements instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.6f).build()));
			setRegistryName("gruszka");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}