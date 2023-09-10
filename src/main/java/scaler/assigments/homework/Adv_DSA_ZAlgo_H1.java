package scaler.assigments.homework;

public class Adv_DSA_ZAlgo_H1 {
	
	public static void  main(String args[])
	{
		String A = "aaaa";
		int []  zArray = new Adv_DSA_ZAlgo_H1().consutructZArray(A);
		
		int ans =  new Adv_DSA_ZAlgo_H1().findPeriodOfAString(A, zArray);
		System.out.println(ans);	
		
	}

	private int findPeriodOfAString(String A, int[] zArray) {
		for(int i=1;i<A.length();i++)
		{
			if(i + zArray[i] == A.length())
				return i;
		}
		
		return A.length();
	}
	
	public int[] consutructZArray(String A)
	{
		int[] zArray = new int[A.length()];
		
		int length = A.length();
		
		int left = 0, right =0;
		
		zArray[0] = length;
		
		for(int i=1;i<length;i++)
		{
			if(i > right)
			{
				left = i; right  = i;
				while(right < length && A.charAt(right) == A.charAt(right-left)) {right++;}
				zArray[i] = right - left;
				right--;
			}
			else
			{
				if(i + zArray[i-left] <= right )
				{
					zArray[i] = zArray[i-left];
				}
				else
				{
					left = i;
					while(right < length && A.charAt(right) == A.charAt(right-left)) {right++;}
					zArray[i] = right - left;
					right--;
					
				}
			}
		}
		
		return zArray;
		
	}

}
