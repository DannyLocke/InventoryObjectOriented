package com.ironyard;

/**
 * Created by dlocke on 11/22/16.
 */
public class Frozen extends InventoryItem {

    public Frozen(String name, int quantity){
        this.name = name;
        this.category = "Frozen";
        this.quantity = quantity;

    }
}
