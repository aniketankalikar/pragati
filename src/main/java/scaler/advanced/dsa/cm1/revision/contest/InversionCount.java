package scaler.advanced.dsa.cm1.revision.contest;

import java.util.ArrayList;
import java.util.List;

public class InversionCount {

    public static void main(String args[])
    {
        List<Integer> lst = List.of(1,3,2);
        ArrayList<Integer> A = new ArrayList<>(lst);
        int count  = new InversionCount().solve(A);
        System.out.println("Count is "+count);
    }

    public int solve(ArrayList<Integer> A) {

        return inversion(A,0,A.size()-1);
    }

    public int inversion(ArrayList<Integer> A, int start, int end)
    {

        if(start>=end) return 0;
        int mod = 1000000007;
        int mid = (start+end)/2;

        int left = inversion(A, start,mid);
        int right = inversion(A, mid+1,end);
        int count = merge(A,start,mid,end);
        return (left+right+count)%mod;
    }

    public int merge(ArrayList<Integer> A, int start, int mid, int end)
    {
        int P1=start, P2=mid+1, P3=0;
        int count = 0;
        int temp [] = new int[end-start+1];
        int mod = 1000000007;
        while(P1<=mid && P2<=end)
        {
            if(A.get(P1) <= A.get(P2) )
            {
                temp[P3] = A.get(P1);
                P1++;
                P3++;
            }
            else
            {
                count += (mid - P1 + 1);
                count%=mod;
                temp[P3] = A.get(P2);
                P2++;
                P3++;

            }

        }

        while(P1<=mid)
        {
            temp[P3] = A.get(P1);
            P1++;
            P3++;
        }

        while(P2<=end)
        {
            temp[P3] = A.get(P2);
            P2++;
            P3++;
        }

        for (int i = 0; i < temp.length; i++) {
            A.set(i+start,temp[i]);
        }

        return count;
    }
}