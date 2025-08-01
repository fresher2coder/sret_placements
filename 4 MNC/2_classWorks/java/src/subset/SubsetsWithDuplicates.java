package subset;

import java.util.*;

public class SubsetsWithDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        Arrays.sort(nums); // Important!
        List<List<Integer>> result = new ArrayList<>();
        generateUniqueSubsets(0, nums, new ArrayList<>(), result);

        for (List<Integer> subset : result)
            System.out.println(subset);
    }

    static void generateUniqueSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue; // Skip duplicates

            current.add(nums[i]);
            generateUniqueSubsets(i + 1, nums, current, result);
            current.remove(current.size() - 1);
        }
    }
}
