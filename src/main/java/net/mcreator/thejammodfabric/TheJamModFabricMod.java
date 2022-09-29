/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.thejammodfabric;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.thejammodfabric.init.TheJamModFabricModTabs;
import net.mcreator.thejammodfabric.init.TheJamModFabricModSounds;
import net.mcreator.thejammodfabric.init.TheJamModFabricModItems;
import net.mcreator.thejammodfabric.init.TheJamModFabricModEntities;

import net.fabricmc.api.ModInitializer;

public class TheJamModFabricMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "the_jam_mod_fabric";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing TheJamModFabricMod");
		TheJamModFabricModTabs.load();

		TheJamModFabricModEntities.load();

		TheJamModFabricModItems.load();

		TheJamModFabricModSounds.load();
	}
}
