package net.kmidnight.randomaddingmod.block.entity;

import net.kmidnight.randomaddingmod.RandomAddingMod;
import net.kmidnight.randomaddingmod.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
        DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RandomAddingMod.MODID);

    public static final RegistryObject<BlockEntityType<AtmBlockEntity>> ATM_BE =
        BLOCK_ENTITIES.register("atm_be", () ->
            BlockEntityType.Builder.of(AtmBlockEntity::new,
                ModBlocks.ATM.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
