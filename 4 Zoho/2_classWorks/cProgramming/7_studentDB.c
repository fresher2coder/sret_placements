#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_SUBJECTS 3

// Union: shows storage of either age or grade level
union ExtraInfo {
    int age;
    char gradeLevel;
};

// Structure: Student
struct Student {
    int id;
    char name[50];
    int marks[MAX_SUBJECTS];
    int total;
    float avg;
    union ExtraInfo info;
};

// Function to calculate total and average
void calculate(struct Student *s, int count) {
    for (int i = 0; i < count; i++) {
        s[i].total = 0;
        for (int j = 0; j < MAX_SUBJECTS; j++) {
            s[i].total += s[i].marks[j];
        }
        s[i].avg = s[i].total / (float)MAX_SUBJECTS;
    }
}

// Print top scorer using pointers
void printTopScorer(struct Student *s, int count) {
    int topIndex = 0;
    for (int i = 1; i < count; i++) {
        if ((s + i)->total > (s + topIndex)->total) {
            topIndex = i;
        }
    }
    printf("\nTop Scorer: %s | Total: %d | Avg: %.2f\n", s[topIndex].name, s[topIndex].total, s[topIndex].avg);
}

int main() {
    int n;
    printf("Enter number of students: ");
    scanf("%d", &n);

    // Dynamic memory allocation for students
    struct Student *students = (struct Student *)calloc(n, sizeof(struct Student));
    if (students == NULL) {
        printf("Memory allocation failed\n");
        return 1;
    }

    // Input student data
    for (int i = 0; i < n; i++) {
        printf("\nEnter details for student %d:\n", i + 1);
        students[i].id = i + 1;
        printf("Name: ");
        scanf("%s", students[i].name);

        // Nested loop for marks entry
        for (int j = 0; j < MAX_SUBJECTS; j++) {
            printf("Enter marks for subject %d: ", j + 1);
            scanf("%d", &students[i].marks[j]);

            // Using continue and break
            if (students[i].marks[j] < 0) {
                printf("Invalid mark! Skipping this student...\n");
                break;
            }
            if (students[i].marks[j] == 0) {
                printf("Zero mark noted! Continue to next subject...\n");
                continue;
            }
        }

        // Demo: use union to store age or grade
        if (i % 2 == 0) {
            students[i].info.age = 18 + i;
        } else {
            students[i].info.gradeLevel = 'A' + i;
        }
    }

    // Calculate total and avg
    calculate(students, n);

    // Print all student info
    printf("\n=== Student Report ===\n");
    for (int i = 0; i < n; i++) {
        printf("ID: %d | Name: %s | Total: %d | Avg: %.2f | ", 
            students[i].id, students[i].name, students[i].total, students[i].avg);

        // Print from union based on index
        if (i % 2 == 0)
            printf("Age: %d\n", students[i].info.age);
        else
            printf("Grade: %c\n", students[i].info.gradeLevel);
    }

    // Print top scorer
    printTopScorer(students, n);

    // Reallocate memory for adding more students
    int extra;
    printf("\nHow many more students to add? ");
    scanf("%d", &extra);

    students = realloc(students, (n + extra) * sizeof(struct Student));
    if (students == NULL) {
        printf("Reallocation failed\n");
        return 1;
    }

    printf("\nMemory resized to hold %d students.\n", n + extra);

    // Free memory
    free(students);
    return 0;
}
