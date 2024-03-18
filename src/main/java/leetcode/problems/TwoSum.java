package leetcode.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSum {

	
	public static void main(String args[])
	{
		int[] nums = {3,2,4};
		int target = 6;
		
		int[] ans = new TwoSum().twoSum(nums,target);
		System.out.println(ans);
	}
	
	public int[] twoSum(int[] nums, int target) {
		
		Map<Integer, Integer> mp = new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{
			int complement = target - nums[i];
			if(mp.containsKey(complement))
			{
				return new int[] {mp.get(complement), i};
			}
			else
			{
				mp.put(nums[i],i);
			}
				
		}
		
		
		return null;
	}
}
