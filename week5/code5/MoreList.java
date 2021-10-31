import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoreList {

    public static ArrayList<String> eitherNotBoth(List<String> a, List<String> b) {
        HashSet<String> set = new HashSet(a);
        set.addAll(b);

        return (new ArrayList<String>(set));
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<String>(Arrays.asList(new String[]{"a", "b", "c"}));
        List<String> b = new ArrayList<String>(Arrays.asList(new String[]{"d", "b", "f"}));

        ArrayList<String> list = eitherNotBoth(a, b);
        for (String item : list) {
            System.out.println(item)
        }
    }
}
