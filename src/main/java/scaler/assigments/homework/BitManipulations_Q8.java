package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.List;

public class BitManipulations_Q8 {

	public static void main(String args[]) {
		// int result = new BitManipulations_Q8().DecimalToAnyBase(4, 3);
		// new BitManipulations_Q8().test();
		List<Integer> input = new ArrayList<Integer>();
		input.add(6);
		input.add(9);
		input.add(6);
		input.add(10);
		input.add(9);
		new BitManipulations_Q8().singleNumber(input);
	}

	public int singleNumber(final List<Integer> A) {

		int result = 0;
		for (int i = 0; i < A.size(); i++) {
			result = result ^ A.get(i);
		}

		return result;

	}

	public void test() {
		int val = 76 / 2;
		int val1 = 76 % 2;
		System.out.println(val);
		System.out.println(val1);
	}

	public int DecimalToAnyBase(int A, int B) {
		int divisionValue = Integer.MAX_VALUE;
		int divisor = A;
		String result = "";
		int remainder = 0;
		List<Integer> temp = new ArrayList<Integer>();
		while (divisionValue > 0) {
			divisionValue = divisor / B;
			remainder = divisor % B;
			divisor = divisionValue;
			temp.add(remainder);

		}

		for (int count = temp.size() - 1; count >= 0; count--) {
			result += temp.get(count);
		}

		return Integer.parseInt(result);

	}
}
