package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Advanced_Backtracking2_Q3 {
	
	public static void main(String args[])
	{
		String arr [] = new String [] {"bbba", "aaaa", "abaa", "aba", "aabaaa", "baabbaab", "bbbabbbaaa", "abaabbbbba", "abaa", "aba", "bbabbbbabb", "aab", "baaabbbaaa", "b", "baba", "aaba", "baaba", "abb", "aaaa", "baaabbbaa", "ab"};
		ArrayList<String> B = new ArrayList<String>(Arrays.asList(arr));
		
				
		
		//String A  = "myinterviewtrainer";
		String A  = "babbbbaabbaabaabaabaaabaababaaaabbbbbabbaabbabbbbababaabbabbbabbbaaabaababaaaababbbbabbbbbbaaaabaaabaabbbaaaabaaabbbaabababbbaaaabbabbbabaaabbbabaaabbbaaaaaabaabbabbaabbbbbaababbbbabbabbaabbbabaababaaaabbaabbbaabaabbbbbbaabbbaaaabbaaaaaabaabbaababbbabbbbbbaabbaabbbabbbaabbbaaaabbbaaaabbbabbaababaaabbababbaabbabbabaabbbbaaaabbaababababbbbbabbbbabbaaabbaabaaaaabbaaaaaaaaaaababaaabbbaababbbbbbbabbababbaabbaaaababbbabbaaabbbbbabbbaabbaaaaabbbbbbabbbbbabbabbbabbabbababbabaabaabbabababbababaababbaababbabaabbaaaabbbaa";
		
		int res = new Advanced_Backtracking2_Q3().wordBreak(A, B);
		System.out.println(res);
	}
	
	public int wordBreak(String A, ArrayList<String> B) {

	      Set<String> dict = new HashSet<String>();
			for (String val : B) {
				dict.add(val);
			}  

	       return wordBreakLogic(dict,A);
	    }

	    

		    public int wordBreakLogic(Set<String> dict, String sentence)
		    {

		        if(sentence.length() == 0)
		            return 1;

	                for(int i = 0;i < Math.min(20,sentence.length());i++){
	                    String str = sentence.substring(0,i + 1);
	                    if(dict.contains(str) && wordBreakLogic(dict,sentence.substring(i + 1)) == 1){
	                        return 1;
	                    }
	                }


		       

		        return 0;    
		    }

}
