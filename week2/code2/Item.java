/**
 * Item.java
 *
 * Part of lab class for COM6516 Written by Mark Stevenson
 * mark.stevenson@sheffield.ac.uk Based on code written by Steve Maddock and
 * Richard Clayton
 *
 */

public class Item {

    /**
     * Constructor for class Item
     * @param n name of the item
     * @param p price of the item
     */
    public Item(String n, double p) {
        name = n;
        price = p;
    }

    /**
     * Field accessor
     * @return the private instance filed variable name
     */
    public String getName1() {
        return name;
    }

    /**
     * Field accessor
     * @return the private instance filed variable price
     */
    public double getPrice() {
        return price;
    }

    // using ukp to denote pounds sterling as unicode pound symbol
    // does not display properly in MS Command Window
    public String toString() {
        // return ("object type = " + getClass() + ";\n" + name + " = ukp" + price + "\n" + getClass().getName());
        return ("Instance name = " + this.getClass().getName());
    }

    // instance fields
    private final double price;
    private final String name;

    // main for test
    public static void main(String[] args) {
        String TESTNAME = "testObject";
        double TESTPRICE = 10.0;
        Item testObject = new Item(TESTNAME, TESTPRICE);
        System.out.println("Name:");
        System.out.println("Actual field " + testObject.getName1());
        System.out.println("Expected " + TESTNAME);
        System.out.println("Price:");
        System.out.println("Actual field " + testObject.getPrice());
        System.out.println("Expected " + TESTPRICE);
    }
}
