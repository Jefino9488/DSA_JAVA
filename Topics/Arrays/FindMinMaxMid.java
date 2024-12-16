package Arrays;

public class FindMinMaxMid {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static int findMid(int[] arr) {
        int min = findMin(arr);
        int max = findMax(arr);
        for (int num : arr) {
            if (num != min && num != max) {
                return num;
            }
        }
        return -1;
    }
}
