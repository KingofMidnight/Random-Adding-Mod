package net.kmidnight.randomaddingmod.item;

import net.kmidnight.randomaddingmod.RandomAddingMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RandomAddingMod.MODID);

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
    public static final RegistryObject<Item> WCLAWS = ITEMS.register("wclaws",
        () -> new Item(new Item.Properties().stacksTo(1).defaultDurability(250).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> GRINDSTONEH = ITEMS.register("grindstoneh",
        () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> COINRUSTED = ITEMS.register("coinrusted",
        () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> COIN1 = ITEMS.register("coin1",
        () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> COIN2 = ITEMS.register("coin2",
        () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> COIN5 = ITEMS.register("coin5",
        () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> COIN10 = ITEMS.register("coin10",
        () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> COIN20 = ITEMS.register("coin20",
        () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> COIN50 = ITEMS.register("coin50",
        () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> COIN100 = ITEMS.register("coin100",
        () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> COIN9000 = ITEMS.register("coin9000",
        () -> new Item(new Item.Properties().stacksTo(5).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> WALLET = ITEMS.register("wallet",
        () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CARD = ITEMS.register("card",
        () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
