/**
 * Basket.java
 *
 * Part of lab class for COM6516 Written by Mark Stevenson
 * mark.stevenson@sheffield.ac.uk Based on code written by Steve Maddock Last
 * modified 19 September 2014
 *
 */

public class Basket {

    /**
     * Basket constructor
     * @param it an array that store items
     */
    public Basket(Item[] it) {
        items = it;
    }

    /**
     * Calculate the total price for the items array
     * @return double: the total price
     */
    public double total() {
        double tot = 0.0;
        for (int i = 0; i < items.length; i++) {
            tot += items[i].getPrice();
        }
        return tot;
    }

    // instance field
    // functions like a trolley
    private Item[] items;
}
