package com.example;

/**
 * Created by Oleg on 5/28/2016.
 */

enum ItemType { POTION, RING, ARMOR }
public class InventoryItem {

    // declared variables
    private ItemType type;
    private String name;

    // object constructor
    public InventoryItem(ItemType type, String name) {

        this.name = name;
        this.type = type;
    }

    // getters and setters
    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
