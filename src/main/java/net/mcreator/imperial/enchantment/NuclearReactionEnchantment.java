
package net.mcreator.imperial.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.imperial.item.StaloweShovelItem;
import net.mcreator.imperial.item.StalowePickaxeItem;
import net.mcreator.imperial.item.StaloweAxeItem;
import net.mcreator.imperial.item.InfectedShovelItem;
import net.mcreator.imperial.item.InfectedPickaxeItem;
import net.mcreator.imperial.item.InfectedAxeItem;
import net.mcreator.imperial.ImperialModElements;

@ImperialModElements.ModElement.Tag
public class NuclearReactionEnchantment extends ImperialModElements.ModElement {
	@ObjectHolder("imperial:nuclear_reaction")
	public static final Enchantment enchantment = null;
	public NuclearReactionEnchantment(ImperialModElements instance) {
		super(instance, 60);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("nuclear_reaction"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.VERY_RARE, EnchantmentType.BREAKABLE, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 3;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == InfectedPickaxeItem.block)
				return true;
			if (stack.getItem() == StalowePickaxeItem.block)
				return true;
			if (stack.getItem() == StaloweAxeItem.block)
				return true;
			if (stack.getItem() == StaloweShovelItem.block)
				return true;
			if (stack.getItem() == InfectedAxeItem.block)
				return true;
			if (stack.getItem() == InfectedShovelItem.block)
				return true;
			if (stack.getItem() == Items.NETHERITE_PICKAXE)
				return true;
			if (stack.getItem() == Items.NETHERITE_SHOVEL)
				return true;
			if (stack.getItem() == Items.NETHERITE_AXE)
				return true;
			if (stack.getItem() == Items.GOLDEN_PICKAXE)
				return true;
			if (stack.getItem() == Items.GOLDEN_SHOVEL)
				return true;
			if (stack.getItem() == Items.GOLDEN_AXE)
				return true;
			if (stack.getItem() == Items.DIAMOND_SHOVEL)
				return true;
			if (stack.getItem() == Items.DIAMOND_PICKAXE)
				return true;
			if (stack.getItem() == Items.DIAMOND_AXE)
				return true;
			if (stack.getItem() == Items.STONE_SHOVEL)
				return true;
			if (stack.getItem() == Items.STONE_PICKAXE)
				return true;
			if (stack.getItem() == Items.STONE_AXE)
				return true;
			if (stack.getItem() == Items.WOODEN_SHOVEL)
				return true;
			if (stack.getItem() == Items.WOODEN_PICKAXE)
				return true;
			if (stack.getItem() == Items.WOODEN_AXE)
				return true;
			if (stack.getItem() == Items.STONE_SHOVEL)
				return true;
			if (stack.getItem() == Items.STONE_PICKAXE)
				return true;
			if (stack.getItem() == Items.STONE_AXE)
				return true;
			if (stack.getItem() == Items.IRON_SHOVEL)
				return true;
			if (stack.getItem() == Items.IRON_PICKAXE)
				return true;
			if (stack.getItem() == Items.IRON_AXE)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return true;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}

		@Override
		public boolean canGenerateInLoot() {
			return true;
		}

		@Override
		public boolean canVillagerTrade() {
			return true;
		}
	}
}
