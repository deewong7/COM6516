/**
 * solution for part 1 of worksheet 3
 * @author Di Wang
 */

 import java.util.Random;

public class Multiplication {
    public static void main(String[] args) {
        String sep = "   ";
        System.out.print("  ");
        for (int i = 1; i <= 9; i++) {
            // System.out.print("\t" + i);
            System.out.print(sep + i);
        }
        System.out.println();
        for (int i = 0; i < 40; i ++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 1; i <= 9; i ++) {
            System.out.print(i + " |");
            for (int j = 1; j <= 9; j++) {
                System.out.format("% 3d ", i * j);
            }
            System.out.println();
        }
    }
}
