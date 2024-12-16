package Arrays;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[left++] = num;
            } else {
                result[right--] = num;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        SortArrayByParity solution = new SortArrayByParity();

        int[] nums1 = {3, 1, 2, 4};
        int[] result1 = solution.sortArrayByParity(nums1);
        System.out.print("Output for [3, 1, 2, 4]: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
    }
}
