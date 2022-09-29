
package net.mcreator.thejammodfabric.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.sounds.SoundEvent;

import net.mcreator.thejammodfabric.init.TheJamModFabricModTabs;
import net.mcreator.thejammodfabric.init.TheJamModFabricModItems;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public abstract class JammoniteIngottArmorItem extends ArmorItem {
	public JammoniteIngottArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 90;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{6, 9, 12, 6}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 40;
			}

			@Override
			public SoundEvent getEquipSound() {
				return null;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheJamModFabricModItems.JAMMONITE_INGOT));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "armor_";
			}

			@Override
			public float getToughness() {
				return 3.4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends JammoniteIngottArmorItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD));
		}

	}

	public static class Chestplate extends JammoniteIngottArmorItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD));
		}

	}

	public static class Leggings extends JammoniteIngottArmorItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD));
		}

	}

	public static class Boots extends JammoniteIngottArmorItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD));
		}

	}
}
