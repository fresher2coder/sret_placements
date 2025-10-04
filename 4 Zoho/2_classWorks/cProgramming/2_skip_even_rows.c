// skip_even_rows.c
#include <stdio.h>

int main() {
    for (int row = 1; row <= 5; row++) {
        if (row % 2 == 0)
            continue; // Skip even-numbered rows

        for (int col = 1; col <= 5; col++) {
            printf("* ");
        }
        printf("\n");
    }
    return 0;
}
