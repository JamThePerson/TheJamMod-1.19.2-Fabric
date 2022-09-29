
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejammodfabric.init;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.thejammodfabric.enchantment.JamTestEnchantmentEnchantment;
import net.mcreator.thejammodfabric.TheJamModFabricMod;

public class TheJamModFabricModEnchantments {
	public static Enchantment JAM_TEST_ENCHANTMENT;

	public static void load() {
		JAM_TEST_ENCHANTMENT = Registry.register(Registry.ENCHANTMENT, new ResourceLocation(TheJamModFabricMod.MODID, "jam_test_enchantment"),
				new JamTestEnchantmentEnchantment());
	}
}
