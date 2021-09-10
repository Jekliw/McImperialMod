package net.mcreator.imperial.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.imperial.item.GruszkaItem;
import net.mcreator.imperial.ImperialMod;

import java.util.Map;

public class KaczuchaParticleSpawningConditionProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ImperialMod.LOGGER.warn("Failed to load dependency entity for procedure KaczuchaParticleSpawningCondition!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ImperialMod.LOGGER.warn("Failed to load dependency x for procedure KaczuchaParticleSpawningCondition!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ImperialMod.LOGGER.warn("Failed to load dependency y for procedure KaczuchaParticleSpawningCondition!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ImperialMod.LOGGER.warn("Failed to load dependency z for procedure KaczuchaParticleSpawningCondition!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ImperialMod.LOGGER.warn("Failed to load dependency world for procedure KaczuchaParticleSpawningCondition!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) < 10)) {
			if (!entity.world.isRemote())
				entity.remove();
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(GruszkaItem.block));
				entityToSpawn.setPickupDelay((int) 1);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		}
	}
}
