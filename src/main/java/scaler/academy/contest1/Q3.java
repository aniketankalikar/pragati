package scaler.academy.contest1;

import java.util.ArrayList;

public class Q3 {

	public int solve(ArrayList<Integer> A, int B) {
		int count = -1;

		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) == B) {
				count = 0;
			}
		}

		if (count == -1) {
			return -1;
		}

		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) > B) {
				count++;
			}

		}

		return count;
	}
}
