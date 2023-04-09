package scaler.assigments.homework;

import java.util.ArrayList;

public class AdvancedSortingQ1 {
	
	public static void main(String args[])
	{
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(4);
		A.add(10);
		A.add(2);
		A.add(1);
		A.add(5);
		
		new AdvancedSortingQ1().solve(A);
	}

	public ArrayList<Integer> solve(ArrayList<Integer> A) {

		mergeSort(A, 0, A.size()-1);
		return A;

	}

	public void mergeSort(ArrayList<Integer> A, int start, int end) {
		
		if (start == end)
			return ;

		int middle = (start + end) / 2;
		mergeSort(A, start, middle);
		mergeSort(A, middle + 1, end);
		merge(A, start, middle, end);
		
		

	}

	public ArrayList<Integer> merge(ArrayList<Integer> A, int start, int middle, int end) {

		int P1 = start, P2 = middle + 1;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		while (P1 <= middle && P2 <= end) {
			if (A.get(P1) <= A.get(P2)) {
				temp.add(A.get(P1));
				P1++;

			} else {
				temp.add(A.get(P2));
				P2++;
			}
		}

		while (P1 <= middle) {
			temp.add(A.get(P1));
			P1++;
		}

		while (P2 <= end) {
			temp.add(A.get(P2));
			P2++;
		}
		
		for (int i = start; i <=end; i++) {
			A.set(i, temp.get(i-start));
		}

		return A;
	}

}
