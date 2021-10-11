public class LearnEnumerations {

    public enum Color {RED, GREEN, BLUE};

    public static void main(String[] args) {
        Color c1 = Color.RED;
        Color c2 = Color.GREEN;

        Color c3 = Color.RED;

        // System.out.println(c1 == c2);
        // System.out.println(c1 == c3);

        for(Color s : Color.values()) {
            // System.out.println(s);
            System.out.println(s.toString() + " " + s.ordinal()); 
        }

        // String illegalArgument = "HAHA";
        // Color illegalC = Color.valueOf(illegalArgument);

        // String colorText = "RED";
        // Color newC = Color.valueOf(colorText);
        // System.out.println(newC);
    }
    
}
