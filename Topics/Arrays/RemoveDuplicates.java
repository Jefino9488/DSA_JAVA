package Arrays;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {10, 20, 10, 30, 20, 40, 50};
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int num : nums) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        System.out.println(uniqueList);
    }
}
