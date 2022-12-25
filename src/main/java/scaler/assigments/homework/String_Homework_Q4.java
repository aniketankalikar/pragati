package scaler.assigments.homework;

import java.math.BigDecimal;

public class String_Homework_Q4 {

	public static void main(String args[]) {
		//new String_Homework_Q4().findOccurances("bobob");
		new String_Homework_Q4().addBinary("1010110111001101101000","1000011011000000111100110");
	}
	
	 public String addBinary(String A, String B) {

		 	
		 	int num1 = 0;
		 	int power = 0;
		 	for(int i=A.length()-1;i>=0;i--)
		 	{
		 		num1+= Math.pow(2, power)* Character.getNumericValue( A.charAt(i));
		 		power++;
		 	}
		 	
		 	int num2 = 0;
		 	power = 0;
		 	for(int i=B.length()-1;i>=0;i--)
		 	{
		 		num2+= Math.pow(2, power)*Character.getNumericValue( B.charAt(i));
		 		power++;
		 	}
		 	
		 	int sum = num1 + num2;
		 	
		 	int quotient = sum;
		 	int remainder =  0;
		 	String finalString  = "";
		 	while(quotient > 0)
		 	{
		 		quotient = quotient / 2;
		 		remainder  = quotient % 2;
		 		finalString+=remainder;
		 	}
		 	
		 	
		 	
	        return finalString;
	        
	    }

	public int findOccurances(String A) {

		int count = 0;
		String subStr = "";
		for (int i = 0; i < A.length(); i++) {
			
			if((i+3) <= A.length())
			{
				subStr = A.substring(i, i + 3);
				if (subStr.equals("bob")) 
					count++;
				
			}
			
		}

		return count;

	}

	public int solve(String A, int B) {

		int[] countArr = new int[A.length()];

		int index = 0;
		for (int i = 0; i < 0; i++) {
			index = A.charAt(i) - 'a';
			countArr[index]++;
		}

		return 0;
	}

}
