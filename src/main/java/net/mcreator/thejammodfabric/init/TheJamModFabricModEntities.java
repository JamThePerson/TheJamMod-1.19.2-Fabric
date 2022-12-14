
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejammodfabric.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.thejammodfabric.entity.JamEntity;
import net.mcreator.thejammodfabric.entity.FrayloEntity;
import net.mcreator.thejammodfabric.entity.DevsEntity;
import net.mcreator.thejammodfabric.entity.DdyllEntity;
import net.mcreator.thejammodfabric.entity.AlexEntity;
import net.mcreator.thejammodfabric.TheJamModFabricMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class TheJamModFabricModEntities {
	public static EntityType<DevsEntity> DEVS;
	public static EntityType<DdyllEntity> DDYLL;
	public static EntityType<FrayloEntity> FRAYLO;
	public static EntityType<JamEntity> JAM;
	public static EntityType<AlexEntity> ALEX;

	public static void load() {
		DEVS = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TheJamModFabricMod.MODID, "devs"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, DevsEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true))
						.trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		DevsEntity.init();
		FabricDefaultAttributeRegistry.register(DEVS, DevsEntity.createAttributes());
		DDYLL = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TheJamModFabricMod.MODID, "ddyll"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, DdyllEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).fireImmune()
						.trackRangeBlocks(72).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		DdyllEntity.init();
		FabricDefaultAttributeRegistry.register(DDYLL, DdyllEntity.createAttributes());
		FRAYLO = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TheJamModFabricMod.MODID, "fraylo"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, FrayloEntity::new).dimensions(new EntityDimensions(0.7f, 1.8f, true))
						.fireImmune().trackRangeBlocks(135).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		FrayloEntity.init();
		FabricDefaultAttributeRegistry.register(FRAYLO, FrayloEntity.createAttributes());
		JAM = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TheJamModFabricMod.MODID, "jam"),
				FabricEntityTypeBuilder.create(MobCategory.UNDERGROUND_WATER_CREATURE, JamEntity::new)
						.dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(360).forceTrackedVelocityUpdates(true)
						.trackedUpdateRate(3).build());
		JamEntity.init();
		FabricDefaultAttributeRegistry.register(JAM, JamEntity.createAttributes());
		ALEX = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TheJamModFabricMod.MODID, "alex"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, AlexEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true))
						.trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		AlexEntity.init();
		FabricDefaultAttributeRegistry.register(ALEX, AlexEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1)
				.trackedUpdateRate(64).build();
	}
}
