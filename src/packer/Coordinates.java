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
 */
public class Coordinates {

    private final double x;
    private final double y;

    /**
     * Constructs and initializes a Coordinates on position (x, y)
     * @param x x coordinate
     * @param y y coordinate
     */
    
    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    // NOTE: methods euclideanDistanceTo() and manhattanDistanceTo() were removed
    // due to code duplication
    
    /**
     * Computes the distance using the average of Euclidean Distance 
     * and Manhattan Distance to the customer.
     * @param other (x, y) coordinates of another address
     * @return the computed value that is added with 1km as a company requirement 
     */
    public double companyDistanceTo(Coordinates other) {
        // Computes the distance using Euclidean Distance formula
        double xDiff1 = other.getX() - this.getX(); 
        double yDiff1 = other.getY() - this.getY();
        double dist1 = Math.pow((xDiff1 * xDiff1 + yDiff1 * yDiff1), 0.5); 
        // Computes the distance using Manhattan Distance formula
        double xDiff2 = other.getX() - this.getX();
        double yDiff2 = other.getY() - this.getY();
        // Computes the distance using Company Distance formula
        double dist2 = Math.abs(xDiff2) + Math.abs(yDiff2); 
        return ((dist1 + dist2) / 2) + 1;
    }
   
}
