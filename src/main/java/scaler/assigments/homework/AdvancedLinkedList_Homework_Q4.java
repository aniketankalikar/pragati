package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Comparator;

public class AdvancedLinkedList_Homework_Q4 {

	public static void main(String args[]) {
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

		ArrayList<Integer> result = new ArrayList<Integer>();
		result.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return o1.compareTo(o2);
			}

		});

		new AdvancedLinkedList_Homework_Q4().reverseBetween(N1, 2, 4);

	}

	/**
	 * Definition for singly-linked list. class ListNode { public int val; public
	 * ListNode next; ListNode(int x) { val = x; next = null; } }
	 */

	public ListNode reverseBetween(ListNode A, int B, int C) {

		if (A == null || A.next == null || B == C)
			return A;
		ListNode curr = A, p1 = null, p2 = null, temp, prev = null;

		for (int i = 1; i < B; i++) {
			p1 = curr; // just previous Node to B
			curr = curr.next;
		}

		p2 = curr; // end of reversedList

		while (B <= C) { // reversing the sublist
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
			B++;
		}

		if (p1 != null) // some elems before B are present
			p1.next = prev;
		else
			A = prev;

		p2.next = curr;

		ArrayList<Integer> test = new ArrayList<Integer>();

		return A;
	}
}
