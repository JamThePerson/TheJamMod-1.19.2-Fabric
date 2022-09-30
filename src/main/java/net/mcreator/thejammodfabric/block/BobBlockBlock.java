
package net.mcreator.thejammodfabric.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.thejammodfabric.init.TheJamModFabricModItems;
import net.mcreator.thejammodfabric.init.TheJamModFabricModBlocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;
import java.util.Collections;

public class BobBlockBlock extends Block {
	public static BlockBehaviour.Properties PROPERTIES = FabricBlockSettings.of(Material.WATER_PLANT).sound(SoundType.WOOL).strength(0.25f, 50f)
			.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true);

	public BobBlockBlock() {
		super(PROPERTIES);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(TheJamModFabricModItems.BOB, (int) (9)));
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(TheJamModFabricModBlocks.BOB_BLOCK, RenderType.solid());
	}
}
