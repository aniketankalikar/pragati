package scaler.assigments.homework;

import java.util.ArrayList;

public class Advanced_Array2_Assignment4 {

	public Long solve(ArrayList<ArrayList<Integer>> A) {

		Integer arr [][] = (Integer [][]) A.toArray();
		
		long maxsum = Integer.MIN_VALUE;
        int N = arr.length;
        int M = arr[0].length;
        int row = N-1;
        int col = M-1;
        if(arr[row][col] < 0 ) return new Long(arr[row][col]);
        long[][] pf = new long[N+1][M+1];
       
        for(int i=N-1; i>=0; i--){
            for(int j=M-1; j>=0; j--){
               long s =  (long)arr[i][j] + pf[i+1][j] + pf[i][j+1] - pf[i+1][j+1];
               maxsum = Math.max(s,maxsum);
               pf[i][j] = s;
            }
        }
        return maxsum;
	}

}
