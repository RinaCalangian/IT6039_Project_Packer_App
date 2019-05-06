/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import packer.Address;
import packer.Box;
import packer.Coordinates;
import packer.Customer;
import packer.Depot;
import packer.Manifest;
import packer.Product;

/**
 *
 * @author rinac
 * @version 1.0
 */
public class PackerTest {
    
    
    // Test Data
    Address depotAddress = new Address("23 Good Luck St", "Blue View", 
                "Sandy Shores", "H337", new Coordinates(138, 995));
        Depot depot = new Depot("Main Depot", depotAddress);
        
        
        Address customerAddress1 = new Address("67 Torch Rd", 
                "Treeline", "Mt High", "T799", new Coordinates(1102, 87));
        Address customerAddress2 = new Address("88 Camp Mine St", 
                "Ridgeway", "Lowe Valley", "I998", new Coordinates(100, 34));
        Customer customer = new Customer("Andy Bravo", customerAddress1);
        
        // Test data
        Product hammer = new Product("Hammer", 3, false, false);
        Product nails = new Product("Nails", 1, false, false);
        Product ladder = new Product("Ladder", 15, false, false);
        Product saw = new Product("Saw", 5, false, false);
        Product lightBulbs = new Product("Light Bulbs", 1, false, true);
        Product weedKiller = new Product("Weedkiller", 2, true, false);
        
        

        Manifest manifest = new Manifest();
        //manifest.addProduct(hammer,1);
        
    
    public PackerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Testing Packer class...");
    }
   

    /**
     * Test of packProducts method, of class Packer.
     */
    @Test
    public void testPackProducts() {
        System.out.println("packProducts");
        Customer c = null;
        Depot d = null;
        Manifest m = null;
        List<Box> expResult = null;
        List<Box> result = Packer.packProducts(c, d, m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
