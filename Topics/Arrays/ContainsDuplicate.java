package Arrays;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int n : nums)
        {
            if(set1.contains(n))
            {
                return true;
            }
            set1.add(n);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        ContainsDuplicate c = new ContainsDuplicate();
        System.out.println(c.containsDuplicate(nums));
    }
}
