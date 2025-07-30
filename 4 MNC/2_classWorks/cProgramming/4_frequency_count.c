// frequency_count.c
#include <stdio.h>

void frequencyCount(int arr[], int n) {
    int freq[100] = {0};

    for (int i = 0; i < n; i++)
        freq[arr[i]]++;

    for (int i = 0; i < 100; i++) {
        if (freq[i] > 0)
            printf("Element %d -> %d times\n", i, freq[i]);
    }
}

int main() {
    int arr[] = {1, 2, 2, 3, 1, 4, 2};
    int n = sizeof(arr) / sizeof(arr[0]);

    frequencyCount(arr, n);
    return 0;
}
