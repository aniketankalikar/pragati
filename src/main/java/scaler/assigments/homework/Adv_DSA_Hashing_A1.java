package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Adv_DSA_Hashing_A1 {

	public static void main(String args[]) {

		List<Integer> A = new ArrayList<Integer>();
		A.add(100);
		A.add(4);
		A.add(200);
		A.add(1);
		A.add(3);
		A.add(2);

		int res = new Adv_DSA_Hashing_A1().longestConsecutive(A);
		System.out.println(res);
	}

	public int longestConsecutive(final List<Integer> A) {

		Set<Integer> elementSet = new HashSet<Integer>();

		for (int i = 0; i < A.size(); i++) {
			elementSet.add(A.get(i));
		}

		int ans = 0;

		for (int i = 0; i < A.size(); i++) {
			int counter = 0;
			if (elementSet.contains(A.get(i) - 1))
				continue;
			else {
				int ele = A.get(i);
				while (elementSet.contains(ele)) {
					counter++;
					ele++;

				}
			}
			ans = Math.max(ans, counter);
		}

		return ans;

	}
}