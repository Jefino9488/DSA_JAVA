package Arrays;

import java.util.Scanner;

public class ReverseAndFindMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers in the array (space-separated):");
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        reverseArray(arr);
        System.out.println("Reversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing Number: " + missingNumber);
    }

    private static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    private static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
