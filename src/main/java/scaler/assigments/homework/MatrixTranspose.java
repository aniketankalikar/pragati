package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixTranspose {

	public static void main(String args[]) {
		Integer arr1[] = { 21, 62, 16, 44, 55, 100, 16, 86, 29 };
		ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(arr1));
		Integer arr2[] = { 62, 72, 85, 35, 14, 1, 89, 15, 73 };
		ArrayList<Integer> input2 = new ArrayList<Integer>(Arrays.asList(arr2));
		Integer arr3[] = { 42, 44, 30, 56, 25, 52, 61, 23, 54 };
		ArrayList<Integer> input3 = new ArrayList<Integer>(Arrays.asList(arr3));
		Integer arr4[] = { 5, 35, 12, 35, 55, 74, 50, 50, 80 };
		ArrayList<Integer> input4 = new ArrayList<Integer>(Arrays.asList(arr4));
		Integer arr5[] = { 2, 65, 65, 82, 26, 36, 66, 60, 1 };
		ArrayList<Integer> input5 = new ArrayList<Integer>(Arrays.asList(arr5));
		Integer arr6[] = { 18, 1, 16, 91, 42, 11, 72, 97, 35 };
		ArrayList<Integer> input6 = new ArrayList<Integer>(Arrays.asList(arr6));
		Integer arr7[] = { 23, 57, 9, 28, 13, 44, 40, 47, 98 };
		ArrayList<Integer> input7 = new ArrayList<Integer>(Arrays.asList(arr7));

		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		A.add(input1);
		A.add(input2);
		A.add(input3);
		A.add(input4);
		A.add(input5);
		A.add(input6);
		A.add(input7);

		new MatrixTranspose().solve(A);
	}

	public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int rows = A.size();
		int columns = A.get(0).size();

		for (int i = 0; i < columns; i++) {
			ArrayList<Integer> arrList = new ArrayList<>();
			for (int j = 0; j < rows; j++) {
				int val = A.get(j).get(i);
				arrList.add(val);
			}
			result.add(arrList);
		}
		return result;
	}

}
