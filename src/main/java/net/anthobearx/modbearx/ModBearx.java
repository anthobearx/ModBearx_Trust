package net.anthobearx.modbearx;

import net.anthobearx.modbearx.item.ModItems;
import net.anthobearx.modbearx.item.ModItemsLegacy;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModBearx implements ModInitializer {
	public static final String MOD_ID = "modbearx";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();//que ejecute este método al iniciar
		ModItemsLegacy.registerModItems();//que ejecute este metodo
	}
}
