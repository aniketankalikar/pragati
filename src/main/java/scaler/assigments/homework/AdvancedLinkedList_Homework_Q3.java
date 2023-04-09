package scaler.assigments.homework;

public class AdvancedLinkedList_Homework_Q3 {

	
	public static void main(String args[])
	{
		ListNode N1 = new ListNode(1);
		ListNode N2 = new ListNode(2);
		ListNode N3 = new ListNode(3);
		ListNode N4 = new ListNode(4);
		ListNode N5 = new ListNode(5);
		ListNode N6 = new ListNode(6);
		N1.next = N2;
		N2.next = N3;
		N3.next = N4;
		N4.next = N5;
		N5.next = N6;
		
		new AdvancedLinkedList_Homework_Q3().reverseList(N1, 3);
		
	}
	
	/**
	 * Definition for singly-linked list. class ListNode { public int val; public
	 * ListNode next; ListNode(int x) { val = x; next = null; } }
	 */
	
	
	 public ListNode reverseList(ListNode A, int B) {

	      if(A==null || B==0 ){ return A;}
	        ListNode h1 = A;
	        ListNode h2 = null;
	        ListNode h3 = A;
	        int tempB=B;
	        while(B>0 && h1!=null){
	            ListNode temp = h1;
	            h1 = h1.next;
	            temp.next = h2;
	            h2 = temp;
	            B--;
	        }
	        h3.next = reverseList(h1,tempB);
	        return h2;

	    }

}
