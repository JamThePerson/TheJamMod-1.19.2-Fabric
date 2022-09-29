
package net.mcreator.thejammodfabric.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.sounds.SoundEvent;

import net.mcreator.thejammodfabric.init.TheJamModFabricModTabs;
import net.mcreator.thejammodfabric.init.TheJamModFabricModSounds;
import net.mcreator.thejammodfabric.init.TheJamModFabricModItems;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public abstract class SteveniteArmorItem extends ArmorItem {
	public SteveniteArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 103;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{17, 16, 21, 13}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 54;
			}

			@Override
			public SoundEvent getEquipSound() {
				return TheJamModFabricModSounds.STEVENITEARMOUREQUIP;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheJamModFabricModItems.STEVENITE_INGOT));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "stevenite";
			}

			@Override
			public float getToughness() {
				return 5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.5f;
			}
		}, slot, properties);
	}

	public static class Helmet extends SteveniteArmorItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD).fireResistant());
		}

	}

	public static class Chestplate extends SteveniteArmorItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD).fireResistant());
		}

	}

	public static class Leggings extends SteveniteArmorItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD).fireResistant());
		}

	}

	public static class Boots extends SteveniteArmorItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD).fireResistant());
		}

	}
}
