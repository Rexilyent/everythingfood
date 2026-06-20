package dev.forgeeverything.everythingfood;

import dev.forgeeverything.everythingfood.registry.EFCreativeTab;
import dev.forgeeverything.everythingfood.registry.EFItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(EverythingFood.MOD_ID)
public class EverythingFood {

    public static final String MOD_ID = "everythingfood";

    public EverythingFood(IEventBus modEventBus) {
        EFItems.ITEMS.register(modEventBus);
        EFCreativeTab.CREATIVE_MODE_TABS.register(modEventBus);
    }
}
