package com.notipas.scipunk.item;

import com.notipas.scipunk.SciPunk;
import io.wispforest.owo.itemgroup.OwoItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class SciPunkItems {
    public static final Item AD_ITEM = registerItem(
            "ad_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item AG_ITEM = registerItem(
            "ag_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item AQ_ITEM = registerItem(
            "aq_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item AU_ITEM = registerItem(
            "au_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item BA_ITEM = registerItem(
            "ba_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item CA_ITEM = registerItem(
            "ca_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item CU_ITEM = registerItem(
            "cu_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item FE_ITEM = registerItem(
            "fe_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item KB_ITEM = registerItem(
            "kb_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item KV_ITEM = registerItem(
            "kv_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item MI_ITEM = registerItem(
            "mi_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item MN_ITEM = registerItem(
            "mn_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item MT_ITEM = registerItem(
            "mt_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item OR_ITEM = registerItem(
            "or_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item OS_ITEM = registerItem(
            "os_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item PA_ITEM = registerItem(
            "pa_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item PT_ITEM = registerItem(
            "pt_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item RN_ITEM = registerItem(
            "rn_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item SH_ITEM = registerItem(
            "sh_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item SN_ITEM = registerItem(
            "sn_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item SR_ITEM = registerItem(
            "sr_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item UB_ITEM = registerItem(
            "ub_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item PR_ITEM = registerItem(
            "pr_element",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item VILLAGER_IMPLANT = registerItem(
            "villager_implant",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item GLD = registerItem(
            "gld",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item KSV = registerItem(
            "ksv",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item STP = registerItem(
            "stp",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );
    public static final Item VSR = registerItem(
            "vsr",
            new Item(new OwoItemSettings().group(SciPunkItemGroups.GROUP))
    );

    public static Item registerItem(String id, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SciPunk.MOD_ID, id), item);
    };

    public static void register() {
        SciPunk.LOGGER.debug("Load items");
    }
}
