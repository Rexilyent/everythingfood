package dev.forgeeverything.everythingfood.registry;

import dev.forgeeverything.everythingfood.EverythingFood;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EFItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(EverythingFood.MOD_ID);

    // -------------------------------------------------------------------------
    // HELPER — reduces boilerplate for food item registration
    // -------------------------------------------------------------------------

    private static Item.Properties food(int nutrition, float saturation) {
        return new Item.Properties().food(
                new FoodProperties.Builder()
                        .nutrition(nutrition)
                        .saturationModifier(saturation)
                        .build());
    }

    private static Item.Properties item() {
        return new Item.Properties();
    }

    // -------------------------------------------------------------------------
    // RAW CROPS
    // Simple farmable ingredients. Light nutrition values — these are raw
    // produce, not finished meals.
    // -------------------------------------------------------------------------

    public static final DeferredItem<Item> TOMATO       = ITEMS.registerSimpleItem("tomato",       food(2, 0.3f));
    public static final DeferredItem<Item> ONION        = ITEMS.registerSimpleItem("onion",        food(1, 0.3f));
    public static final DeferredItem<Item> GARLIC       = ITEMS.registerSimpleItem("garlic",       food(1, 0.3f));
    public static final DeferredItem<Item> CABBAGE      = ITEMS.registerSimpleItem("cabbage",      food(2, 0.3f));
    public static final DeferredItem<Item> LETTUCE      = ITEMS.registerSimpleItem("lettuce",      food(1, 0.3f));
    public static final DeferredItem<Item> RICE         = ITEMS.registerSimpleItem("rice",         food(1, 0.3f));
    public static final DeferredItem<Item> STRAWBERRY   = ITEMS.registerSimpleItem("strawberry",   food(3, 0.4f));
    public static final DeferredItem<Item> CORN         = ITEMS.registerSimpleItem("corn",         food(2, 0.3f));
    public static final DeferredItem<Item> LEEK         = ITEMS.registerSimpleItem("leek",         food(1, 0.2f));
    public static final DeferredItem<Item> PEANUT       = ITEMS.registerSimpleItem("peanut",       food(3, 0.4f));
    public static final DeferredItem<Item> GINGER       = ITEMS.registerSimpleItem("ginger",       food(1, 0.1f));
    public static final DeferredItem<Item> OATS         = ITEMS.registerSimpleItem("oats",         food(1, 0.1f));
    public static final DeferredItem<Item> BARLEY       = ITEMS.registerSimpleItem("barley",       food(1, 0.1f));
    public static final DeferredItem<Item> RYE          = ITEMS.registerSimpleItem("rye",          food(1, 0.1f));
    public static final DeferredItem<Item> ROTTEN_TOMATO = ITEMS.registerSimpleItem("rotten_tomato", food(1, 0.1f));

    // -------------------------------------------------------------------------
    // SEEDS & PLANTABLES
    // Non-edible. Registered for tag unification — farming drops are unified
    // through Almost Unified so players receive one canonical seed version.
    // -------------------------------------------------------------------------

    public static final DeferredItem<Item> TOMATO_SEEDS = ITEMS.registerSimpleItem("tomato_seeds", item());

    // -------------------------------------------------------------------------
    // PROCESSED INGREDIENTS
    // Items used as recipe inputs. Most are not directly edible.
    // -------------------------------------------------------------------------

    public static final DeferredItem<Item> FLOUR              = ITEMS.registerSimpleItem("flour",              item());
    public static final DeferredItem<Item> DOUGH              = ITEMS.registerSimpleItem("dough",              item());
    public static final DeferredItem<Item> TOMATO_SAUCE       = ITEMS.registerSimpleItem("tomato_sauce",       item());
    public static final DeferredItem<Item> RAW_PASTA          = ITEMS.registerSimpleItem("raw_pasta",          item());
    public static final DeferredItem<Item> COCOA_POWDER       = ITEMS.registerSimpleItem("cocoa_powder",       item());
    public static final DeferredItem<Item> MILK_POWDER        = ITEMS.registerSimpleItem("milk_powder",        item());
    public static final DeferredItem<Item> MINCED_BEEF        = ITEMS.registerSimpleItem("minced_beef",        food(3, 0.3f));
    public static final DeferredItem<Item> BUTTER             = ITEMS.registerSimpleItem("butter",             food(1, 0.4f));
    public static final DeferredItem<Item> CONDENSED_MILK_BOTTLE = ITEMS.registerSimpleItem("condensed_milk_bottle", food(3, 0.4f));

    // -------------------------------------------------------------------------
    // COOKED FOODS & MEALS
    // Prepared foods with meaningful nutrition. Values are balanced relative
    // to the vanilla scale (Bread = 5/0.6, Steak = 8/0.8).
    // -------------------------------------------------------------------------

    public static final DeferredItem<Item> ONION_SOUP         = ITEMS.registerSimpleItem("onion_soup",         food(6, 0.7f));
    public static final DeferredItem<Item> BACON              = ITEMS.registerSimpleItem("bacon",              food(5, 0.7f));
    public static final DeferredItem<Item> BACON_SANDWICH     = ITEMS.registerSimpleItem("bacon_sandwich",     food(8, 0.7f));
    public static final DeferredItem<Item> HAMBURGER          = ITEMS.registerSimpleItem("hamburger",          food(8, 0.8f));
    public static final DeferredItem<Item> PUMPKIN_PIE_SLICE  = ITEMS.registerSimpleItem("pumpkin_pie_slice",  food(4, 0.5f));
    public static final DeferredItem<Item> BREAD_SLICE        = ITEMS.registerSimpleItem("bread_slice",        food(3, 0.4f));
    public static final DeferredItem<Item> TOAST              = ITEMS.registerSimpleItem("toast",              food(3, 0.5f));
    public static final DeferredItem<Item> SALAD              = ITEMS.registerSimpleItem("salad",              food(5, 0.6f));
    public static final DeferredItem<Item> BOILED_EGG         = ITEMS.registerSimpleItem("boiled_egg",         food(4, 0.6f));
    public static final DeferredItem<Item> GINGERBREAD        = ITEMS.registerSimpleItem("gingerbread",        food(4, 0.5f));
    public static final DeferredItem<Item> MARSHMALLOW        = ITEMS.registerSimpleItem("marshmallow",        food(3, 0.4f));

    // -------------------------------------------------------------------------
    // END DIMENSION FOODS
    // Chorus-based foods — cross-mod unification for Create: Food and
    // End's Delight (ends_delight is dominant for all four).
    // -------------------------------------------------------------------------

    public static final DeferredItem<Item> CHORUS_COOKIE         = ITEMS.registerSimpleItem("chorus_cookie",         food(5, 0.6f));
    public static final DeferredItem<Item> CHORUS_FRUIT_PIE      = ITEMS.registerSimpleItem("chorus_fruit_pie",      food(8, 0.8f));
    public static final DeferredItem<Item> CHORUS_FRUIT_PIE_SLICE = ITEMS.registerSimpleItem("chorus_fruit_pie_slice", food(3, 0.5f));
    public static final DeferredItem<Item> CHORUS_FRUIT_POPSICLE = ITEMS.registerSimpleItem("chorus_fruit_popsicle", food(4, 0.5f));

    // -------------------------------------------------------------------------
    // DRINKS
    // Liquid consumables. Registered as standard food items.
    // Note: caramel_bucket, hot_chocolate_bucket, and white_chocolate_bucket
    // are intentionally excluded — they require fluid registration and are
    // handled by Create: Confectionery's own fluid system.
    // -------------------------------------------------------------------------

    public static final DeferredItem<Item> APPLE_JUICE          = ITEMS.registerSimpleItem("apple_juice",          food(2, 0.3f));
    public static final DeferredItem<Item> APPLE_CIDER          = ITEMS.registerSimpleItem("apple_cider",          food(3, 0.4f));
    public static final DeferredItem<Item> HOT_CHOCOLATE_BOTTLE = ITEMS.registerSimpleItem("hot_chocolate_bottle", food(4, 0.5f));

    // -------------------------------------------------------------------------
    // UTILITY ITEMS
    // Non-food items that appear as duplicates across mods. Registered as
    // plain items for tag unification purposes.
    // -------------------------------------------------------------------------

    public static final DeferredItem<Item> ROPE         = ITEMS.registerSimpleItem("rope",         item());
    public static final DeferredItem<Item> MUG          = ITEMS.registerSimpleItem("mug",          item());
    public static final DeferredItem<Item> DOG_FOOD     = ITEMS.registerSimpleItem("dog_food",     item());
    public static final DeferredItem<Item> GINGER_CRATE = ITEMS.registerSimpleItem("ginger_crate", item());

    // -------------------------------------------------------------------------
    // RELIC ITEMS
		// Intentionally left blank for Ben to implement Endless Water Bottle
    // -------------------------------------------------------------------------
}
