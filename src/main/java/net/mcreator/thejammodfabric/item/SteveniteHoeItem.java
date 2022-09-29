
package net.mcreator.thejammodfabric.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.thejammodfabric.init.TheJamModFabricModItems;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public class SteveniteHoeItem extends HoeItem {
	public SteveniteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 6072;
			}

			public float getSpeed() {
				return 18f;
			}

			public float getAttackDamageBonus() {
				return 10f;
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
		}, 0, -2.5f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
	}

	@Override
	@Environment(EnvType.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
