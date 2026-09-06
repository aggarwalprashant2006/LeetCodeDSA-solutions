/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = l1;
        ListNode temp1 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carry = 0;
        while(temp != null && temp1 != null){
            int a = temp.val+temp1.val + carry;
            int b = a%10;
            curr.next = new ListNode(b);
            a = a/10;
            if(a > 0){
                carry = a;
            }else{
                carry = 0;
            }
            temp = temp.next;
            temp1 = temp1.next;
            curr = curr.next;
        }
        while(temp != null){
            int a = temp.val+carry;
            int b = a%10;
            curr.next = new ListNode(b);
            a = a/10;
            if(a > 0){
                carry = a;
            }else{
                carry = 0;
            }
            temp = temp.next;
            curr = curr.next;
        }
        while(temp1 != null){
            int a = temp1.val+carry;
            int b = a%10;
            curr.next = new ListNode(b);
            a = a/10;
            if(a > 0){
                carry = a;
            }else{
                carry = 0;
            }
            temp1 = temp1.next;
            curr = curr.next;
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return dummy.next;
    }
}