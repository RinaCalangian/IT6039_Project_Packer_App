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
 * 
 */
public class Address {
    private String street;
    private String suburb;
    private String city;
    private String postcode;
    private Coordinates coordinates;

    /**
     * Constructs and initializes an Address components and object Coordinates
     * @param street street and number (example: "123 Sunshine St")
     * @param suburb suburb (example: "Suburb 1")
     * @param city city (example: "Wellington")
     * @param postcode postcode (example: "5000")
     * @param coordinates x and y coordinates
     */
    public Address(String street, String suburb, String city, 
            String postcode, Coordinates coordinates) {
        this.street = street;
        this.suburb = suburb;
        this.city = city;
        this.postcode = postcode;
        this.coordinates = coordinates;
    }

     /**
      * Generates string representation of an object of class Address
      * @return return the string
      * The parameters will be used for box labeling
      */    
     
    // added Override annotation 
    @Override
    public String toString() {
        return 
                street + "\n" +
                suburb + "\n" +
                city + "\n" +
                postcode;
    }
    /**
     * @return the coordinates
     * The Address coordinates (x, y) will be used to evaluate its distance
     from another coordinates (e.g depot address coordinates)  
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }
}
