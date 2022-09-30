
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejammodfabric.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.thejammodfabric.item.SteveniteSwordItem;
import net.mcreator.thejammodfabric.item.SteveniteShovelItem;
import net.mcreator.thejammodfabric.item.StevenitePickaxeItem;
import net.mcreator.thejammodfabric.item.SteveniteIngotItem;
import net.mcreator.thejammodfabric.item.SteveniteHoeItem;
import net.mcreator.thejammodfabric.item.SteveniteAxeItem;
import net.mcreator.thejammodfabric.item.SteveniteArmorItem;
import net.mcreator.thejammodfabric.item.StevenBowItem;
import net.mcreator.thejammodfabric.item.JammoniteItem;
import net.mcreator.thejammodfabric.item.JammoniteIngottSwordItem;
import net.mcreator.thejammodfabric.item.JammoniteIngottShovelItem;
import net.mcreator.thejammodfabric.item.JammoniteIngottPickaxeItem;
import net.mcreator.thejammodfabric.item.JammoniteIngottHoeItem;
import net.mcreator.thejammodfabric.item.JammoniteIngottAxeItem;
import net.mcreator.thejammodfabric.item.JammoniteIngottArmorItem;
import net.mcreator.thejammodfabric.item.JammoniteIngotItem;
import net.mcreator.thejammodfabric.item.JamhimselfItem;
import net.mcreator.thejammodfabric.item.EmptyBobFlingerItem;
import net.mcreator.thejammodfabric.item.DoubleSteveniteSwordItem;
import net.mcreator.thejammodfabric.item.ChocolateItem;
import net.mcreator.thejammodfabric.item.BobItem;
import net.mcreator.thejammodfabric.TheJamModFabricMod;

public class TheJamModFabricModItems {
	public static Item DEVS;
	public static Item DDYLL;
	public static Item FRAYLO;
	public static Item JAMMONITE;
	public static Item STEVENITE_INGOT;
	public static Item STEVENITE_INGOT_BLOCK;
	public static Item STEVENITE_PICKAXE;
	public static Item STEVENITE_AXE;
	public static Item STEVENITE_SWORD;
	public static Item STEVENITE_SHOVEL;
	public static Item STEVENITE_HOE;
	public static Item JAMMONITE_ORE;
	public static Item BOB;
	public static Item STEVEN_BOW;
	public static Item CHOCOLATE;
	public static Item STEVENITE_ARMOR_HELMET;
	public static Item STEVENITE_ARMOR_CHESTPLATE;
	public static Item STEVENITE_ARMOR_LEGGINGS;
	public static Item STEVENITE_ARMOR_BOOTS;
	public static Item JAMMONITE_INGOT;
	public static Item JAMMONITE_INGOTT_PICKAXE;
	public static Item JAMMONITE_INGOTT_AXE;
	public static Item JAMMONITE_INGOTT_SWORD;
	public static Item JAMMONITE_INGOTT_SHOVEL;
	public static Item JAMMONITE_INGOTT_HOE;
	public static Item JAMMONITE_INGOTT_ARMOR_HELMET;
	public static Item JAMMONITE_INGOTT_ARMOR_CHESTPLATE;
	public static Item JAMMONITE_INGOTT_ARMOR_LEGGINGS;
	public static Item JAMMONITE_INGOTT_ARMOR_BOOTS;
	public static Item EMPTY_BOB_FLINGER;
	public static Item DOUBLE_STEVENITE_SWORD;
	public static Item JAM;
	public static Item JAMHIMSELF;
	public static Item JAM_BLOCK;
	public static Item ALEX;
	public static Item BOB_BLOCK;

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
		STEVENITE_INGOT_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "stevenite_ingot_block"),
				new BlockItem(TheJamModFabricModBlocks.STEVENITE_INGOT_BLOCK, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD)));
		STEVENITE_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "stevenite_pickaxe"),
				new StevenitePickaxeItem());
		STEVENITE_AXE = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "stevenite_axe"), new SteveniteAxeItem());
		STEVENITE_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "stevenite_sword"),
				new SteveniteSwordItem());
		STEVENITE_SHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "stevenite_shovel"),
				new SteveniteShovelItem());
		STEVENITE_HOE = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "stevenite_hoe"), new SteveniteHoeItem());
		JAMMONITE_ORE = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "jammonite_ore"),
				new BlockItem(TheJamModFabricModBlocks.JAMMONITE_ORE, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD)));
		BOB = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "bob"), new BobItem());
		STEVEN_BOW = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "steven_bow"), new StevenBowItem());
		CHOCOLATE = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "chocolate"), new ChocolateItem());
		STEVENITE_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "stevenite_armor_helmet"),
				new SteveniteArmorItem.Helmet());
		STEVENITE_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "stevenite_armor_chestplate"),
				new SteveniteArmorItem.Chestplate());
		STEVENITE_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "stevenite_armor_leggings"),
				new SteveniteArmorItem.Leggings());
		STEVENITE_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "stevenite_armor_boots"),
				new SteveniteArmorItem.Boots());
		JAMMONITE_INGOT = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "jammonite_ingot"),
				new JammoniteIngotItem());
		JAMMONITE_INGOTT_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "jammonite_ingott_pickaxe"),
				new JammoniteIngottPickaxeItem());
		JAMMONITE_INGOTT_AXE = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "jammonite_ingott_axe"),
				new JammoniteIngottAxeItem());
		JAMMONITE_INGOTT_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "jammonite_ingott_sword"),
				new JammoniteIngottSwordItem());
		JAMMONITE_INGOTT_SHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "jammonite_ingott_shovel"),
				new JammoniteIngottShovelItem());
		JAMMONITE_INGOTT_HOE = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "jammonite_ingott_hoe"),
				new JammoniteIngottHoeItem());
		JAMMONITE_INGOTT_ARMOR_HELMET = Registry.register(Registry.ITEM,
				new ResourceLocation(TheJamModFabricMod.MODID, "jammonite_ingott_armor_helmet"), new JammoniteIngottArmorItem.Helmet());
		JAMMONITE_INGOTT_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM,
				new ResourceLocation(TheJamModFabricMod.MODID, "jammonite_ingott_armor_chestplate"), new JammoniteIngottArmorItem.Chestplate());
		JAMMONITE_INGOTT_ARMOR_LEGGINGS = Registry.register(Registry.ITEM,
				new ResourceLocation(TheJamModFabricMod.MODID, "jammonite_ingott_armor_leggings"), new JammoniteIngottArmorItem.Leggings());
		JAMMONITE_INGOTT_ARMOR_BOOTS = Registry.register(Registry.ITEM,
				new ResourceLocation(TheJamModFabricMod.MODID, "jammonite_ingott_armor_boots"), new JammoniteIngottArmorItem.Boots());
		EMPTY_BOB_FLINGER = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "empty_bob_flinger"),
				new EmptyBobFlingerItem());
		DOUBLE_STEVENITE_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "double_stevenite_sword"),
				new DoubleSteveniteSwordItem());
		JAM = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "jam_spawn_egg"),
				new SpawnEggItem(TheJamModFabricModEntities.JAM, -16062198, -5900765, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD)));
		JAMHIMSELF = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "jamhimself"), new JamhimselfItem());
		JAM_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "jam_block"),
				new BlockItem(TheJamModFabricModBlocks.JAM_BLOCK, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD)));
		ALEX = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "alex_spawn_egg"), new SpawnEggItem(
				TheJamModFabricModEntities.ALEX, -15059493, -6091799, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD)));
		BOB_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "bob_block"),
				new BlockItem(TheJamModFabricModBlocks.BOB_BLOCK, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD)));
	}
}
