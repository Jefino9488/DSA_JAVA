package Arrays;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for the multiplication table: ");
        int num = scanner.nextInt();
        System.out.print("Enter the range for the table: ");
        int range = scanner.nextInt();

        System.out.println("Multiplication Table for " + num + ":");

        for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
