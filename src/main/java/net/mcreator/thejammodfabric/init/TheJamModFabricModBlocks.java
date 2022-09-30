
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejammodfabric.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.thejammodfabric.block.SteveniteIngotBlockBlock;
import net.mcreator.thejammodfabric.block.JammoniteOreBlock;
import net.mcreator.thejammodfabric.block.JamBlockBlock;
import net.mcreator.thejammodfabric.block.BobBlockBlock;
import net.mcreator.thejammodfabric.TheJamModFabricMod;

public class TheJamModFabricModBlocks {
	public static Block STEVENITE_INGOT_BLOCK;
	public static Block JAMMONITE_ORE;
	public static Block JAM_BLOCK;
	public static Block BOB_BLOCK;

	public static void load() {
		STEVENITE_INGOT_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(TheJamModFabricMod.MODID, "stevenite_ingot_block"),
				new SteveniteIngotBlockBlock());
		JAMMONITE_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(TheJamModFabricMod.MODID, "jammonite_ore"), new JammoniteOreBlock());
		JAM_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(TheJamModFabricMod.MODID, "jam_block"), new JamBlockBlock());
		BOB_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(TheJamModFabricMod.MODID, "bob_block"), new BobBlockBlock());
	}

	public static void clientLoad() {
		SteveniteIngotBlockBlock.clientInit();
		JammoniteOreBlock.clientInit();
		JamBlockBlock.clientInit();
		BobBlockBlock.clientInit();
	}
}
