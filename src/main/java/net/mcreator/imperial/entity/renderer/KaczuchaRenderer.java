package net.mcreator.imperial.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.model.ChickenModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.imperial.entity.KaczuchaEntity;

@OnlyIn(Dist.CLIENT)
public class KaczuchaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(KaczuchaEntity.entity,
					renderManager -> new MobRenderer(renderManager, new ChickenModel(), 0.5f) {
						@Override
						public ResourceLocation getEntityTexture(Entity entity) {
							return new ResourceLocation("imperial:textures/evil_chicken.png");
						}
					});
		}
	}
}
