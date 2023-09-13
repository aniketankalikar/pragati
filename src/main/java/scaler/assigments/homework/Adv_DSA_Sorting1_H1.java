package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Adv_DSA_Sorting1_H1 {

	public ArrayList<Integer> solve(ArrayList<Integer> A) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		Integer arr [] = new Integer[A.size()];
		
		for(int i=0;i<A.size();i++)
		{
			arr[i] = A.get(i);
		}
		
		Arrays.sort(arr);
		int N = A.size();
		
		int p1=0, p2 = N-1;
		long max=0, min=0, mod = 1000000007;
		
		while(p1<=p2)
		{
			max  = (max + (arr[p2]-arr[p1]))%mod;
			p1++;
			p2--;
		}
		
		p1=0; p2 = 1;
		
		while(p1<N && p2<N)
		{
			min  = (min + arr[p2]-arr[p1] )%mod;
			p1 = p1 + 2;
			p2 = p2 + 2;
		}
		
		result.add(Integer.parseInt(String.valueOf(max)));
		result.add(Integer.parseInt(String.valueOf(min)));
		
		return result;

	}
	
	
	
}