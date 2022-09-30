
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejammodfabric.init;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.thejammodfabric.client.renderer.JamRenderer;
import net.mcreator.thejammodfabric.client.renderer.FrayloRenderer;
import net.mcreator.thejammodfabric.client.renderer.DevsRenderer;
import net.mcreator.thejammodfabric.client.renderer.DdyllRenderer;
import net.mcreator.thejammodfabric.client.renderer.AlexRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class TheJamModFabricModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(TheJamModFabricModEntities.DEVS, DevsRenderer::new);
		EntityRendererRegistry.register(TheJamModFabricModEntities.DDYLL, DdyllRenderer::new);
		EntityRendererRegistry.register(TheJamModFabricModEntities.FRAYLO, FrayloRenderer::new);
		EntityRendererRegistry.register(TheJamModFabricModEntities.STEVEN_BOW, ThrownItemRenderer::new);
		EntityRendererRegistry.register(TheJamModFabricModEntities.JAM, JamRenderer::new);
		EntityRendererRegistry.register(TheJamModFabricModEntities.ALEX, AlexRenderer::new);
	}
}
