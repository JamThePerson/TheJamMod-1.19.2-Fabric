
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejammodfabric.init;

import net.mcreator.thejammodfabric.procedures.SteveniteArmorAchievementProcedureProcedure;
import net.mcreator.thejammodfabric.procedures.JamEntityDiesProcedure;
import net.mcreator.thejammodfabric.procedures.FrayloEntityDiesProcedure;
import net.mcreator.thejammodfabric.procedures.DevsEntityDiesProcedure;
import net.mcreator.thejammodfabric.procedures.DdyllEntityDiesProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class TheJamModFabricModProcedures {
	public static void load() {
		new FrayloEntityDiesProcedure();
		new DdyllEntityDiesProcedure();
		new DevsEntityDiesProcedure();
		new SteveniteArmorAchievementProcedureProcedure();
		new JamEntityDiesProcedure();
	}
}
