package Arrays;

import java.util.Arrays;

public class RunningSumOf1dArray {
    // Leetcode 1480. Running Sum of 1d Array (Array Prefix Sum)
    public int[] runningSum (int[] nums) {
        int [] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        RunningSumOf1dArray runningSum = new RunningSumOf1dArray();
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum.runningSum(arr)));
    }
}
