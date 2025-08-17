// Q5: Sorting Strings in Descending Order using Lambda

import java.util.*;

public class StringSortRunner {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Apple");
        names.add("Banana");
        names.add("Mango");
        names.add("Orange");

        // Sort in descending order using lambda
        names.sort((a, b) -> b.compareTo(a));

        System.out.println("Strings in Descending Order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

