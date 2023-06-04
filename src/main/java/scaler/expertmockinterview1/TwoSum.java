package scaler.expertmockinterview1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String args[])
	{
		int [] arr = {3,1,5,6,8};
		new TwoSum().twoSumMethod(arr, 7);
		
	}
	
		
	public boolean twoSumMethod(int [] arr, int target)
	{
		boolean result = false;
		
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]>= target)
			{
				int complement = arr[i] - target;
				if(mp.containsKey(complement))
				{
					System.out.println("Indexs are : "+i+","+mp.get(complement));
					result = true;
					break;
				}
			}
			mp.put(arr[i],i);
		}
		System.out.println("result : "+result);
		return result;
	}

}
