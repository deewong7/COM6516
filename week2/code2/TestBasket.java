public class TestBasket {
    public static void main(String[] args) {
        Item[] trolley = {
            new Item("name1", 10),
            new Item("name2", 110)
        };
        Basket myBasket = new Basket(trolley);

        for (int i = 0; i < trolley.length; i++) {
            System.out.println(trolley[i]);
            System.out.println();
        }

        System.out.println("Your total price is " + myBasket.total());
    }
}
