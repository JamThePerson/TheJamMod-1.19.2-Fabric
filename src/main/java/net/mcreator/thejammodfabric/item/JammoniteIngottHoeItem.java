
package net.mcreator.thejammodfabric.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.thejammodfabric.init.TheJamModFabricModTabs;
import net.mcreator.thejammodfabric.init.TheJamModFabricModItems;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public class JammoniteIngottHoeItem extends HoeItem {
	public JammoniteIngottHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 4719;
			}

			public float getSpeed() {
				return 17f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 11;
			}

			public int getEnchantmentValue() {
				return 77;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheJamModFabricModItems.JAMMONITE_INGOT));
			}
		}, 0, -3f, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD));
	}

	@Override
	@Environment(EnvType.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
