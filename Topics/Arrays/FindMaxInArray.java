package Arrays;

import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements (space-separated):");
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int maxElement = findMax(arr);

        System.out.println("Maximum Element: " + maxElement);
    }

    // Function to find the maximum element
    private static int findMax(int[] arr) {
        int maxElement = arr[0]; // Initialize with the first element
        for (int num : arr) {
            if (num > maxElement) {
                maxElement = num; // Update if a larger element is found
            }
        }
        return maxElement;
    }
}
