package leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	
	public static void main(String args[])
	{
		int[] nums = new int [] {-1,0,1,2,-1,-4};
		
		new ThreeSum().threeSum(nums);
	}

	public List<List<Integer>> threeSum(int[] nums) {

		Arrays.sort(nums);
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length; i++) {
			
		 if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }
			
			int left = i + 1;
			int right = nums.length-1;

			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) {
					List<Integer> indexes = new ArrayList<Integer>();
					indexes.add(nums[i]);
					indexes.add(nums[left]);
					indexes.add(nums[right]);
					result.add(indexes);
					left++;
					
					// avoid duplicate entry at the 2nd element in the triplet
                    while(nums[left] == nums[left-1] && left < right)left++;
				}

				else if (sum > 0)
					right--;
				else if (sum < 0)
					left++;
				
				
			}
		}

		return result;

	}
}