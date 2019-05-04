/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

/*import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;*/

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import packer.Address;
import packer.Coordinates;
import static packer.CoordinatesTest.ACCEPTABLE_DELTA;
import packer.Customer;
import packer.Depot;

/**
 *
 * @author bunta
 * @version 1.1
 */
public class CustomerTest {

    // Test data orig
    /*Coordinates testCoordinates0 = new Coordinates(0,0);
    Coordinates testCoordinates1 = new Coordinates(3,4);
    Coordinates testCoordinates2 = new Coordinates(30,40);
    Coordinates testCoordinates3 = new Coordinates(300, 400);
    Coordinates testCoordinates4 = new Coordinates(3000, 4000);*/
    
    //Test data v1.1
    Coordinates testCoordinates0 = new Coordinates(0,0);
    Coordinates testCoordinates1 = new Coordinates(300,400);
    Coordinates testCoordinates2 = new Coordinates(30,40);
    Coordinates testCoordinates3 = new Coordinates(3, 4);
    Coordinates testCoordinates4 = new Coordinates(3000, 4000);
    
    Address testAddress0 = new Address("111 Emerge Rd", 
            "Really", "Inn Town", "D444", testCoordinates0);
    Address testAddress1 = new Address("1 First St", 
            "Aplace", "Citadel City", "A111", testCoordinates1);
    Address testAddress2 = new Address("123 Count St", 
            "Brooklyn", "Welling Town", "B222", testCoordinates2);
    Address testAddress3 = new Address("321 Back St", 
            "Christly", "Holly Oaks", "C333", testCoordinates3);
    Address testAddress4 = new Address("55 Some St", 
            "Somewhere", "Elsewhere", "E555", testCoordinates4);
    
    Depot testDepot0 = new Depot("Test Depot", testAddress0);
    Depot testDepot4 = new Depot("Test Depot", testAddress4);
        
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Testing Customer class...");
    }

    /**
     * Test of getClosestAddressTo method, of class Customer.
     * returns the best customer address (with the shortest distance) from the
     * given depot address 
     */
    @Test
    public void testGetClosestAddressTo() {
        // Maybe this should be broken int three tests.
        System.out.println("getClosestAddressTo");
        Customer testCustomer;
        
        
        // Has changed the test code of testing best address to show the actual 
        // result being returned (v1.1 - roc - 04.05.2019)
         
         
        // TEST 1 v1.1- to verify address 3 is the best address with reference to depot0
        // Initial address assignment
        testCustomer = new Customer("Test Customer", testAddress3);
        
        assertEquals(testAddress3, testCustomer.getClosestAddressTo(testDepot0));
        
        // Added new address
        testCustomer.addAddress(testAddress2);
        assertEquals(testAddress2, testCustomer.getClosestAddressTo(testDepot0));
       
        // added test to TEST 1 for showing the bestAddress value
        System.out.println("Address2 CompanyDistanceTo from Depot0: " 
                + testCoordinates2.companyDistanceTo(testCoordinates0));
        System.out.println("Address3 CompanyDistanceTo from Depot0: " 
                + testCoordinates3.companyDistanceTo(testCoordinates0));
        System.out.println("bestAddress is: " + testCustomer.bestAddress + testCustomer);
        assertEquals(testAddress3,testCustomer.bestAddress);
        
        /*
        // TEST 2 v1.1 - to verify address 2 is the best address with reference to depot0
        // Initial address assignment
        testCustomer = new Customer("Test Customer", testAddress2);
        assertEquals(testAddress2, testCustomer.getClosestAddressTo(testDepot0));
        
        // Added new address
        testCustomer.addAddress(testAddress1);
        assertEquals(testAddress1, testCustomer.getClosestAddressTo(testDepot0));
        
        // added test to TEST 2 for showing the bestAddress value
        System.out.println("Address1 CompanyDistanceTo from Depot0: " 
                + testCoordinates1.companyDistanceTo(testCoordinates0));
        System.out.println("Address2 CompanyDistanceTo from Depot0: " 
                + testCoordinates2.companyDistanceTo(testCoordinates0));
        System.out.println("bestAddress is: " + testCustomer.bestAddress + testCustomer);
        assertEquals(testAddress2,testCustomer.bestAddress);
        */
        
        /*
        // TEST 3 v1.1 - to verify address 1 is the best address with reference to depot4
        // Initial address
        testCustomer = new Customer("Test Customer", testAddress1);
        assertEquals(testAddress1, testCustomer.getClosestAddressTo(testDepot4));
        
        // Added new address
        testCustomer.addAddress(testAddress2);
        assertEquals(testAddress2, testCustomer.getClosestAddressTo(testDepot4));
        
        // added test to TEST 3 for showing the bestAddress value
        System.out.println("Address1 CompanyDistanceTo from Depot4: " 
                + testCoordinates1.companyDistanceTo(testCoordinates4));
        System.out.println("Address2 CompanyDistanceTo from Depot4: " 
                + testCoordinates2.companyDistanceTo(testCoordinates4));
        System.out.println("bestAddress is: " + testCustomer.bestAddress + testCustomer);
        assertEquals(testAddress1,testCustomer.bestAddress);
        */
                
        /*
        // TEST 4 v1.1 - to verify address 2 is the best address with reference to depot4
        // Initial address
        testCustomer = new Customer("Test Customer", testAddress2);
        assertEquals(testAddress2, testCustomer.getClosestAddressTo(testDepot4));
        
        // Added new address
        testCustomer.addAddress(testAddress3);
        assertEquals(testAddress3, testCustomer.getClosestAddressTo(testDepot4));
        
        // added test to TEST 4 for showing the bestAddress value
        System.out.println("Address2 CompanyDistanceTo from Depot4: " 
                + testCoordinates2.companyDistanceTo(testCoordinates4));
        System.out.println("Address3 CompanyDistanceTo from Depot4: " 
                + testCoordinates3.companyDistanceTo(testCoordinates4));
        System.out.println("bestAddress is: " + testCustomer.bestAddress + testCustomer);
        assertEquals(testAddress2,testCustomer.bestAddress);
        */
    }
    
    // created additional test
    /**
     * Test of toString method, of class Customer.
     */
   
    @Test
    public void testToString() {
        System.out.println("toString");
        Customer testCustomer;
        testCustomer = new Customer("Test Customer", testAddress1);
        assertEquals("Test Customer", testCustomer.toString());
        System.out.println(testCustomer.toString());
   }
}