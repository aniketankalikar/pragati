package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Advanced_Bit_Manipulation_Assgn_Q1 {
	
	public static void main(String args[])
	{
		Integer arr [] = new Integer[] {1,2,2,3,1};
		List<Integer> A = new ArrayList<Integer>(Arrays.asList(arr));
		int res = new Advanced_Bit_Manipulation_Assgn_Q1().singleNumber(A);
		System.out.println(res);
	}
	
	public int singleNumber(final List<Integer> A) {
		
		int result =0;
		
		for (int i=0;i<A.size();i++)
		{
			result = result ^ A.get(i);
		}
		
		return result;
    }

}
