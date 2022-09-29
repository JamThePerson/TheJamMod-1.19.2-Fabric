
package net.mcreator.thejammodfabric.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.util.RandomSource;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.Minecraft;

import net.mcreator.thejammodfabric.init.TheJamModFabricModItems;
import net.mcreator.thejammodfabric.init.TheJamModFabricModBlocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;
import java.util.Collections;

public class JammoniteOreBlock extends Block {
	public static BlockBehaviour.Properties PROPERTIES = FabricBlockSettings.of(Material.STONE).requiresCorrectToolForDrops().sound(SoundType.STONE)
			.strength(3f, 30f).lightLevel(s -> 1).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true)
			.emissiveRendering((bs, br, bp) -> true);

	public JammoniteOreBlock() {
		super(PROPERTIES);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 7;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(TheJamModFabricModItems.JAMMONITE, (int) (4)));
	}

	@Environment(EnvType.CLIENT)
	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, RandomSource random) {
		super.animateTick(blockstate, world, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		for (int l = 0; l < 2; ++l) {
			double x0 = x + random.nextFloat();
			double y0 = y + random.nextFloat();
			double z0 = z + random.nextFloat();
			double dx = (random.nextFloat() - 0.5D) * 0.3D;
			double dy = (random.nextFloat() - 0.5D) * 0.3D;
			double dz = (random.nextFloat() - 0.5D) * 0.3D;
			world.addParticle(ParticleTypes.TOTEM_OF_UNDYING, x0, y0, z0, dx, dy, dz);
		}
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(TheJamModFabricModBlocks.JAMMONITE_ORE, RenderType.solid());
	}
}
