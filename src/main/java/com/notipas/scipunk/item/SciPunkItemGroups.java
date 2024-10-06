package com.notipas.scipunk.item;

import com.notipas.scipunk.SciPunk;
import io.wispforest.owo.itemgroup.Icon;
import io.wispforest.owo.itemgroup.OwoItemGroup;
import net.minecraft.resources.ResourceLocation;

public class SciPunkItemGroups {
    public static final OwoItemGroup GROUP = OwoItemGroup
            .builder(new ResourceLocation(SciPunk.MOD_ID, "item_group"), () -> Icon.of(SciPunkItems.AQ_ITEM))
            .build();
}
