#include <stdio.h>

// 1. Right-angled triangle
void rightAngledTriangle(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            printf("* ");
        }
        printf("\n");
    }
}

// 2. Hollow square pattern
void hollowSquare(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if (i == 1 || i == n || j == 1 || j == n)
                printf("* ");
            else
                printf("  ");
        }
        printf("\n");
    }
}

// 3. Floyd’s triangle
void floydsTriangle(int n) {
    int num = 1;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            printf("%d ", num++);
        }
        printf("\n");
    }
}

// Helper function for Pascal's triangle
int factorial(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++)
        f *= i;
    return f;
}

int combination(int n, int r) {
    return factorial(n) / (factorial(r) * factorial(n - r));
}

// 4. Pascal’s triangle
void pascalsTriangle(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            printf("%d ", combination(i, j));
        }
        printf("\n");
    }
}

// 5. Diamond pattern
void diamondPattern(int n) {
    int space = n - 1;

    // Top half
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= space; j++) printf(" ");
        space--;
        for (int j = 1; j <= 2 * i - 1; j++) printf("*");
        printf("\n");
    }

    // Bottom half
    space = 1;
    for (int i = 1; i <= n - 1; i++) {
        for (int j = 1; j <= space; j++) printf(" ");
        space++;
        for (int j = 1; j <= 2 * (n - i) - 1; j++) printf("*");
        printf("\n");
    }
}

int main() {
    int n;

    printf("Enter number of rows: ");
    scanf("%d", &n);

    printf("\nRight-Angled Triangle:\n");
    rightAngledTriangle(n);

    printf("\nHollow Square:\n");
    hollowSquare(n);

    printf("\nFloyd's Triangle:\n");
    floydsTriangle(n);

    printf("\nPascal's Triangle:\n");
    pascalsTriangle(n);

    printf("\nDiamond Pattern:\n");
    diamondPattern(n);

    return 0;
}
