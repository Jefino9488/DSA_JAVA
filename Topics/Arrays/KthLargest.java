package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargest {
    public static int findKthLargest(Integer[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n - k];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the elements (comma-separated): ");
        String input = scan.nextLine();
        String[] parts = input.split(",");
        Integer[] nums = new Integer[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i].trim());
        }
        System.out.print("Enter the k: ");
        int k = scan.nextInt();
        int result = findKthLargest(nums,k);
        System.out.print("the "+ k +" th largest element is: " + result);
        scan.close();
    }
}
