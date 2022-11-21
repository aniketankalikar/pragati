package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDMatricesQ7 {

	public static void main(String args[]) {
		
		Integer arr1[] = {1,2};
		ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(arr1));
		Integer arr2[] = {3,4 };
		ArrayList<Integer> input2 = new ArrayList<Integer>(Arrays.asList(arr2));
		
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		A.add(input1);
		A.add(input2);
		
		new TwoDMatricesQ7().solve(A);

	}

	public void solve(ArrayList<ArrayList<Integer>> A) {
		int rows = A.size();
		int cols = A.get(0).size();

		for (int i = 0; i < cols; i++) {
			ArrayList<Integer> arrList = new ArrayList<>();
			for (int j = 0; j < rows; j++) {
				int val = A.get(j).get(i);
				arrList.add(val);
				
			}
			A.set(i,arrList);
		}
		
		System.out.println("Result List  "+ A);
	}
}