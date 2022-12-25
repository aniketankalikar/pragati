package scaler.assigments.homework;

public class LinkedList_Assignment_Q4 {

	/**
	 * Definition for singly-linked list. class ListNode { public int val; public
	 * ListNode next; ListNode(int x) { val = x; next = null; } }
	 * 
	 */

	public static void main(String args[]) {
		// 6 3 3 6 7 8 7 3 7

		/*
		 * ListNode head = new ListNode(6); head.next = new ListNode(3); ListNode Temp =
		 * head.next; Temp.next = new ListNode(3); Temp = Temp.next; Temp.next = new
		 * ListNode(6); Temp = Temp.next; Temp.next = new ListNode(7); Temp = Temp.next;
		 * Temp.next = new ListNode(8); Temp = Temp.next; Temp.next = new ListNode(7);
		 * Temp = Temp.next; Temp.next = new ListNode(3); Temp = Temp.next; Temp.next =
		 * new ListNode(7); Temp = Temp.next;
		 */
		
		ListNode head = new ListNode(5);
		head.next = new ListNode(10);
		ListNode Temp = head.next;
		Temp.next = new ListNode(12);
		Temp = Temp.next;
		Temp.next = new ListNode(4);
		Temp = Temp.next;
		Temp.next = new ListNode(17);
		
		//new LinkedList_Assignment_Q4().solve(head,1);
		new LinkedList_Assignment_Q4().reverse(head);
		

	}

	public ListNode solve(ListNode A, int B) {

		ListNode head = A;
		ListNode NextNode = A;
		ListNode PreviousNode = A;
		ListNode TraverseNode = A;

		for (int i = 0; i <=B; i++) {
			PreviousNode = TraverseNode;
			NextNode = TraverseNode.next;
			TraverseNode = NextNode;
		}

		PreviousNode.next = NextNode.next;

		return head;

	}
	
	public void reverse(ListNode A) {
	       
	       if (A == null)
			{
				 System.out.print("\n");
	            return;
			}
				
	       reverse(A.next); 
	        System.out.print(A.val + " ");
	        
	    } 
}