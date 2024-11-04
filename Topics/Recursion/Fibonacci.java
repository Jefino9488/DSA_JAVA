package Recursion;

import java.util.Scanner;
class Fibonacci {
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Fibonacci of " + n + " is: " + fib(n));
        scan.close();
    }
}