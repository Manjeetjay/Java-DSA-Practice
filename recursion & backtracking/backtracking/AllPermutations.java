package backtracking;

import java.util.ArrayList;

public class AllPermutations {
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtrack(arr, 0, result);
        return result;
    }

    public static void backtrack(int[] nums, int start, ArrayList<ArrayList<Integer>> result) {
        
        if (start == nums.length) {
            ArrayList<Integer> current = new ArrayList<>();
            for (int num : nums) {
                current.add(num);
            }
            result.add(current);
            return;
        }

        // Try each element from 'start' to the end
        for (int i = start; i < nums.length; i++) {
            // Swap current element with the start element
            swap(nums, start, i);
            // Recursively generate permutations for the rest
            backtrack(nums, start + 1, result);
            // Backtrack: Undo the swap to restore the original array
            swap(nums, start, i);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
