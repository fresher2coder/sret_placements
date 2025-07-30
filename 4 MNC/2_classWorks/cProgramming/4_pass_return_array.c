// pass_return_array.c
#include <stdio.h>
#include <stdlib.h>

int* squareArray(int arr[], int n) {
    int *squares = (int*)malloc(n * sizeof(int));
    for (int i = 0; i < n; i++) {
        squares[i] = arr[i] * arr[i];
    }
    return squares;
}

int main() {
    int arr[] = {1, 2, 3, 4};
    int n = sizeof(arr) / sizeof(arr[0]);

    int *res = squareArray(arr, n);

    printf("Squared values: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", res[i]);
    }

    free(res);
    return 0;
}
