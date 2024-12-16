package Arrays;

public class SingleNumber {
    // Leetcode 136. Single Number
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
