import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EvenMoreList {

    public static void main(String[] args) {
        EvenMoreList evenMoreList = new EvenMoreList();
        List<String> a = new ArrayList<String>(Arrays.asList(new String[]{"x", "y", "z"}));
        List<String> b = new ArrayList<String>(Arrays.asList(new String[]{"p", "q", "r", "s"}));
        
        
        evenMoreList.interleaved(a, b);
        evenMoreList.removeEverySecond(a, b);
        a.removeAll(b);

        System.out.println(a);
        System.out.println(b);
    }

    public void removeEverySecond(List a, List b) {
        Iterator i = b.iterator();

        while (i.hasNext()) {
            i.next();
            if (i.hasNext()) {
                i.next();
                i.remove();
            }
        }
    }

    public void interleaved(List a, List b) {
        ListIterator ia = a.listIterator();
        Iterator ib = b.iterator();

        while(ib.hasNext()) {
            Object itemB = ib.next();

            if (ia.hasNext()) {
                ia.next();
            }
            ia.add(itemB);
        }
    }
}