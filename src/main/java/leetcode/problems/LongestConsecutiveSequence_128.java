package leetcode.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an unsorted array of integers nums, return the length of the longest
 * consecutive elements sequence.
 * 
 * You must write an algorithm that runs in O(n) time.
 * 
 * Example 1:
 * 
 * Input: nums = [100,4,200,1,3,2] Output: 4 Explanation: The longest
 * consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 * Example 2:
 * 
 * Input: nums = [0,3,7,2,5,8,4,6,0,1] Output: 9
 * 
 * 
 * Constraints:
 * 
 * 0 <= nums.length <= 105 -109 <= nums[i] <= 109
 * 
 * 
 * 
 */
public class LongestConsecutiveSequence_128 {

	public static void main(String args[]) {

		int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		int len = new LongestConsecutiveSequence_128().longestConsecutive(nums);
		System.out.println(len);
	}

	public int longestConsecutive(int[] nums) {
		int len = 0;
		int longest = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}

		for (int i = 0; i < nums.length; i++) {
			if (!set.contains(nums[i] - 1)) {
				len = 0;
				while (set.contains(nums[i] + len))
					len++;
				longest = Math.max(len, longest);
			}
		}

		return longest;
	}

}