package net.kmidnight.randomaddingmod.entity;

import net.kmidnight.randomaddingmod.RandomAddingMod;
import net.kmidnight.randomaddingmod.entity.custom.HamsterEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE =
        DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RandomAddingMod.MOD_ID);

    public static final RegistryObject<EntityType<HamsterEntity>> HAMSTER =
        ENTITY_TYPE.register("hamster", () -> EntityType.Builder.of(HamsterEntity::new, MobCategory.CREATURE)
                .sized(1.5f, 1.5f).build("hamster"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPE.register(eventBus);
    }
}
