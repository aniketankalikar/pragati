package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_Homework_Q2 {

	public static void main(String args[]) {
		Integer arr[] = new Integer[] {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr));
		int totalCount = new Arrays_Homework_Q2().solve(A, 65);
		System.out.println("totalCount--->" + totalCount);
	}

	public int solve(ArrayList<Integer> A, int B) {
		int sum = 0;
		int length = 0;
		int totalCount = 0;
		for (int i = 0; i < A.size(); i++) {
			sum = 0;
			length = 0;
			for (int j = i; j < A.size(); j++) {

				if (j == i) {
					length = 1;
					sum += A.get(j);
					if (A.get(j) > B)
						totalCount++;
				} else {
					length = j -i+1;
					boolean even = length % 2 == 0 ? true : false;
					sum += A.get(j);
					if (even && sum < B)
						totalCount++;
					else if (!even && sum > B)
						totalCount++;
				}
			}
			
		}
		return totalCount;
	}
}