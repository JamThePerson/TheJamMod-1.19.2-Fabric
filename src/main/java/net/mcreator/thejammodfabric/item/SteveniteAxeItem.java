
package net.mcreator.thejammodfabric.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.thejammodfabric.init.TheJamModFabricModTabs;
import net.mcreator.thejammodfabric.init.TheJamModFabricModItems;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public class SteveniteAxeItem extends AxeItem {
	public SteveniteAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 6072;
			}

			public float getSpeed() {
				return 18f;
			}

			public float getAttackDamageBonus() {
				return 42f;
			}

			public int getLevel() {
				return 12;
			}

			public int getEnchantmentValue() {
				return 84;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheJamModFabricModItems.STEVENITE_INGOT));
			}
		}, 1, -3.65f, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD).fireResistant());
	}

	@Override
	@Environment(EnvType.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
