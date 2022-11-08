package scaler.assigments.homework;

import java.util.ArrayList;

public class CarryForward_Question4 {
	
	public static void main(String args[])
	{
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(814);
		input.add(761);
		input.add(697);
		input.add(483);
		input.add(981);
		
		new CarryForward_Question4().solve(input);
	}
	
	 public int solve(ArrayList<Integer> A) {

	        int n = A.size();
	        int max = A.get(n-1);
	        int min = A.get(0);
	        int ans =n;
	        int maxi = -1;
	        int mini = -1;

	        for(int i=0;i<n;i++)
	        {
	            if(A.get(i)>max)
	            {
	                max  = A.get(i);
	            }
	            if(A.get(i)< min)
	            {
	                min = A.get(i);
	            }


	        }

	        if(min == max)
	        {
	            return 1 ;
	        }

	        for(int i=n-1;i>=0;i--)
	        {

	            if(A.get(i) == min)
	            {
	                if(maxi!=-1)
	                {
	                    ans = ans < maxi-i+1 ? ans : maxi-i+1;
	                }
	                mini = i;
	            }
	            else if(A.get(i) == max)
	            {
	                if(mini!=-1)
	                {
	                    ans = ans < mini-i+1 ? ans : mini-i+1;
	                }
	                maxi = i;
	            }
	        }
	        System.out.println("ans ---> "+ans);
	        return ans;
	    }

}
