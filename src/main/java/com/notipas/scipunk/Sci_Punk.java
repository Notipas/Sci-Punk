package com.notipas.scipunk;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sci_Punk implements ModInitializer {
    public static final String MOD_ID = "sci-punk";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
//        ModItems.register();
//        ModBlocks.register();
//        ModBlockEntities.register();
//        ModScreenHandlers.register();
//        ModItemGroups.GROUP.initialize();
        LOGGER.info("Sci-Punk has started");
    }
}
