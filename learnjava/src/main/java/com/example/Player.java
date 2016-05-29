package com.example;

import java.util.ArrayList;

/**
 * Created by Oleg on 5/15/2016.
 */
public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<InventoryItem> inventoryitems;

    public ArrayList<InventoryItem> getInventoryitems() {
        return inventoryitems;
    }

//    public void setInventoryitems(ArrayList<InventoryItem> inventoryitems) {
  //      this.inventoryitems = inventoryitems;
    //}

    public void addInventoryItem(InventoryItem InventoryItem) {
        inventoryitems.add(InventoryItem);
    }

    public boolean dropInventoryItem(InventoryItem InventoryItem) {

        if (this.inventoryitems.contains(InventoryItem)) {
            inventoryitems.remove(InventoryItem);
            return true;
        }

        return false;

    }

    public int getLives() {
        return lives;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Player() {
        this.handleName = "Unknown Player";
        this.lives = 3;
        this.level = 1;
        this.score = 0;
        setDefaultWeapon();
        inventoryitems = new ArrayList<InventoryItem>();
    }

    public Player(String handle) {
        this();
        setHandleName(handle);
    }

    public Player(String handle, int level) {
        this();
        setHandleName(handle);
        setLevel(level);
    }

    private void setDefaultWeapon() {
        this.weapon = new Weapon("Sword", 10, 20);

    }

    public String getHandleName() {
        return handleName;
    }

    public void setNameAndLevel(String name, int level) {
        setHandleName(name);
        setLevel(level);
    }

    public void setHandleName(String handle) {
        if (handle.length() < 4)
            return;

        handleName = handle;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
