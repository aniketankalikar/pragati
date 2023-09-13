package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Adv_DSA_Sorting1_H2 {
	
	public static void main(String args[])
	{
		ArrayList<Integer> A = new ArrayList<Integer>(List.of(5, 17, 100, 11));
		int min = new Adv_DSA_Sorting1_H2().solve(A);
		System.out.println(min);
	}

	public int solve(ArrayList<Integer> A) {
		
		int min = Integer.MAX_VALUE;
		Collections.sort(A);
		
		for(int i=1;i<A.size();i++)
		{
			min = Math.min(min, A.get(i) - A.get(i-1));
		} 
		
		return min;
	}

}
