package Sort;

import java.util.Arrays;

public class Insertion {
    private static int binarySearch(int[] arr, int key, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid + 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static int[] insertionSortWithBinarySearch(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int insertPos = binarySearch(arr, key, 0, i - 1);
            for (int j = i; j > insertPos; j--) {
                arr[j] = arr[j - 1];
            }
            arr[insertPos] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.print(Arrays.toString(insertionSortWithBinarySearch(arr)));
    }
}
