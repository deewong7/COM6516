import java.util.Comparator;

public class AgeComparator1 implements Comparator<Person> {

    public static Map<String> uniqueWord = new HashMap<>();

    public int compare(Person a, Person b) {
        int i = b.getAge() - a.getAge();
        if (i == 0) {
            i = 1;
        }
        return i;
    }
}
