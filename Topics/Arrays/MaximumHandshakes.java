package Arrays;

public class MaximumHandshakes {
    public static void main(String[] args) {
        int n = 10; // people

        int maxHandshakes = calculateHandshakes(n);
        System.out.println(maxHandshakes);
    }

    public static int calculateHandshakes(int n) {
        return n * (n - 1) / 2;
    }
}
