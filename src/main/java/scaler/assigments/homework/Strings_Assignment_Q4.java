package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Strings_Assignment_Q4 {
	
	public static void main(String args[])
	{
		Integer arr [] = new Integer [] {6, 3, 3, 6, 7, 8, 7, 3, 7 };
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr));
		new Strings_Assignment_Q4().solve(A);
		
		
	}

	public ArrayList<Integer> solve(ArrayList<Integer> A) {
		int n = A.size();
        int max = A.get(0);
        for(int i = 0;i < n;i++){
            max = Math.max(A.get(i),max);
        }
        int[] numbers = new int[max + 1];
        for(int i = 0;i < n;i++){
            int index = A.get(i) - 0;
            numbers[index]++;
        }
        int k = 0;
        for(int i = 0;i < numbers.length;i++){
            int count = numbers[i];
            for(int j = 1; j <= count;j++) {
                A.set(k, i);
                k++;
            }
        }
        return A;
	}
}
