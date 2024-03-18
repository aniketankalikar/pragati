package leetcode.problems;

public class Two_Sum_1 {

    public static void main(String args[])
    {
        int input [] = {3,2,4};
        int res [] = new Two_Sum_1().twoSum(input,6);
        System.out.println(res[0]+"   "+res[1]);
    }

    public int[] twoSum(int[] nums, int target) {

        int [] res = new int[2];
        int i =0;
        int j = nums.length-1;
        while(i<j)
        {
            if(nums[i] + nums[j] == target)
            {
                res[0] = i;res[1] = j;
                break;
            }
            else if(nums[i] + nums[j] < target)
            {
                i++;
            }
            else if(nums[i] + nums[j] > target)
            {
                j--;
            }
        }
        return res;
    }
}
