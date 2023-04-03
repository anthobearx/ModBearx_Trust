package net.anthobearx.modbearx.item;

import net.anthobearx.modbearx.ModBearx;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    //creacion de item bearcoin
    public static final Item BEAR_COIN = registerItem("bear_coin",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    //creacion de otro item
    //xandrite petalos lavanda con contorno rosa y palo verde
    public static final Item XANDRITE = registerItem("xandrite",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    //hory petalos rosas con contorno azul bajito y palo blanco
    public static final Item HORY = registerItem("hory",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item KNOVA = registerItem("knova",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    //petalos blancos con contorno azul y palo blanco
    public static final Item ANTWO = registerItem("antwo",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));




    //metodos para la creacion de item
    public static Item registerItem(String nombre, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ModBearx.MOD_ID, nombre),item);
    }
    public static void registerModItems(){
        ModBearx.LOGGER.debug("Registrador de items para " + ModBearx.MOD_ID);
    }
}
