// break_on_prime.c
#include <stdio.h>
#include <stdbool.h>

// Helper to check prime
bool isPrime(int n) {
    if (n < 2) return false;
    for (int i = 2; i * i <= n; i++)
        if (n % i == 0) return false;
    return true;
}

int main() {
    for (int i = 10; i <= 50; i++) {
        if (isPrime(i)) {
            printf("First prime found: %d\n", i);
            break; // Stop on first prime
        }
    }
    return 0;
}
