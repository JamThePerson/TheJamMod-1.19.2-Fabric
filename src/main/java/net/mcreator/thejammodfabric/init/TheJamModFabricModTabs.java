
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejammodfabric.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class TheJamModFabricModTabs {
	public static CreativeModeTab TAB_JAM_MOD;

	public static void load() {
		TAB_JAM_MOD = FabricItemGroupBuilder.create(new ResourceLocation("the_jam_mod_fabric", "jam_mod"))
				.icon(() -> new ItemStack(Blocks.LIME_CANDLE_CAKE)).build();
	}
}
