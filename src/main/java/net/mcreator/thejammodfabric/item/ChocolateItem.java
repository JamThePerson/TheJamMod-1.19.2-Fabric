
package net.mcreator.thejammodfabric.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.thejammodfabric.init.TheJamModFabricModTabs;

public class ChocolateItem extends Item {
	public ChocolateItem() {
		super(new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(8f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
