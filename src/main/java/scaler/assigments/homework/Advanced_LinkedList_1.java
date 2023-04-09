package scaler.assigments.homework;

public class Advanced_LinkedList_1 {

	/**
	 * Definition for singly-linked list. class ListNode1 { public int val; public
	 * ListNode1 next; ListNode1(int x) { val = x; next = null; } }
	 */

	public static void main(String args[]) {
		ListNode1 newNode6A = new ListNode1(6);
		ListNode1 newNode3A = new ListNode1(3);
		newNode6A.next = newNode3A;
		ListNode1 newNode3B = new ListNode1(3);
		newNode3A.next = newNode3B;
		ListNode1 newNode6B = new ListNode1(6);
		newNode3B.next = newNode6B;
		ListNode1 newNode7A = new ListNode1(7);
		newNode6B.next = newNode7A;
		ListNode1 newNode3C = new ListNode1(3);
		newNode7A.next = newNode3C;
		ListNode1 newNode8A = new ListNode1(8);
		newNode3C.next = newNode8A;
		ListNode1 newNode7B = new ListNode1(7);
		newNode8A.next = newNode7B;
		ListNode1 newNode3D = new ListNode1(3);
		newNode7B.next = newNode3D;
		ListNode1 newNode7C = new ListNode1(7);
		newNode3D.next = newNode7C;

		ListNode1 A = newNode6A;

		A = new Advanced_LinkedList_1().solve(A, 3, 5);
		System.out.println(A);
	}

	public ListNode1 solve(ListNode1 A, int B, int C) {

		ListNode1 temp = A;
		int counter = 0;
		ListNode1 head = A;
		ListNode1 last = null;
		while (temp != null) {
			counter++;
			last = temp;
			temp = temp.next;

		}

		if (C == 0) {
			ListNode1 newNode = new ListNode1(B);
			newNode.next = A;
			head = newNode;
		} else if (C > counter) {
			ListNode1 newNode = new ListNode1(B);
			last.next = newNode;
		} else {
			temp = A;
			counter = 0;
			while (temp != null) {
				if (C == counter) {
					ListNode1 newNode = new ListNode1(B);
					newNode.next = temp.next;
					temp.next = newNode;
					temp = newNode;
				}
				counter++;
				temp = temp.next;
			}
		}

		return head;

	}

}

class ListNode1 {
	public int val;
	public ListNode1 next;

	ListNode1(int x) {
		val = x;
		next = null;
	}
}