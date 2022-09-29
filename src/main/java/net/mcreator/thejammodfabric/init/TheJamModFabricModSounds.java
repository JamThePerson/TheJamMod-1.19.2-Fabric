
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejammodfabric.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class TheJamModFabricModSounds {
	public static SoundEvent DEVSLIVINGNOISE = new SoundEvent(new ResourceLocation("the_jam_mod_fabric", "devslivingnoise"));
	public static SoundEvent DEVSDEATHNOISE = new SoundEvent(new ResourceLocation("the_jam_mod_fabric", "devsdeathnoise"));
	public static SoundEvent FRAYLOLIVING = new SoundEvent(new ResourceLocation("the_jam_mod_fabric", "frayloliving"));
	public static SoundEvent FRAYLOWALKING = new SoundEvent(new ResourceLocation("the_jam_mod_fabric", "fraylowalking"));
	public static SoundEvent FRAYLODEATH = new SoundEvent(new ResourceLocation("the_jam_mod_fabric", "fraylodeath"));
	public static SoundEvent STEVENITEARMOUREQUIP = new SoundEvent(new ResourceLocation("the_jam_mod_fabric", "stevenitearmourequip"));

	public static void load() {
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("the_jam_mod_fabric", "devslivingnoise"), DEVSLIVINGNOISE);
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("the_jam_mod_fabric", "devsdeathnoise"), DEVSDEATHNOISE);
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("the_jam_mod_fabric", "frayloliving"), FRAYLOLIVING);
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("the_jam_mod_fabric", "fraylowalking"), FRAYLOWALKING);
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("the_jam_mod_fabric", "fraylodeath"), FRAYLODEATH);
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("the_jam_mod_fabric", "stevenitearmourequip"), STEVENITEARMOUREQUIP);
	}
}
