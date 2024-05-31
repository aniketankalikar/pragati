package scaler.assigments.homework;

import java.util.Arrays;
import java.util.List;

public class Int_DSA_Arrays_Repeat_Number_N_By_3 {

    public int repeatedNumber(final List<Integer> a) {
        //boyer moore voting algorithm
        Integer A[] = new Integer[a.size()];
        for (int i = 0; i < a.size(); i++) {
            A[i] = a.get(i);
        }

        int n = A.length;
        int count_1 = 0;
        int count_2 = 0;
        int majority_candidate_1 = -1; // first majority element
        int majority_candidate_2 = -1;  //second majority element
        for (int i = 0; i < n; i++) {
            int element = A[i];
            if (element == majority_candidate_1) {
                count_1++;
            } else if (element == majority_candidate_2) {
                count_2++;
            } else if (count_1 == 0) {
                majority_candidate_1 = element;
                count_1 = 1;
            } else if (count_2 == 0) {
                majority_candidate_2 = element;
                count_2 = 1;
            } else {
                count_1--;
                count_2--;
            }
        }
        int num1Count = 0;  //storing count of first majority element
        int num2Count = 0;  //storing count of second majority element
        for (int i = 0; i < n; i++) {
            if (A[i] == majority_candidate_1) {
                num1Count++;
            }
            if (A[i] == majority_candidate_2) {
                num2Count++;
            }
        }
        if (num1Count > n / 3) {
            return majority_candidate_1;
        } else if (num2Count > n / 3) {
            return majority_candidate_2;
        }
        return -1;
    }
}
