package scaler.assigments.homework;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class BitMap2_Homework_Q6 {
	
	public static void main(String args[])
	{
		//new BitMap2_Homework_Q6().reverse(3);
		//new BitMap2_Homework_Q6().solve(5,2,4);
		
		Integer [] arr = new Integer [] {4, 5, 8, 9, 0, 8, 8, 2, 2, 5, 8, 4, 1, 5, 8, 9, 1, 1, 2, 4, 4, 0, 5, 5, 7, 8, 3, 5, 8, 9, 3, 7, 8, 6, 8, 7, 8, 6, 8, 0, 7, 5, 3, 9, 6, 0, 3, 9, 4, 8, 8, 4, 7, 6, 6, 1, 3, 4, 6, 8, 8, 0, 6, 3, 8, 5, 1, 5, 4, 8, 8, 2, 2, 1, 9, 5, 3, 5, 5, 1, 8, 1, 7, 7, 8, 0, 8, 1, 9, 2, 9, 7, 0, 8, 1, 7, 7, 5, 7, 8, 9, 3, 9, 4, 7, 1, 5, 4, 8, 1, 4, 6, 1, 9, 9, 0, 8, 3, 0, 3, 9, 7, 6, 6, 4, 7, 6, 2, 2, 4, 4, 7, 0, 1, 2, 8, 9, 8, 4, 9, 7, 8, 8, 4, 0, 7, 3, 1, 2, 5, 8, 4, 4, 2, 3, 7, 1, 1, 8, 1, 7, 6, 7, 4, 9, 2, 0, 5, 8, 3, 0, 0, 9, 8, 1, 3, 0, 3, 3, 0, 4, 2, 7, 3, 7, 1, 1, 2, 7, 1, 6, 5, 3, 8, 6, 6, 2, 9, 5, 0, 2, 8, 3, 2, 5, 9, 4, 4, 5, 5, 1, 4, 4, 2, 3, 0, 2, 0, 1, 6, 2, 5, 4, 1, 3, 3, 2, 6, 7, 5, 7, 4, 9, 1, 2, 4, 9, 9, 8, 5, 9, 7, 6, 2, 9, 3, 6, 3, 2, 0, 7, 2, 0, 8, 5, 0, 9, 3, 7, 2, 1, 0, 1, 9, 1, 5, 6, 6, 9, 8, 5, 5, 3, 2, 1, 4, 0};
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr));
		new BitMap2_Homework_Q6().modArray(A,16);
	}
	
	public int modArray(ArrayList<Integer> A, int B) {

		 	
		long num= 0 ;
		for(int i =0;i<A.size();i++)
		{
		num = (((num) * (10))%B + A.get(i)) %B ;
		}
		return (int)num;
    }
	
	public int solve(int A, int B, int C)
	{
		
		long ans = 1;
		for(int i=1;i<=B;i++)
		{
			ans  = (ans*A) % C;
		}
		
		return Long.valueOf(ans).intValue();
	}
	
	public long reverse(long a) {
		  long result = 0L;	
		  String resultStr = "";
		  
		  String binary = String.format("%32s", Long.toBinaryString(a)).replaceAll(" ", "0");
				  
		  char chr;
		  for(int i=binary.length()-1;i>=0;i--)
		  {
			  chr = binary.charAt(i);
			  resultStr+=String.valueOf(chr);
		  }
		  
		  result = Long.parseLong(resultStr, 2); 
		  
		  return result;
		}


}
