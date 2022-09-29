
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejammodfabric.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.thejammodfabric.item.SteveniteIngotItem;
import net.mcreator.thejammodfabric.item.JammoniteItem;
import net.mcreator.thejammodfabric.TheJamModFabricMod;

public class TheJamModFabricModItems {
	public static Item DEVS;
	public static Item DDYLL;
	public static Item FRAYLO;
	public static Item JAMMONITE;
	public static Item STEVENITE_INGOT;

	public static void load() {
		DEVS = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "devs_spawn_egg"), new SpawnEggItem(
				TheJamModFabricModEntities.DEVS, -16776961, -13395457, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD)));
		DDYLL = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "ddyll_spawn_egg"), new SpawnEggItem(
				TheJamModFabricModEntities.DDYLL, -16737997, -16711885, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD)));
		FRAYLO = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "fraylo_spawn_egg"), new SpawnEggItem(
				TheJamModFabricModEntities.FRAYLO, -10092442, -3407668, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD)));
		JAMMONITE = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "jammonite"), new JammoniteItem());
		STEVENITE_INGOT = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "stevenite_ingot"),
				new SteveniteIngotItem());
	}
}
