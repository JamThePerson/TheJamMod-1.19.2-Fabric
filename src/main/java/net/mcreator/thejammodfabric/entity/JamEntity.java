
package net.mcreator.thejammodfabric.entity;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.thejammodfabric.procedures.JamEntityDiesProcedure;
import net.mcreator.thejammodfabric.init.TheJamModFabricModItems;
import net.mcreator.thejammodfabric.init.TheJamModFabricModEntities;
import net.mcreator.thejammodfabric.init.TheJamModFabricModBlocks;
import net.mcreator.thejammodfabric.TheJamModFabricMod;

import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

public class JamEntity extends Monster {
	private final ServerBossEvent bossInfo = new ServerBossEvent(this.getDisplayName(), ServerBossEvent.BossBarColor.RED,
			ServerBossEvent.BossBarOverlay.PROGRESS);

	public JamEntity(EntityType<JamEntity> type, Level world) {
		super(type, world);
		xpReward = 1800;
		setNoAi(false);
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(TheJamModFabricModItems.JAMMONITE_INGOTT_SWORD));
		this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(Items.TOTEM_OF_UNDYING));
		this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(TheJamModFabricModItems.JAMMONITE_INGOTT_ARMOR_HELMET));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(TheJamModFabricModItems.JAMMONITE_INGOTT_ARMOR_CHESTPLATE));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(TheJamModFabricModItems.JAMMONITE_INGOTT_ARMOR_LEGGINGS));
		this.setItemSlot(EquipmentSlot.FEET, new ItemStack(TheJamModFabricModItems.JAMMONITE_INGOTT_ARMOR_BOOTS));
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new LeapAtTargetGoal(this, (float) 0.5));
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}
		});
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new RandomSwimmingGoal(this, 1, 40));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Player.class, true, true));
		this.goalSelector.addGoal(6, new RemoveBlockGoal(Blocks.GRASS_BLOCK, this, 1, (int) 3));
		this.goalSelector.addGoal(7, new RemoveBlockGoal(Blocks.DIRT, this, 1, (int) 3));
		this.goalSelector.addGoal(8, new RemoveBlockGoal(Blocks.STONE, this, 1, (int) 3));
		this.goalSelector.addGoal(9, new RandomStrollGoal(this, 0.8));
		this.goalSelector.addGoal(10, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(12, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(15, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(16, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.ILLAGER;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(TheJamModFabricModBlocks.JAM_BLOCK));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return SoundEvents.GENERIC_HURT;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundEvents.GENERIC_DEATH;
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.CACTUS)
			return false;
		if (source == DamageSource.ANVIL)
			return false;
		if (source == DamageSource.DRAGON_BREATH)
			return false;
		if (source == DamageSource.WITHER)
			return false;
		if (source.getMsgId().equals("witherSkull"))
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity sourceentity = source.getEntity();
		Entity entity = this;
		Level world = this.level;

		JamEntityDiesProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build());
	}

	@Override
	public boolean canChangeDimensions() {
		return false;
	}

	@Override
	public void startSeenByPlayer(ServerPlayer player) {
		super.startSeenByPlayer(player);
		this.bossInfo.addPlayer(player);
	}

	@Override
	public void stopSeenByPlayer(ServerPlayer player) {
		super.stopSeenByPlayer(player);
		this.bossInfo.removePlayer(player);
	}

	@Override
	public void customServerAiStep() {
		super.customServerAiStep();
		this.bossInfo.setProgress(this.getHealth() / this.getMaxHealth());
	}

	public void aiStep() {
		super.aiStep();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;
		for (int l = 0; l < 2; ++l) {
			double x0 = x + random.nextFloat();
			double y0 = y + random.nextFloat();
			double z0 = z + random.nextFloat();
			double dx = (random.nextFloat() - 0.5D) * 1.9D;
			double dy = (random.nextFloat() - 0.5D) * 1.9D;
			double dz = (random.nextFloat() - 0.5D) * 1.9D;
			world.addParticle(ParticleTypes.TOTEM_OF_UNDYING, x0, y0, z0, dx, dy, dz);
		}
	}

	public static void init() {
		BiomeModifications.create(new ResourceLocation(TheJamModFabricMod.MODID, "jam_entity_spawn")).add(ModificationPhase.ADDITIONS,
				BiomeSelectors.all(), ctx -> ctx.getSpawnSettings().addSpawn(MobCategory.UNDERGROUND_WATER_CREATURE,
						new MobSpawnSettings.SpawnerData(TheJamModFabricModEntities.JAM, 1, 1, 1)));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
		builder = builder.add(Attributes.MAX_HEALTH, 343);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 9);
		builder = builder.add(Attributes.FOLLOW_RANGE, 135);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 3);
		return builder;
	}
}
