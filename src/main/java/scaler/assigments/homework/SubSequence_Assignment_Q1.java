package scaler.assigments.homework;

public class SubSequence_Assignment_Q1 {
	
	public static void main(String args[])
	{
		int [] arr = new int[] {1, 2, 3, 4, 5};
		int result  =  new SubSequence_Assignment_Q1().solve(arr);
		System.out.println(result);
		
	}

	public int solve(int[] A) {

		long ans =0, n = A.length, tot_subArray=(n*(n+1))/2;
        for(int b = 0 ; b<32;b++){
            long anszero =0, cnt =0;
            for(int i = 0 ; i < A.length ; i++){
                if(((A[i]>>b)&1)!=1)
                    cnt ++;
                else {
                    anszero +=((cnt *(cnt+1))/2);
                    cnt =0;
                }
            }
            anszero +=((cnt *(cnt+1))/2);
            anszero = (tot_subArray -anszero);
            ans = (ans+(anszero*(1<<b)))%1000000007;
        }
        return (int)ans;
	}

}
