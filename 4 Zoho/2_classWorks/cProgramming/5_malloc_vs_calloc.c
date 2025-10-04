// malloc_vs_calloc.c
#include <stdio.h>
#include <stdlib.h>

int main() {
    int n = 5;
    int *m = (int*) malloc(n * sizeof(int));
    int *c = (int*) calloc(n, sizeof(int));

    printf("Malloc array: ");
    for (int i = 0; i < n; i++) printf("%d ", m[i]);  // May print garbage

    printf("\nCalloc array: ");
    for (int i = 0; i < n; i++) printf("%d ", c[i]);  // All 0

    free(m);
    free(c);
    return 0;
}
