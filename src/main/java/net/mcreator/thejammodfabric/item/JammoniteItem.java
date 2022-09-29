
package net.mcreator.thejammodfabric.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.thejammodfabric.init.TheJamModFabricModTabs;

public class JammoniteItem extends Item {
	public JammoniteItem() {
		super(new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
