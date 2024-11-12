package Search;

import java.util.Arrays;

public class Binary {
    public static int BinarySearch(int[] array, int target) {
        return Arrays.binarySearch(array, target);
    }
    public static void main(String[] args) {
            int[] nums = {1, 3, 5, 6};
            System.out.println(BinarySearch(nums, 6));
    }
}
