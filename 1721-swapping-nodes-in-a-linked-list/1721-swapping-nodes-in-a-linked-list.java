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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy=new ListNode(0,head);
        ListNode slow=dummy;
        ListNode fast=dummy;
        
        while(k>0){
            fast=fast.next;
            k--;
        }
        ListNode curr=fast;
        while(curr !=null){
            slow=slow.next;
            curr=curr.next;
        }
        int temp=fast.val;
        fast.val=slow.val;
        slow.val=temp;
        
        return dummy.next;
    }
}