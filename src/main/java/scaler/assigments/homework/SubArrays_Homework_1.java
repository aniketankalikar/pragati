package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrays_Homework_1 {

	public static void main(String args[]) {
		Integer arr[] = new Integer[] {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
		new SubArrays_Homework_1().solve(new ArrayList<Integer>(Arrays.asList(arr)), 4);
	}

	public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

		ArrayList<Integer> result = new ArrayList<Integer>();
		int lenghtOfSubArray = 2 * B + 1;
		Integer[] centerLengthArray = null;
		int index = 1;
		int centerIndex = 0;

		if (lenghtOfSubArray == 1) {
			for (int i = 0; i < A.size(); i++) {
				result.add(i);
			}

		} else if (lenghtOfSubArray == A.size()) {
			centerLengthArray =  new Integer[lenghtOfSubArray];
			for (int i = 0; i < lenghtOfSubArray; i++) {
				centerLengthArray[i] = A.get(i);
			}
			
			boolean retVal = checkCenterIndex(centerLengthArray);
			if (retVal == true) {
				result.add(centerIndex);
			}

		} else {
			for (int i = 1; i < A.size() - 1; i++) {

				index = 1;
				centerIndex = i;
				centerLengthArray = new Integer[lenghtOfSubArray];
				centerLengthArray[index - 1] = A.get(i - 1);
				for (int j = i; j < i + lenghtOfSubArray - 1; j++) {
					if(j>=lenghtOfSubArray)
					{
						j = lenghtOfSubArray-1;
						
					}
					centerLengthArray[index] = A.get(j);
					index++;
				}

				boolean retVal = checkCenterIndex(centerLengthArray);
				if (retVal == true) {
					result.add(centerIndex);
				}

			}
		}

		return result;
	}

	private boolean checkCenterIndex(Integer[] centerLengthArray) {
		boolean retVal = false;
		for (int i = 0; i < centerLengthArray.length - 1; i++) {
			if ((centerLengthArray[i] == 0 && centerLengthArray[i + 1] == 1)
					|| (centerLengthArray[i] == 1 && centerLengthArray[i + 1] == 0)) {
				retVal = true;
			} else {
				retVal = false;
			}
		}
		return retVal;
	}

}