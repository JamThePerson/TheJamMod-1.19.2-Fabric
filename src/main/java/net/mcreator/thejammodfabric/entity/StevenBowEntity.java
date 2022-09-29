
package net.mcreator.thejammodfabric.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;

import net.mcreator.thejammodfabric.init.TheJamModFabricModItems;
import net.mcreator.thejammodfabric.init.TheJamModFabricModEntities;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class StevenBowEntity extends AbstractArrow implements ItemSupplier {
	public StevenBowEntity(EntityType<? extends StevenBowEntity> type, Level world) {
		super(type, world);
	}

	public StevenBowEntity(EntityType<? extends StevenBowEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public StevenBowEntity(EntityType<? extends StevenBowEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	@Environment(EnvType.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(TheJamModFabricModItems.BOB);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Items.ARROW);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static StevenBowEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		StevenBowEntity entityarrow = new StevenBowEntity(TheJamModFabricModEntities.STEVEN_BOW, entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound((Player) null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ARROW_SHOOT, SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static StevenBowEntity shoot(LivingEntity entity, LivingEntity target) {
		StevenBowEntity entityarrow = new StevenBowEntity(TheJamModFabricModEntities.STEVEN_BOW, entity, entity.level);
		double d0 = target.getY() + (double) target.getEyeHeight() - 1.1;
		double d1 = target.getX() - entity.getX();
		double d3 = target.getZ() - entity.getZ();
		entityarrow.shoot(d1, d0 - entityarrow.getY() + Math.sqrt(d1 * d1 + d3 * d3) * 0.2F, d3, 5f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(9);
		entityarrow.setKnockback(6);
		entityarrow.setCritArrow(true);
		entity.level.addFreshEntity(entityarrow);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		entity.level.playSound((Player) null, (double) x, (double) y, (double) z, SoundEvents.ARROW_SHOOT, SoundSource.PLAYERS, 1,
				1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
