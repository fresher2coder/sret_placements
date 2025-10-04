#include <stdio.h>
#include <string.h>

// 1. Book structure
struct Book {
    char title[50];
    char author[50];
    float price;
};

// 2. Max price from array of structs
void findMaxPrice(struct Book books[], int n) {
    float max = books[0].price;
    int index = 0;
    for(int i = 1; i < n; i++) {
        if(books[i].price > max) {
            max = books[i].price;
            index = i;
        }
    }
    printf("Book with max price:\nTitle: %s\nPrice: %.2f\n\n", books[index].title, books[index].price);
}

// 3. Union size trace
union Data {
    int i;
    float f;
    char str[20];
};

void showUnionSize() {
    union Data d;
    printf("Size of union Data: %lu bytes\n\n", sizeof(d));
}

// 4. Function passing: struct as parameter
void printBook(struct Book b) {
    printf("Book details passed to function:\nTitle: %s\nAuthor: %s\nPrice: %.2f\n\n", b.title, b.author, b.price);
}

// 5. Compare sizeof struct vs union
struct SampleStruct {
    int x;
    float y;
    char z[10];
};

union SampleUnion {
    int x;
    float y;
    char z[10];
};

void compareStructUnionSize() {
    printf("Size of SampleStruct: %lu bytes\n", sizeof(struct SampleStruct));
    printf("Size of SampleUnion: %lu bytes\n\n", sizeof(union SampleUnion));
}

int main() {
    struct Book library[3] = {
        {"C Programming", "Dennis Ritchie", 250.50},
        {"Let Us C", "Yashwant Kanetkar", 199.99},
        {"The C Answer Book", "Tondo", 275.75}
    };

    // Max price
    findMaxPrice(library, 3);

    // Print Book via function
    printBook(library[1]);

    // Union size demo
    showUnionSize();

    // Struct vs Union size comparison
    compareStructUnionSize();

    return 0;
}
