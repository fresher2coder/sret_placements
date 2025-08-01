package subset;

import java.util.*;

public class SubsetGenerator {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);

        for (List<Integer> subset : result)
            System.out.println(subset);
    }

    static void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include current element
        current.add(nums[index]);
        generateSubsets(index + 1, nums, current, result);

        // Exclude current element
        current.remove(current.size() - 1);
        generateSubsets(index + 1, nums, current, result);
    }
}

