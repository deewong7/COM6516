// create FoodStore objects and calls their method
public class TestFoodStore {
    public static void main(String[] args) {
        FoodStore foodStore = new FoodStore(7);

        System.out.println(foodStore);

        foodStore.depositFood(10);
        System.out.println(foodStore);

        foodStore.withdrawFood(17);
        System.out.println(foodStore);

        foodStore.withdrawFood(17);
        System.out.println(foodStore);
        // can be negtive
    }
}
