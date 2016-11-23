package com.ironyard;

/**
 * Created by dlocke on 11/22/16.
 */
public class Deli extends InventoryItem {

    public Deli(String name, int quantity){
        this.name = name;
        this.category = "Deli";
        this.quantity = quantity;
   }
}
