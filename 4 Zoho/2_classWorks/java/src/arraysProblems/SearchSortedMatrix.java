package arraysProblems;

public class SearchSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {15, 25, 35},
            {27, 29, 37}
        };

        int target = 25;
        int i = 0, j = matrix[0].length - 1;

        boolean found = false;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                System.out.println("Found at: (" + i + ", " + j + ")");
                found = true;
                break;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }

        if (!found)
            System.out.println("Element not found.");
    }
}

