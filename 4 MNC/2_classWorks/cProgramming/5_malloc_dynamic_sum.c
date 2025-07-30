// malloc_dynamic_sum.c
#include <stdio.h>
#include <stdlib.h>

int main() {
    int n, *arr, sum = 0;
    printf("Enter size: ");
    scanf("%d", &n);

    arr = (int*) malloc(n * sizeof(int));
    if (arr == NULL) {
        printf("Memory allocation failed.\n");
        return 1;
    }

    printf("Enter %d elements: ", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
        sum += arr[i];
    }

    printf("Sum = %d\n", sum);
    free(arr);
    return 0;
}
