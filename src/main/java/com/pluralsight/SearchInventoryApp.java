package com.pluralsight;
import java.util.ArrayList;

public class SearchInventoryApp {
    public static void main(String[] args) {
        Inventory storeInventory = new Inventory();

        ArrayList<Product> inventory = storeInventory.getInventory(); //gets what is stored in the inventory.

        //sout the inventory.
        System.out.println("");
        System.out.println("Store Inventory");
        System.out.println("------------------------------");

        for (Product product : inventory) { //for loop to go through each element
            System.out.println(product);
        }

        //sout
        System.out.println("------------------------------");
        System.out.println("Total products: " + inventory.size());
    }
}


