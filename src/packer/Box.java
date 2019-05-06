/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

/**
 *
 * @author I.M.Bad
 * @version  1.1
 */
public class Box {
    
    private Manifest contents;
    private Customer customer;
    private Depot depot; 

    /**
     * Constructs and initializes a Box containing variables of type Customer and Depot
     * @param customer customer object of class Customer
     * @param depot depot object of class Depot
     */ 
    public Box(Customer customer, Depot depot) {
        this.customer = customer;
        this.depot = depot;
        contents = new Manifest();
    }
    
    /**
     * Evaluates if the item weight is lesser than the max weight
     * @param product a variable of type Product
     */
    public void addProduct(Product product) {
        if (canFit(product)) {
            contents.addProduct(product, 1);
        }
    }
     
    /**
     * Evaluates if the item weight multiplied by quantity is lesser than the max weight
     * @param product a variable of type Product
     * @param quantity quantity of entered product
     */
    public void addProduct(Product product, int quantity) {
        if (canFit(product,quantity)); {
            contents.addProduct(product, quantity);
        }
    }
   
    /**
     * Generates label of the box containing customer name, best address and contents;
     * contents consist of objects of Product as collection on object of class Manifest. 
     * @return return the label in string form
     */
    public String getLabel() {
        StringBuilder label = new StringBuilder();
        label.append(customer);
        label.append("\n");
        label.append(customer.getClosestAddressTo(depot));
        label.append("\n");
        label.append(contents.toString());
        label.append("\n");
        if (this.isFragile()) {
            label.append("FRAGILE\n");
        }
        return label.toString();
    }
    
    /**
     * 
     * @return return label in string form
     */
    // added Override annotation 
    @Override
    public String toString() {
        return getLabel();
    }
    
    /**
     * Gets the total weight of the contents by calling a method in the class Manifest. 
     * @return return 
     */
    public double getWeight() {
        // commented-out line below as getWeight() is not a method in Manifest class
        //return contents.getWeight();
        return contents.getTotalWeight();
    }
    
    // commented out as this method is already defined in this class
    /*
    public void addProduct(Product product) {
        if (canFit(product)) {
            contents.addProduct(product, 1);
        }
    }*/
    
    /**
     * 
     * @param p p an object of the class Product
     * @return returns product weight multiplied by 1(default quantity)
     * Is the result lesser than maximum weight capacity?
     */
    public boolean canFit(Product p) {
        //return p.getWeight() < 40;
        return p.getWeight() < 2000;
    }
    
    /**
     * Evaluates if the total weight of an object of class Product 
     * is lesser than maximum weight capacity
     * @param p p an object of the class Product
     * @param quantity quantity is entered quantity of a product
     * @return return true if weight is lesser than maximum weight capacity;
     * otherwise return false
     * 
     */
    public boolean canFit(Product p, int quantity) {
        //return (p.getWeight() * quantity) < 40;
        return (p.getWeight() * quantity) < 2000;
    }
    
    /**
     * 
     * @return returns the computed value of subtracting the current total
     * weight stored (as processed by a method in the class Manifest)
     * from the set maximum weight capacity (20kg)
     */
    public double remainingCapacity() {
        //return 40 - this.getWeight();
        return 20 - this.getWeight();
    }
    
    /**
     * 
     * @return: returns value true or false if product is fragile
     * as processed by a method in the class Manifest
     */
    public boolean isFragile() {
        return contents.hasFragileItems();
    }
    
    /**
     * 
     * @return: returns value true or false if product is hazardous
     *      (as processed by a method in the class Manifest) 
     */
    public boolean isHazardous() {
        // return value should be the actual entered boolean value 
        //return false;
        return contents.hasHazardousItems();
    }
}
