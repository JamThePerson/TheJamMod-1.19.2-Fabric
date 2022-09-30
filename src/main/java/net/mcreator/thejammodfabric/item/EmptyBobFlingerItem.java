
package net.mcreator.thejammodfabric.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.thejammodfabric.init.TheJamModFabricModTabs;

public class EmptyBobFlingerItem extends Item {
	public EmptyBobFlingerItem() {
		super(new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
