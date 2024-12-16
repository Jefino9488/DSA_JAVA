package Arrays;

import java.util.Scanner;

public class ReplaceZeroWithOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int result = replaceZeroWithOne(number);
        System.out.println("Result after replacing 0's with 1's: " + result);
    }

    private static int replaceZeroWithOne(int num) {
        int result = 0, place = 1;

        if (num == 0) {
            return 1;
        }

        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
                digit = 1;
            }
            result += digit * place;
            place *= 10;
            num /= 10;
        }

        return result;
    }
}

