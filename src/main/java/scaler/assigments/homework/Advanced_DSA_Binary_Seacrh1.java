package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Advanced_DSA_Binary_Seacrh1 {
	
	public static void main(String args[])
	{
		Integer [] arr = new Integer[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,5,5,5,6,6,6,6,6,6,6,6,6,6,6,6,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,8,8,8,8,8,8,8,8,9,9,9,9,9,9,9,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		List<Integer> A = Arrays.asList(arr);
		new Advanced_DSA_Binary_Seacrh1().searchRange(A, 10);
		
	}

	public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int N = A.size();
		int l = 0;
		int h = N-1;
		int firstIndex = -1;
		while(l<=h)
		{
			int m = l+(h-l)/2;
			if(A.get(m)==B)
			{
				firstIndex = m;
				h = m- 1;
			}
			else if(A.get(m)<B)
			{
				l = m + 1;
			}
			else
			{
				h = m -1;
			}
		}
		
		result.add(firstIndex);
		
		l = 0;
		h = N-1;
		int lastIndex = -1;
		while(l<=h)
		{
			int m = l+(h-l)/2;
			if(A.get(m)==B)
			{
				lastIndex = m;
				l = m+ 1;
			}
			else if(A.get(m)<B)
			{
				l = m + 1;
			}
			else
			{
				h = m -1;
			}
		}
		
		result.add(lastIndex);
		
		return result;
    }
}
