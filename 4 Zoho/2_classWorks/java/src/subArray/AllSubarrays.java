package subArray;

public class AllSubarrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        int n = arr.length;

        System.out.println("All subarrays are:");

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
