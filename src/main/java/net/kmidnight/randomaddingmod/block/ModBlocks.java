package net.kmidnight.randomaddingmod.block;

import net.kmidnight.randomaddingmod.RandomAddingMod;
import net.kmidnight.randomaddingmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RandomAddingMod.MOD_ID);

    public static final RegistryObject<Block> EXP_BLOCK = registerBlock("exp_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> GDMB = registerBlock("glowing_dark_mush_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> LAND_CLAIMING = registerBlock("land_claiming_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> ATM = registerBlock("atm",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> VAULT = registerBlock("vault",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> INVISMINE = registerBlock("invis_mine",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> INVISBEARTRAP = registerBlock("invis_bear_trap",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> QUICKSAND = registerBlock("quicksand",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Block> FAKEDIRTFLOOR = registerBlock("fake_dirt_floor",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> ACID = registerBlock("acid",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK)));
    public static final RegistryObject<Block> PLANET_PROJECTOR = registerBlock("planet_projector",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
