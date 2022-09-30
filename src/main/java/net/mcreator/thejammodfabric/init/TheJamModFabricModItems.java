
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejammodfabric.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.thejammodfabric.item.UseIfEntityOverflowToolItem;
import net.mcreator.thejammodfabric.item.UseIfEntityOverflowItem;
import net.mcreator.thejammodfabric.item.SteveniteSwordItem;
import net.mcreator.thejammodfabric.item.SteveniteShovelItem;
import net.mcreator.thejammodfabric.item.StevenitePickaxeItem;
import net.mcreator.thejammodfabric.item.SteveniteIngotItem;
import net.mcreator.thejammodfabric.item.SteveniteHoeItem;
import net.mcreator.thejammodfabric.item.SteveniteAxeItem;
import net.mcreator.thejammodfabric.item.SteveniteArmorItem;
import net.mcreator.thejammodfabric.item.JammoniteItem;
import net.mcreator.thejammodfabric.item.JammoniteIngottSwordItem;
import net.mcreator.thejammodfabric.item.JammoniteIngottShovelItem;
import net.mcreator.thejammodfabric.item.JammoniteIngottPickaxeItem;
import net.mcreator.thejammodfabric.item.JammoniteIngottHoeItem;
import net.mcreator.thejammodfabric.item.JammoniteIngottAxeItem;
import net.mcreator.thejammodfabric.item.JammoniteIngottArmorItem;
import net.mcreator.thejammodfabric.item.JammoniteIngotItem;
import net.mcreator.thejammodfabric.item.JamhimselfItem;
import net.mcreator.thejammodfabric.item.DoubleSteveniteSwordItem;
import net.mcreator.thejammodfabric.item.DirtSwordItem;
import net.mcreator.thejammodfabric.item.DirtShovelItem;
import net.mcreator.thejammodfabric.item.DirtPickaxeItem;
import net.mcreator.thejammodfabric.item.DirtHoeItem;
import net.mcreator.thejammodfabric.item.DirtDustItem;
import net.mcreator.thejammodfabric.item.DirtAxeItem;
import net.mcreator.thejammodfabric.item.DirtArmorItem;
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
	public static Item DOUBLE_STEVENITE_SWORD;
	public static Item JAMHIMSELF;
	public static Item JAM_BLOCK;
	public static Item ALEX;
	public static Item BOB_BLOCK;
	public static Item USE_IF_ENTITY_OVERFLOW;
	public static Item USE_IF_ENTITY_OVERFLOW_TOOL;
	public static Item DIRT_DUST;
	public static Item DIRT_ARMOR_HELMET;
	public static Item DIRT_ARMOR_CHESTPLATE;
	public static Item DIRT_ARMOR_LEGGINGS;
	public static Item DIRT_ARMOR_BOOTS;
	public static Item DIRT_PICKAXE;
	public static Item DIRT_AXE;
	public static Item DIRT_SWORD;
	public static Item DIRT_SHOVEL;
	public static Item DIRT_HOE;

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
		DOUBLE_STEVENITE_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "double_stevenite_sword"),
				new DoubleSteveniteSwordItem());
		JAMHIMSELF = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "jamhimself"), new JamhimselfItem());
		JAM_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "jam_block"),
				new BlockItem(TheJamModFabricModBlocks.JAM_BLOCK, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD)));
		ALEX = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "alex_spawn_egg"), new SpawnEggItem(
				TheJamModFabricModEntities.ALEX, -15059493, -6091799, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD)));
		BOB_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "bob_block"),
				new BlockItem(TheJamModFabricModBlocks.BOB_BLOCK, new Item.Properties().tab(TheJamModFabricModTabs.TAB_JAM_MOD)));
		USE_IF_ENTITY_OVERFLOW = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "use_if_entity_overflow"),
				new UseIfEntityOverflowItem());
		USE_IF_ENTITY_OVERFLOW_TOOL = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "use_if_entity_overflow_tool"),
				new UseIfEntityOverflowToolItem());
		DIRT_DUST = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "dirt_dust"), new DirtDustItem());
		DIRT_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "dirt_armor_helmet"),
				new DirtArmorItem.Helmet());
		DIRT_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "dirt_armor_chestplate"),
				new DirtArmorItem.Chestplate());
		DIRT_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "dirt_armor_leggings"),
				new DirtArmorItem.Leggings());
		DIRT_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "dirt_armor_boots"),
				new DirtArmorItem.Boots());
		DIRT_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "dirt_pickaxe"), new DirtPickaxeItem());
		DIRT_AXE = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "dirt_axe"), new DirtAxeItem());
		DIRT_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "dirt_sword"), new DirtSwordItem());
		DIRT_SHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "dirt_shovel"), new DirtShovelItem());
		DIRT_HOE = Registry.register(Registry.ITEM, new ResourceLocation(TheJamModFabricMod.MODID, "dirt_hoe"), new DirtHoeItem());
	}
}
