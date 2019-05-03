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
public class Depot {
    private String name;
    private Address address;

    public Depot(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    
    /**
     * 
     * @return: returns to string type the parameter name entered in the 
     * instantiation of this class 
     */
    public String getName() {
        //return address.toString(); => should be name.toString()
        return name.toString();
    }
    
    
    /**
     * 
     * @return: returns the corresponding coordinates entered in the 
     * instantiation of Address class
     */
    public Coordinates getCoordinates() {
        return this.address.getCoordinates();
    }

// added Override annotation 
    @Override    
    public String toString() {
        return this.getName();
    }
}

