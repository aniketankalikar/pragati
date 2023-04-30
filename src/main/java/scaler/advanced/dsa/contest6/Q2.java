package scaler.advanced.dsa.contest6;

import java.util.ArrayList;
import java.util.HashSet;

public class Q2 {

	public static void main(String args[]) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(3);
		A.add(2);
		A.add(6);

		int res = new Q2().solve(A);
		System.out.println(res);
	}

	public int solve(ArrayList<Integer> A) {

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < A.size(); i++) {
			hs.add(A.get(i));
		}

		int count = 0;

		for (int j = 0; j < hs.size(); j++) {
			if (!hs.contains(0))
				count++;
		}

		return count;
	}

}
