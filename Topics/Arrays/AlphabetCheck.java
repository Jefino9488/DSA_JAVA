package Arrays;

public class AlphabetCheck {
    public static void main(String[] args) {
        char ch = '9';

        if (isAlphabet(ch)) {
            System.out.println(ch + " is alphabet.");
        } else {
            System.out.println(ch + " is not alphabet.");
        }
    }

    public static boolean isAlphabet(char ch) {
        return Character.isLetter(ch);
    }
}
