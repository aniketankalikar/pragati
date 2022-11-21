package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class SlidingWindow {
	
	 public static void main(String args[])
	 {
		 Integer arr [] = new Integer []{ 15, 7, 11, 7, 9, 8, 18, 1, 16, 18, 6, 1, 1, 4, 18 };
		 ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr));
		 
		 new SlidingWindow().solve(A, 6);
	 }
	
	 public int solve(ArrayList<Integer> A, int B) {
		 	if(B==1)
		 	{
		 		int min = Integer.MAX_VALUE;
		 		int sIndex = 0;
		 		for(int i=0;i<A.size();i++)
		 		{
		 			if(A.get(i)< min)
		 			{
		 				min = A.get(i);
		 				sIndex = i;
		 			}
		 		}
		 		return sIndex;
		 	}
		 
	        long avg = Integer.MAX_VALUE;
	        int s = 0;
	        int e= B-1;
	        long sum  = 0;
	        int startIndex = 0;
	        while(e<A.size())
	        {
	            sum = 0;
	            for(int i=s;i<=e;i++)
	            {
	                sum+=A.get(i);
	            }
	            
	            if(sum/B==avg)
	            {
	            	if(s< startIndex)
	            		startIndex = s;
	            		
	            }
	            else if(sum/B<avg)
	            {
	                avg = sum/	B;
	                startIndex = s;
	            }
	                

	             s++;
	             e++;   
	        }

	        return startIndex;
	      
	    }

}
