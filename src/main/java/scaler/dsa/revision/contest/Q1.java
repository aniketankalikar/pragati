package scaler.dsa.revision.contest;

import java.util.ArrayList;

public class Q1 {

	public static void main(String args[]) {

	}

	public int minPathSum(ArrayList<ArrayList<Integer>> A) {

		int rows = A.size();
		int cols = A.get(0).size();

		for (int i = 1; i < rows; i++) {
			int cost = A.get(i).get(0);
			cost = cost + A.get(i - 1).get(0);
			A.get(i).set(0, cost);
		}

		for (int j = 1; j < cols; j++) {
			int cost = A.get(0).get(j);
			cost = cost + A.get(0).get(j - 1);
			A.get(0).set(j, cost);
		}

		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				int cost = A.get(i).get(j);
				cost = cost + Math.min(A.get(i - 1).get(j - 1), Math.min(A.get(i - 1).get(j), A.get(i).get(j - 1)));

				A.get(i).set(j, cost);
			}
		}

		return A.get(rows - 1).get(cols - 1);

	}

}
