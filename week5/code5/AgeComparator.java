import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    public int compare(Person a, Person b) {
    return b.getAge() - a.getAge();
    }
}

