package scaler.assigments.homework;

import java.util.ArrayList;

public class Advance_Arrays1_Q2 {

	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(10);
		B.add(input);
		input = new ArrayList<Integer>();
		input.add(2);
		input.add(3);
		input.add(20);
		B.add(input);
		input = new ArrayList<Integer>();
		input.add(2);
		input.add(5);
		input.add(25);
		B.add(input);

		new Advance_Arrays1_Q2().solve(5, B);
	}

	public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {

		ArrayList<Integer> result = new ArrayList<Integer>();

		int arr[] = new int[A];
		int queries = B.size();
		int start = 0;
		int end = 0;
		int val = 0;
		while (queries > 0) {
			start = B.get(queries - 1).get(0);
			end = B.get(queries - 1).get(1);
			val = B.get(queries - 1).get(2);
			arr[start - 1] += val;
			if (end < A)
				arr[end] -= val;

			queries--;

		}
		result.add(arr[0]);
		for (int i = 1; i < A; i++) {
			arr[i] += arr[i - 1];
			result.add(arr[i]);
		}

		return result;
	}
}
