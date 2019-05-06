/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author I.M.Bad
 * @version 1.1
 */
public class Manifest {
    
    // This tracks the quantity of each product in the manifest
    private Map<Product, Integer> quantities;
    // This keeps a list of all products ordered by weight
    private Set<Product> byWeight;

    /**
     * Constructs and initializes a Manifest of list of objects of Product and  
     * its corresponding quantity and records a list of objects of Product
     * by weight.
     * 
     */
    public Manifest() {
        quantities = new HashMap<>();
        byWeight = new TreeSet<>(new ProductWeightComparator());
    }
    
    /**
     * Adds object of Product with quantity equals to 1 as default value
     * @param p p is a variable of type Product
     */
    public void addProduct(Product p) {
        addProduct(p,1);
    }
    
    /**
     * Adds object of Product with quantity equals to the entered value
     * @param p p is a variable of type Product (example: "hammer", 10, true, true)
     * @param quantity quantity is a variable of integer type (example: 2 or 100)
     */
    public void addProduct(Product p, int quantity) {
        if (quantities.containsKey(p)) {
            quantities.put(p,quantities.get(p)*quantity);
        }
        else {
            quantities.put(p,quantity);
            if(!byWeight.add(p)) {
                System.out.println("Couldn't add to Set");
            }
        }
    }
    
    /**
     * A method called by Packer class which removes an object of Product 
     * @param p p is a variable of type Product (example: "hammer", 10, true, true)
     */
    public void removeProduct(Product p) {
        if (quantities.containsKey(p) && quantities.get(p) > 0) {
            quantities.put(p,quantities.get(p)-1);
        }
        // has put 'else if' instead of just 'if' and changed the operator
        // if (quantities.get(p) == 0) {
        else if (quantities.get(p) > 0) {    
            quantities.remove(p);
        }
        // has put 'else if' instead of just 'if'
        else if (quantities.containsKey(p)) {
            byWeight.remove(p);
        }
    }
    
    /**
     * Firstly initializes weight to zero and then computes weight an 
     * object Product by multiplying its quantity to its weight by calling 
     * method getWeight in class Product.
     * @return return total weight of an object Product
     */
    public double getTotalWeight() {
        double weight = 0;
        for (Product p : quantities.keySet()) {
            weight = quantities.get(p) * p.getWeight();
        }
        return weight;
    }
    
    /**
     * Checks if the weight of an object Product is lesser or equal to the 
     * remaining box capacity 
     * @param weight remaining weight capacity 
     * @return return object p if weight is lesser or equal to the 
     * remaining capacity; otherwise return null 
     */
    public Product getHeaviestUnder(double weight) {
        for (Product p : byWeight) {
            if (p.getWeight() <= weight) {
                return p;
            }
        }
        return null;
    }
    
    public boolean isEmpty() {
        return byWeight.isEmpty();
    }
    
    
    /**
     * 
     * @param p p an object of class Product 
     * @return return true if an object of Product has value greater than 0  
     */
    public boolean containsProduct(Product p) {
        return quantities.containsKey(p) && quantities.get(p) > 0;
    }
    
    /** 
     * Generates string representation of an object of class Product which 
     * includes product name and its quantity.
     * @return returns the string representation of the object Product
     *  that includes the values of name and quantity from object Product 
     *      and object Manifest respectively    
     */
    // added Override annotation 
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Product p : quantities.keySet()) {
            result.append(p.getName());
            result.append(" x ");
            result.append(quantities.get(p));
            result.append("\n");
        }
        return result.substring(0, result.length()-1);
    }
    
    /**
     * Check if an object of class Product is hazardous or not.
     * @return return true if the value in parameter fragile 
     * in class Product is entered as true; otherwise return false
     */
    public boolean hasFragileItems() {
        for (Product p : quantities.keySet()) {
            if (p.isFragile()== true) {
                return true;
            }
        }
        return false;
    }
    
    // has added method hasHazardousItems()
    /**
     * Check if an object of class Product is fragile or not.
     * @return:  returns true if the value in parameter hazardous 
     * in class Product is entered as true; otherwise return false
     * 
     */
    public boolean hasHazardousItems() {
        for (Product p : quantities.keySet()) {
            if (p.isHazardous()== true) {
                return true;
            }
        }
        return false;
    }

// has added closing bracket below
}


