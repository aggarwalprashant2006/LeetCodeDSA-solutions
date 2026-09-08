class Solution {
    public ListNode doubleIt(ListNode head) {
        if(head.val == 0 && head.next == null){
            return new ListNode(0);
        }
        Stack<Integer> str1 = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            str1.push(temp.val);
            temp = temp.next;
        }
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        List<Integer> lst = new ArrayList<>();
        while(!str1.isEmpty()){
            int a = str1.pop()*2;
            lst.add(a%10+carry);
            carry = a/10;
        }
        if(carry > 0){
            lst.add(carry);
        }
        for(int i = lst.size()-1;i>= 0;i--){
            curr.next = new ListNode(lst.get(i));
            curr = curr.next;
        }
        return dummy.next;
    }
}