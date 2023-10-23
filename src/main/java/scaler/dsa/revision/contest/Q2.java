package scaler.dsa.revision.contest;



public class Q2 {

    public static void main(String args[])
    {

        // 10.9.8

        ListNode ten = new ListNode(10);
        ListNode nine = new ListNode(9);
        ListNode eght = new ListNode(8);

        ten.next = nine;
        nine.next =  eght;

        new Q2().solve(ten);

    }

    public ListNode solve(ListNode A) {

    	ListNode oddHead = new ListNode(0), odd = oddHead;
        ListNode evenHead = new ListNode(0), even = evenHead;
        ListNode curr = A;
        int counter = 1;
         
        // Traverse the original linked list
        while (curr != null) {
            if (counter % 2 == 1) {
                // Odd-positioned node
                odd.next = curr;
                odd = odd.next;
            } else {
                // Even-positioned node
                even.next = curr;
                even = even.next;
            }
             
            // Move to the next node
            curr = curr.next;
            counter++;
        }
         
        // Merge the odd-positioned linked list and the even-positioned linked list
        odd.next = evenHead.next;
        even.next = null;
         
        // Return the rearranged linked list
        return oddHead.next;
    }


}
