package Arrays;

import java.util.Arrays;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n - k];
    }
    public static void main(String[] args) {
        KthLargestElementInAnArray findKthLargest = new KthLargestElementInAnArray();
        int k = 2;
        int[] nums = new int[]{3,2,1,5,6,4};
        System.out.println(findKthLargest.findKthLargest(nums, k));
    }
}
