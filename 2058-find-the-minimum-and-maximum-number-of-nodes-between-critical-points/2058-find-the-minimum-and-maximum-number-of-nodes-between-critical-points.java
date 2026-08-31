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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> lst = new ArrayList<>();
        ListNode prev = head;
        ListNode temp = head.next;
        int count = 1;
        while(temp.next != null){
            if((temp.val > prev.val && temp.val > temp.next.val) || (temp.val < prev.val && temp.val < temp.next.val)){
                lst.add(count);
            }
            count++;
            prev = temp;
            temp = temp.next;
        }
        if(lst.size() < 2){
            return new int[]{-1,-1};
        }
        int arr[] = new int[2];
        int max = lst.get(lst.size()-1) - lst.get(0);
        int min = Integer.MAX_VALUE;
        for(int i =0;i<lst.size()-1;i++){
            min = Math.min(min,lst.get(i+1)-lst.get(i));
        }
        return new int[]{min,max};
    }
}