package com.pluralsight;

import java.util.ArrayList;

public class Inventory {
    public ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        inventory.add(new Product(4567, "10' 2x4 (grade B)", 9.99));
        inventory.add(new Product(1234, "Hammer", 19.49));
        inventory.add(new Product(2345, "Box of nails", 9.29));
        inventory.add(new Product(3456, "Screwdriver", 7.99));
        inventory.add(new Product(5678, "Measuring tape", 12.49));

        return inventory;//return the inventory.
    }

}