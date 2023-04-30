package scaler.advanced.dsa.contest6;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Q1 {
	
	public static void main(String args[])
	{
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(2);
		A.add(4);
		A.add(3);
		A.add(4);
		A.add(5);
		
		Long res  = new Q1().solve(A);
		System.out.println(res);
	}
	
	public Long solve(ArrayList<Integer> A) {
		
		Collections.sort(A);
		Long finalResult  = new Long(0L);
		Queue<Long> queue = new ArrayDeque<Long>(A.size());
		
		for(int i=0;i<A.size();i++)
		{
			queue.add(Long.valueOf(A.get(i)) );
		}
		
		
		
		Long val = 0L;
		Long result = 0L;
		while(!queue.isEmpty())
		{
			result = 0L;
			val = queue.remove();
			if(val!=null) {
				result += Long.valueOf(val);
			}
			val = queue.remove();
			if(val!=null) {
				result += Long.valueOf(val);
			}
			finalResult+=result;
			if(!queue.isEmpty())
				queue.add(result);
			
		}
		return finalResult;
    }

}
