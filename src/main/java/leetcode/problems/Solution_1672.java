package leetcode.problems;

public class Solution_1672 {

	public static void main(String args[]) {
		 maximumWealth(new int [][] {{1,2,3},{3,2,1}});
	}

	public static int maximumWealth(int[][] accounts) {
		int result = 0;

		for (int i = 0; i < accounts.length; i++) {
			int wealth = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				wealth += accounts[i][j];

			}
			if (wealth > result)
				result = wealth;

		}
		System.out.println(result);
		return result;
	}

}
