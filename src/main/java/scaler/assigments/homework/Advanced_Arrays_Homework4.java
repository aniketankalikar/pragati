package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Advanced_Arrays_Homework4 {

	public static void main(String args[]) {
		
		ArrayList<ArrayList<Integer>> group = new ArrayList<ArrayList<Integer>>();
		group.add(new ArrayList(Arrays.asList(0, 1, 1)));
		group.add(new ArrayList(Arrays.asList(0, 0, 1)));
		group.add(new ArrayList(Arrays.asList(0, 1, 1)));
		int result = new Advanced_Arrays_Homework4().solve(group);
		System.out.println(result);
		
	}

	public int solve(ArrayList<ArrayList<Integer>> A) {

		int N = A.size();
		int ans = -1, row = -1;
		for (int i = 0; i < N; i++) {
			int count = 0;
			for (int j = N - 1; j >= 0; j--) {
				if (A.get(i).get(j) == 1) {
					count++;
				}
			}
			if (ans < count) {
				ans = count;
				row = i;
			}
		}
		return row;
	}

}
