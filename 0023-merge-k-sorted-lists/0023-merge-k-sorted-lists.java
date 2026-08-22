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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> lst = new ArrayList<>();
        for(int i =0;i<lists.length;i++){
            ListNode temp = lists[i];
            while(temp != null){
                lst.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(lst);
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for(int i =0;i<lst.size();i++){
            curr.next = new ListNode(lst.get(i));
            curr = curr.next;
        }
        return dummy.next;
    }
}