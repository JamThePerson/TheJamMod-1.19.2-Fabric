
package net.mcreator.thejammodfabric.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.thejammodfabric.init.TheJamModFabricModTabs;
import net.mcreator.thejammodfabric.init.TheJamModFabricModItems;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public class DoubleSteveniteSwordItem extends SwordItem {
	public DoubleSteveniteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 12028;
			}

			public float getSpeed() {
				return 54f;
			}

			public float getAttackDamageBonus() {
				return 36f;
			}

			public int getLevel() {
				return 12;
			}

			public int getEnchantmentValue() {
				return 243;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheJamModFabricModItems.STEVENITE_INGOT));
			}
		}, 3, -1.5f, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD).fireResistant());
	}

	@Override
	@Environment(EnvType.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
