package scaler.academy.contest2;

public class Q4 {
	
	public static void main(String args[])
	{
		int res = new Q4().solve("nitin");
		System.out.println(res);
	}
	
	
	public int solve(String A)
	{
		char [] input = A.toCharArray();
		
		for(int i=0;i<input.length;i++)
		{
			//input = A.toCharArray();
			for(int j=i+1;j<input.length;j++)
			{
				char temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				
				boolean res = isPalindrome(input, 0,input.length-1);
				if(res == true)
					return 1;	
			}
		}
		
		return 0;
	}
	
	public boolean isPalindrome(char [] input, int s, int e)
	{
		while(s<e)
		{
			if(input[s]!=input[e])
				return false;
			
			s++;
			e--;
		}
		
		return true;
	}

}
