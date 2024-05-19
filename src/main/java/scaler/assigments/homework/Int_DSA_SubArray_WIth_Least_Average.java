package scaler.assigments.homework;

import java.util.ArrayList;

public class Int_DSA_SubArray_WIth_Least_Average {
    public int solve(ArrayList<Integer> A, int B) {

        int n = A.size();
        int sum = 0, result = 0;
        for(int i = 0; i<B; i++){
            sum += A.get(i);
        }
        int min_sum = sum;
        for(int i = B; i<n; i++){
            sum = sum + A.get(i) - A.get(i-B);
            if(sum < min_sum){
                min_sum = sum;
                result = i-B+1;
            }
        }
        return result;

    }
}