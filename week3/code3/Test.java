public class Test {
    public static void main(String[] args) {
        // int i = 10;
        // int j = 1;

        // System.out.format("The value is %d %d\n", i, j);

        recursion1(2);
        System.out.println(Math.PI);

    }

    static void recursion1(int i) {
        if (i == 0)
            return;
        else {
            System.out.println("Hello, " + i);
            recursion1(--i);
            System.out.println("Bye, " + i);
            return;
        }
    }

    static void testCircle() {
        System.out.println(Circle.PI);
        System.out.println(Math.round(Circle.radToDeg(Math.PI * 2)));
    }
}
