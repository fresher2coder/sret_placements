// realloc_resize.c
#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr, n = 3, i;
    arr = (int*) malloc(n * sizeof(int));
    for (i = 0; i < n; i++) arr[i] = i + 1;

    printf("Original array: ");
    for (i = 0; i < n; i++) printf("%d ", arr[i]);

    // Resize to 5
    arr = (int*) realloc(arr, 5 * sizeof(int));
    arr[3] = 4;
    arr[4] = 5;

    printf("\nResized array: ");
    for (i = 0; i < 5; i++) printf("%d ", arr[i]);

    free(arr);
    return 0;
}
