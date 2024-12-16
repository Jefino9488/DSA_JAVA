package Arrays;

public class VowelOrConsonant {
    public static void main(String[] args) {
        char ch = 'b';

        if (isVowel(ch)) {
            System.out.println(ch + " vowel.");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " consonant.");
        } else {
            System.out.println(ch + " is not valid");
        }
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
