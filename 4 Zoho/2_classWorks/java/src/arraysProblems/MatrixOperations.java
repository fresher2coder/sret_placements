package arraysProblems;

public class MatrixOperations {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {5, 6},
            {7, 8}
        };

        int n = A.length;

        // Matrix Addition
        int[][] sum = new int[n][n];
        int[][] product = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Matrix Addition:");
        for (int[] row : sum) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }

        // Matrix Multiplication
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                product[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matrix Product:");
        for (int[] row : product) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}

