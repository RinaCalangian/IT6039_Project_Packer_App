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
public class Box {
    
    
    private Manifest contents;
    private Customer customer;
    private Depot depot; 

    public Box(Customer customer, Depot depot) {
        this.customer = customer;
        this.depot = depot;
        contents = new Manifest();
    }
    
    public void addProduct(Product product) {
        if (canFit(product)) {
            contents.addProduct(product, 1);
        }
    }
     
    public void addProduct(Product product, int quantity) {
        if (canFit(product,quantity)); {
            contents.addProduct(product, quantity);
        }
    }
   
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
    
    // added Override annotation 
    @Override
    public String toString() {
        return getLabel();
    }
    
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
     * @param p: an instantiation of the class Product
     * @return: returns product weight multiplied by 1(default quantity)
     *          => is the result lesser than maximum weight capacity?
     */
    public boolean canFit(Product p) {
        //return p.getWeight() < 40;
        return p.getWeight() < 20;
    }
    
    /**
     * 
     * @param p: an instantiation of the class Product
     * @param quantity: entered quantity of a product
     * @return: returns product weight multiplied by entered quantity
     *          => is the result lesser than maximum weight capacity?
     */
    public boolean canFit(Product p, int quantity) {
        //return (p.getWeight() * quantity) < 40;
        return (p.getWeight() * quantity) < 20;
    }
    
    /**
     * 
     * @return: returns the computed value of subtracting the current total
     *      weight stored (as processed by a method in the class Manifest)
     *      from the set maximum weight capacity (20kg)
     */
    public double remainingCapacity() {
        //return 40 - this.getWeight();
        return 20 - this.getWeight();
    }
    
    /**
     * 
     * @return: returns value true or false if product is hazardous
     *      (as processed by a method in the class Manifest)
     */
    public boolean isFragile() {
        return contents.hasFragileItems();
    }
    
    /**
     * 
     * @return: returns value true or false if product is fragile
     *      (as processed by a method in the class Manifest) 
     */
    public boolean isHazardous() {
        // return value should be the actual entered boolean value 
        //return false;
        return contents.hasHazardousItems();
    }
}
