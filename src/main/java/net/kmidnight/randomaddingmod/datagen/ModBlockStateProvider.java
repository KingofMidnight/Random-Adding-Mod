package net.kmidnight.randomaddingmod.datagen;

import net.kmidnight.randomaddingmod.RandomAddingMod;
import net.kmidnight.randomaddingmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, RandomAddingMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.EXP_BLOCK); // blockWithItem(ModBlocks.);
        blockWithItem(ModBlocks.GDMB);
        blockWithItem(ModBlocks.ADAMANTIUM_BLOCK);
        //blockWithItem(ModBlocks.QUICKSAND);
        //blockWithItem(ModBlocks.FAKEDIRTFLOOR);
        //blockWithItem(ModBlocks.ACID);

        simpleBlockWithItem(ModBlocks.ATM.get(),
            new ModelFile.UncheckedModelFile(modLoc("block/atm")));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
