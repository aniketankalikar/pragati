package leetcode.problems;

import java.util.Arrays;

public class ContainsDuplicate_217 {

    public static void main(String args[])
    {
        int nums [] = {1,1,1,3,3,4,3,2,4,2};
        boolean result = new ContainsDuplicate_217().containsDuplicate(nums);
        System.out.println(result);
    }

    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                   return true;
        }

        return false;
    }
}
