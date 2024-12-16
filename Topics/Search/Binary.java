package Search;

import java.util.Arrays;

public class Binary {
    public static int BinarySearch(int[] array, int target) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int start_index = 0;
        int end_index = array.length - 1;
        while (start_index <= end_index) {
            int mid = start_index + (end_index - start_index) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target) {
                start_index = mid + 1;
            }
            else {
                end_index = mid - 1;
            }
        }
        System.out.println("Target element "+target+" not found");
        return -1;
    }
    public static void main(String[] args) {
            int[] nums = {1, 3, 5, 6, 2, 0, 4};
            System.out.println(BinarySearch(nums, 10));
    }
}
