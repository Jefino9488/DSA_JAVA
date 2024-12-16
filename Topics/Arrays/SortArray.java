package Arrays;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] nums = {40, 10, 30, 20, 50};
        System.out.print("Before sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        Arrays.sort(nums);
    }
}
