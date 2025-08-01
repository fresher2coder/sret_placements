package arraysProblems;

public class RowWiseSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 4, 1},
            {7, 5, 6},
            {2, 9, 8}
        };

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }
    }
}

