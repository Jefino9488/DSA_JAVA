package Arrays;

public class RemoveElement {
    // Leetcode 27. Remove Element (Array, Two Pointer)
    public static int removeElement(int[] nums, int valueToRemove) {
        int nextPosition = 0;
        for (int currentPosition = 0; currentPosition < nums.length; currentPosition++) {
            if (nums[currentPosition] != valueToRemove) {
                nums[nextPosition] = nums[currentPosition];
                nextPosition++;
            }
        }
        return nextPosition;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        System.out.println(removeElement(nums, 3));
    }
}
