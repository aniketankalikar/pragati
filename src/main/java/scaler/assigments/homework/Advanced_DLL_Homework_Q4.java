package scaler.assigments.homework;

import java.util.HashSet;

public class Advanced_DLL_Homework_Q4 {
	
	public static void main(String args[])
	{
		ListNode A = new ListNode(1);
		ListNode N2 = new ListNode(2);
		ListNode N3 = new ListNode(3);
		ListNode N4 = new ListNode(4);
		ListNode N5 = new ListNode(5);
		A.next = N2;
		N2.next = N3;
		N3.next = N4;
		N4.next = N5;
		
		
		ListNode B6 = new ListNode(6);
		ListNode B3 = new ListNode(3);
		ListNode B4 = new ListNode(4);
		ListNode B5 = new ListNode(5);
		
		B6.next = B3;
		B3.next = B4;
		B4.next = B5;
		
		new Advanced_DLL_Homework_Q4().getIntersectionNode(A, B6);
	}

	/**
	 * Definition for singly-linked list. class ListNode { public int val; public
	 * ListNode next; ListNode(int x) { val = x; next = null; } }
	 */
	public ListNode getIntersectionNode(ListNode A, ListNode B) {

		HashSet<ListNode> set = new HashSet<>();

        if(A==null || B==null) return null;

        while(A!=null)
        {
            set.add(A);
            A=A.next;
        }

        while(B!=null)
        {
            if(set.contains(B))
            {
                return B;
            }

            B=B.next;
        }
      return null;
	}
}
