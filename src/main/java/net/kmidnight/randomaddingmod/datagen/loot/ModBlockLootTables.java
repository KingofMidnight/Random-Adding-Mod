package net.kmidnight.randomaddingmod.datagen.loot;

import net.kmidnight.randomaddingmod.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() { // this.dropSelf(ModBlocks..get());
        this.dropSelf(ModBlocks.EXP_BLOCK.get());
        this.dropSelf(ModBlocks.GDMB.get());
        this.dropSelf(ModBlocks.ADAMANTIUM_BLOCK.get());
        this.dropSelf(ModBlocks.LAND_CLAIMING.get());
        this.dropSelf(ModBlocks.ATM.get());
        this.dropSelf(ModBlocks.INVISMINE.get());
        this.dropSelf(ModBlocks.INVISBEARTRAP.get());
        this.dropSelf(ModBlocks.QUICKSAND.get());
        this.dropSelf(ModBlocks.FAKEDIRTFLOOR.get());
        this.dropSelf(ModBlocks.PLANET_PROJECTOR.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
