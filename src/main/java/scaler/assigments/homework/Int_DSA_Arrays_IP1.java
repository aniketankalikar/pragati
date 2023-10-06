package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.List;

public class Int_DSA_Arrays_IP1 {

    public static void main(String args[])
    {
        List<Integer> A = List.of(1, 6, 4, 2, 6, 9);
        List<Integer> B = List.of(2, 5, 7, 3, 2, 7);

       int res =  new Int_DSA_Arrays_IP1().solve(new ArrayList<Integer>(A),new ArrayList<Integer>(B));
        System.out.println(res);
    }

    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        int [] A1  =  A.stream().mapToInt(Integer::intValue).toArray();
        int [] B1  =  B.stream().mapToInt(Integer::intValue).toArray();

        int n = A1.length;
        int finalAns = Integer.MAX_VALUE;
        for(int j=1;j<n-1;j++){
            int tempAns = B1[j];
            int valueOfI = Integer.MAX_VALUE;
            int valueOfIK = Integer.MAX_VALUE;
            for(int i=j-1;i>=0;i--){
                if(A1[i]<A1[j] && B1[i]<valueOfI){
                    valueOfI = B1[i];
                }
            }
            for(int k=j+1;k<n;k++){
                if(A1[k]>A1[j] && B1[k]<valueOfIK){
                    valueOfIK = B1[k];
                }
            }
            if(valueOfI != Integer.MAX_VALUE && valueOfIK != Integer.MAX_VALUE){
                tempAns = tempAns+valueOfI+valueOfIK;
                finalAns = Math.min(tempAns,finalAns);
            }
        }
        if(finalAns == Integer.MAX_VALUE){
            return -1;
        }
        return finalAns;

    }
}
