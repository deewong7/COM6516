import java.util.Comparator;
import java.util.HashMap;

public class WordComparator implements Comparator<String> {

    public static HashMap<String, int> word_count = new HashMap<>();

    @Override
    public int compare(String a, String b) {
        // System.out.println("Comparing!!!");
        int i = Character.toLowerCase(a.charAt(0)) - Character.toLowerCase(b.charAt(0));
        if (i == 0) {
            i = 1;
        }
        return i;
    }
}
