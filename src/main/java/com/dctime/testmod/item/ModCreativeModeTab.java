package com.dctime.testmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab test_TAB = new CreativeModeTab("testModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.WUMIUM_INGOT.get());
        }
    };
}
