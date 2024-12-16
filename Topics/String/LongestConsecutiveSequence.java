package String;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    // Leetcode 128. Longest Consecutive Sequence (String, Split, Reverse)
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int longestStreak = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence l = new LongestConsecutiveSequence();
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        System.out.println(l.longestConsecutive(nums));
    }
}
