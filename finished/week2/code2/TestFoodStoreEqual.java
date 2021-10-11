public class TestFoodStoreEqual {
    public static void main(String[] args) {
        FoodStore foodStore1 = new FoodStore(100);
        FoodStore foodStore2 = new FoodStore(100);
        // foodStore2 = foodStore1;

        System.out.println(foodStore1 == foodStore2);
        System.out.println(foodStore1.equals(foodStore2));

    }
}
