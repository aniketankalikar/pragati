package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Q5_SubArrays {
	
	public static void main(String args[])
	{
		Integer [] arr = new Integer[] {1, 2, 4, 4, 5, 5, 5, 7, 5};
		ArrayList<Integer> C = new ArrayList<Integer>(Arrays.asList(arr));
		int max = new Q5_SubArrays().maxSubarray(9, 14, C);
		System.out.println(max);
	}

	public int maxSubarray(int A, int B, ArrayList<Integer> C) {

		int sum = 0;
		int max = 0;
		for (int i = 0; i < C.size(); i++) {
			sum = 0;
			for (int j = i; j < C.size(); j++) {
				sum = sum + C.get(j);
				if (sum> max && sum <= B) {
					max = sum;
				}

			}

			
		}

		return max;
	}
}
