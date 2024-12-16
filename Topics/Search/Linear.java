package Search;

public class Linear {
    public static int search(int[] a, int b) {
        for (int c = 0; c < a.length; c++) {
            if (a[c] == b) return c;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println(search(arr, target));
    }
}
