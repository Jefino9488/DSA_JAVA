package Arrays;

import java.util.Scanner;

public class SumOfTwoPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean found = false;

        for (int i = 2; i <= number / 2; i++) {
            if (isPrime(i) && isPrime(number - i)) {
                System.out.println(number + " = " + i + " + " + (number - i));
                found = true;
            }
        }

        if (!found) {
            System.out.println(number + " cannot ");
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

