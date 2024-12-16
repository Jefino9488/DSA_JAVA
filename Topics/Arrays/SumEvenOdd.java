package Arrays;

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int evenSum = 0;
        int oddSum = 0;
        int i = 1;

        while (i <= n) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
            i++;
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        scanner.close();
    }
}
