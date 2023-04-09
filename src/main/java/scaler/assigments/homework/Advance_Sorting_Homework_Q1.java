package scaler.assigments.homework;

import java.math.BigDecimal;

public class Advance_Sorting_Homework_Q1 {

	public static void main(String args[]) {
		ListNode N1 = new ListNode(2);
		ListNode N2 = new ListNode(4);
		ListNode N3 = new ListNode(3);
		ListNode N4 = new ListNode(5);
		ListNode N5 = new ListNode(6);
		ListNode N6 = new ListNode(4);
		N1.next = N2;
		N2.next = N3;
		N4.next = N5;
		N5.next = N6;

		//new Advance_Sorting_Homework_Q1().swapPairs(N1);
		new Advance_Sorting_Homework_Q1().addTwoNumbers(N1,N4);
		
		/*
		 * BigDecimal lval = new BigDecimal(
		 * "5176166587911563894375357473129825776789918451542222886425362913992681277867187688965133177781226652556452176845684425763871323194274497914214114292377568573919462164535442869713274313781684159847114581457931463186357578144173399491262699996232776986168762898342177166267457189198124573616887273814452356474199478963938814759774687435856727457246317437147897564397194237442277779575435125455362636254975638439587313262472386583155271831393449924356934389188528295328784114797761584774698774969"
		 * ); System.out.println("lval"+lval.intValue());
		 */
		

	}

	public ListNode swapPairs(ListNode A) {

		ListNode curr = A;
		ListNode next = A;
		while (curr != null) {
			next = curr.next;
			if (curr != null && next != null) {
				int currVal = curr.val;
				int nextVal = next.val;

				curr.val = nextVal;
				next.val = currVal;

			}
			curr = (next != null) ? next.next : curr.next;

		}

		return A;
	}
	
	

	/*
	 * public ListNode addTwoNumbers(ListNode A, ListNode B) {
	 * 
	 * ListNode h1 = A; ListNode h2 = A;
	 * 
	 * h1 = reverseNode(h1); h2 = reverseNode(h2);
	 * 
	 * return null; }
	 */

	public ListNode reverseNode(ListNode A) {
		
		ListNode prev = null;
		ListNode curr = A;
		ListNode next = null;
		while(curr !=null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
	}
	
	public ListNode addTwoNumbers(ListNode A, ListNode B) {

       	ListNode h1 = A;
        ListNode h2 = B;

        StringBuilder input1 =new StringBuilder();
        StringBuilder input2 =new StringBuilder();

        while(h1!=null)
        {
            input1.append(String.valueOf(h1.val)) ;
            h1 = h1.next;
        }

        while(h2!=null)
        {
        	input2.append(String.valueOf(h2.val)) ;
            h2 = h2.next;
        }
       
        input1 = input1.reverse();
        input2 = input2.reverse();
        
       BigDecimal inp1 =  new BigDecimal(input1.toString());
       BigDecimal inp2 =  new BigDecimal(input2.toString());
       BigDecimal result = inp1.add(inp2) ;
       																																		
       StringBuilder res = new StringBuilder(String.valueOf(result));
       res = res.reverse();
       
       String newRes = res.toString();
       ListNode head = null;
       ListNode nn = null;	
       ListNode curr = null;
       for(int i=0;i<newRes.length();i++)
       {
    	   int newVal = Integer.parseInt(String.valueOf(newRes.charAt(i))) ;
    	   if(nn == null)
    	   {
    		   nn = new ListNode(newVal);
    		   head = nn;
    		   curr =nn;
    	   }
    	   else
    	   {
    		   nn = new ListNode(newVal);
    		   curr.next = nn;
    		   curr =nn;
    	   }
       }
		
		
		return head;
    }
}