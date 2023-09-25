package scaler.advanced.dsa.cm1.revision.contest;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class FrequencySorting {


    public static void main(String[] args) {


        //String str = "twvtgg";
        String str = "pvgcuhrydk";
        System.out.println("Input String "+str);
        System.out.println("Result "+new FrequencySorting().frequencySort(str));
    }


    class Pair implements Comparable<Pair>
    {
        int first;
        char second;
        Pair(int first,char second)
        {
            this.first  = first;
            this.second  = second;
        }
        // Custom comparator useful for heap

        public int compareTo(Pair a)
        {
            // If frequencies are same for two characters
            // sort according to their order
            if(this.first==a.first)
                return Character.compare(a.second, this.second) ;
            return this.first - a.first;
        }

    }

    public  String frequencySort(String s) {

        // Creating a HashMap to store the frequency of characters
        HashMap<Character, Integer> mpp = new HashMap<Character, Integer>();

        // Creating a min heap to store the frequency and corresponding character
        PriorityQueue<Pair> min_heap = new PriorityQueue<Pair>(Collections.reverseOrder());

        // Looping through the string to calculate the frequency of each character
        for (char ch : s.toCharArray()) {
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }

        // Adding the frequency and character to the min heap
        for (char m : mpp.keySet()) {
            min_heap.offer(new Pair(mpp.get(m), m));
        }

        String ans = "";
        // Now we have in the TOP - Less Freq chars
        while (!min_heap.isEmpty()) {
            Pair pair = min_heap.poll();
            int freq = pair.first;
            char ch = pair.second;
            // Append as many times of frequency

            for (int i = 0; i < freq; i++) {
                ans += ch;
            }
        }
        return ans;
    }
}
