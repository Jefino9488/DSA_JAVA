package Arrays;

import java.util.*;

public class GroupsOfSpecialEquivalentStrings {
    // Leetcode 893. Groups of Special-Equivalent Strings (Arrays, Strings, Sorting)
//    public int numSpecialEquivGroups(String[] words) {
//        Set<String> set = new HashSet<>();
//        for (String word:words) {
//            System.out.println(set);
//            int n = word.length();
//            String even = "";
//            String odd = "";
//            for (int i=0;i < n;i++) {
//                if (i % 2 == 0) {
//                    even += word.charAt(i);
//                } else {
//                    odd += word.charAt(i);
//                }
//            }
//            char[] ev = even.toCharArray();
//            char[] od = odd.toCharArray();
//            String val = new String(ev) + new String(od);
//            set.add(val);
//            System.out.println(val);
//            Arrays.sort(ev);
//            Arrays.sort(od);
//        }
//        return set.size();
//    }
    public int numsSpecialEquivGroups(String[] words) {
        Set<String> uniqueSignatures = new HashSet<>();

        for (String word : words) {
            int n = word.length();
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    even.append(word.charAt(i));
                } else {
                    odd.append(word.charAt(i));
                }
            }

            char[] evenArr = even.toString().toCharArray();
            char[] oddArr = odd.toString().toCharArray();
            Arrays.sort(evenArr);
            Arrays.sort(oddArr) ;

            String signature = new String(evenArr) + new String(oddArr);
            uniqueSignatures.add(signature);
        }

        return uniqueSignatures.size();
    }
    public static void main(String[] args) {
        GroupsOfSpecialEquivalentStrings g = new GroupsOfSpecialEquivalentStrings();
        String[] words = new String[]{"abc","acb","bac","bca","cab","cba"};
        System.out.println(g.numsSpecialEquivGroups(words));
    }
}
