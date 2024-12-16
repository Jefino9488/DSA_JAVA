package Arrays;

public class NumberToWords {
    public static void main(String[] args) {
        int number = 1537;


        System.out.println("The number " + number + " in words is: " + convertToWords(number));
    }

    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero";
        }


        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] thousands = {"", "Thousand", "Million", "Billion"};

        String words = "";

        int i = 0;
        while (number > 0) {
            if (number % 1000 != 0) {
                words = convertHundreds(number % 1000) + thousands[i] + " " + words;
            }
            number /= 1000;
            i++;
        }

        return words.trim();
    }

    private static String convertHundreds(int number) {
        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        String words = "";

        if (number >= 100) {
            words += ones[number / 100] + " Hundred ";
            number %= 100;
        }

        if (number >= 20) {
            words += tens[number / 10] + " ";
            number %= 10;
        }

        if (number >= 10) {
            words += teens[number - 10] + " ";
        } else if (number > 0) {
            words += ones[number] + " ";
        }

        return words;
    }
}

