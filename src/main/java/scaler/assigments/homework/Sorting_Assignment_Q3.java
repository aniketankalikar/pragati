package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sorting_Assignment_Q3 {
	
	public static void main(String args[])
	{
		Integer arr [] = new Integer[] {36, 13, 13, 26, 37, 28, 27, 43, 7 };
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr));
		new Sorting_Assignment_Q3().solve(A);
	}

	 public ArrayList<Integer> solve(ArrayList<Integer> A) {

	        Collections.sort(A, new Comparator<Integer>(){

	            public int compare(Integer a, Integer b)
	            {
	                int factorsa = count_factors(a);
	                int factorsb = count_factors(b);

	                if(factorsa < factorsb)
	                {
	                    return -1;
	                }
	                if(factorsa > factorsb)
	                {
	                    return 1;
	                }
	                else
	                {
	                    if(a<=b)
	                    {
	                        return -1;        
	                    }
	                    else{
	                        return 1;
	                    }
	                }

	            }
	        }
	        
	        );

	        return A;
	    }

	    public int count_factors(Integer x)
	    {
	        int count  =0 ;
	        for (int i=1;i<=Math.sqrt(x);i++)
	        {
	            if(x%i==0)
	            {
	                if(i== x/i){count++;}
	                else {count+=2;} 

	            }
	        }

	        return count;
	    }
}