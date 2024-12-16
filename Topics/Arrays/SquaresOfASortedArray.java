package Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index--] = leftSquare;
                left++;
            } else {
                result[index--] = rightSquare;
                right--;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        SquaresOfASortedArray solution = new SquaresOfASortedArray();

        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] result1 = solution.sortedSquares(nums1);
        System.out.print("Output for [-4, -1, 0, 3, 10]: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
    }
}
