package arraysProblems;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 13, 22, 35, 40, 57};

        int even = 0, odd = 0;

        for (int num : arr) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even Count = " + even);
        System.out.println("Odd Count = " + odd);
    }
}

