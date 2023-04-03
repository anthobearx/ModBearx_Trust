package net.anthobearx.modbearx.item;

import net.anthobearx.modbearx.ModBearx;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModItemsLegacy {

    public static final Item CAMARA = ModItems.registerItem("camara",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item PLASTIC = ModItems.registerItem("plastic",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item PLASTIC_BLOCK = ModItems.registerItem("plastic_block",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item PLUSH_AKITA = ModItems.registerItem("plush_akita",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item PLUSH_DUCK = ModItems.registerItem("plush_duck",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item PLUSH_JOSU = ModItems.registerItem("plush_josu",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item PLUSH_RABBIT = ModItems.registerItem("plush_rabbit",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item PLUSH_SHARK = ModItems.registerItem("plush_shark",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item TRASH_BLOCK = ModItems.registerItem("trash_block",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item USELESS_BLOCK = ModItems.registerItem("useless_block",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item WET_PLASTIC = ModItems.registerItem("wet_plastic",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static void registerModItems(){
        ModBearx.LOGGER.debug("Registrador de items para " + ModBearx.MOD_ID);
    }
}
