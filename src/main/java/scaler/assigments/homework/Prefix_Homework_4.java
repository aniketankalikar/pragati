package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Collections;

public class Prefix_Homework_4 {

	public static void main(String args[]) {

		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);

		new Prefix_Homework_4().solve(A);

	}

	public ArrayList<Integer> solve(ArrayList<Integer> A) {

		ArrayList<Integer> result = new ArrayList<Integer>(A.size());
		ArrayList<Integer> leftProduct = new ArrayList<Integer>(A.size());
		ArrayList<Integer> rightProduct = new ArrayList<Integer>(A.size());

		int leftProd = 1;
		int rightProd = 1;

		for (int i = 0; i < A.size(); i++) {

			if (i == 0) {
				leftProd = A.get(i);
				leftProduct.add(i, leftProd);
			} else {
				leftProd = leftProduct.get(i - 1) * A.get(i);
				leftProduct.add(i, leftProd);

			}

			if (i == A.size() - 1) {
				rightProd = 1;
				rightProduct.add(i, rightProd);
			} else {
				for (int j = i + 1; j < A.size(); j++) {

					rightProd = rightProd * A.get(j);

				}
				rightProduct.add(i, rightProd);
				rightProd = 1;
			}

		}
		
		result.add(rightProduct.get(0));
		leftProduct.remove(leftProduct.size()-1);
		rightProduct.remove(rightProduct.get(0));
		
		
		
		for(int i=0; i < leftProduct.size(); i++)
		{
			result.add(leftProduct.get(i) * rightProduct.get(i));
		}
		
		return result;
	}
}
