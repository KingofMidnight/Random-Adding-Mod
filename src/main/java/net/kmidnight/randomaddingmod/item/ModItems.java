package net.kmidnight.randomaddingmod.item;

import net.kmidnight.randomaddingmod.RandomAddingMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RandomAddingMod.MOD_ID);

    public static final RegistryObject<Item> ICESWORD = ITEMS.register("ice_sword",
        () -> new Item(new Item.Properties().stacksTo(1).durability(500).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CATLAUNCHER = ITEMS.register("cat_launcher",
        () -> new Item(new Item.Properties().stacksTo(1).durability(500).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> MUSKET = ITEMS.register("musket",
        () -> new Item(new Item.Properties().stacksTo(1).durability(500).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> CHEESEBANNERLOGO = ITEMS.register("cheese_banner_logo",
        () -> new Item(new Item.Properties().stacksTo(1).durability(500).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> SELFDESTRUCTBUTTON = ITEMS.register("self_destruct_button",
        () -> new Item(new Item.Properties().stacksTo(1).durability(500).rarity(Rarity.UNCOMMON)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
