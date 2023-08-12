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

		int counter = 0;
		int ans = 0;

		for (int i = 0; i < A.size(); i++) {
			
			if(elementSet.contains(A.get(i)-1))
					continue;
			
			counter++;
			int nextElement = A.get(i) + 1;
			boolean found = elementSet.contains(nextElement);
			while (found) {
				counter++;
				nextElement = nextElement + 1;
				found = elementSet.contains(nextElement);

			}
			ans = counter > ans ? counter : ans;
			counter = 0;
		}

		return ans;

	}
}