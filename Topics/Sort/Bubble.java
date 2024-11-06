package Sort;

import java.util.Scanner;

public class Bubble {
    public static int[] bubbleSort(int[] array) {
        int l = array.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l -i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array :");
        String arr = scan.nextLine();
        String[] str = arr.split(" ");
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        int[] sorted = bubbleSort(array);
        for (int j : sorted) {
            System.out.print(j + " ");
        }
        scan.close();
    }
}
