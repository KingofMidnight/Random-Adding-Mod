package net.kmidnight.randomaddingmod.item;

import net.kmidnight.randomaddingmod.RandomAddingMod;
import net.kmidnight.randomaddingmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RandomAddingMod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> RANDOMADDINGMOD_TAB = CREATIVE_MODE_TABS.register("randomaddingmod_tab", () -> CreativeModeTab.builder()
        .icon(() -> new ItemStack(ModItems.ICESWORD.get()))
        .title(Component.translatable("creativetab.randomaddingmod_tab"))
        .displayItems((parameters, output) -> {
            output.accept(ModItems.ICESWORD.get());
            output.accept(ModItems.CATLAUNCHER.get());
            output.accept(ModItems.MUSKET.get());
            output.accept(ModItems.CHEESEBANNERLOGO.get());
            output.accept(ModItems.SELFDESTRUCTBUTTON.get());
            output.accept(ModItems.COINRUSTED.get());
            output.accept(ModItems.COIN1.get());
            output.accept(ModItems.COIN2.get());
            output.accept(ModItems.COIN5.get());
            output.accept(ModItems.COIN10.get());
            output.accept(ModItems.COIN20.get());
            output.accept(ModItems.COIN50.get());
            output.accept(ModItems.COIN100.get());
            output.accept(ModItems.COIN9000.get());
            output.accept(ModItems.WALLET.get());
            output.accept(ModItems.WCLAWS.get());
            output.accept(ModItems.GRINDSTONEH.get());
            output.accept(ModBlocks.EXP_BLOCK.get());
            output.accept(ModBlocks.GDMB.get());
            output.accept(ModBlocks.LAND_CLAIMING.get());
            output.accept(ModBlocks.ATM.get());
            output.accept(ModBlocks.INVISMINE.get());
            output.accept(ModBlocks.INVISBEARTRAP.get());
            output.accept(ModBlocks.QUICKSAND.get());
            output.accept(ModBlocks.FAKEDIRTFLOOR.get());
            output.accept(ModBlocks.ACID.get());
            output.accept(ModBlocks.PLANET_PROJECTOR.get());
        }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
