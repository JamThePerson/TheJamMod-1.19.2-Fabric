package net.mcreator.thejammodfabric.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.thejammodfabric.TheJamModFabricMod;

import java.util.Map;
import java.util.Iterator;

public class SteveniteArmorAchievementProcedureProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheJamModFabricMod.LOGGER.warn("Failed to load dependency entity for procedure SteveniteArmorAchievementProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) > 6 && entity instanceof Player) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements()
						.getAdvancement(new ResourceLocation("the_jam_mod_fabric:theres_always_something_better"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
	}
}
