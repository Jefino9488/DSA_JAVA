package Arrays;

import java.util.*;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            uniqueNums.add(num);
        }

        List<Integer> sortedNums = new ArrayList<>(uniqueNums);
        sortedNums.sort(Collections.reverseOrder());

        return sortedNums.size() >= 3 ? sortedNums.get(2) : sortedNums.get(0);
    }
    public static void main(String[] args) {
        ThirdMaximumNumber t = new ThirdMaximumNumber();
        System.out.println(t.thirdMax(new int[]{3, 2, 1,4}));
    }
}
