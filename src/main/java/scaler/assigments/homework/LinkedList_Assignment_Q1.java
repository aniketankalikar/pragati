package scaler.assigments.homework;

public class LinkedList_Assignment_Q1 {
	
	public static void main(String args[])
	{
		//6 3 3 6 7 8 7 3 7 
		/*
		 * ListNode head = new ListNode(6); head.next = new ListNode(3); ListNode Temp =
		 * head.next; Temp.next = new ListNode(3); Temp = Temp.next; Temp.next = new
		 * ListNode(6); Temp = Temp.next; Temp.next = new ListNode(7); Temp = Temp.next;
		 * Temp.next = new ListNode(8); Temp = Temp.next; Temp.next = new ListNode(7);
		 * Temp = Temp.next; Temp.next = new ListNode(3); Temp = Temp.next; Temp.next =
		 * new ListNode(7); Temp = Temp.next;
		 */
		
		ListNode head = new ListNode(10);
		head.next = new ListNode(9);
		ListNode Temp = head.next;
		Temp.next = new ListNode(8);
		Temp = Temp.next;
		
		new LinkedList_Assignment_Q1().solve(head);
		
	}

	public void solve(ListNode A) {

		if (A == null)
		{
			System.out.println("\n");
			return;
		}
			

		System.out.print(A.val + " ");
		solve(A.next);
		
	}

	
}