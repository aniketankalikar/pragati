package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting_Assignment_Q1 {

	public int solve(ArrayList<Integer> A) {

		Collections.sort(A, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return b.compareTo(a);
			}
		});
		
		int ans = 0;

		for (int i = 0; i < A.size(); i++) {
			ans+= (i+1)* A.get(i);
		}

		return ans;
	}

}
