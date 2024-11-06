package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSum1d {
    public static int[] runningSum (int[] nums) {
        int [] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array elements:");
        String inputs = scan.nextLine();
        String[] nums = inputs.split(" ");
        int[] runningSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            runningSum[i] = Integer.parseInt(nums[i]);
        }
        int[] sum = runningSum(runningSum);
        System.out.println(Arrays.toString(sum));
        scan.close();
    }
}
