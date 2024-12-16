package Arrays;

import java.util.Arrays;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        String[] numStrs = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(numStrs, (a, b) -> (b + a).compareTo(a + b));

        String result = String.join("", numStrs);

        if (result.startsWith("0")) {
            return "0";
        }

        return result;
    }
    public static void main(String[] args) {
        LargestNumber l = new LargestNumber();
        System.out.println(l.largestNumber(new int[]{10,2}));
    }
}
