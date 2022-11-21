package scaler.assigments.homework;

import java.util.ArrayList;

public class TwoDMatrices_SprialOrder {

	public static void main(String args[]) {
		new TwoDMatrices_SprialOrder().generateMatrix(2);
	}

	public ArrayList<ArrayList<Integer>> generateMatrix(int A) {

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int[][] spiralMat = new int[A][A];
		int elem = 1;
		int x = 0, y = 0;

		while (A > 1) {
			for (int k = 1; k <= A - 1; k++) {
				spiralMat[x][y] = elem++;
				y++;
			}

			for (int k = 1; k <= A - 1; k++) {
				spiralMat[x][y] = elem++;
				x++;
			}

			for (int k = 1; k <= A - 1; k++) {
				spiralMat[x][y] = elem++;
				y--;
			}

			for (int k = 1; k <= A - 1; k++) {
				spiralMat[x][y] = elem++;
				x--;
			}
			x++;
			y++;
			A -= 2;
		}

		if (A == 1) {
			spiralMat[x][y] = elem;
		}
		
		for(int i=0;i<spiralMat.length;i++)
		{
			ArrayList<Integer> arrList = new ArrayList<Integer>();
			result.add(arrList);
			for(int j=0;j<spiralMat[i].length;j++)
			{
				arrList.add(spiralMat[i][j]);
			}
		}

		return result;
	}

}
