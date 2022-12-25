package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hashing_Homework_Q2 {
	
	public static void main(String args[])
	{
		Integer [] arrA  = new Integer [] {1, 2, 2, 1};
		Integer [] arrB  = new Integer [] {2, 3, 1, 2};
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arrA));
		ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(arrB));
		new Hashing_Homework_Q2().solve(A, B);
	}
	
	
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
    	
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	
    	Map<Integer, Integer> hashMapA = new HashMap<Integer,Integer>();
    	Map<Integer, Integer> hashMapB = new HashMap<Integer,Integer>();
    	int cnt = 0;
    	for(int i=0;i<A.size();i++)
    	{
    		if(hashMapA.get(A.get(i))!=null )
    		{
    			cnt  = hashMapA.get(A.get(i))+1;
    			hashMapA.replace(A.get(i), cnt);
    		}
    		else
    		{
    			hashMapA.put(A.get(i), 1);
    		}
    	}

    	
    	for(int i=0;i<B.size();i++)
    	{
    		if(hashMapB.get(B.get(i))!=null )
    		{
    			cnt  = hashMapB.get(B.get(i))+1;
    			hashMapB.replace(B.get(i), cnt);
    		}
    		else
    		{
    			hashMapB.put(B.get(i), 1);
    		}
    	}
    	
    	for (Map.Entry<Integer,Integer> entry : hashMapA.entrySet())
    	{
    		int count = 0;
    		
    		Integer key = entry.getKey();
    		if(hashMapB.containsKey(key))
    		{
    			count = (hashMapA.get(key) < hashMapB.get(key) ) ? hashMapA.get(key) : hashMapB.get(key);
    			for(int idx =0;idx<count;idx++)
    			{
    				result.add(key);
    			}
    		}
    	}
            
    	
    	return result;
    }
}