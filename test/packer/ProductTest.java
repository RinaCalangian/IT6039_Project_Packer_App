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

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author bunta
 * @version 1.1
 */
public class ProductTest {
    
    // Test data
    Product a1 = new Product("Alpha", 0, true, true);
    Product a2 = new Product("Alpha", 2, true, true);
    Product a3 = new Product("Alpha", 3, false, true);
    Product a4 = new Product("Alpha", 4, true, false);
    
    Product b1 = new Product("Beta", 0, true, true);
    Product b2 = new Product("Beta", 2, true, true);
    Product b3 = new Product("Beta", 3, false, true);
    Product b4 = new Product("Beta", 4, true, false);
        
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Testing Product class...");
    }

    /**
    * Test of Equals method, of class Product.
    */
    @Test
    public void testEquals() {
        assertEquals(true, a1.equals(a1));
        assertEquals(true, a2.equals(a1));
        //assertEquals(true, a3.equals(a1));
        //assertEquals(true, a4.equals(a1));

        assertEquals(false, b1.equals(a1));
        //assertEquals(true, b1.equals(a1));
        //assertEquals(false, b2.equals(a1));
        //assertEquals(false, b3.equals(a1));
        //assertEquals(false, b4.equals(a1));
        
        //assertEquals(false, b2.equals(a2));
        //assertEquals(false, b3.equals(a3));
        //assertEquals(false, b4.equals(a4)); 
    }
    
    /**
     * Test of GetWeight method, of class Product.
     */
    @Test
    public void testGetWeight() {
        assertEquals(2, a2.getWeight());
        //assertEquals(3, a3.getWeight());
        //assertEquals(4, a4.getWeight());
    }

    /**
     * Test of isHazardous method, of class Product.
     */
    @Test
    public void testIsHazardous() {
        //assertEquals(true,a1.isHazardous());
        assertEquals(false,a3.isHazardous());
    }

    /**
     * Test of isFragile method, of class Product.
     */
    @Test
    public void testIsFragile() {
        //assertEquals(true,a1.isFragile());
        assertEquals(true,a2.isFragile());
        //assertEquals(false,a4.isFragile());
    }

}
