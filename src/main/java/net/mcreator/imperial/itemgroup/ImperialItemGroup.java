
package net.mcreator.imperial.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.imperial.item.GruszkaItem;
import net.mcreator.imperial.ImperialModElements;

@ImperialModElements.ModElement.Tag
public class ImperialItemGroup extends ImperialModElements.ModElement {
	public ImperialItemGroup(ImperialModElements instance) {
		super(instance, 72);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabimperial") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GruszkaItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
