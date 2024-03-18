package leetcode.problems;

public class SumArray1D {
	
	public static void main(String args[])
	{
		runningSum(new int [] {1,2,3,4});
	}
	
    public static int[] runningSum(int[] nums) {
        
        int [] result = new int[nums.length];
        int sum =0;
        for(int i=0;i<nums.length;i++)
        {
            sum = 0;
            for(int j = 0; j<=i; j++)
            {
                sum += nums[j];
            }
            result [i] = sum;
        }
        return result;
    }
}