public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        Circle c1 = new Circle(3);

        // System.out.println(c);
        // System.out.println(c.toString());
        // System.out.println(c.getClass());
        System.out.println(c.equals(c1));
    }
}
