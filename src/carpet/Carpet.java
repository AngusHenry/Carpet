/*
 * Angus Henry
 * Carpet.java
 * This programcalculates the cost of a carpet per square inch of a room
 * 27 Feb 2018
 */

package carpet;

/**
 *
 * @author anhen3335
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Length = 8.5;
        double width = 6;
        double area = 0;
        double cost = 19.95;
        double price = 0;
        area = Length * width;
        price = area * cost;
        System.out.println ("The cost of the Carpet is " + price + "$");
    }
    
   
}
