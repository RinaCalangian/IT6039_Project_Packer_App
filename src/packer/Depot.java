/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

/**
 *
 * @author I.M.Bad
 */
public class Depot {
    private String name;
    private Address address;

    public Depot(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    
    public String getName() {
        //return address.toString(); => should be name.toString()
        return name.toString();
    }
    
    public Coordinates getCoordinates() {
        return this.address.getCoordinates();
    }

// added Override annotation 
    @Override    
    public String toString() {
        return this.getName();
    }
}

