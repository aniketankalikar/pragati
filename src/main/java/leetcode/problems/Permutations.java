package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public static void main(String args[]) {

		int[] nums = { 1, 2, 3 };
		List<List<Integer>> res = new Permutations().permute(nums);
		System.out.println(res);

	}

	public List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		backtrack(new ArrayList<Integer>(), ans, nums);

		return ans;
	}

	private void backtrack(ArrayList<Integer> curr, List<List<Integer>> ans, int[] nums) {

		if (curr.size() == nums.length)
		{
			ans.add(new ArrayList<Integer>(curr));
			return;
		}
			

		for (int i : nums) {
			if (!curr.contains(i)) {
				curr.add(i);
				backtrack(curr, ans, nums);
				curr.remove(curr.size() - 1);
			}
		}

	}

}
