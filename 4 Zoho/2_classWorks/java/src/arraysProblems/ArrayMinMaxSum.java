package arraysProblems;

public class ArrayMinMaxSum {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 34, 89, 23};

        int max = arr[0], min = arr[0], sum = 0;

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Sum = " + sum);
    }
}

