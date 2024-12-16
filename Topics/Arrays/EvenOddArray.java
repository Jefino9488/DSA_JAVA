package Arrays;

public class EvenOddArray {
    public static void main(String[] args) {
        int[] nums = {10, 15, 20, 25, 30, 35, 40};

        System.out.print("Even numbers: ");
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println();

        System.out.print("Odd numbers: ");
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
