package String;

public class ConcatWithoutBuiltin {
    public static String concat(String s1, String s2) {
        char[] str = new char[s1.length() + s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            str[i] = s1.charAt(i);
        }
        for (int i = 0; i < s2.length(); i++) {
            str[s1.length() + i] = s2.charAt(i);
        }
        return new String(str);
    }
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(concat(s1, s2));
    }
}
