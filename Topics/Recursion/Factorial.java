package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int Fact(int n) {
        if (n <= 1) {
            return n;
        }
        return n * Fact(n - 1);
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Factorial of " + n + " is: " + Fact(n));
        scan.close();
    }
}
