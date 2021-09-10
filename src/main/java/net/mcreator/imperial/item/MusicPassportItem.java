
package net.mcreator.imperial.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.imperial.ImperialModElements;

@ImperialModElements.ModElement.Tag
public class MusicPassportItem extends ImperialModElements.ModElement {
	@ObjectHolder("imperial:music_passport")
	public static final Item block = null;
	public MusicPassportItem(ImperialModElements instance) {
		super(instance, 69);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, ImperialModElements.sounds.get(new ResourceLocation("imperial:glorytoarztocka")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("music_passport");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
