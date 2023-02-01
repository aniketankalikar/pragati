package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Advanced_Arrays_Homework2 {

	public static void main(String args[]) {
		Integer arr[] = new Integer[] { 52, 7, 93, 47, 68, 26, 51, 44, 5, 41, 88, 19, 78, 38, 17, 13, 24, 74, 92, 5, 84,
				27, 48, 49, 37, 59, 3, 56, 79, 26, 55, 60, 16, 83, 63, 40, 55, 9, 96, 29, 7, 22, 27, 74, 78, 38, 11, 65,
				29, 52, 36, 21, 94, 46, 52, 47, 87, 33, 87, 70 };
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr));
		int result = new Advanced_Arrays_Homework2().solve(A, 19);
		System.out.println(result);
	}

	public int solve(ArrayList<Integer> A, int B) {

		int count = 0;
		int n = A.size();
		int k = B;
		for (int i = 0; i < n; ++i)
			if (A.get(i) <= k)
				++count;

		// Find unwanted elements in current
		// window of size 'count'
		int bad = 0;
		for (int i = 0; i < count; ++i)
			if (A.get(i) > k)
				++bad;

		// Initialize answer with 'bad' value of
		// current window
		int ans = bad;
		for (int i = 0, j = count; j < n; ++i, ++j) {

			// Decrement count of previous window
			if (A.get(i) > k)
				--bad;

			// Increment count of current window
			if (A.get(j) > k)
				++bad;

			// Update ans if count of 'bad'
			// is less in current window
			ans = Math.min(ans, bad);
		}
		return ans;
	}
}