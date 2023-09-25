package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.List;

public class Adv_DSA_Sorting1_H4 {

    public static void main(String args[])
    {
        List<Integer> list = List.of(2000000000,2000000000,-2000000000);
        ArrayList<Integer> A = new ArrayList<>(list);
        int pairs = new Adv_DSA_Sorting1_H4().solve(A);
        System.out.println(pairs);
    }

    public int solve(ArrayList<Integer> A) {

        int [] arr = new int[A.size()];
        for(int i=0;i<A.size();i++)
        {
            arr[i] = A.get(i);
        }

        return mergeSort(arr,0,A.size()-1);
    }

    int mergeSort(int[] a, int start, int end) {
        if(start>=end){
            return 0;
        }

        int mid = (start + end) / 2;

        int ac = mergeSort(a, start, mid);
        int bc = mergeSort(a, mid + 1, end);
        int count = 0;
        int i = start;
        int j = mid + 1;

        while (i <= mid && j <= end) {
            if ((long)a[i] > (long)2*a[j]) {
                count += mid - i + 1;
                j++;
            } else {
                i++;
            }
        }

        merge(a, start, mid, end);
        return ac + bc + count;

    }
    public void merge(int[] A ,int start,int mid,int end){

        int[] temp=new int[end-start+1];
        int i=start,j=mid+1,k=0;

        while(i<=mid && j<=end){
            if(A[i]< A[j]){
                temp[k++]=A[i++];
            }
            else{
                temp[k++]=A[j++];
            }
        }

        while(i<=mid) temp[k++]=A[i++];
        while(j<=end) temp[k++]=A[j++];

        for(i=start;i<=end;i++){
            A[i]=temp[i-start];
        }
    }
}
