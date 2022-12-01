package scaler.assigments.homework;

public class BitManipulations_Homework_Q1 {
	
	public static void main(String args[])
	{
		new BitManipulations_Homework_Q1().solve(13, 2);
	}

	public int solve(int A, int B) {

		String binary = getBinary(A);
		int result = checkBit(binary, B);

		return result;
	}

	public String getBinary(int A) {
		
		String sBin = "";
		int remainder = 0;
		int quotient = A;
		
		while (quotient > 0) {
			quotient = A / 2;
			remainder = A % 2;
			A = quotient;
			sBin += String.valueOf(remainder);

		}
		
		return sBin;
	}

	public int checkBit(String binary, int B) {
		int res = 0;
		int binaryValueInt  = Integer.parseInt(binary);
		binaryValueInt = binaryValueInt >> B;
		if ((binaryValueInt & 1) == 0) {
			res = 0;
		} else {
			res = 1;
		}
		return res;
	}
}
