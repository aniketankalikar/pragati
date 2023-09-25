package scaler.advanced.dsa.cm1.revision.contest;

import java.util.ArrayList;
import java.util.List;

public class PaintersProblem {

    public static void main(String args[]) {
        List<Integer> C = List.of(1,10);
        int count  = new PaintersProblem().paint(2,5,new ArrayList<Integer>(C));
        System.out.println("count "+count);
    }

    public int paint(int A, int B, ArrayList<Integer> C) {

        long start = 0;
        long end = 0;

        for (int i=0; i<C.size(); i++) {
            start = Math.max(start, C.get(i));
            end += C.get(i);
        }

        while (start < end){

            long pieces=1;
            long sum =0;
            long middle = start + (end-start)/2;

            for (int i=0; i<C.size(); i++) {
                if (sum + C.get(i) > middle){
                    pieces++;
                    sum = C.get(i);
                } else {
                    sum += C.get(i);
                }
            }

            if (pieces > A) {
                start = middle + 1;
            } else {
                end = middle;
            }
        }

        long ans = (end*B) % 10000003;

        return (int) ans;
    }



}
