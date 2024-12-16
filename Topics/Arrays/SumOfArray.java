package Arrays;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements (space-separated):");
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) arr[i] = Integer.parseInt(input[i]);
        int sum = 0;
        for (int num : arr) sum += num;
        System.out.println("Sum of Array Elements: " + sum);
    }
}
