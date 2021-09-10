package net.mcreator.imperial.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.imperial.ImperialMod;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class KaczuchaOnInitialEntitySpawnProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ImperialMod.LOGGER.warn("Failed to load dependency x for procedure KaczuchaOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ImperialMod.LOGGER.warn("Failed to load dependency y for procedure KaczuchaOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ImperialMod.LOGGER.warn("Failed to load dependency z for procedure KaczuchaOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ImperialMod.LOGGER.warn("Failed to load dependency world for procedure KaczuchaOnInitialEntitySpawn!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			List<? extends PlayerEntity> _players = new ArrayList<>(world.getPlayers());
			for (Entity entityiterator : _players) {
				if (entityiterator instanceof LivingEntity)
					((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.INSTANT_DAMAGE, (int) 60, (int) 1, (false), (false)));
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.LARGE_SMOKE, x, y, z, (int) 20, 3, 3, 3, 1);
				}
			}
		}
	}
}
