package net.kmidnight.randomaddingmod.datagen;

import net.kmidnight.randomaddingmod.RandomAddingMod;
import net.kmidnight.randomaddingmod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, RandomAddingMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(ModBlocks.EXP_BLOCK.get(),
                ModBlocks.ATM.get(),
                ModBlocks.LAND_CLAIMING.get());
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
            .add(ModBlocks.FAKEDIRTFLOOR.get(),
                ModBlocks.QUICKSAND.get());
        this.tag(BlockTags.NEEDS_STONE_TOOL)
            .add(ModBlocks.FAKEDIRTFLOOR.get(),
                ModBlocks.QUICKSAND.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL)
            .add(ModBlocks.EXP_BLOCK.get(),
                ModBlocks.ATM.get(),
                ModBlocks.LAND_CLAIMING.get());
    }
}
