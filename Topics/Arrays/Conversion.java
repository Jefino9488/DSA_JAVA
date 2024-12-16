package Arrays;

public class Conversion {
    public static void main(String[] args) {
        String binary = "1010";
        int decimal = 42;
        String octal = "52";

        System.out.println("Conversions:");

        // Binary to Decimal
        System.out.println("Binary to Decimal: " + binary + " -> " + binaryToDecimal(binary));

        // Decimal to Binary
        System.out.println("Decimal to Binary: " + decimal + " -> " + decimalToBinary(decimal));

        // Decimal to Octal
        System.out.println("Decimal to Octal: " + decimal + " -> " + decimalToOctal(decimal));

        // Octal to Decimal
        System.out.println("Octal to Decimal: " + octal + " -> " + octalToDecimal(octal));

        // Binary to Octal
        System.out.println("Binary to Octal: " + binary + " -> " + binaryToOctal(binary));

        // Octal to Binary
        System.out.println("Octal to Binary: " + octal + " -> " + octalToBinary(octal));
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0, base = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2;
        }
        return decimal;
    }

    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        if (decimal == 0) return "0";
        while (decimal > 0) {
            binary.append(decimal % 2);
            decimal /= 2;
        }
        return binary.reverse().toString();
    }

    public static String decimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();
        if (decimal == 0) return "0";
        while (decimal > 0) {
            octal.append(decimal % 8);
            decimal /= 8;
        }
        return octal.reverse().toString();
    }

    public static int octalToDecimal(String octal) {
        int decimal = 0, base = 1;
        for (int i = octal.length() - 1; i >= 0; i--) {
            decimal += (octal.charAt(i) - '0') * base;
            base *= 8;
        }
        return decimal;
    }

    public static String binaryToOctal(String binary) {
        int decimal = binaryToDecimal(binary);
        return decimalToOctal(decimal);
    }

    public static String octalToBinary(String octal) {
        int decimal = octalToDecimal(octal);
        return decimalToBinary(decimal);
    }
}
