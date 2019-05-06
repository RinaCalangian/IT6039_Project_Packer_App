/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rinac
 * @version 1.0
 */
public class ManifestTest {
    
    public static final double ACCEPTABLE_DELTA = 0.001; 
    
    // Test data
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
    
    Customer customer1 = new Customer("Customer One", testAddress1);  
    
    Product hammer = new Product("Hammer", 3, false, false);
    Product nails = new Product("Nails", 1, true, false);
    Product ladder = new Product("Ladder", 15, false, false);
    
    Manifest manifest = new Manifest();
    
    @BeforeClass
    public static void setUpClass() {
    System.out.println("Testing Manifest class...");
    }
    
  

    /**
     * Test of addProduct method, of class Manifest.
     */
    @Test
    public void testAddProduct_Product() {
        System.out.println("addProduct");
        manifest.addProduct(hammer);
    }

    /**
     * Test of addProduct method, of class Manifest.
     */
    @Test
    public void testAddProduct_Product_int() {
        System.out.println("addProduct with quantity");
        manifest.addProduct(nails, 10);
    }

    /**
     * Test of hasFragileItems method, of class Manifest.
     */
    @Test
    public void testHasFragileItems() {
        System.out.println("hasFragileItems");
        assertEquals(false, hammer.isFragile());
    }

    /**
     * Test of hasHazardousItems method, of class Manifest.
     */
    @Test
    public void testHasHazardousItems() {
        System.out.println("hasHazardousItems");
        assertEquals(true, nails.isHazardous());
    }
    
    /**
     * Test of removeProduct method, of class Manifest.
     */
    /*@Test
    public void testRemoveProduct() {
        System.out.println("removeProduct");
        manifest.removeProduct(nails);
    }*/
    
    /**
     * Test of getTotalWeight method, of class Manifest.
     */
    /*
    @Test
    public void testGetTotalWeight() {
        System.out.println("getTotalWeight");
        Manifest instance = new Manifest();
        double expResult = 0.0;
        double result = instance.getTotalWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getHeaviestUnder method, of class Manifest.
     */
   /* @Test
    public void testGetHeaviestUnder() {
        System.out.println("getHeaviestUnder");
        double weight = 0.0;
        Manifest instance = new Manifest();
        Product expResult = null;
        Product result = instance.getHeaviestUnder(weight);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of isEmpty method, of class Manifest.
     */
    /*@Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Manifest instance = new Manifest();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of containsProduct method, of class Manifest.
     */
    /*@Test
    public void testContainsProduct() {
        System.out.println("containsProduct");
        Product p = null;
        Manifest instance = new Manifest();
        boolean expResult = false;
        boolean result = instance.containsProduct(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of toString method, of class Manifest.
     */
    /*@Test
    public void testToString() {
        System.out.println("toString");
        Manifest instance = new Manifest();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    
    
}
