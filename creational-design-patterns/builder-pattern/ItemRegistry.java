package com.example;

public class ItemRegistry {

    public static void main(String[] args) {

        var item1 = new StoreItem.StoreItemBuilder("Pretzel", 2.0)
                .setShortDescription("A tasty snack")
                .setStockAvailable(7)
                .setLongDescription(null)
                .setPackagingType(null)
                .build();

        var item2 = new StoreItem.StoreItemBuilder("Soup", 1.5)
                .setShortDescription(null)
                .setStockAvailable(null)
                .setLongDescription("A meal that you can warm up at home. It can come in different flavours including tomato, chicken, and vegetable")
                .setPackagingType("Can")
                .build();

        addToItemRegistry(item1);
        addToItemRegistry(item2);
    }

    private static void addToItemRegistry(StoreItem storeItem) {
        System.out.println("A new item was added to the registry: \n" + storeItem);
    }

}
