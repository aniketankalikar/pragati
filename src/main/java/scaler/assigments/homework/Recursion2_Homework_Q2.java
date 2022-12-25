package scaler.assigments.homework;

public class Recursion2_Homework_Q2 {
	
	public static void main(String args[])
	{
		new Recursion2_Homework_Q2().solve(3, 0);
	}

	public int solve(int A, int B) {

		StringBuilder result = new StringBuilder("");
		result.append("0");
		int counter = 1;
		while (counter <= A) {
				result = getValue(result);
			counter++;
		}

		int res =  Integer.parseInt(String.valueOf(result.charAt(B)));
		return res;

	}

	public StringBuilder getValue(StringBuilder val) {
		StringBuilder result = new StringBuilder("");

		int length = val.length();
		for (int i = 0; i < length; i++) {
			if (val.charAt(i) == '0') {
				result.append("01");
			} else if (val.charAt(i) == '1') {
				result.append("10");
			}
		}

		return result;
	}

}
