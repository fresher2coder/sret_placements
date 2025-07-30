// second_largest_element.c
#include <stdio.h>

int secondLargest(int arr[], int n) {
    int first = -1e9, second = -1e9;

    for (int i = 0; i < n; i++) {
        if (arr[i] > first) {
            second = first;
            first = arr[i];
        } else if (arr[i] > second && arr[i] != first) {
            second = arr[i];
        }
    }

    return second;
}

int main() {
    int arr[] = {12, 35, 1, 10, 34, 1};
    int n = sizeof(arr) / sizeof(arr[0]);

    printf("Second largest: %d\n", secondLargest(arr, n));
    return 0;
}
