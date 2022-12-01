package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class BitManipulations_Homework_Q3 {

	public static void main(String args[]) {

		int size = 10000;
		Integer arr[] = new Integer[size];
		for (int i = 0; i < size; i++) {
			arr[i] = 1;
		}

		// Integer arr[] = new Integer[] {1,0,1,1};
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(arr));
		new BitManipulations_Homework_Q3().solve(input.size(), input);
	}

	 public Long solve(int A, ArrayList<Integer> B) {
		 int last=0;
	       long ans=0;
	       for(int i=0;i<A;i++){
	           if(B.get(i)==1){
	               last=i+1;
	           }
	           ans=ans+last;
	       }
	       return ans;
	    }

}
