package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.HashMap;

public class Advanced_DSA2_2Pointers_Assignment_Q1 {

	public static void main(String args[]) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(1);
		A.add(1);

		int ans = new Advanced_DSA2_2Pointers_Assignment_Q1().solve(A, 2);
		System.out.println(ans);
	}

	public int solve(ArrayList<Integer> A, int B) {
		int modulo = 1000000007;
		long count = 0;// counter
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) < B) {
				int element = B - A.get(i);
				if (hm.containsKey(element)) {
					count += hm.get(element);
				}
				if (hm.get(A.get(i)) == null)// if element is not present in the HashMap
				{
					hm.put(A.get(i), 0);
				}
				hm.put(A.get(i), hm.get(A.get(i)) + 1);
			}
		}
		return (int)(count % modulo);
	}

}
