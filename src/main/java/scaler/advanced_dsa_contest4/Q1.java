package scaler.advanced_dsa_contest4;

import java.util.ArrayList;
import java.util.Collections;

public class Q1 {

	public static void main(String args[]) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(5);
		A.add(4);
		A.add(3);
		
		int res = new Q1().solve(A, 8);
		System.out.println(res);

	}
	
	

	public int solve(ArrayList<Integer> A, int B) {
		
		Collections.sort(A);
        int count =0;
        int sum = 0;
        
        for(int i=0;i<A.size();i++)
        {
            if(sum + A.get(i) <=B)
            {
                sum += A.get(i);
                count++;
            }
            else
            {
                break;
            }
            
        }
        
        return count;
	}
}
