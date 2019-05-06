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


/**
 *
 * @author bunta
 * @version 1.1
 * 
 */
public class CoordinatesTest {
    
    // If distances are in km, then results can be off by up to 1m
    public static final double ACCEPTABLE_DELTA = 0.001; 
    
    // Test data
    Coordinates testCoordinates1 = new Coordinates(0,0);
    Coordinates testCoordinates2 = new Coordinates(30,40);
    Coordinates testCoordinates3 = new Coordinates(1000, 2000);
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Testing Coordinates class...");
    }
    
    /**
     * Test of getX method, of class Coordinates.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        assertEquals(0.0,testCoordinates1.getX(),ACCEPTABLE_DELTA);
        assertEquals(30.00,testCoordinates2.getX(),ACCEPTABLE_DELTA);
        assertEquals(1000.0,testCoordinates3.getX(),ACCEPTABLE_DELTA);
    }

    /**
     * Test of getY method, of class Coordinates.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        assertEquals(0.0,testCoordinates1.getY(),ACCEPTABLE_DELTA);
        assertEquals(40.0,testCoordinates2.getY(),ACCEPTABLE_DELTA);
        assertEquals(2000.0,testCoordinates3.getY(),ACCEPTABLE_DELTA);
    }
    
    /**
     * Test of companyDistanceTo method, of class Coordinates.
     */
    @Test
    public void testCompanyDistanceTo() {
        System.out.println("companyDistanceTo");
        assertEquals(61.0, testCoordinates1.companyDistanceTo(testCoordinates2), 
                ACCEPTABLE_DELTA);
        System.out.println("TestCompanyDistance:" 
                + testCoordinates1.companyDistanceTo(testCoordinates2));
        assertEquals(2619.0340, testCoordinates1.companyDistanceTo(testCoordinates3), 
                ACCEPTABLE_DELTA);
        System.out.println("TestCompanyDistance:" 
                + testCoordinates1.companyDistanceTo(testCoordinates3));
        assertEquals(2559.4464, testCoordinates2.companyDistanceTo(testCoordinates3), 
                ACCEPTABLE_DELTA);
        System.out.println("TestCompanyDistance:" 
                + testCoordinates2.companyDistanceTo(testCoordinates3));
    }
}