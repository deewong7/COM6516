import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class AnimalNames {
    public static void main(String[] args) {
        // Arrays.asList returns a fixed-size list, so cannot use remove and add methods
        // you cannot use its iterator
        List<String> animals = Arrays.asList("elephant", "leopard", "lion", "tiger");
        List<String> myList = new LinkedList(animals);
        System.out.println(myList);
        ListIterator<String> listIterator = myList.listIterator();

        while(listIterator.hasNext()) {
            String item = listIterator.next();
            item = item.toUpperCase();
            listIterator.remove();
            listIterator.add(item);
        }

        System.out.println(myList);
    }
}