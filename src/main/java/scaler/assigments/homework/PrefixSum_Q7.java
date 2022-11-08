package scaler.assigments.homework;

import java.util.ArrayList;

public class PrefixSum_Q7 {
	
	public static void main(String args[]) {

		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
	
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		
		a.add(0);
		a.add(2);
		b.add(1);
		b.add(4);
		B.add(a);
		B.add(b);
		
		new PrefixSum_Q7().solve(A, B);

	}
	
	public ArrayList<Long> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

		ArrayList<Long> result = new ArrayList<Long>();
		
		Integer[] input = new Integer[A.size()];
		input = A.toArray(input);

		ArrayList<Integer[]> tempList = new ArrayList<Integer[]>();
		Integer[] tempArr = null;
		for (ArrayList<Integer> idxList : B) {
			tempArr = new Integer[idxList.size()];
			tempArr = idxList.toArray(tempArr);
			tempList.add(tempArr);
		}

		Integer[][] indexes = new Integer[B.size()][];
		indexes = tempList.toArray(indexes);
		
		// Update the same Array With ODD / EVEN Indicators
		
		for (int i = 0; i < input.length; i++) {
			if (input[i]%2 == 0) {
				input[i] = 1;
			} else {
				input[i] = 0;
			}
		}
		
		
		// Build the Prefix Sum Array
		for (int i = 1; i < input.length; i++) {
			input[i] = input[i - 1] + input[i];
		}

		int startIndex = 0;
		int endIndex = 0;
		long sum = 0;
		for (int j = 0; j < indexes.length; j++) {
			startIndex = indexes[j][0];
			endIndex = indexes[j][1];
			
				System.out.println("startIndex-->" + startIndex);
				System.out.println("endIndex-->" + endIndex);
				if (startIndex == 0) {
					sum += Long.valueOf(input[endIndex]);
				} else {
					sum += Long.valueOf(input[endIndex]) - Long.valueOf(input[startIndex - 1]);
				}
				result.add(sum);
				sum =0;
			
			
		}

		return result;
	}

}
