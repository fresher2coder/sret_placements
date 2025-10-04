package arrayBasics;

import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        int[] marks = {56, 78, 90, 45, 66, 88, 92, 30};

        // 1. Print all marks
        System.out.println("All Marks:");
        Arrays.stream(marks)
              .forEach(System.out::println);

        // 2. Filter: Pass marks >= 50
        System.out.println("\nPassed Students:");
        Arrays.stream(marks)
              .filter(m -> m >= 50)
              .forEach(System.out::println);

        // 3. Map: Add 5 grace marks to all
        System.out.println("\nAfter Grace Marks:");
        Arrays.stream(marks)
              .map(m -> m + 5)
              .forEach(System.out::println);

        // 4. Sort the marks
        System.out.println("\nSorted Marks:");
        Arrays.stream(marks)
              .sorted()
              .forEach(System.out::println);

        // 5. Count number of distinctions (>= 75)
        long distinctionCount = Arrays.stream(marks)
                                      .filter(m -> m >= 75)
                                      .count();
        System.out.println("\nNumber of Distinctions: " + distinctionCount);

        // 6. Find minimum and maximum mark
        int min = Arrays.stream(marks).min().getAsInt();
        int max = Arrays.stream(marks).max().getAsInt();
        System.out.println("Min Mark: " + min);
        System.out.println("Max Mark: " + max);

        // 7. Reduce: Calculate total marks
        int total = Arrays.stream(marks)
                          .reduce(0, (a, b) -> a + b);
        System.out.println("Total Marks: " + total);
    }
}

