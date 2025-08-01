package arrayBasics;

import java.util.*;
import java.util.stream.*;

public class ArraysClassExample {
    public static void main(String[] args) {
        // 1. toString() - Print 1D array
        int[] numbers = {5, 2, 9, 1};
        System.out.println("1D Array: " + Arrays.toString(numbers));

        // 2. deepToString() - Print 2D array
        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println("2D Array: " + Arrays.deepToString(matrix));

        // 3. sort() - Sort the array
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));

        // 4. binarySearch() - Search in sorted array
        int index = Arrays.binarySearch(numbers, 9);
        System.out.println("Index of 9: " + index);

        // 5. equals() - Compare 1D arrays
        int[] copy1 = {1, 2, 3};
        int[] copy2 = {1, 2, 3};
        System.out.println("Arrays equal? " + Arrays.equals(copy1, copy2));

        // 6. deepEquals() - Compare 2D arrays
        int[][] m1 = {{1, 2}, {3, 4}};
        int[][] m2 = {{1, 2}, {3, 4}};
        System.out.println("2D Arrays equal? " + Arrays.deepEquals(m1, m2));

        // 7. fill() - Fill an array with same value
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("Filled: " + Arrays.toString(filled));

        // 8. copyOf() - Resize an array
        int[] resized = Arrays.copyOf(copy1, 5);
        System.out.println("Resized: " + Arrays.toString(resized));  // [1, 2, 3, 0, 0]

        // 9. copyOfRange() - Copy part of array
        int[] range = Arrays.copyOfRange(numbers, 1, 3);
        System.out.println("Sub-array: " + Arrays.toString(range));

        // 10. asList() - Convert to fixed-size list
        String[] fruits = {"Apple", "Banana", "Cherry"};
        List<String> fruitList = Arrays.asList(fruits);
        System.out.println("List: " + fruitList);

        // 11. setAll() - Set values using index
        int[] squares = new int[5];
        Arrays.setAll(squares, i -> i * i);
        System.out.println("Squares: " + Arrays.toString(squares));  // [0, 1, 4, 9, 16]

        // 12. stream() - Stream operations
        int sum = Arrays.stream(squares).filter(n -> n > 4).sum();
        System.out.println("Sum of >4: " + sum);  // 9 + 16 = 25
    }
}

