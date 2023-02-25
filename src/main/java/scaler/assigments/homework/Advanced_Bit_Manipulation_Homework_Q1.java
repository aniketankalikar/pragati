package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Advanced_Bit_Manipulation_Homework_Q1 {

	public static void main(String args[])
	{
		Integer arr [] = new Integer[] {9,17};
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr));
		String res = new Advanced_Bit_Manipulation_Homework_Q1().solve(A);
		System.out.println(res);
	}
	
	public String solve(ArrayList<Integer> A) {
		
		int res = 0;
		
		if(A.size()==1)
				return "No";
		
		for(int i=0;i<A.size();i++)
		{
			res = res ^ A.get(i);
		}
		
		if(res % 2 ==0)
			return "Yes";
		
		return "No";
    }
	
}
