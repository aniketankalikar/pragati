package scaler.assigments.homework;

import java.util.ArrayList;

public class Advanced_Backtracking1_Q4 {

	int sum = 0;

	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		A.add(new ArrayList<Integer>());
		A.add(new ArrayList<Integer>());
		A.add(new ArrayList<Integer>());

		A.get(0).add(0, 1);
		A.get(0).add(1, 0);
		A.get(0).add(2, 0);
		A.get(0).add(3, 0);

		A.get(1).add(0, 0);
		A.get(1).add(1, 0);
		A.get(1).add(2, 0);
		A.get(1).add(3, 0);

		A.get(2).add(0, 0);
		A.get(2).add(1, 0);
		A.get(2).add(2, 2);
		A.get(2).add(3, -1);

		new Advanced_Backtracking1_Q4().solve(A);

	}

	public int solve(ArrayList<ArrayList<Integer>> A) {
		
		int [][] grid = new int[A.size()][A.get(0).size()];
		
		
		int zeroCount = 0, si = 0, sj = 0;
		for (int row = 0; row < A.size(); row++) {
			for (int col = 0; col < A.get(0).size(); col++) {
				if (A.get(row).get(col) == 0) {
					zeroCount++;
				} else if (A.get(row).get(col) == 1) {
					si = row;
					sj = col;
				}
				grid[row][col] = A.get(row).get(col);
						
				}
		}
		int res = dfs(grid, si, sj, zeroCount); 
		return res;
	}

	public int dfs(int[][] grid, int x, int y, int zeroCount) {
		if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == -1)
			return 0;
		if (grid[x][y] == 2)
			return zeroCount == -1 ? 1 : 0;
		grid[x][y] = -1;
		zeroCount--;

		int totalPath = dfs(grid, x + 1, y, zeroCount) + dfs(grid, x, y + 1, zeroCount) + dfs(grid, x - 1, y, zeroCount)
				+ dfs(grid, x, y - 1, zeroCount);
		zeroCount++;
		grid[x][y] = 0;
		return totalPath;
	}
}
