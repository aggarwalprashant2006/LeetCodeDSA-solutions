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
import java.util.Arrays;
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int arr[][]  = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], -1);
        }
        ListNode temp = head;
        int count1 = 0;
        int a = n;
        int b = m;
        int count = 0;
        int c = 0;
        while(temp != null){
            int i = n-a;
            int j = m-b;
            while(j < a){
                if(temp == null){
                    count1++;
                    break;
                }
                arr[i][j] = temp.val;
                temp = temp.next;
                j++;
            }
            if(count1 != 0){
                break;
            }
            i++;
            while(i < b){
                if(temp == null){
                    count1++;
                    break;
                }
                arr[i][a-1] = temp.val;
                temp = temp.next;
                i++;
            }
            if(count1 != 0){
                break;
            }
            j = a-2;
            while(j >= n-a){
                if(temp == null){
                    count1++;
                    break;
                }
                arr[b-1][j] = temp.val;
                temp = temp.next;
                j--;
            }
            if(count1 != 0){
                break;
            }
            i =b-2;
            while(i > m-b){
                if(temp == null){
                    count1++;
                    break;
                }
                arr[i][c] = temp.val;
                temp =temp.next;
                i--;
            }
            if(count1 != 0){
                break;
            }
            c++;
            a--;
            b--;
        }
        return arr;
    }
}