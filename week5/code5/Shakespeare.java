/*
 * Shakespeare.java
 *
 * reads information from shakespeare.txt
 */

import java.util.*;
import java.io.*;

public class Shakespeare {
    public static void main(String args[]) {
        String line;
        String wd;
        StringTokenizer st;
        List<String> words = new LinkedList<String>();
        // Collections.sort(words, new WordComparator());

        // Apparently you should sort after the elements got inserted
        // Comparator<String> c = new WordComparator();
        // Collections.sort(words, c);

        // read data from file and split into tokens, ie. words
        // (The try/catch construction catches an exception, ie. error,
        // if the file is not found)
        try {
            Scanner file = new Scanner(new File("shakespeare.txt"));

            // read in each line, and split into tokens
            while (file.hasNext()) {
                line = file.next();
                st = new StringTokenizer(line, " .,:?'");

                // space, full stop, comma, etc are included as token
                // delimiters and are thus not tokens themselves
                while (st.hasMoreTokens()) {
                    wd = st.nextToken();
                    words.add(wd);
                }
            }
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        System.out.println("words: " + words);
        System.out.println();

        // words.sort(new WordComparator());
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        HashMap<String, Integer> uniqueWord = new HashMap<>();


        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            item = item.toLowerCase();
            try {
                int count = uniqueWord.get(item);
                uniqueWord.put(item, count + 1);
            } catch (NullPointerException e) {
                uniqueWord.put(item, 1);
            }
            // System.out.println(item);
        }

        // iterate through the word map
        Set<String> all_word = uniqueWord.keySet();
        for (String item : all_word) {
            System.out.format("%10s appeared: %d times.\n", item, uniqueWord.get(item));
        }
    }
}
