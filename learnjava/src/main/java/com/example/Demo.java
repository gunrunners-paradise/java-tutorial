package com.example;

public class Demo {
    public static void main(String[] args) {
        /* Basic Variables

        String testMessage = "This is another test";
        String mySecondTest = " demo";

        System.out.println("This is a test!");
        System.out.println(testMessage + mySecondTest);

        int firstNumber = 55;
        int secondNumber = 5;

        int result = (firstNumber + secondNumber) * 5;
        System.out.println(result);

        double myValue = 12345.12345;
        double mySecondValue = 3.124135562462462146246;
        System.out.println(myValue + mySecondValue);

        // conditionals and more variables
        int lives = 3;
        boolean isGameOver = (lives < 1);
        System.out.println(isGameOver);
        if (isGameOver) {
            System.out.println("Game Over!");
        } else {
            System.out.println("You are still alive");
        }


        Player tim = new Player("Timothy", 5);
        //tim.setNameAndLevel("Timothy", 5);
        System.out.println(tim.getHandleName());
        System.out.println(tim.getLevel());
        System.out.println(tim.getWeapon().getName());

        Weapon myAxe = new Weapon("GoldShine Axe", 15, 50);
        tim.setWeapon(myAxe);
        System.out.println(tim.getWeapon().getName());
        InventoryItem redPotion = new InventoryItem(ItemType.POTION, "Red Potion");
        tim.addInventoryItem(redPotion);
        tim.addInventoryItem(new InventoryItem(ItemType.ARMOR, "+3 Bronze Ringmail"));
        tim.addInventoryItem(new InventoryItem(ItemType.RING, "Ring of Power"));

        boolean deleted = tim.dropInventoryItem(redPotion);
        System.out.println(deleted);

        ArrayList<InventoryItem> allItems = tim.getInventoryitems();
        for (InventoryItem item : allItems) {
            System.out.println(item.getName());
        }

        Enemy enemy = new Enemy(10, 3);
        System.out.println("Hitpoints: " + enemy.getHitPoints());
        System.out.println("Lives: " + enemy.getLives());

        Soldier soldier = new Soldier(25, 1);
        System.out.println("\nHitpoints: " + soldier.getHitPoints());
        System.out.println("Lives: " + soldier.getLives());
        soldier.takeDamage(8);

        SuperSoldier SuperSoldier = new SuperSoldier(25, 1);
        System.out.println("\nHitpoints: " + SuperSoldier.getHitPoints());
        System.out.println("Lives: " + SuperSoldier.getLives());
        SuperSoldier.takeDamage(8);
        */

        int[] elements = { 5, 100, 7, 12, -1, 8, 3 };
        int indexPos = 0;
        int total = 0;

        while(indexPos < elements.length) {

            System.out.println("Processing: " + indexPos + ", Value:" + elements[indexPos]);

            if(elements[indexPos] < 0) {
                System.out.println("Break");
                break;
            }

            if(elements[indexPos] > 99) {
                System.out.println("Continue");
                indexPos++;
                continue;
            }

            total += elements[indexPos];
            indexPos++;
        }

        System.out.println("Sum total: " + total);

    }
}
