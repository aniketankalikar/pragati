package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Advanced_Arrays2_Assignment3 {

	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> group = new ArrayList<ArrayList<Integer>>();
		group.add(new ArrayList(Arrays.asList(3, 3, 3)));
		group.add(new ArrayList(Arrays.asList(3, 3, 3)));
		group.add(new ArrayList(Arrays.asList(3, 3, 3)));

		int res = new Advanced_Arrays2_Assignment3().solve(group, 3);
		System.out.println(res);

	}

	public int solve(ArrayList<ArrayList<Integer>> A, int B) {
		int min = Integer.MAX_VALUE;
		int i = 0, j = A.get(0).size() - 1;
		while (i < A.size() && j >= 0) {
			if (A.get(i).get(j) == B)
				min = Math.min(min, (i + 1) * 1009 + j + 1);
			if (A.get(i).get(j) >= B)
				j--;
			else
				i++;
		}
		return (min == Integer.MAX_VALUE) ? -1 : min;
	}

}
