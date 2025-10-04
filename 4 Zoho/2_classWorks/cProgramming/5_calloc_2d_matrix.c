// calloc_2d_matrix.c
#include <stdio.h>
#include <stdlib.h>

int main() {
    int rows = 2, cols = 3;
    int **matrix = (int**) calloc(rows, sizeof(int*));

    for (int i = 0; i < rows; i++)
        matrix[i] = (int*) calloc(cols, sizeof(int));

    printf("Matrix initialized with calloc:\n");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++)
            printf("%d ", matrix[i][j]);
        printf("\n");
    }

    for (int i = 0; i < rows; i++) free(matrix[i]);
    free(matrix);

    return 0;
}
