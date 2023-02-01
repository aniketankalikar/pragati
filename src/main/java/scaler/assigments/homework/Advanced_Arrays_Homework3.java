package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Advanced_Arrays_Homework3 {

	public static void main(String args[]) {
		Integer arr[] = new Integer[] { 1, 2, 3, 4, 0 };
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr));
		int result = new Advanced_Arrays_Homework3().solve(A);
		System.out.println(result);
		System.out.println(A);
	}

	public int solve(ArrayList<Integer> A) {

		int arr[] = A.stream().mapToInt(Integer::intValue).toArray();

		int count = 0;
		int N = arr.length;
		int s = 0;
		while (s < N) {
			if (arr[s] != s) {
				count++;
				int temp = arr[arr[s]];
				arr[arr[s]] = arr[s];
				arr[s] = temp;
			} else
				s++;
		}
		return count;

	}

}