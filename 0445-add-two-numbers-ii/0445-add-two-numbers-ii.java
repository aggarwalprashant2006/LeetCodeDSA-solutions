
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = null;
        ListNode curr = l1;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode prev1 = null;
        ListNode curr1 = l2;
        while(curr1 != null){
            ListNode next = curr1.next;
            curr1.next = prev1;
            prev1 = curr1;
            curr1 = next;
        }
        ListNode temp1 = prev;
        ListNode temp2 = prev1;
        ListNode dummy = new ListNode(-1);
        ListNode curr3 = dummy;
        int carry = 0;
        while(temp1 != null || temp2 != null){
            if(temp1 == null && temp2 != null){
                int a = temp2.val+carry;
                curr3.next = new ListNode(a%10);
                carry = a/10;
                temp2 = temp2.next;
            }else if(temp1 != null && temp2 == null){
                int a = temp1.val+carry;
                curr3.next = new ListNode(a%10);
                carry = a/10;
                temp1 = temp1.next;
            }else{
                int a = temp1.val+carry+temp2.val;
                curr3.next = new ListNode(a%10);
                carry = a/10;
                temp2 = temp2.next;
                temp1 = temp1.next;
            }
            curr3 = curr3.next;
        }
        if(carry > 0){
            curr3.next = new ListNode(carry);
        }
        ListNode prev2 = null;
        ListNode curr4 = dummy.next;
        while(curr4 != null){
            ListNode next = curr4.next;
            curr4.next = prev2;
            prev2 = curr4;
            curr4 = next;
        }
        return prev2;
    }
}