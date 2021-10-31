/*
 * HashSetTest.java
 *
 * Example class that demonstrates used of HashSet Collection.
 */

import java.util.*;
import java.io.*;

public class HashSetTest {
    public static void main(String args[]) {

        // here we declare people to be the most general type,
        // which makes it possible to swap HashSet for TreeSet
        Set<Person> people = new HashSet<Person>();
        // c
        people = new TreeSet<>();
        people = new TreeSet<>(new AgeComparator1());
        // e
        // people = new TreeSet<>(new )
        StringTokenizer st;
        String firstname, surname, line;
        int age;

        // read data from file
        // (note) The try/catch construction catches an exception,
        // ie. error, if the file is not found
        try {
            Scanner file = new Scanner(new File("person.txt"));

            // assume the 1st line of the file specifies #records
            int numData = file.nextInt();

            // read in each line, and split into tokens
            for (int i = 0; i < numData; i++) {
                line = file.next();
                st = new StringTokenizer(line, "|");
                firstname = st.nextToken();
                surname = st.nextToken();
                // if (!(surname.equals("James") || surname.equals("Cole"))) {
                //     continue;
                // }
                age = Integer.parseInt(st.nextToken());
                people.add(new Person(firstname, surname, age));
            }
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        // My code here:
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getSurname().equals("Wright-Phillips")) {
                // iterator.remove();
            }
        }

        // iterate through HashSet
        System.out.println("** People in the list:");
        Iterator<Person> i = people.iterator();
        while (i.hasNext()) {
            Person p = i.next();
            System.out.println(p + ", hash code: " + p.hashCode());
        }

        // Person class comparator to compare the first person with the rest
        System.out.println();
        System.out.println("** Using Person class comparator:");
        Person firstPerson = people.iterator().next();
        for (Person p : people) {
            System.out.println(firstPerson + " compared to " + p + " returns " + firstPerson.compareTo(p));
        }

        // AgeComparator to compare the first person with the rest
        System.out.println();
        System.out.println("** Using AgeComparator:");
        Comparator<Person> comparator = new AgeComparator();
        firstPerson = people.iterator().next();
        for (Person p : people) {
            System.out.println(firstPerson + " compared to " + p + " returns " + comparator.compare(firstPerson, p));
        }
    }
}
