package scaler.assigments.homework;

public class BitMap2_Assignment_Q2 {

	public static void main(String args[]) {
		new BitMap2_Assignment_Q2().solve(8, 5);
	}

	public int solve(int A, int B) {
		int max = (A > B) ? A : B;
		char[] arr = new char[max + 1];
		int index = max;
		for (int i = 0; i <= max; i++) {
			if (i == A || i == B)
				arr[index] = '1';
			else
				arr[index] = '0';

			index--;

		}

		// Convert Binary to Decimal
		int powIndex = 0;
		int decimal = 0;
		for (int count = arr.length - 1; count >= 0; count--) {
			decimal += Character.getNumericValue(arr[count]) * Math.pow(2, powIndex);
			powIndex++;
		}

		return decimal;

	}
}
