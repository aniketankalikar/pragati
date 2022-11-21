package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDMatrices_RowToColumn_Zero {
	
	public static void main(String args[])
	{
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		Integer [] inputArr1 = new Integer[] {97, 18, 55, 1, 50, 17, 16, 0, 22, 14};
		ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(inputArr1));
		Integer [] inputArr2 = new Integer[] {58, 14, 75, 54, 11, 23, 54, 95, 33, 23};
		ArrayList<Integer> input2 = new ArrayList<Integer>(Arrays.asList(inputArr2));
		Integer [] inputArr3 = new Integer[] {73, 11, 2, 80, 6, 43, 67, 82, 73, 4};
		ArrayList<Integer> input3 = new ArrayList<Integer>(Arrays.asList(inputArr3));
		A.add(input1);
		A.add(input2);
		A.add(input3);
		
		new TwoDMatrices_RowToColumn_Zero().solve(A);
	}

	public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {

		int rows = A.size();
		int cols = A.get(0).size();
		
		List<String> indexList = new ArrayList<String>();
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (A.get(i).get(j) == 0) {
					indexList.add(String.valueOf(i+","+String.valueOf(j)));
				}
			}
		}
		
		for(int counter =0; counter < indexList.size(); counter++)
		{
			String index  = indexList.get(counter);
			updateRowToColumnZero(A, Integer.parseInt(index.split(",")[0]) , Integer.parseInt(index.split(",")[1]) );
		}
		
		return A;
	}
	
	private void updateRowToColumnZero(ArrayList<ArrayList<Integer>> A, int i, int j)
	{
		int rows = A.size();
		int cols = A.get(0).size();
		
		for(int rIndex=0;rIndex<rows;rIndex++)
		{
			A.get(rIndex).set(j, 0);
		}
		
		for(int cIndex=0;cIndex<cols;cIndex++)
		{
			A.get(i).set(cIndex, 0);
		}
			
		
	}
}
