package dev.forgeeverything.everythingfood.registry;

import dev.forgeeverything.everythingfood.EverythingFood;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EFCreativeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EverythingFood.MOD_ID);

    public static final Supplier<CreativeModeTab> EVERYTHING_FOOD_TAB =
            CREATIVE_MODE_TABS.register("everythingfood_tab", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable("itemGroup.everythingfood"))
                            .withTabsBefore(CreativeModeTabs.FOOD_AND_DRINKS)
                            .icon(() -> EFItems.TOMATO.get().getDefaultInstance())
                            .displayItems((parameters, output) -> {

                                // --- Raw Crops ---
                                output.accept(EFItems.TOMATO.get());
                                output.accept(EFItems.ONION.get());
                                output.accept(EFItems.GARLIC.get());
                                output.accept(EFItems.CABBAGE.get());
                                output.accept(EFItems.LETTUCE.get());
                                output.accept(EFItems.RICE.get());
                                output.accept(EFItems.STRAWBERRY.get());
                                output.accept(EFItems.CORN.get());
                                output.accept(EFItems.LEEK.get());
                                output.accept(EFItems.PEANUT.get());
                                output.accept(EFItems.GINGER.get());
                                output.accept(EFItems.OATS.get());
                                output.accept(EFItems.BARLEY.get());
                                output.accept(EFItems.RYE.get());
                                output.accept(EFItems.ROTTEN_TOMATO.get());

                                // --- Seeds & Plantables ---
                                output.accept(EFItems.TOMATO_SEEDS.get());

                                // --- Processed Ingredients ---
                                output.accept(EFItems.FLOUR.get());
                                output.accept(EFItems.DOUGH.get());
                                output.accept(EFItems.BUTTER.get());
                                output.accept(EFItems.TOMATO_SAUCE.get());
                                output.accept(EFItems.RAW_PASTA.get());
                                output.accept(EFItems.MINCED_BEEF.get());
                                output.accept(EFItems.COCOA_POWDER.get());
                                output.accept(EFItems.MILK_POWDER.get());
                                output.accept(EFItems.CONDENSED_MILK_BOTTLE.get());

                                // --- Cooked Foods & Meals ---
                                output.accept(EFItems.BREAD_SLICE.get());
                                output.accept(EFItems.TOAST.get());
                                output.accept(EFItems.BACON.get());
                                output.accept(EFItems.BACON_SANDWICH.get());
                                output.accept(EFItems.HAMBURGER.get());
                                output.accept(EFItems.BOILED_EGG.get());
                                output.accept(EFItems.ONION_SOUP.get());
                                output.accept(EFItems.SALAD.get());
                                output.accept(EFItems.PUMPKIN_PIE_SLICE.get());
                                output.accept(EFItems.GINGERBREAD.get());
                                output.accept(EFItems.MARSHMALLOW.get());
                                output.accept(EFItems.DOG_FOOD.get());

                                // --- End Dimension Foods ---
                                output.accept(EFItems.CHORUS_COOKIE.get());
                                output.accept(EFItems.CHORUS_FRUIT_PIE.get());
                                output.accept(EFItems.CHORUS_FRUIT_PIE_SLICE.get());
                                output.accept(EFItems.CHORUS_FRUIT_POPSICLE.get());

                                // --- Drinks ---
                                output.accept(EFItems.APPLE_JUICE.get());
                                output.accept(EFItems.APPLE_CIDER.get());
                                output.accept(EFItems.HOT_CHOCOLATE_BOTTLE.get());

                                // --- Utility Items ---
                                output.accept(EFItems.ROPE.get());
                                output.accept(EFItems.MUG.get());
                                output.accept(EFItems.GINGER_CRATE.get());

                                // Relic items
                            })
                            .build());
}
