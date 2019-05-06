/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author I.M.Bad
 * @version 1.1
 */
public class Customer {
    
    private String name;
    private List<Address> addresses;
    
    /**
     * Constructs and initializes a Customer name and an object Address
     * @param name name of the customer
     * @param address address of the customer and its coordinates
     */
    public Customer(String name, Address address) {
        addresses = new ArrayList<>();
        this.name = name;
        this.addresses.add(address);
    }
    
    public void addAddress(Address address) {
        this.addresses.add(address);
    }
    
    /**
     * 
     * @return returns to string type the parameter name entered in the 
     * instantiation of this class
     */
    public String getName() {
        return name;
    }

    /**
     * Calculates the distance between customer coordinates and depot coordinates.
     * It is expected that customer could have different addresses (having different coordinates)
     * It is expected that depot could have different address (having different coordinates)
     * The customer address with the least distance should be assigned as the best address  
     */
    // has changed bestAddress as global variable
    Address bestAddress = null;
    public Address getClosestAddressTo(Depot d) {
        double bestDistance = Double.MAX_VALUE;
        //Address bestAddress = null;
        for (Address a : addresses) {
            double distance = a.getCoordinates().companyDistanceTo(d.getCoordinates());
            if (distance < bestDistance) {
                bestAddress = a;
                /*System.out.println(a);
                System.out.println(a.getCoordinates());
                System.out.println(distance);
                System.out.println(bestAddress + "\n");*/
            }
            
        } 
        return bestAddress;
        
    }

    // added Override annotation 
    @Override
    public String toString() {
        return this.getName();
    }
}
