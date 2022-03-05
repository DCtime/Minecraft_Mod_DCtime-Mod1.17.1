package com.dctime.testmod.item;

import com.dctime.testmod.TestMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> WUMIUM_INGOT = ITEMS.register("wumium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.test_TAB)));

    public static final RegistryObject<Item> WUMIUM_OXIDE = ITEMS.register("wumium_oxide",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.test_TAB)));

    public static final RegistryObject<Item> THINKING = ITEMS.register("thinking",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.test_TAB).food(
                    new FoodProperties.Builder().nutrition(20).saturationMod(0.2f).build())));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}