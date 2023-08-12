package scaler.assigments.homework;

import java.util.ArrayList;

public class Advanced_DSA2_BS2_H3 {

	public static void main(String args[]) {

	}

	public int solve(ArrayList<Integer> A, int B) {
		int start = 1, end = A.size(), mid, ans = 0;
		while (start <= end) {
			mid = start + (end - start) / 2;
			boolean flag = checkWindow(A, B, mid);
			if (flag) {
				ans = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return ans;
	}

	private boolean checkWindow(ArrayList<Integer> A, int B, int window) {
		long sum = 0;
		for (int i = 0; i < window; i++)
			sum += A.get(i);
		long max = sum;
		for (int i = window; i < A.size(); i++) {
			sum = sum + A.get(i) - A.get(i - window);
			max = Math.max(max, sum);
		}
		if (max <= B)
			return true;
		return false;
	}

}
