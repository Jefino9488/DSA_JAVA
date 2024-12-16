package String;

public class ReverseWordsInAString {
    // Leetcode 151. Reverse Words in a String (String, Split, Reverse)
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWordsInAString r = new ReverseWordsInAString();
        System.out.println(r.reverseWords("the sky is blue"));
    }
}
