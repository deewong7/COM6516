import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random(1);
        for (int i = 0; i < 10; i++) {
            // System.out.format("%.3f  ", random.nextDouble());
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.format("%d  ", random.nextInt(10));
        }
        System.out.println();
    }
}
