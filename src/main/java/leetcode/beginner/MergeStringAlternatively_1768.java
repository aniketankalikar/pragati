package leetcode.beginner;

public class MergeStringAlternatively_1768 {

    public static void main(String args[])
    {
        String ans = new MergeStringAlternatively_1768().mergeAlternately("aniket","deepa");
        System.out.println(ans);
    }

    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();

        int i=0, j =0;
        boolean flag = true;

        while(i<word1.length() && j< word2.length())
        {

            if(flag)
            {
                sb.append(word1.charAt(i));
                i++;
            }
            else {
                sb.append(word2.charAt(j));
                j++;

            }
            flag = !flag;
        }

        while(i<word1.length())
        {
            sb.append(word1.charAt(i));
            i++;
        }

        while(j<word2.length())
        {
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();

    }
}
