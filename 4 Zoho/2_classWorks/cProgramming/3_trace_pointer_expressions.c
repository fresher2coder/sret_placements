// trace_pointer_expressions.c
#include <stdio.h>

int main() {
    int a[] = {10, 20, 30, 40, 50};
    int *p = a;

    printf("p       = %p\n", p);
    printf("*p      = %d\n", *p);
    printf("*(p+2)  = %d\n", *(p + 2));
    printf("p[3]    = %d\n", p[3]);
    printf("*(++p)  = %d\n", *(++p));
    printf("*(p++)  = %d\n", *(p++));
    printf("*p      = %d\n", *p);

    return 0;
}
