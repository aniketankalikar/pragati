package scaler.assigments.homework;

import java.util.HashSet;
import java.util.Set;

public class Hashing_Homework_Q3 {
	
	public static void main(String args[])
	{
		new Hashing_Homework_Q3().colorful(2634);
	}
	
	public int colorful(int A) {
		
			int result =0;
			
			Set<Integer> subArrSet = new HashSet<Integer>();
			String strNum = String.valueOf(A);
			Integer subNum = 1;
	        for(int i=0;i<strNum.length();i++)
			{
				subNum = 1;
	            subArrSet.add(Integer.parseInt(String.valueOf(strNum.charAt(i))));
				result++;
	            subNum*=Integer.parseInt(String.valueOf(strNum.charAt(i)));
	            for(int j=i+1;j<strNum.length();j++)
				{
			        subNum= subNum * Integer.parseInt(String.valueOf(strNum.charAt(j)));
			        subArrSet.add(subNum);
					result++;
				}	
				
	            
			}
			
			if(result == subArrSet.size())
				result = 1;
			else
				result = 0;	
			
			return result;
    }

}
