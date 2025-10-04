// dangling_pointer.c
#include <stdio.h>
#include <stdlib.h>

int main() {
    int *ptr = (int*) malloc(sizeof(int));
    *ptr = 42;

    printf("Value before free: %d\n", *ptr);

    free(ptr);

    // Dangerous: ptr is dangling now!
    printf("Value after free (undefined behavior!): %d\n", *ptr); // Unsafe
    ptr = NULL;

    return 0;
}
