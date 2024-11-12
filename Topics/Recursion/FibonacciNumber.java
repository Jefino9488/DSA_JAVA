package Recursion;

class FibonacciNumber {
    // Leetcode 509. Fibonacci Number (Math,Dynamic Programming, Recursion, Memoization)
    public int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        FibonacciNumber fib = new FibonacciNumber();
        int f = fib.fib(2);
        System.out.println(f);
    }
}