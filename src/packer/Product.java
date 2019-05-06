/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

/**
 *
 * @author I.M.Bad
 * @version 1.1
 */
public class Product {

    private String name;
    private int weight;
    private boolean hazardous;
    private boolean fragile;

    /**
     * Constructs and initializes a Product name, weight, and its properties 
     * @param name name of the item (example: "Hammer")
     * @param weight weight of the item (example: 5)
     * @param hazardous hazardous enter true if it is, otherwise enter false 
     * @param fragile fragile enter true if it is, otherwise enter false
     */
    public Product(String name, int weight, boolean hazardous, boolean fragile) {
        this.name = name;
        this.weight = weight;
        this.hazardous = hazardous;
        this.fragile = fragile;
    }

    /**
     * @return return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @return return item name
     */
    public String getName() {
        return name;
    }

    /**
     * @return hazardous returns true if entered true, otherwise false
     */
    public boolean isHazardous() {
        // commented-out as the return value should not be forced to 'false'
        //return false;
        return hazardous;
    }

    /**
     * @return fragile returns true if entered true, otherwise false
     */
    public boolean isFragile() {
        return fragile;
    }

    // added Override annotation
    @Override 
    public String toString() {
        return this.getName();
    }
    
    /**
     * Compares the equality of string (item names) of objects of class Product. 
     * @param o o instance of class Product
     * @return returns the item name
     */
    // added Override annotation
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product)) {
            return false;
        }
        Product p = (Product)o;
        return p.getName().equals(this.getName());
    }

}
