package scaler.assigments.homework;

import java.util.ArrayList;

public class Carry_Forward_Q3 {
	
	public static void main(String args[])
	{
		
	}
	
	    public ArrayList<Integer> solve(ArrayList<Integer> A) {

	        ArrayList<Integer> result = new ArrayList<Integer>();

	        int max = A.get(A.size()-1);
	        result.add(A.get(A.size()-1));

	        for(int i= A.size()-2; i>=0;i--)
	        {
	            if(A.get(i) > max)
	            {
	                result.add(A.get(i));
	                max = A.get(i);
	                
	            }
	        }

	        return result;
	    }
}