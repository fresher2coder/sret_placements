// merge_sorted_arrays.c
#include <stdio.h>

void mergeSorted(int a[], int n1, int b[], int n2, int result[]) {
    int i = 0, j = 0, k = 0;

    while (i < n1 && j < n2) {
        if (a[i] < b[j])
            result[k++] = a[i++];
        else
            result[k++] = b[j++];
    }

    while (i < n1) result[k++] = a[i++];
    while (j < n2) result[k++] = b[j++];
}

int main() {
    int a[] = {1, 3, 5};
    int b[] = {2, 4, 6, 8};
    int result[20];

    mergeSorted(a, 3, b, 4, result);

    printf("Merged Array: ");
    for (int i = 0; i < 7; i++) {
        printf("%d ", result[i]);
    }

    return 0;
}
