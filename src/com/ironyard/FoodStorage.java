package com.ironyard;

/**
 * Created by dlocke on 11/22/16.
 */
public class FoodStorage extends InventoryItem {

    public FoodStorage(String name, int quantity){
        this.name = name;
        this.category = "FoodStorage";
        this.quantity = quantity;

    }
}
