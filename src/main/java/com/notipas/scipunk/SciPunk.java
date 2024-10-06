package com.notipas.scipunk;

import com.notipas.scipunk.item.SciPunkItemGroups;
import com.notipas.scipunk.item.SciPunkItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SciPunk implements ModInitializer {
    public static final String MOD_ID = "sci-punk";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        SciPunkItems.register();
//        ModBlocks.register();
//        ModBlockEntities.register();
//        ModScreenHandlers.register();
        SciPunkItemGroups.GROUP.initialize();
        LOGGER.info("Sci-Punk has started");
    }
}
