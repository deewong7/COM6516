import sheffield.EasyReader;

public class TestFoodStore2 {
    public static void main(String[] args) {
        EasyReader easyReader = new EasyReader();
        FoodStore foodStore = new FoodStore(100);

        int refused = 0;
        int withdraw = 0, withdrawAmount = 0;
        int deposit = 0, depositAmount = 0;

        System.out.println("Loop number:");
        int times = easyReader.readInt();

        while (times > 0) {
            times--;
            System.out.print("Please enter a number to deposit or withdraw - ");
            int amount = easyReader.readInt();
            if (amount >= 0) {
                System.out.println("You are depositing " + amount + " amount of food.");
                foodStore.depositFood(amount);
                deposit ++;
                depositAmount += amount;
            } else {
                amount = Math.abs(amount);
                if (amount > foodStore.getAmountStored()) {
                    refused ++;
                    System.out.println("Action refused because of the insufficient amount of food.");
                    continue;
                }
                System.out.println("You are withdrawing " + amount + " amount of food.");
                foodStore.withdrawFood(amount);
                withdraw ++;
                withdrawAmount += amount;
            }
            System.out.println("There is(are) " + foodStore.getAmountStored() + " amount of food left.");
        }

        System.out.println("");
        System.out.println("Total withdraw: " + withdraw);
        System.out.println("Total amount of withdraw: " + withdrawAmount);
        System.out.println("Total deposit: " + deposit);
        System.out.println("Total amount of deposit: " + depositAmount);
        System.out.println("Total refused: " + refused);

        easyReader.close();
    }
}
