package leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_Arrays_Q4 {
	
	public static void main(String args[])
	{
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		ArrayList<Integer>  result = new Solution_Arrays_Q4().solve(input,2);
		System.out.println(result);
	}
	
	
	public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

        Integer arr [] = A.toArray(new Integer[0]);
        int n = arr.length;
        int k  = B % n;

        reversePart(arr, 0 , n-1);
        reversePart(arr, 0 , k-1);
        reversePart(arr, k , n-1);

        return new ArrayList<Integer>(Arrays.asList(arr));
        
    }

    private void reversePart(Integer arr[], int sIndex, int eIndex)
    {
        while(sIndex <  eIndex)
        {
            int temp = arr[sIndex];
            arr[sIndex] = arr[eIndex];
            arr[eIndex] = temp;
            sIndex++;
            eIndex--;
        }
    }

}
