package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Adv_DSA_Hashing2_Q2 {

	public static void main(String args[]) {
		ArrayList<Integer> A = new ArrayList<Integer>(List.of(1, 1, 2, 3, 3));
		ArrayList<Integer> B = new ArrayList<Integer>(List.of(1, 2, 1, 2, 1));

		int result = new Adv_DSA_Hashing2_Q2().solve(A, B);
		System.out.println(result);
	}

	public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		int ans = 0;
		int mod = 1000000007;

		Map<Integer, Integer> xf = new HashMap<Integer, Integer>();
		Map<Integer, Integer> yf = new HashMap<Integer, Integer>();

		// Frequency Array for X Axis
		for (int i = 0; i < A.size(); i++) {
			if (xf.containsKey(A.get(i))) {
				xf.put(A.get(i), xf.get(A.get(i)) + 1);
			} else {
				xf.put(A.get(i), 1);
			}
		}

		// Frequency Array for Y Axis
		for (int i = 0; i < B.size(); i++) {
			if (yf.containsKey(B.get(i))) {
				yf.put(B.get(i), yf.get(B.get(i)) + 1);
			} else {
				yf.put(B.get(i), 1);
			}
		}

		for (int i = 0; i < A.size(); i++) {
			ans += (xf.get(A.get(i)) - 1) * (yf.get(B.get(i)) - 1) % mod;
		}

		return ans;

	}

}
