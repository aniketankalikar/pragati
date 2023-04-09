package scaler.advanced_dsa_contest3;

public class Q3 {
	
	public static void main(String args[])
	{
		int ans = new Q3().solve("lmsltrv", 5, "l");
		System.out.println("Matches found "+ans);
	}
	
	public int solve(String A, int B, String C)
	{
		
		int matchingCount = 0;
		int ans = 0;
		int startIndex = 0;
		StringBuilder sbr = new StringBuilder(A);
		for(int i=0;i<sbr.length()-1;i++)
		{
			char currChar =sbr.charAt(i); 
			char nextChar = sbr.charAt(i+1);
			if( currChar == C.toCharArray()[0] && nextChar == C.toCharArray()[0])
			{
				if(matchingCount ==0)
					startIndex = i;
				matchingCount++;
				
			}
			else
			{
				if(matchingCount!=0)
					matchingCount = 0;
				
				if(currChar == C.toCharArray()[0])
					startIndex = i;
			}
		}
		System.out.println("Start Index "+startIndex);
		
		
		int counter = 0;
		int index  = startIndex;
		matchingCount = 0;
		for(counter=0;counter<B;counter++)
		{
			index = index -1;
			if(index >= 0)
			{
				sbr.setCharAt(index, C.toCharArray()[0]);
				matchingCount++;
				
			}
				
		}
		
		if(matchingCount!=B || startIndex==0)
		{
			counter = 0;
			index  = startIndex;
			
			for(counter=0;counter<B;counter++)
			{
				index = index +1;
				if(index < sbr.length())
				{
					sbr.setCharAt(index, C.toCharArray()[0]);
					
				}
					
			}
		}
		
		for(int i=0;i<sbr.length();i++)
		{
			if(sbr.charAt(i) == C.toCharArray()[0])
			{
				ans++;
			}
		}
		
		
		return ans;
	}
	

}