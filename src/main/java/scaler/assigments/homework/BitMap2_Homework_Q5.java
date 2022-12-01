package scaler.assigments.homework;

public class BitMap2_Homework_Q5 {

	public static void main(String args[])
	{
		new BitMap2_Homework_Q5().solve(10);
	}
	
	public int solve(int A) {

		double magicNumber = 5;
		double powerN = 5;
		int count = 1;
		int power =2;
		while (count < A) {
			powerN = Math.pow(5, power);
			power++;
			count++;
			if (count != 1) {
				magicNumber = (powerN) + 5;
				count++;
			}
		}

		return new Double(magicNumber).intValue();
	}
}
