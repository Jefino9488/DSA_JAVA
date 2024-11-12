package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    // Leetcode 26. Remove Duplicates from Sorted Array (Array, Two Pointers)
    public int removeDuplicates(int[] nums) {
        int uniqueIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }
    public static Integer[] removeDuplicates(Integer[] nums) {
        Set<Integer> set = new HashSet<>(Arrays.asList(nums));
        return set.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int[] arr = {1,1,2};
        int k = removeDuplicatesFromSortedArray.removeDuplicates(arr);
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }

    }
}
