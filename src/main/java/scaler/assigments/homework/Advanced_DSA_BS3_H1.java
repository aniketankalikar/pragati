package scaler.assigments.homework;

import java.util.ArrayList;

public class Advanced_DSA_BS3_H1 {

	public static void main(String args[]) {
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(12);
		A.add(34);
		A.add(67);
		A.add(90);
		
		int ans = new Advanced_DSA_BS3_H1().books(A, 2);
		System.out.println(ans);

	}

	public int books(ArrayList<Integer> A, int B) {

		int max = A.get(0);
		int sum = 0;
		int ans = 0;
		for (int i = 0; i < A.size(); i++) {
			max = A.get(i) > max ? A.get(i) : max;
			sum += A.get(i);
		}

		int l = max;
		int h = sum;

		if (B > A.size()) {
			return -1;
		}

		while (l <= h) {
			int m = l + (h - l) / 2;

			if (check(A, B, m)) {
				ans = m;
				h = m - 1;
			} else {
				l = m + 1;
			}
		}

		return ans;
	}

	private boolean check(ArrayList<Integer> A, int B, int m) {

		int cnt = 1; // Counter to keep track of painter
		long sum = 0; // variable to stop the current sum of time
		for (int i = 0; i < A.size(); i++) {
			// will calculate the time taken to pain the board.
			// if sum exceeds the given time then we will increment the counter and reset
			// the sum to currrent board length multiple by B
			sum = sum + (long) A.get(i);
			if (sum > m) {
				cnt = cnt + 1;
				sum = (long) A.get(i);
				// if the counter exceeds the limit A then it is not possible to paint all the
				// board with the available painter
				if (cnt > B) {
					return false;
				}
			}
		}
		return true;
	}
}
