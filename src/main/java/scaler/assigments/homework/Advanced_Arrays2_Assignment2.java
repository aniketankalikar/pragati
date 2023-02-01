package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Advanced_Arrays2_Assignment2 {

	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> group = new ArrayList<ArrayList<Integer>>();
		group.add(new ArrayList(Arrays.asList(1, 2, 3)));
		group.add(new ArrayList(Arrays.asList(4, 5, 6)));
		group.add(new ArrayList(Arrays.asList(7, 8, 9)));

		ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(1, 2));
		ArrayList<Integer> C = new ArrayList<Integer>(Arrays.asList(1, 2));
		ArrayList<Integer> D = new ArrayList<Integer>(Arrays.asList(2, 3));
		ArrayList<Integer> E = new ArrayList<Integer>(Arrays.asList(2, 3));

		ArrayList<Integer> result = new Advanced_Arrays2_Assignment2().solve(group, B, C, D, E);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

	public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B, ArrayList<Integer> C,
			ArrayList<Integer> D, ArrayList<Integer> E) {

		int n = A.size();
		int m = A.get(0).size();
		int mod = 1000000007;

		long psum[][] = new long[n][m];

		// Row wise Prefix sum

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (j == 0) {
					psum[i][j] = A.get(i).get(j);
				} else {
					psum[i][j] = psum[i][j - 1] + A.get(i).get(j);
				}

			}
		}

		// Column wise prefix sum

		for (int j = 0; j < m; j++) {
			for (int i = 1; i < n; i++) {
				psum[i][j] = psum[i - 1][j] + psum[i][j];
			}
		}

		ArrayList<Integer> result = new ArrayList<Integer>();
		// Solving the query

		for (int i = 0; i < B.size(); i++) {
			// Top left
			int x1 = B.get(i) - 1;
			int y1 = C.get(i) - 1;

			// Bottom Right
			int x2 = D.get(i) - 1;
			int y2 = E.get(i) - 1;

			long sum = 0;

			sum += psum[x2][y2];

			if (x1 > 0) {
				sum -= psum[x1 - 1][y2];
			}

			if (y1 > 0) {
				sum -= psum[x2][y1 - 1];
			}

			if (x1 > 0 && y1 > 0) {
				sum += psum[x1 - 1][y1 - 1];
			}

			result.add((int) (((sum % mod) + mod) % mod)) ;
		}

		return result;

	}
}