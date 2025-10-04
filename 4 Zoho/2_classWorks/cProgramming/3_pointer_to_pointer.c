// pointer_to_pointer.c
#include <stdio.h>

int main() {
    int x = 100;
    int *p = &x;
    int **pp = &p;

    printf("Value of x     : %d\n", x);
    printf("Value via *p   : %d\n", *p);
    printf("Value via **pp : %d\n", **pp);

    return 0;
}
