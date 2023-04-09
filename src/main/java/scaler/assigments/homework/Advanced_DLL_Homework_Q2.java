package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.List;

public class Advanced_DLL_Homework_Q2 {

	public ListNode partition(ListNode A, int B) {
		
		return null;
	}
	
	/**
	 * Definition for singly-linked list.
	 * class ListNode {
	 *     public int val;
	 *     public ListNode next;
	 *     ListNode(int x) { val = x; next = null; }
	 * }
	 */
	public class Solution {
	    public ListNode partition(ListNode A, int B) {

	        ListNode temp = A;
	        ListNode head = null;

	        // List with values less than B
	        List<ListNode> L1 = new ArrayList<ListNode>();
	        // List with values greater than  B
	        List<ListNode> L2 = new ArrayList<ListNode>();
	       
	        while(temp!=null)
	        {
	            if(temp.val < B)
	            {
	                L1.add(temp);   
	            }
	            else
	            {
	                L2.add(temp);   
	            }
	            temp = temp.next;
	        }

	        temp = null;
	        if(L1!=null && L1.size()>0)
	        {
	            head = L1.get(0);
	            temp = head;

	            for(int i=1;i<L1.size();i++)
	            {
	                temp.next = L1.get(i);
	                temp = temp.next;
	            }
	        }

	        if(L2!=null && L2.size()>0)
	        {
	            if(head!=null)
	            {
	                temp.next = L2.get(0);
	                temp = temp.next;
	                for(int i=1;i<L2.size();i++)
	                {
	                    temp.next = L2.get(i);
	                    temp = temp.next;
	                }

	            }
	            else
	            {
	                head =   L2.get(0);
	                temp = head;

	                for(int i=1;i<L2.size();i++)
	                {
	                    temp.next = L2.get(i);
	                    temp = temp.next;
	                }
	            }

	            
	        }
	        temp.next = null;
	        return head;

	    }
	}


}
