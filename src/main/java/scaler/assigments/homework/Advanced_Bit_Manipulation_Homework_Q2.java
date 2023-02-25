package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Advanced_Bit_Manipulation_Homework_Q2 {
	
	public static void main(String args[])
	{
		Integer arr [] = new Integer[] {9,17};
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr));
		int res = new Advanced_Bit_Manipulation_Homework_Q2().cntBits(A);
		System.out.println(res);
	}
	
	
	
	public int cntBits(ArrayList<Integer> A) {

        int ans = 0;

        for(int i=0;i<32;i++)
        {
            for(int j=0;j<A.size()-1;j++)
            {
               // ans+=calcValue
            }
        }


        return ans;
    }

}