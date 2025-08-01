package subset;

import java.util.*;

public class SubsetSumTarget {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5};
        int target = 7;
        List<List<Integer>> result = new ArrayList<>();
        findTargetSubsets(0, nums, new ArrayList<>(), result, target);

        for (List<Integer> subset : result)
            System.out.println(subset);
    }

    static void findTargetSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result, int target) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (index == nums.length || target < 0) return;

        // Include nums[index]
        current.add(nums[index]);
        findTargetSubsets(index + 1, nums, current, result, target - nums[index]);

        // Exclude nums[index]
        current.remove(current.size() - 1);
        findTargetSubsets(index + 1, nums, current, result, target);
    }
}

