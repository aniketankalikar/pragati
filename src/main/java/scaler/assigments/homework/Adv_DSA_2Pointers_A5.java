package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Adv_DSA_2Pointers_A5 {

	public static void main(String args[]) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(2);
		A.add(2);
		A.add(2);
		A.add(3);
		

		int res = new Adv_DSA_2Pointers_A5().threeSumClosest(A, 8);
		System.out.println(res);
	}

	public int threeSumClosest(ArrayList<Integer> A, int B) {
		
		int ans =0;
		int maxDiff = Integer.MAX_VALUE;
		Integer arr[] = new Integer[A.size()];
		int counter = 0;
		for (Integer integer : A) {
			arr[counter] = integer;
			counter++;
		}
		
		Arrays.sort(arr);
		
		for(int i=0;i< arr.length;i++)
		{
			int p1 = i+1;
			int p2 = arr.length-1;
			while(p1<p2)
			{
				
				int diff  = Math.abs(B -  (arr[i] + arr[p1]+ arr[p2]));
				if(diff < maxDiff)
				{
					maxDiff = diff;
					ans  = arr[i] + arr[p1]+ arr[p2];
					
				}
				
				if( (arr[i] + arr[p1]+ arr[p2]) < B)
				{
					p1++;
				}
				else
				{
					p2--;
				}
				
			}
		}
		
		return ans;

	}
}
