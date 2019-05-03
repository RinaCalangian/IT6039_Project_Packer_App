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
 * @author bunta
 * @version 1.1
 */
public class Packer {
/**
 * 
 * @param c object of class Customer containing customer name and closest address
 * @param d object of class Depot containing depot name and address
 * @param m object of class Manifest containing list of products and quantities
 * @return returns collection of created boxes of packed products (could be one or more)
 */
    public static List<Box> packProducts(Customer c, Depot d, Manifest m) {
        List<Box> packedBoxes = new ArrayList<>();
        Box b = null;
        while (!m.isEmpty()) { // repeat until all items are packed
            if (b == null) {
                // commented-out code below as the arguments are wrongly placed
                //b = new Box(d,c);
                b = new Box(c, d);
            }
            Product prodToAdd = m.getHeaviestUnder(b.remainingCapacity());
            if (prodToAdd == null) {
                packedBoxes.add(b);
                b = null;
            }
            else {
                b.addProduct(prodToAdd);
                m.removeProduct(prodToAdd);
            }  
        }
        if (b != null) {
            packedBoxes.add(b);
            // removed the second call to method
            //packedBoxes.add(b);
        }
        return packedBoxes;
    }
    
}

